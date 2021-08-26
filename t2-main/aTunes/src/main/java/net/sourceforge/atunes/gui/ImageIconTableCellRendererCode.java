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

package net.sourceforge.atunes.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 * Renderer for ImageIcon objects
 * 
 * @author alex
 * 
 */
public class ImageIconTableCellRendererCode extends
		AbstractTableCellRendererCode<JLabel, ImageIcon> {

	@Override
	public JLabel getComponent(final JLabel c, final JTable table,
			final ImageIcon value, final boolean isSelected,
			final boolean hasFocus, final int row, final int column) {
		c.setText(null);
		c.setIcon(value);
		return c;
	}
}
