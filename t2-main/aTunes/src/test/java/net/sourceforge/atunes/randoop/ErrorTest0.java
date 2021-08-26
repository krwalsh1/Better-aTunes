package net.sourceforge.atunes.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = cDMetadata0.getArtist((int) (short) 10);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = cDMetadata0.getComposer((int) (byte) 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = cDMetadata0.getArtist((int) '4');
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = cDMetadata0.getComposer((int) (short) -1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = cDMetadata0.getComposer((int) (short) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = cDMetadata0.getArtist(0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = cDMetadata0.getArtist((int) (short) 10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList4 = cDMetadata0.getTrackNames();
        java.lang.String str5 = cDMetadata0.getAlbum();
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = cDMetadata0.getComposer(120);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        java.lang.Integer[] intArray21 = new java.lang.Integer[] { 10, 100 };
        java.util.ArrayList<java.lang.Integer> intList22 = new java.util.ArrayList<java.lang.Integer>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.Integer>) intList22, intArray21);
        cDMetadata0.setTracks((java.util.List<java.lang.Integer>) intList22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = cDMetadata0.getComposer((int) (short) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        net.sourceforge.atunes.model.FontSettings fontSettings0 = new net.sourceforge.atunes.model.FontSettings();
        net.sourceforge.atunes.model.CDMetadata cDMetadata1 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata1.setAlbumArtist("");
        boolean boolean4 = fontSettings0.equals((java.lang.Object) cDMetadata1);
        java.lang.String str5 = cDMetadata1.getGenre();
        java.lang.String str6 = cDMetadata1.getAlbumArtist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = cDMetadata1.getComposer((int) (short) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = cDMetadata0.getArtist((int) (byte) 1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = cDMetadata0.getComposer((int) (byte) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        net.sourceforge.atunes.model.FontSettings fontSettings0 = new net.sourceforge.atunes.model.FontSettings();
        net.sourceforge.atunes.model.CDMetadata cDMetadata1 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata1.setAlbumArtist("");
        boolean boolean4 = fontSettings0.equals((java.lang.Object) cDMetadata1);
        java.lang.String str5 = cDMetadata1.getAlbum();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = cDMetadata1.getArtist((int) (byte) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = cDMetadata0.getArtist(0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = cDMetadata0.getArtist(10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        java.lang.String[] strArray5 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList6);
        cDMetadata0.setAlbumArtist("net.sourceforge.atunes.model.InconsistentRepositoryException");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = cDMetadata0.getArtist(0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        int int4 = cDMetadata0.getYear();
        int int5 = cDMetadata0.getYear();
        net.sourceforge.atunes.model.CDMetadata cDMetadata6 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str7 = cDMetadata6.getGenre();
        net.sourceforge.atunes.model.CDMetadata cDMetadata8 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata8.setAlbumArtist("");
        java.lang.String str11 = cDMetadata8.getGenre();
        java.lang.String[] strArray13 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        cDMetadata8.setTrackNames((java.util.List<java.lang.String>) strList14);
        cDMetadata6.setComposerNames((java.util.List<java.lang.String>) strList14);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList14);
        net.sourceforge.atunes.model.CDMetadata cDMetadata19 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str20 = cDMetadata19.getGenre();
        java.util.List<java.lang.String> strList21 = cDMetadata19.getComposerNames();
        java.lang.String str22 = cDMetadata19.getAlbum();
        java.util.List<java.lang.Integer> intList23 = cDMetadata19.getTracks();
        int int24 = cDMetadata19.getDisc();
        java.lang.String[] strArray32 = new java.lang.String[] { "net.sourceforge.atunes.model.InconsistentRepositoryException", "./title", "1.0.0 ", "./title", "./duration", "mpc", "net.sourceforge.atunes.model.InconsistentRepositoryException" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        cDMetadata19.setArtistNames((java.util.List<java.lang.String>) strList33);
        cDMetadata0.setArtistNames((java.util.List<java.lang.String>) strList33);
        java.lang.String[] strArray43 = new java.lang.String[] { "./description", "flac", "./author", "/rss/channel/item", "flac", "1.0.0 " };
        java.util.ArrayList<java.lang.String> strList44 = new java.util.ArrayList<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList44, strArray43);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = cDMetadata0.getComposer(120);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        int int5 = cDMetadata0.getYear();
        java.util.List<java.lang.String> strList6 = cDMetadata0.getArtistNames();
        cDMetadata0.setDisc((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = cDMetadata0.getArtist(90);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        java.lang.String[] strArray5 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList6);
        cDMetadata0.setAlbumArtist("net.sourceforge.atunes.model.InconsistentRepositoryException");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = cDMetadata0.getArtist((int) (short) 100);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        java.util.List<java.lang.String> strList4 = cDMetadata0.getTrackNames();
        cDMetadata0.setAlbum("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = cDMetadata0.getComposer((int) (short) 100);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        int int5 = cDMetadata0.getYear();
        cDMetadata0.setAlbumArtist("mpc");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = cDMetadata0.getArtist((int) ' ');
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        int int1 = cDMetadata0.getYear();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = cDMetadata0.getComposer((int) (byte) 1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        java.lang.String str7 = cDMetadata0.getAlbumArtist();
        cDMetadata0.setYear((-1));
        java.util.List<java.lang.String> strList10 = cDMetadata0.getTrackNames();
        int int11 = cDMetadata0.getYear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = cDMetadata0.getComposer(120);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = cDMetadata0.getComposer(10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.util.List<java.lang.String> strList1 = cDMetadata0.getArtistNames();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getTrackNames();
        java.lang.String str3 = cDMetadata0.getAlbumArtist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = cDMetadata0.getComposer(0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        int int1 = cDMetadata0.getYear();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = cDMetadata0.getComposer(90);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = cDMetadata0.getArtist((int) (byte) 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        int int5 = cDMetadata0.getYear();
        cDMetadata0.setAlbum("./description");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = cDMetadata0.getArtist((int) 'a');
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        java.util.List<java.lang.String> strList19 = cDMetadata0.getTrackNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = cDMetadata0.getComposer((int) (short) 10);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        cDMetadata0.setDisc((int) (short) -1);
        cDMetadata0.setDisc(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = cDMetadata0.getComposer((int) 'a');
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        java.lang.String str19 = cDMetadata0.getGenre();
        cDMetadata0.setAlbum("/rss/channel/title");
        java.util.List<java.lang.String> strList22 = cDMetadata0.getTrackNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = cDMetadata0.getComposer((int) 'a');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        cDMetadata0.setDisc((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = cDMetadata0.getComposer((int) (byte) 100);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        java.lang.String str19 = cDMetadata0.getGenre();
        cDMetadata0.setYear((int) (short) 10);
        java.lang.String str22 = cDMetadata0.getAlbum();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = cDMetadata0.getArtist((int) (short) -1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = cDMetadata0.getArtist((int) '#');
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        cDMetadata0.setAlbumArtist("SOCKS_PROXY");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = cDMetadata0.getArtist(0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        int int1 = cDMetadata0.getYear();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        net.sourceforge.atunes.model.FontSettings fontSettings3 = new net.sourceforge.atunes.model.FontSettings();
        net.sourceforge.atunes.model.CDMetadata cDMetadata4 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata4.setAlbumArtist("");
        boolean boolean7 = fontSettings3.equals((java.lang.Object) cDMetadata4);
        java.lang.String str8 = cDMetadata4.getAlbum();
        java.lang.String str9 = cDMetadata4.getAlbum();
        java.lang.String str11 = cDMetadata4.getTitle(1);
        java.util.List<java.lang.String> strList12 = cDMetadata4.getTrackNames();
        net.sourceforge.atunes.model.CDMetadata cDMetadata13 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str14 = cDMetadata13.getGenre();
        net.sourceforge.atunes.model.CDMetadata cDMetadata15 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata15.setAlbumArtist("");
        java.lang.String str18 = cDMetadata15.getGenre();
        java.lang.String[] strArray20 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        cDMetadata15.setTrackNames((java.util.List<java.lang.String>) strList21);
        cDMetadata13.setComposerNames((java.util.List<java.lang.String>) strList21);
        cDMetadata4.setComposerNames((java.util.List<java.lang.String>) strList21);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = cDMetadata0.getComposer((int) (short) 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        java.lang.String str19 = cDMetadata0.getGenre();
        cDMetadata0.setYear((int) (short) 10);
        net.sourceforge.atunes.model.CDMetadata cDMetadata22 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata22.setAlbumArtist("");
        java.lang.String str25 = cDMetadata22.getGenre();
        java.lang.String[] strArray27 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        cDMetadata22.setTrackNames((java.util.List<java.lang.String>) strList28);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList28);
        int int32 = cDMetadata0.getDisc();
        java.util.List<java.lang.String> strList33 = cDMetadata0.getComposerNames();
        net.sourceforge.atunes.model.CDMetadata cDMetadata34 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata34.setAlbumArtist("");
        java.lang.String str37 = cDMetadata34.getGenre();
        java.util.List<java.lang.String> strList38 = cDMetadata34.getTrackNames();
        java.util.List<java.lang.String> strList39 = cDMetadata34.getTrackNames();
        net.sourceforge.atunes.model.CDMetadata cDMetadata40 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata40.setAlbumArtist("");
        java.lang.String str44 = cDMetadata40.getTitle((int) (byte) -1);
        net.sourceforge.atunes.model.CDMetadata cDMetadata45 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata45.setAlbumArtist("");
        java.lang.String str48 = cDMetadata45.getGenre();
        int int49 = cDMetadata45.getYear();
        int int50 = cDMetadata45.getYear();
        net.sourceforge.atunes.model.CDMetadata cDMetadata51 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str52 = cDMetadata51.getGenre();
        net.sourceforge.atunes.model.CDMetadata cDMetadata53 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata53.setAlbumArtist("");
        java.lang.String str56 = cDMetadata53.getGenre();
        java.lang.String[] strArray58 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        cDMetadata53.setTrackNames((java.util.List<java.lang.String>) strList59);
        cDMetadata51.setComposerNames((java.util.List<java.lang.String>) strList59);
        cDMetadata45.setTrackNames((java.util.List<java.lang.String>) strList59);
        net.sourceforge.atunes.model.CDMetadata cDMetadata64 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str65 = cDMetadata64.getGenre();
        java.util.List<java.lang.String> strList66 = cDMetadata64.getComposerNames();
        java.lang.String str67 = cDMetadata64.getAlbum();
        java.util.List<java.lang.Integer> intList68 = cDMetadata64.getTracks();
        int int69 = cDMetadata64.getDisc();
        java.lang.String[] strArray77 = new java.lang.String[] { "net.sourceforge.atunes.model.InconsistentRepositoryException", "./title", "1.0.0 ", "./title", "./duration", "mpc", "net.sourceforge.atunes.model.InconsistentRepositoryException" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        cDMetadata64.setArtistNames((java.util.List<java.lang.String>) strList78);
        cDMetadata45.setArtistNames((java.util.List<java.lang.String>) strList78);
        cDMetadata40.setComposerNames((java.util.List<java.lang.String>) strList78);
        cDMetadata34.setTrackNames((java.util.List<java.lang.String>) strList78);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str86 = cDMetadata0.getComposer((int) (short) -1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList4 = cDMetadata0.getTrackNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = cDMetadata0.getComposer((int) ' ');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        java.lang.String[] strArray5 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList6);
        cDMetadata0.setYear((int) (short) 10);
        cDMetadata0.setDisc(0);
        cDMetadata0.setYear((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = cDMetadata0.getComposer((int) (byte) 10);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        java.lang.String[] strArray5 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList6);
        java.lang.String str10 = cDMetadata0.getTitle((int) (byte) 100);
        cDMetadata0.setYear((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = cDMetadata0.getArtist((int) (short) 100);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        int int5 = cDMetadata0.getYear();
        java.util.List<java.lang.String> strList6 = cDMetadata0.getArtistNames();
        cDMetadata0.setDisc((int) (short) 100);
        net.sourceforge.atunes.model.CDMetadata cDMetadata9 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata9.setAlbumArtist("");
        java.lang.String str12 = cDMetadata9.getGenre();
        java.lang.String[] strArray14 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        cDMetadata9.setTrackNames((java.util.List<java.lang.String>) strList15);
        cDMetadata0.setArtistNames((java.util.List<java.lang.String>) strList15);
        java.lang.String str19 = cDMetadata0.getAlbum();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = cDMetadata0.getComposer((-1));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        int int1 = cDMetadata0.getYear();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = cDMetadata0.getArtist((int) ' ');
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        java.lang.String str19 = cDMetadata0.getGenre();
        cDMetadata0.setAlbum("/rss/channel/title");
        java.util.List<java.lang.String> strList22 = cDMetadata0.getTrackNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = cDMetadata0.getComposer(120);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        java.lang.String str7 = cDMetadata0.getAlbumArtist();
        cDMetadata0.setYear((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = cDMetadata0.getArtist((int) (byte) 100);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        cDMetadata0.setAlbumArtist("net.sourceforge.atunes.model.InconsistentRepositoryException");
        cDMetadata0.setAlbumArtist("10.52.35  ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = cDMetadata0.getArtist(0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        net.sourceforge.atunes.model.FontSettings fontSettings0 = new net.sourceforge.atunes.model.FontSettings();
        net.sourceforge.atunes.model.CDMetadata cDMetadata1 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata1.setAlbumArtist("");
        boolean boolean4 = fontSettings0.equals((java.lang.Object) cDMetadata1);
        fontSettings0.setUseFontSmoothingSettingsFromOs(false);
        boolean boolean7 = fontSettings0.isUseFontSmoothing();
        net.sourceforge.atunes.model.PlaybackState playbackState8 = net.sourceforge.atunes.model.PlaybackState.PLAY_FINISHED;
        boolean boolean9 = fontSettings0.equals((java.lang.Object) playbackState8);
        net.sourceforge.atunes.model.CDMetadata cDMetadata10 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata10.setAlbumArtist("");
        java.lang.String str13 = cDMetadata10.getGenre();
        int int14 = cDMetadata10.getYear();
        int int15 = cDMetadata10.getYear();
        net.sourceforge.atunes.model.CDMetadata cDMetadata16 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str17 = cDMetadata16.getGenre();
        net.sourceforge.atunes.model.CDMetadata cDMetadata18 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata18.setAlbumArtist("");
        java.lang.String str21 = cDMetadata18.getGenre();
        java.lang.String[] strArray23 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        cDMetadata18.setTrackNames((java.util.List<java.lang.String>) strList24);
        cDMetadata16.setComposerNames((java.util.List<java.lang.String>) strList24);
        cDMetadata10.setTrackNames((java.util.List<java.lang.String>) strList24);
        net.sourceforge.atunes.model.CDMetadata cDMetadata29 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str30 = cDMetadata29.getGenre();
        java.util.List<java.lang.String> strList31 = cDMetadata29.getComposerNames();
        java.lang.String str32 = cDMetadata29.getAlbum();
        java.util.List<java.lang.Integer> intList33 = cDMetadata29.getTracks();
        int int34 = cDMetadata29.getDisc();
        java.lang.String[] strArray42 = new java.lang.String[] { "net.sourceforge.atunes.model.InconsistentRepositoryException", "./title", "1.0.0 ", "./title", "./duration", "mpc", "net.sourceforge.atunes.model.InconsistentRepositoryException" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        cDMetadata29.setArtistNames((java.util.List<java.lang.String>) strList43);
        cDMetadata10.setArtistNames((java.util.List<java.lang.String>) strList43);
        net.sourceforge.atunes.model.CDMetadata cDMetadata47 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata47.setAlbumArtist("");
        java.lang.String str50 = cDMetadata47.getGenre();
        java.lang.String[] strArray52 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        cDMetadata47.setTrackNames((java.util.List<java.lang.String>) strList53);
        cDMetadata10.setTrackNames((java.util.List<java.lang.String>) strList53);
        boolean boolean57 = fontSettings0.equals((java.lang.Object) cDMetadata10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str59 = cDMetadata10.getComposer((int) '#');
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        net.sourceforge.atunes.model.CDMetadata cDMetadata4 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata4.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList7 = cDMetadata4.getTracks();
        cDMetadata4.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList10 = cDMetadata4.getTrackNames();
        net.sourceforge.atunes.model.CDMetadata cDMetadata11 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata11.setAlbumArtist("");
        java.lang.String str14 = cDMetadata11.getGenre();
        java.lang.String[] strArray16 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        cDMetadata11.setTrackNames((java.util.List<java.lang.String>) strList17);
        cDMetadata4.setTrackNames((java.util.List<java.lang.String>) strList17);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = cDMetadata0.getArtist(3);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        java.lang.String str19 = cDMetadata0.getGenre();
        cDMetadata0.setYear((int) (short) 10);
        net.sourceforge.atunes.model.CDMetadata cDMetadata22 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata22.setAlbumArtist("");
        java.lang.String str25 = cDMetadata22.getGenre();
        java.lang.String[] strArray27 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        cDMetadata22.setTrackNames((java.util.List<java.lang.String>) strList28);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList28);
        int int32 = cDMetadata0.getDisc();
        java.util.List<java.lang.String> strList33 = cDMetadata0.getComposerNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str35 = cDMetadata0.getArtist((int) 'a');
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        java.lang.String str19 = cDMetadata0.getGenre();
        cDMetadata0.setYear((int) (short) 10);
        net.sourceforge.atunes.model.CDMetadata cDMetadata22 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata22.setAlbumArtist("");
        java.lang.String str25 = cDMetadata22.getGenre();
        java.lang.String[] strArray27 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList28 = new java.util.ArrayList<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList28, strArray27);
        cDMetadata22.setTrackNames((java.util.List<java.lang.String>) strList28);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList28);
        int int32 = cDMetadata0.getDisc();
        java.util.List<java.lang.String> strList33 = cDMetadata0.getComposerNames();
        net.sourceforge.atunes.model.CDMetadata cDMetadata34 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata34.setAlbumArtist("");
        java.lang.String str37 = cDMetadata34.getGenre();
        java.util.List<java.lang.String> strList38 = cDMetadata34.getTrackNames();
        java.util.List<java.lang.String> strList39 = cDMetadata34.getTrackNames();
        net.sourceforge.atunes.model.CDMetadata cDMetadata40 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata40.setAlbumArtist("");
        java.lang.String str44 = cDMetadata40.getTitle((int) (byte) -1);
        net.sourceforge.atunes.model.CDMetadata cDMetadata45 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata45.setAlbumArtist("");
        java.lang.String str48 = cDMetadata45.getGenre();
        int int49 = cDMetadata45.getYear();
        int int50 = cDMetadata45.getYear();
        net.sourceforge.atunes.model.CDMetadata cDMetadata51 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str52 = cDMetadata51.getGenre();
        net.sourceforge.atunes.model.CDMetadata cDMetadata53 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata53.setAlbumArtist("");
        java.lang.String str56 = cDMetadata53.getGenre();
        java.lang.String[] strArray58 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        cDMetadata53.setTrackNames((java.util.List<java.lang.String>) strList59);
        cDMetadata51.setComposerNames((java.util.List<java.lang.String>) strList59);
        cDMetadata45.setTrackNames((java.util.List<java.lang.String>) strList59);
        net.sourceforge.atunes.model.CDMetadata cDMetadata64 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str65 = cDMetadata64.getGenre();
        java.util.List<java.lang.String> strList66 = cDMetadata64.getComposerNames();
        java.lang.String str67 = cDMetadata64.getAlbum();
        java.util.List<java.lang.Integer> intList68 = cDMetadata64.getTracks();
        int int69 = cDMetadata64.getDisc();
        java.lang.String[] strArray77 = new java.lang.String[] { "net.sourceforge.atunes.model.InconsistentRepositoryException", "./title", "1.0.0 ", "./title", "./duration", "mpc", "net.sourceforge.atunes.model.InconsistentRepositoryException" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        cDMetadata64.setArtistNames((java.util.List<java.lang.String>) strList78);
        cDMetadata45.setArtistNames((java.util.List<java.lang.String>) strList78);
        cDMetadata40.setComposerNames((java.util.List<java.lang.String>) strList78);
        cDMetadata34.setTrackNames((java.util.List<java.lang.String>) strList78);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str86 = cDMetadata0.getArtist(100);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        cDMetadata0.setAlbum("/rss/channel/item");
        java.util.List<java.lang.String> strList9 = cDMetadata0.getArtistNames();
        cDMetadata0.setGenre("net.sourceforge.atunes.model.SearchQuerySyntaxException");
        cDMetadata0.setAlbumArtist("./updated");
        cDMetadata0.setYear(2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = cDMetadata0.getComposer((int) 'a');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        java.lang.String str7 = cDMetadata0.getAlbumArtist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = cDMetadata0.getArtist((int) (byte) -1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        net.sourceforge.atunes.model.FontSettings fontSettings0 = new net.sourceforge.atunes.model.FontSettings();
        net.sourceforge.atunes.model.CDMetadata cDMetadata1 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata1.setAlbumArtist("");
        boolean boolean4 = fontSettings0.equals((java.lang.Object) cDMetadata1);
        java.lang.String str5 = cDMetadata1.getGenre();
        cDMetadata1.setAlbum("net.sourceforge.atunes.model.SearchQuerySyntaxException");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = cDMetadata1.getArtist((int) (short) 1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        java.lang.String str7 = cDMetadata0.getAlbumArtist();
        cDMetadata0.setYear((-1));
        java.util.List<java.lang.String> strList10 = cDMetadata0.getTrackNames();
        cDMetadata0.setAlbumArtist("1.0.0 ");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = cDMetadata0.getArtist(0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.util.List<java.lang.String> strList1 = cDMetadata0.getArtistNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = cDMetadata0.getComposer(32);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str4 = cDMetadata0.getTitle((int) (byte) -1);
        java.lang.String[] strArray6 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList7);
        cDMetadata0.setAlbum("mp4");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = cDMetadata0.getArtist((int) (byte) 100);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        cDMetadata0.setAlbumArtist("./description");
        cDMetadata0.setAlbumArtist("./description");
        java.lang.String str8 = cDMetadata0.getAlbumArtist();
        int int9 = cDMetadata0.getDisc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = cDMetadata0.getComposer(1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        cDMetadata0.setAlbum("/rss/channel/item");
        java.util.List<java.lang.String> strList9 = cDMetadata0.getArtistNames();
        cDMetadata0.setGenre("net.sourceforge.atunes.model.SearchQuerySyntaxException");
        java.util.List<java.lang.String> strList12 = cDMetadata0.getArtistNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = cDMetadata0.getArtist(90);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getYear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = cDMetadata0.getArtist((int) (short) -1);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        net.sourceforge.atunes.model.FontSettings fontSettings0 = new net.sourceforge.atunes.model.FontSettings();
        net.sourceforge.atunes.model.CDMetadata cDMetadata1 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata1.setAlbumArtist("");
        boolean boolean4 = fontSettings0.equals((java.lang.Object) cDMetadata1);
        fontSettings0.setUseFontSmoothingSettingsFromOs(false);
        boolean boolean7 = fontSettings0.isUseFontSmoothing();
        net.sourceforge.atunes.model.PlaybackState playbackState8 = net.sourceforge.atunes.model.PlaybackState.PLAY_FINISHED;
        boolean boolean9 = fontSettings0.equals((java.lang.Object) playbackState8);
        net.sourceforge.atunes.model.CDMetadata cDMetadata10 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata10.setAlbumArtist("");
        java.lang.String str13 = cDMetadata10.getGenre();
        int int14 = cDMetadata10.getYear();
        int int15 = cDMetadata10.getYear();
        net.sourceforge.atunes.model.CDMetadata cDMetadata16 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str17 = cDMetadata16.getGenre();
        net.sourceforge.atunes.model.CDMetadata cDMetadata18 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata18.setAlbumArtist("");
        java.lang.String str21 = cDMetadata18.getGenre();
        java.lang.String[] strArray23 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        cDMetadata18.setTrackNames((java.util.List<java.lang.String>) strList24);
        cDMetadata16.setComposerNames((java.util.List<java.lang.String>) strList24);
        cDMetadata10.setTrackNames((java.util.List<java.lang.String>) strList24);
        net.sourceforge.atunes.model.CDMetadata cDMetadata29 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str30 = cDMetadata29.getGenre();
        java.util.List<java.lang.String> strList31 = cDMetadata29.getComposerNames();
        java.lang.String str32 = cDMetadata29.getAlbum();
        java.util.List<java.lang.Integer> intList33 = cDMetadata29.getTracks();
        int int34 = cDMetadata29.getDisc();
        java.lang.String[] strArray42 = new java.lang.String[] { "net.sourceforge.atunes.model.InconsistentRepositoryException", "./title", "1.0.0 ", "./title", "./duration", "mpc", "net.sourceforge.atunes.model.InconsistentRepositoryException" };
        java.util.ArrayList<java.lang.String> strList43 = new java.util.ArrayList<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList43, strArray42);
        cDMetadata29.setArtistNames((java.util.List<java.lang.String>) strList43);
        cDMetadata10.setArtistNames((java.util.List<java.lang.String>) strList43);
        net.sourceforge.atunes.model.CDMetadata cDMetadata47 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata47.setAlbumArtist("");
        java.lang.String str50 = cDMetadata47.getGenre();
        java.lang.String[] strArray52 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList53 = new java.util.ArrayList<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList53, strArray52);
        cDMetadata47.setTrackNames((java.util.List<java.lang.String>) strList53);
        cDMetadata10.setTrackNames((java.util.List<java.lang.String>) strList53);
        boolean boolean57 = fontSettings0.equals((java.lang.Object) cDMetadata10);
        cDMetadata10.setGenre("");
        java.lang.String str60 = cDMetadata10.getAlbum();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str62 = cDMetadata10.getComposer(0);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        java.lang.String[] strArray5 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList6);
        cDMetadata0.setYear((int) (short) 10);
        java.util.List<java.lang.String> strList11 = cDMetadata0.getComposerNames();
        cDMetadata0.setDisc(120);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = cDMetadata0.getArtist((int) (short) -1);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str4 = cDMetadata0.getTitle((int) (byte) -1);
        java.lang.String[] strArray6 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList7);
        cDMetadata0.setAlbumArtist("/rss/channel/item");
        net.sourceforge.atunes.model.CDMetadata cDMetadata12 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str13 = cDMetadata12.getGenre();
        java.util.List<java.lang.String> strList14 = cDMetadata12.getComposerNames();
        java.lang.String str15 = cDMetadata12.getAlbum();
        java.util.List<java.lang.Integer> intList16 = cDMetadata12.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata17 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata17.setAlbumArtist("");
        java.lang.String str21 = cDMetadata17.getTitle((int) (byte) -1);
        java.lang.String[] strArray23 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList24 = new java.util.ArrayList<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList24, strArray23);
        cDMetadata17.setTrackNames((java.util.List<java.lang.String>) strList24);
        cDMetadata12.setTrackNames((java.util.List<java.lang.String>) strList24);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = cDMetadata0.getArtist((-1));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        int int18 = cDMetadata0.getDisc();
        int int19 = cDMetadata0.getDisc();
        java.lang.String str20 = cDMetadata0.getGenre();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str22 = cDMetadata0.getArtist((int) '4');
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        int int3 = cDMetadata0.getYear();
        cDMetadata0.setYear(100);
        cDMetadata0.setYear((-1));
        int int8 = cDMetadata0.getDisc();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = cDMetadata0.getArtist((int) (short) -1);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        java.lang.String[] strArray5 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList6);
        cDMetadata0.setYear((int) (short) 10);
        cDMetadata0.setDisc(0);
        cDMetadata0.setYear((-1));
        java.util.List<java.lang.String> strList15 = cDMetadata0.getTrackNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = cDMetadata0.getComposer(32);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        cDMetadata0.setAlbumArtist("SOCKS_PROXY");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = cDMetadata0.getArtist((int) '#');
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        int int4 = cDMetadata0.getYear();
        int int5 = cDMetadata0.getYear();
        net.sourceforge.atunes.model.CDMetadata cDMetadata6 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str7 = cDMetadata6.getGenre();
        net.sourceforge.atunes.model.CDMetadata cDMetadata8 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata8.setAlbumArtist("");
        java.lang.String str11 = cDMetadata8.getGenre();
        java.lang.String[] strArray13 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        cDMetadata8.setTrackNames((java.util.List<java.lang.String>) strList14);
        cDMetadata6.setComposerNames((java.util.List<java.lang.String>) strList14);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList14);
        net.sourceforge.atunes.model.CDMetadata cDMetadata19 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str20 = cDMetadata19.getGenre();
        java.util.List<java.lang.String> strList21 = cDMetadata19.getComposerNames();
        java.lang.String str22 = cDMetadata19.getAlbum();
        java.util.List<java.lang.Integer> intList23 = cDMetadata19.getTracks();
        int int24 = cDMetadata19.getDisc();
        java.lang.String[] strArray32 = new java.lang.String[] { "net.sourceforge.atunes.model.InconsistentRepositoryException", "./title", "1.0.0 ", "./title", "./duration", "mpc", "net.sourceforge.atunes.model.InconsistentRepositoryException" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        cDMetadata19.setArtistNames((java.util.List<java.lang.String>) strList33);
        cDMetadata0.setArtistNames((java.util.List<java.lang.String>) strList33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = cDMetadata0.getComposer((int) (short) 10);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        net.sourceforge.atunes.model.FontSettings fontSettings0 = new net.sourceforge.atunes.model.FontSettings();
        net.sourceforge.atunes.model.CDMetadata cDMetadata1 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata1.setAlbumArtist("");
        boolean boolean4 = fontSettings0.equals((java.lang.Object) cDMetadata1);
        java.lang.String str5 = cDMetadata1.getAlbum();
        net.sourceforge.atunes.model.RankList<java.lang.Throwable> throwableRankList6 = new net.sourceforge.atunes.model.RankList<java.lang.Throwable>();
        java.util.List<java.lang.Throwable> throwableList8 = throwableRankList6.getNFirstElements((int) (short) 10);
        throwableRankList6.clear();
        java.util.List<java.lang.Integer> intList11 = throwableRankList6.getNFirstElementCounts(150);
        cDMetadata1.setTracks(intList11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = cDMetadata1.getComposer((int) ' ');
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        cDMetadata0.setYear((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = cDMetadata0.getArtist((-1));
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        java.lang.String[] strArray5 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList6);
        cDMetadata0.setAlbumArtist("net.sourceforge.atunes.model.InconsistentRepositoryException");
        cDMetadata0.setDisc((int) (short) -1);
        java.lang.String str13 = cDMetadata0.getAlbumArtist();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = cDMetadata0.getComposer(100);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        cDMetadata0.setAlbum("/rss/channel/item");
        cDMetadata0.setAlbum("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = cDMetadata0.getComposer(2);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.lang.String str3 = cDMetadata0.getGenre();
        int int4 = cDMetadata0.getYear();
        java.util.List<java.lang.Integer> intList5 = cDMetadata0.getTracks();
        int int6 = cDMetadata0.getYear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = cDMetadata0.getComposer(52);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        java.lang.String str1 = cDMetadata0.getGenre();
        java.util.List<java.lang.String> strList2 = cDMetadata0.getComposerNames();
        java.lang.String str3 = cDMetadata0.getAlbum();
        java.util.List<java.lang.Integer> intList4 = cDMetadata0.getTracks();
        net.sourceforge.atunes.model.CDMetadata cDMetadata5 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata5.setAlbumArtist("");
        java.lang.String str9 = cDMetadata5.getTitle((int) (byte) -1);
        java.lang.String[] strArray11 = new java.lang.String[] { "./title" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        cDMetadata5.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList12);
        cDMetadata0.setYear((int) (short) 1);
        java.util.List<java.lang.String> strList18 = cDMetadata0.getArtistNames();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str20 = cDMetadata0.getArtist(0);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        net.sourceforge.atunes.model.CDMetadata cDMetadata0 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata0.setAlbumArtist("");
        java.util.List<java.lang.Integer> intList3 = cDMetadata0.getTracks();
        cDMetadata0.setAlbumArtist("/rss/channel/title");
        java.util.List<java.lang.String> strList6 = cDMetadata0.getTrackNames();
        net.sourceforge.atunes.model.CDMetadata cDMetadata7 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata7.setAlbumArtist("");
        java.lang.String str10 = cDMetadata7.getGenre();
        java.lang.String[] strArray12 = new java.lang.String[] { "HTTP_PROXY" };
        java.util.ArrayList<java.lang.String> strList13 = new java.util.ArrayList<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList13, strArray12);
        cDMetadata7.setTrackNames((java.util.List<java.lang.String>) strList13);
        cDMetadata0.setTrackNames((java.util.List<java.lang.String>) strList13);
        int int17 = cDMetadata0.getYear();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str19 = cDMetadata0.getArtist((int) 'a');
    }
}

