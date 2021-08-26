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

package net.sourceforge.atunes.gui.views.controls;

import java.awt.Dimension;

import javax.swing.Action;

import net.sourceforge.atunes.gui.GuiUtils;
import net.sourceforge.atunes.gui.images.PauseImageIcon;
import net.sourceforge.atunes.gui.images.PlayImageIcon;
import net.sourceforge.atunes.model.IControlButton;

/**
 * @author alex
 * 
 */
public final class PlayPauseButton extends PlayerControlButton implements
		IControlButton {

	private static final long serialVersionUID = 4348041346542204394L;

	private boolean playing;

	private Dimension playButtonSize;

	private PauseImageIcon pauseIcon;

	private PlayImageIcon playIcon;

	/**
	 * @param pauseIcon
	 */
	public void setPauseIcon(final PauseImageIcon pauseIcon) {
		this.pauseIcon = pauseIcon;
	}

	/**
	 * @param playIcon
	 */
	public void setPlayIcon(final PlayImageIcon playIcon) {
		this.playIcon = playIcon;
	}

	/**
	 * Instantiates a new play pause button.
	 * 
	 * @param playAction
	 */
	public PlayPauseButton(final Action playAction) {
		super(playAction);
	}

	/**
	 * @param playButtonSize
	 */
	public void setPlayButtonSize(final Dimension playButtonSize) {
		this.playButtonSize = playButtonSize;
	}

	@Override
	protected Dimension getButtonSize() {
		return this.playButtonSize;
	}

	/**
	 * Sets the playing.
	 * 
	 * @param playing
	 *            the new playing
	 */
	public void setPlaying(final boolean playing) {
		GuiUtils.callInEventDispatchThread(new Runnable() {
			@Override
			public void run() {
				setPlayingState(playing);
			}
		});
	}

	private void setPlayingState(final boolean playing) {
		this.playing = playing;
		setIcon();
	}

	/**
	 * Checks if is playing.
	 * 
	 * @return true, if is playing
	 */
	public boolean isPlaying() {
		return this.playing;
	}

	@Override
	protected void setIcon() {
		if (this.playing) {
			this.pauseIcon.setSize(this.playButtonSize);
			updateIcon(this.pauseIcon);
		} else {
			this.playIcon.setSize(this.playButtonSize);
			updateIcon(this.playIcon);
		}
	}
}
