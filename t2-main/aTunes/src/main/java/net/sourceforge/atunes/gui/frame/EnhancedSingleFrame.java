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

package net.sourceforge.atunes.gui.frame;

import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JSplitPane;

import net.sourceforge.atunes.gui.GuiUtils;
import net.sourceforge.atunes.model.IFrameState;

/**
 * A single frame where playlist is under navigator table, navigator tree at
 * left, context panel at right
 * 
 * @author alex
 * 
 */
public final class EnhancedSingleFrame extends MainSplitPaneLeftSingleFrame {

	private static final long serialVersionUID = 1L;

	private static final String PLAYLIST_SPLIT_PANE = "3";

	private JSplitPane playListSplitPane;

	@Override
	protected void setupSplitPaneDividerPosition(final IFrameState frameState) {
		super.setupSplitPaneDividerPosition(frameState);
		applySplitPaneDividerPosition(this.playListSplitPane,
				frameState.getSplitPaneDividerPos(PLAYLIST_SPLIT_PANE), 0.5);
	}

	@Override
	public void showContextPanel(final boolean show) {
		applyVisibility(show, RIGHT_SPLIT_PANE, getContextPanel()
				.getSwingComponent(), getRightSplitPane());
	}

	@Override
	public void showNavigator(final boolean show) {
		applyVisibility(show, LEFT_SPLIT_PANE, getNavigationTreePanel()
				.getSwingComponent(), getLeftSplitPane());
	}

	@Override
	public void showNavigationTree(final boolean show) {
		super.showNavigationTree(show);
		GuiUtils.callInEventDispatchThreadLater(new Runnable() {
			@Override
			public void run() {
				applyVisibility(show, LEFT_SPLIT_PANE, getNavigationTreePanel()
						.getSwingComponent(), getLeftSplitPane());
			}
		});
	}

	@Override
	public void showNavigationTable(final boolean show) {
		applyVisibility(show, PLAYLIST_SPLIT_PANE, getNavigationTablePanel()
				.getSwingComponent(), this.playListSplitPane);
	}

	@Override
	protected JComponent getComponentA() {
		return getNavigationTreePanel().getSwingComponent();
	}

	@Override
	protected JComponent getComponentB() {
		this.playListSplitPane = new SplitPaneFactory().getSplitPane(
				getControlsBuilder(), this, PLAYLIST_SPLIT_PANE,
				JSplitPane.VERTICAL_SPLIT, getNavigationTablePanel()
						.getSwingComponent(), getPlayListPanel()
						.getSwingComponent());
		return this.playListSplitPane;
	}

	@Override
	protected JComponent getComponentC() {
		return getContextPanel().getSwingComponent();
	}

	@Override
	protected Dimension getNavigationTablePanelMinimumSize() {
		return getContext().getBean("navigationTableMinimumSize",
				Dimension.class);
	}

	@Override
	protected Dimension getNavigationTablePanelPreferredSize() {
		return getContext().getBean("navigationTablePreferredSize",
				Dimension.class);
	}

	@Override
	protected Dimension getNavigationTablePanelMaximumSize() {
		return getContext().getBean("navigationTableMaximumSize",
				Dimension.class);
	}

	@Override
	protected Dimension getNavigationTreePanelMinimumSize() {
		return getContext().getBean("navigationMinimumSize", Dimension.class);
	}

	@Override
	protected Dimension getNavigationTreePanelPreferredSize() {
		return getContext().getBean("navigationPreferredSize", Dimension.class);
	}

	@Override
	protected Dimension getNavigationTreePanelMaximumSize() {
		return getContext().getBean("navigationMaximumSize", Dimension.class);
	}

	@Override
	public Map<String, Double> getDefaultSplitPaneRelativePositions() {
		Map<String, Double> values = new HashMap<String, Double>();
		values.put(LEFT_SPLIT_PANE, 0.3);
		values.put(RIGHT_SPLIT_PANE, 0.6);
		values.put(PLAYLIST_SPLIT_PANE, 0.4);
		return values;
	}

	@Override
	protected int getLeftSplitType() {
		return JSplitPane.HORIZONTAL_SPLIT;
	}

	@Override
	protected int getRightSplitType() {
		return JSplitPane.HORIZONTAL_SPLIT;
	}

}
