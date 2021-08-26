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

package net.sourceforge.atunes.kernel.modules.state;

import java.io.Serializable;

/**
 * Represents a value of a preference
 * @author alex
 *
 */
public class Preference implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6098500054034715366L;

	private Object value;

	/**
	 * @return
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * Sets value of this preference
	 * @param value
	 */
	public void setValue(Object value) {
		this.value = value;
	}	
}
