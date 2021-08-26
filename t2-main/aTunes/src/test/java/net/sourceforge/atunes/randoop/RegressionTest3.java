package net.sourceforge.atunes.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        net.sourceforge.atunes.model.RankList<java.lang.Throwable> throwableRankList0 = new net.sourceforge.atunes.model.RankList<java.lang.Throwable>();
        java.util.List<java.lang.Throwable> throwableList2 = throwableRankList0.getNFirstElements((int) (short) 100);
        java.util.List<java.lang.Throwable> throwableList4 = throwableRankList0.getNFirstElements((int) (byte) 0);
        java.util.List<java.lang.Throwable> throwableList5 = throwableRankList0.getOrder();
        org.junit.Assert.assertNotNull(throwableList2);
        org.junit.Assert.assertNotNull(throwableList4);
        org.junit.Assert.assertNotNull(throwableList5);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        net.sourceforge.atunes.model.ColumnBean columnBean0 = new net.sourceforge.atunes.model.ColumnBean();
        boolean boolean1 = columnBean0.isVisible();
        net.sourceforge.atunes.model.SubmissionState submissionState2 = net.sourceforge.atunes.model.SubmissionState.PENDING;
        boolean boolean3 = columnBean0.equals((java.lang.Object) submissionState2);
        net.sourceforge.atunes.model.ColumnSort columnSort4 = net.sourceforge.atunes.model.ColumnSort.DESCENDING;
        columnBean0.setSort(columnSort4);
        columnBean0.setWidth((int) '4');
        columnBean0.setVisible(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + submissionState2 + "' != '" + net.sourceforge.atunes.model.SubmissionState.PENDING + "'", submissionState2.equals(net.sourceforge.atunes.model.SubmissionState.PENDING));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + columnSort4 + "' != '" + net.sourceforge.atunes.model.ColumnSort.DESCENDING + "'", columnSort4.equals(net.sourceforge.atunes.model.ColumnSort.DESCENDING));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        net.sourceforge.atunes.model.FontSettings fontSettings22 = new net.sourceforge.atunes.model.FontSettings();
        net.sourceforge.atunes.model.CDMetadata cDMetadata23 = new net.sourceforge.atunes.model.CDMetadata();
        cDMetadata23.setAlbumArtist("");
        boolean boolean26 = fontSettings22.equals((java.lang.Object) cDMetadata23);
        java.lang.String str27 = cDMetadata23.getAlbum();
        net.sourceforge.atunes.model.RankList<java.lang.Throwable> throwableRankList28 = new net.sourceforge.atunes.model.RankList<java.lang.Throwable>();
        java.util.List<java.lang.Throwable> throwableList30 = throwableRankList28.getNFirstElements((int) (short) 10);
        throwableRankList28.clear();
        java.util.List<java.lang.Integer> intList33 = throwableRankList28.getNFirstElementCounts(150);
        cDMetadata23.setTracks(intList33);
        cDMetadata0.setTracks(intList33);
        cDMetadata0.setYear(32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(intList7);
        org.junit.Assert.assertNull(strList10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(throwableList30);
        org.junit.Assert.assertNotNull(intList33);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        net.sourceforge.atunes.model.IFontBean iFontBean0 = null;
        net.sourceforge.atunes.model.FontSettings fontSettings3 = new net.sourceforge.atunes.model.FontSettings(iFontBean0, true, false);
        net.sourceforge.atunes.model.IFontBean iFontBean4 = null;
        fontSettings3.setFont(iFontBean4);
        fontSettings3.setUseFontSmoothing(false);
        net.sourceforge.atunes.model.IFontBean iFontBean8 = fontSettings3.getFont();
        org.junit.Assert.assertNull(iFontBean8);
    }
}

