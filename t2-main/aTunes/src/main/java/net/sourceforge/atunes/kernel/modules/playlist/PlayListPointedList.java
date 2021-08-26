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

package net.sourceforge.atunes.kernel.modules.playlist;

import net.sourceforge.atunes.model.IAudioObject;
import net.sourceforge.atunes.model.IStatePlayer;
import net.sourceforge.atunes.utils.PointedList;

class PlayListPointedList extends PointedList<IAudioObject> {
    
	private static final long serialVersionUID = -6966402482637754615L;

    private transient IStatePlayer statePlayer;
    
    /**
     * No args constructor for serialization 
     */
    PlayListPointedList() {
	}
    
    /**
     * @param statePlayer
     */
    PlayListPointedList(IStatePlayer statePlayer) {
        super();
        this.statePlayer = statePlayer;
    }

    /**
     * @param pointedList
     * @param statePlayer
     */
    PlayListPointedList(PointedList<IAudioObject> pointedList, IStatePlayer statePlayer) {
        super(pointedList);
        this.statePlayer = statePlayer;
    }

    @Override
    public boolean isCyclic() {
        return statePlayer.isRepeat();
    }
    
    /**
     * @param statePlayer
     */
    public void setStatePlayer(IStatePlayer statePlayer) {
		this.statePlayer = statePlayer;
	}
}