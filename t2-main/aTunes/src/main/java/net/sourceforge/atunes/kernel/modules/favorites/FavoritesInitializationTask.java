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

package net.sourceforge.atunes.kernel.modules.favorites;

import net.sourceforge.atunes.kernel.AbstractStateRetrieveTask;
import net.sourceforge.atunes.model.IBeanFactory;
import net.sourceforge.atunes.model.IFavorites;
import net.sourceforge.atunes.model.INavigationHandler;
import net.sourceforge.atunes.model.INavigationView;
import net.sourceforge.atunes.model.IPlayListHandler;
import net.sourceforge.atunes.model.IStateService;

/**
 * Reads favorites
 * 
 * @author alex
 * 
 */
public class FavoritesInitializationTask extends AbstractStateRetrieveTask {

	private IFavorites favorites;

	@Override
	public void retrieveData(final IStateService stateService,
			final IBeanFactory beanFactory) {
		this.favorites = stateService.retrieveFavoritesCache();
	}

	@Override
	public void setData(final IBeanFactory beanFactory) {
		if (this.favorites != null) {
			beanFactory.getBean(FavoritesHandler.class).setFavorites(
					this.favorites);
			// Update navigator
			beanFactory.getBean(INavigationHandler.class).refreshView(
					beanFactory.getBean("favoritesNavigationView",
							INavigationView.class));
			// Update playlist
			beanFactory.getBean(IPlayListHandler.class).refreshPlayList();
		}
	}
}
