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

package net.sourceforge.atunes.gui.lookandfeel.substance;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JComponent;

interface ICustomSubstanceSkin {

	/**
	 * Defines custom colors for mutable icons
	 * 
	 * @param component
	 * @param isSelected
	 * @return
	 */
	public Color getPaintForColorMutableIcon(Component component,
			boolean isSelected);

	/**
	 * Returns paint to be used with certain controls (player controls)
	 * 
	 * @return
	 */
	public Color getPaintForSpecialControls();

	/**
	 * Returns paint to be used with certain controls (player controls)
	 * 
	 * @return
	 */
	public Color getPaintForSpecialControlsRollover();

	/**
	 * Returns paint to be used with certain controls (player controls) when
	 * disabled
	 * 
	 * @return
	 */
	public Color getPaintForDisabledSpecialControls();

	/**
	 * Defines custom configuration for component
	 * 
	 * @param c
	 */
	public void setupComponent(JComponent c);

}
