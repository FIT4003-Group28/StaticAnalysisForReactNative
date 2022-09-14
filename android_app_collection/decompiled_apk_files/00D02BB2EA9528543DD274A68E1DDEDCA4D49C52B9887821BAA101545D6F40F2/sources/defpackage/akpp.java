package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: akpp  reason: default package */
/* loaded from: classes2.dex */
public abstract class akpp {
    public static final akpp d = o(new akqq(dcyn.a, dcyn.a));

    public static akpp k(akqq akqqVar, akps akpsVar, long j, dcdc<altv> dcdcVar) {
        dbsk.a(akpsVar != akps.CUSTOM_ICON);
        dbsk.s(akpsVar);
        return new akpd(akqqVar, akpsVar, j, Integer.MIN_VALUE, true, 2, null, Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), dcdcVar);
    }

    public static akpp l(akqq akqqVar, int i) {
        dbsk.s(akqqVar);
        return new akpd(akqqVar, akps.NORMAL, 0L, i, true, 2, null, Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), dcdc.e());
    }

    public static akpp m(akqq akqqVar, akps akpsVar) {
        dbsk.a(akpsVar != akps.CUSTOM_ICON);
        dbsk.s(akqqVar);
        dbsk.s(akpsVar);
        return new akpd(akqqVar, akpsVar, 0L, Integer.MIN_VALUE, true, 2, null, Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), dcdc.e());
    }

    public static akpp n(akqq akqqVar, long j) {
        return new akpd(akqqVar, akps.NORMAL, j, Integer.MIN_VALUE, true, 2, null, Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), dcdc.e());
    }

    public static akpp o(akqq akqqVar) {
        dbsk.s(akqqVar);
        return new akpd(akqqVar, akps.NORMAL, 0L, Integer.MIN_VALUE, true, 2, null, Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), dcdc.e());
    }

    @Deprecated
    public static akpp p(akqq akqqVar, boolean z, int i, Bitmap bitmap) {
        dbsk.s(bitmap);
        dbsk.s(akqqVar);
        return new akpd(akqqVar, akps.CUSTOM_ICON, 0L, Integer.MIN_VALUE, z, i, bitmap, Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), dcdc.e());
    }

    public static akpp q(akqq akqqVar, dmqc dmqcVar, dmqc dmqcVar2) {
        dbsk.s(dmqcVar);
        dbsk.s(dmqcVar2);
        return new akpd(akqqVar, akps.NAMED_STYLE, 0L, Integer.MIN_VALUE, false, 2, null, Integer.valueOf(dmqcVar.oE), Integer.valueOf(dmqcVar2.oE), dcdc.e());
    }

    public static akpp r(akqq akqqVar, dmqc dmqcVar, dmqc dmqcVar2, long j) {
        dbsk.s(dmqcVar);
        dbsk.s(dmqcVar2);
        return new akpd(akqqVar, akps.NAMED_STYLE, j, Integer.MIN_VALUE, false, 2, null, Integer.valueOf(dmqcVar.oE), Integer.valueOf(dmqcVar2.oE), dcdc.e());
    }

    public abstract akqq a();

    public abstract akps b();

    public abstract long c();

    public abstract int d();

    public abstract boolean e();

    @dzsi
    public abstract Bitmap f();

    public abstract Integer g();

    public abstract Integer h();

    public abstract dcdc<altv> i();

    public abstract int j();
}
