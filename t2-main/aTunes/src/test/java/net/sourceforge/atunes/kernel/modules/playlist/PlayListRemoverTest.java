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

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.atunes.kernel.PlayListEventListeners;
import net.sourceforge.atunes.model.IAudioObject;
import net.sourceforge.atunes.model.IBeanFactory;
import net.sourceforge.atunes.model.ILocalAudioObject;
import net.sourceforge.atunes.model.IPlayList;
import net.sourceforge.atunes.model.IPlayListHandler;
import net.sourceforge.atunes.model.IPlayerControlsPanel;
import net.sourceforge.atunes.model.IPlayerHandler;
import net.sourceforge.atunes.model.IStatePlaylist;

import org.junit.Before;
import org.junit.Test;

public class PlayListRemoverTest {

	private PlayListRemover sut;
	
	private IPlayListHandler playListHandler;
	
	private IPlayListsContainer playListsContainer;
	
	private IPlayerHandler playerHandler;
	
	private IPlayListController playListController;
	
	private IPlayListTabController playListTabController;
	
	private PlayListEventListeners playListEventListeners;
	
	private IStatePlaylist statePlaylist;
	
	private IBeanFactory beanFactory;

	private PlayListInformationInStatusBar playListInformationInStatusBar;
	
	@Before
	public void init() {
		sut = new PlayListRemover();

		playListHandler = mock(IPlayListHandler.class);
		playListsContainer = mock(IPlayListsContainer.class);
		playerHandler = mock(IPlayerHandler.class);
		playListController = mock(IPlayListController.class);
		playListTabController = mock(IPlayListTabController.class);
		playListEventListeners = mock(PlayListEventListeners.class);
		statePlaylist = mock(IStatePlaylist.class);
		beanFactory = mock(IBeanFactory.class);
		playListInformationInStatusBar = mock(PlayListInformationInStatusBar.class);
		
		sut.setPlayerHandler(playerHandler);
		sut.setPlayListController(playListController);
		sut.setPlayListHandler(playListHandler);
		sut.setPlayListsContainer(playListsContainer);
		sut.setPlayListTabController(playListTabController);
		sut.setPlayListEventListeners(playListEventListeners);
		sut.setStatePlaylist(statePlaylist);
		sut.setBeanFactory(beanFactory);
		sut.setPlayListInformationInStatusBar(playListInformationInStatusBar);
	}
	
	@Test
	public void testRemoveActivePlayList() {
		playListsContainer.addPlayList(mock(IPlayList.class));
		playListsContainer.addPlayList(mock(IPlayList.class));
		when(playListsContainer.getVisiblePlayListIndex()).thenReturn(0);
		when(playListsContainer.getActivePlayListIndex()).thenReturn(1);
		when(playListsContainer.getPlayListsCount()).thenReturn(2);
		
		sut.removePlayList(1);
		
		verify(playListsContainer).removePlayList(1);
		
		verify(playListsContainer).setVisiblePlayListActive();
		verify(playerHandler).stopCurrentAudioObject(false);
	}

	@Test
	public void testRemoveNotActivePlayList() {
		playListsContainer.addPlayList(mock(IPlayList.class));
		playListsContainer.addPlayList(mock(IPlayList.class));
		playListsContainer.addPlayList(mock(IPlayList.class));
		when(playListsContainer.getVisiblePlayListIndex()).thenReturn(0);
		when(playListsContainer.getActivePlayListIndex()).thenReturn(2);
		when(playListsContainer.getPlayListsCount()).thenReturn(3);
		
		sut.removePlayList(1);
		
		verify(playListsContainer).removePlayList(1);
		
		verify(playListsContainer, never()).setVisiblePlayListActive();
		verify(playerHandler, never()).stopCurrentAudioObject(false);
	}

	@Test
	public void testRemoveNotActivePlayListAtLeft() {
		playListsContainer.addPlayList(mock(IPlayList.class));
		playListsContainer.addPlayList(mock(IPlayList.class));
		playListsContainer.addPlayList(mock(IPlayList.class));
		when(playListsContainer.getVisiblePlayListIndex()).thenReturn(1);
		when(playListsContainer.getActivePlayListIndex()).thenReturn(2);
		when(playListsContainer.getPlayListsCount()).thenReturn(3);
		
		sut.removePlayList(0);
		
		verify(playListsContainer).removePlayList(0);
		verify(playListsContainer).setVisiblePlayListIndex(0);
		
		verify(playListsContainer, never()).setVisiblePlayListActive();
		verify(playerHandler, never()).stopCurrentAudioObject(false);
	}

	@Test
	public void testRemoveActivePlayListAtLeft() {
		playListsContainer.addPlayList(mock(IPlayList.class));
		playListsContainer.addPlayList(mock(IPlayList.class));
		playListsContainer.addPlayList(mock(IPlayList.class));
		when(playListsContainer.getVisiblePlayListIndex()).thenReturn(2);
		when(playListsContainer.getActivePlayListIndex()).thenReturn(2);
		when(playListsContainer.getPlayListsCount()).thenReturn(3);
		
		sut.removePlayList(0);
		
		verify(playListsContainer).removePlayList(0);
		verify(playListsContainer).setVisiblePlayListIndex(1);
		verify(playListsContainer).setActivePlayListIndex(1);
		
		verify(playListsContainer, never()).setVisiblePlayListActive();
		verify(playerHandler, never()).stopCurrentAudioObject(false);
	}

	
	@Test
	public void testEmptyClearPlayList() {
		IPlayList mockPlayList = mock(IPlayList.class);
		when(playListHandler.getVisiblePlayList()).thenReturn(mockPlayList);
		when(mockPlayList.isEmpty()).thenReturn(true);
		when(playListHandler.isActivePlayListVisible()).thenReturn(false);
		
		sut.clearPlayList();
		
		verify(statePlaylist, never()).isStopPlayerOnPlayListClear();
	}
	
	@Test
	public void testClearPlayList() {
		IPlayList mockPlayList = mock(IPlayList.class);
		when(playListHandler.getVisiblePlayList()).thenReturn(mockPlayList);
		when(mockPlayList.isEmpty()).thenReturn(false);
		when(playListHandler.isActivePlayListVisible()).thenReturn(false);
		when(statePlaylist.isStopPlayerOnPlayListClear()).thenReturn(true);
		
		sut.clearPlayList();

		verify(playListEventListeners, never()).playListCleared();
		verify(playerHandler, never()).stopCurrentAudioObject(false);
		verify(beanFactory, never()).getBean(null);
	}
	
	@Test
	public void testRemoveAudioObjects() {
		IPlayList mockPlayList = mock(IPlayList.class);
		when(playListHandler.getVisiblePlayList()).thenReturn(mockPlayList);
		
		int[] mockInt = new int[1];
		mockInt[0] = 0;
		
		sut.removeAudioObjects(mockInt);
		
		verify(mockPlayList, never()).setCurrentAudioObjectIndex(0);
		
	}
	
	@Test
	public void testRemoveAudioFiles() {
		IPlayList mockPlayList = mock(IPlayList.class);
		when(playListHandler.getVisiblePlayList()).thenReturn(mockPlayList);
		List<ILocalAudioObject> audioFiles = new ArrayList<ILocalAudioObject>();
		
		sut.removeAudioFiles(audioFiles);
		
		verify(playListInformationInStatusBar).showPlayListInformation(mockPlayList);
	}
	
	@Test
	public void testcloseOtherPlaylists() {
		when(playListTabController.getSelectedPlayListIndex()).thenReturn(2);
		sut.closeOtherPlaylists();
		
		verify(playListTabController).getSelectedPlayListIndex();
	}
}
