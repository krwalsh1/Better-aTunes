/*
 * aTunes
 * Copyright (C) Alex Aranda, Sylvain Gaudard and contributors
 *
 * See http://www.atunes.org/wiki/index.php?title=Contributing for information about contributors
 *
 * http://www.atunes.org
 * http://sourceforge.net/projects/atunes
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package net.sourceforge.atunes.kernel.actions;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.awt.Color;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

import net.sourceforge.atunes.gui.images.CachedIconFactory;
import net.sourceforge.atunes.gui.views.controls.VolumeIconCalculator;
import net.sourceforge.atunes.model.IIconCache;
import net.sourceforge.atunes.model.ILookAndFeel;
import net.sourceforge.atunes.model.ILookAndFeelManager;
import net.sourceforge.atunes.model.IPlayerHandler;
import net.sourceforge.atunes.model.IStatePlayer;

import org.junit.Before;
import org.junit.Test;

public class MuteActionTest {

	private MuteAction sut;

	private IPlayerHandler playerHandler;

	private IStatePlayer state;

	@Before
	public void init() {
		this.sut = new MuteAction();
		this.playerHandler = mock(IPlayerHandler.class);
		ILookAndFeelManager lookAndFeelManager = mock(ILookAndFeelManager.class);
		this.state = mock(IStatePlayer.class);
		ILookAndFeel lookAndFeel = mock(ILookAndFeel.class);
		when(lookAndFeel.getPaintForSpecialControls()).thenReturn(Color.red);
		when(lookAndFeelManager.getCurrentLookAndFeel())
				.thenReturn(lookAndFeel);
		this.sut.setPlayerHandler(this.playerHandler);
		this.sut.setStatePlayer(this.state);

		VolumeIconCalculator iconCalculator = new VolumeIconCalculator();
		iconCalculator.setStatePlayer(this.state);
		CachedIconFactory iconFactory = new CachedIconFactory() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -239625553538406706L;

			@Override
			protected ImageIcon createIcon(final Color color) {
				return null;
			}
		};
		iconFactory.setIconCache(mock(IIconCache.class));
		iconCalculator.setVolumeMaxIcon(iconFactory);
		iconCalculator.setVolumeMedIcon(iconFactory);
		iconCalculator.setVolumeMinIcon(iconFactory);
		iconCalculator.setVolumeMuteIcon(iconFactory);
		iconCalculator.setVolumeZeroIcon(iconFactory);

		this.sut.setVolumeIconCalculator(iconCalculator);
	}

	@Test
	public void testMute() {
		when(this.state.isMuteEnabled()).thenReturn(true);
		this.sut.putValue(AbstractAction.SELECTED_KEY, true);

		this.sut.executeAction();

		verify(this.playerHandler).applyMuteState(true);
	}

	@Test
	public void testNoMute() {
		when(this.state.isMuteEnabled()).thenReturn(false);
		this.sut.putValue(AbstractAction.SELECTED_KEY, false);

		this.sut.executeAction();

		verify(this.playerHandler).applyMuteState(false);
	}

}
