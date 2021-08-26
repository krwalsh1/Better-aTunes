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

package net.sourceforge.atunes.model;

import net.sourceforge.atunes.kernel.modules.repository.Album;
import net.sourceforge.atunes.kernel.modules.repository.Genre;
import net.sourceforge.atunes.kernel.modules.repository.Artist;
import net.sourceforge.atunes.kernel.modules.repository.AudioFile;

import org.junit.Assert;
import org.junit.Test;


public class AlbumTest {

	private static final String ARTIST_NAME = "zas heg ha";
	private static final String ARTIST_NAME2 = "FirebendingToph";
	private static final String ALBUM_NAME = "hswwdhgfdjgf";
	private static final String ALBUM_NAME2 = null;
	private static final String AUDIO_FILE_1 = "dhjada";
	private static final String AUDIO_FILE_2 = "dhjadasd";
	private static final Genre gen1 = new Genre("rock");
	
	private static Artist artist = new Artist(ARTIST_NAME);
	private static Artist artist2 = new Artist(ARTIST_NAME);
	private static Artist artist3 = new Artist(ARTIST_NAME);
	private static Artist artist4 = new Artist(ARTIST_NAME2);
	
	
	private static Album a1 = new Album(artist, ALBUM_NAME);
	private Album a2 = new Album(artist2, ALBUM_NAME);
	private Album a3 = new Album(artist3, ALBUM_NAME);
	private Album a4 = new Album(artist4, ALBUM_NAME2);
	
	@Test
	public void createAlbum() {
		Assert.assertEquals(artist, a1.getArtist());
		Assert.assertTrue(a1.isEmpty());
		Assert.assertTrue(a1.getName().equals(ALBUM_NAME));		
	}
	
	@Test
	public void testToString() {
		Assert.assertEquals(a1.toString().equals(ALBUM_NAME), true);
	}
	
	@Test
	public void testHashCode() {
		try {
			int test = a1.hashCode();
			int test2 = a4.hashCode();
			Assert.assertTrue(true);
		} catch (Exception e) {
			Assert.fail("Album.hashCode() did not return a valid int\n");
		}
	}
	
	@Test
	public void testAudioObjects() {
		AudioFile af1 = new AudioFile(AUDIO_FILE_1);
		AudioFile af2 = new AudioFile(AUDIO_FILE_2);
		
		a1.addAudioFile(af1);
		a1.addAudioFile(af2);
		
		Assert.assertTrue(a1.getAudioObjects().contains(af1));
		Assert.assertTrue(a1.getAudioObjects().contains(af2));
		
		a1.removeAudioFile(af1);
		Assert.assertFalse(a1.getAudioObjects().contains(af1));
		Assert.assertTrue(a1.getAudioObjects().contains(af2));
	}
	
	@Test
	public void testcompareTo() {
		artist2 = new Artist(null);
		artist3 = new Artist(null);
		a2 = new Album(artist2, null);
		a3 = new Album(artist3, null);
		Assert.assertEquals(a2.compareTo(a3), 1);
		
		artist2 = new Artist("Drake");
		artist3 = new Artist("Mac Miller");
		a2 = new Album(artist2, "if you're reading this it's too late");
		a3 = new Album(artist3, "swimming");
		
		artist2 = new Artist("Drake");
		artist3 = new Artist("Drake");
		a2 = new Album(artist2, "if you're reading this it's too late");
		a3 = new Album(artist3, "if you're reading this it's too late");
		Assert.assertEquals(a2.compareTo(a3), 0);
	}
	
	@Test
	public void testEquals() {
		
		a2 = new Album(artist2, "if you're reading this it's too late");
		a3 = new Album(artist3, "swimming");	
		Assert.assertTrue(a2.equals(a2));
		Assert.assertFalse(a2.equals(a3));
		
		a2 = null;
		Assert.assertFalse(a3.equals(a2));
		
		a2 = new Album(artist4, "testing Album with different Artists");
		Assert.assertFalse(a2.equals(a3) );
		
		String notAnAlbum = "Hello there.\n General Kenobi.";
		Assert.assertFalse(a3.equals(notAnAlbum) );
		
		a2 = new Album(null, "testing Album equals with a null artist");
		Assert.assertFalse(a2.equals(a3) );
		a3 = new Album(null, "testing Album with another null artist");
		Assert.assertFalse(a2.equals(a3) );
		
		a2 = new Album(artist2, "the name");
		a3 = new Album(artist, "the name");
		Assert.assertTrue(a2.equals(a3) );
	}
	
	@Test
	public void testSize() {
		try {
			a2 = new Album(artist2, "if you're reading this it's too late");
			int test = a2.size();
		} catch (Exception e) {
			Assert.fail("Album.size() did not return an int.\n");
		}
	}
}
