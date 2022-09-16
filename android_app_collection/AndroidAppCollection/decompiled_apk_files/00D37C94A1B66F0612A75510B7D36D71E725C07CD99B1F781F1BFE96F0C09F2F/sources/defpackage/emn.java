package defpackage;

import android.content.Context;
import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: emn  reason: default package */
/* loaded from: classes3.dex */
public final class emn {
    public static String A(String str) {
        return n(awac.b, str);
    }

    public static boolean B(agcp agcpVar) {
        agcpVar.getClass();
        return agcpVar.c("video_notifications_enabled", true);
    }

    public static boolean C(yve yveVar) {
        return !((gft) yveVar.c()).h;
    }

    public static void D(Context context) {
        E(false, context);
    }

    public static void E(boolean z, Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.uiMode = (true != z ? 16 : 32) | (configuration.uiMode & (-49));
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }

    public static boolean F(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean G(int i) {
        return i == 0;
    }

    public static boolean H(int i) {
        return F(i, 1);
    }

    public static boolean I(int i) {
        return F(i, 2);
    }

    public static void J(ajrs ajrsVar, int i) {
        ajrsVar.f("lineSeparatorOverride", Integer.valueOf(i));
    }

    public static int[] a() {
        return new int[]{1, 2, 3, 4, 5, 6};
    }

    public static String b(String str) {
        return n(aozn.b, str);
    }

    public static String c(String str) {
        return n(awjj.b, str);
    }

    public static String d() {
        return n(asyx.b, "");
    }

    public static String e(aqof aqofVar) {
        return m(aqoj.b, aqofVar.toByteString());
    }

    public static String f(awbp awbpVar) {
        return m(aqoj.b, awbpVar.toByteString());
    }

    public static String g(String str) {
        return n(awjn.b, str);
    }

    public static String h(String str) {
        return n(awjs.b, str);
    }

    public static String i() {
        return n(awkc.b, "downloads_list");
    }

    public static String j() {
        return n(aqqd.b, "downloads_page_state");
    }

    public static String k(awbp awbpVar) {
        return m(aqqh.b, awbpVar.toByteString());
    }

    public static String l(String str) {
        return n(aqqy.b, str);
    }

    public static String m(aooq aooqVar, aoob aoobVar) {
        return aakj.e(aooqVar.a(), aoobVar);
    }

    public static String n(aooq aooqVar, String str) {
        return aakj.f(aooqVar.a(), str);
    }

    public static String o(String str) {
        return n(aszf.b, str);
    }

    public static String p() {
        return n(asyj.b, "video");
    }

    public static String q(String str) {
        return n(atst.b, str);
    }

    public static String r(String str) {
        return n(atsz.b, str);
    }

    public static String s(String str) {
        return n(atyq.b, str);
    }

    public static String t(String str) {
        return n(awki.b, str);
    }

    public static String u(String str, String str2) {
        aopg aopgVar = awkq.b;
        aopa createBuilder = awkm.a.createBuilder();
        createBuilder.copyOnWrite();
        awkm awkmVar = (awkm) createBuilder.instance;
        str.getClass();
        awkmVar.b |= 2;
        awkmVar.d = str;
        createBuilder.copyOnWrite();
        awkm awkmVar2 = (awkm) createBuilder.instance;
        str2.getClass();
        awkmVar2.b |= 1;
        awkmVar2.c = str2;
        return m(aopgVar, ((awkm) createBuilder.mo39build()).toByteString());
    }

    public static String v(String str) {
        return n(asyr.b, str);
    }

    public static String w() {
        return n(awkc.b, "DOWNLOADS_LIST_ENTITY_ID_SMART_DOWNLOADS");
    }

    public static String x(String str) {
        return n(avkq.b, str);
    }

    public static String y(String str) {
        return n(awky.b, str);
    }

    public static String z(String str) {
        return n(aszb.b, str);
    }
}
