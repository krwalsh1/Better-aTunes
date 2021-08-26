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

package net.sourceforge.atunes.gui.images;

import java.awt.Color;
import java.awt.Polygon;

import javax.swing.ImageIcon;

/**
 * Icon for repeat
 * 
 * @author alex
 * 
 */
public class RepeatImageIcon extends CachedIconFactory {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2210195660630167447L;

	@Override
	protected ImageIcon createIcon(final Color color) {
		Polygon p = new Polygon();
		p.addPoint(2, 5);
		p.addPoint(2, 3);
		p.addPoint(16, 3);
		p.addPoint(16, 15);
		p.addPoint(2, 15);
		p.addPoint(2, 5);
		p.addPoint(4, 5);
		p.addPoint(4, 13);
		p.addPoint(14, 13);
		p.addPoint(14, 5);

		Polygon p3 = new Polygon();
		p3.addPoint(11, 1);
		p3.addPoint(15, 4);
		p3.addPoint(11, 7);

		Polygon p4 = new Polygon();
		p4.addPoint(3, 14);
		p4.addPoint(7, 11);
		p4.addPoint(7, 17);

		return IconGenerator.generateIcon(color, 18, 18, p, p3, p4);
	}
}
