package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: alfz  reason: default package */
/* loaded from: classes2.dex */
public final class alfz extends alfr {
    public final alft b;
    private static final dcep<dgau> f = dcep.G(dgau.TURN, dgau.NAME_CHANGE, dgau.UTURN, dgau.ON_RAMP, dgau.OFF_RAMP, dgau.FORK, dgau.FERRY, dgau.FERRY_TRAIN, dgau.ROUNDABOUT_EXIT, dgau.ROUNDABOUT_ENTER_AND_EXIT);
    public static final dcep<dqvj> a = dcep.C(dqvj.DRIVE, dqvj.TWO_WHEELER);

    public alfz(amub amubVar, amuo amuoVar, Rect rect, @dzsi String str, boolean z) {
        super(amubVar, amuoVar, str, false);
        amsa amsaVar = new amsa();
        amrn amrnVar = new amrn(amsb.NAVIGATION_SEARCH_RESULT);
        alfs alfsVar = z ? null : new alfs();
        amrq amrqVar = new amrq();
        alfx alfxVar = new alfx(rect, dcdc.t(amubVar.o));
        alfw alfwVar = new alfw(dcdc.t(amubVar.k), amuoVar);
        akrk akrkVar = amubVar.l;
        amrr amrrVar = new amrr(akrkVar, dcdc.f(akrkVar), 0.0f, 0.0f);
        alfv alfvVar = new alfv(amuoVar, amubVar.l);
        amrm amrmVar = new amrm();
        amrp amrpVar = new amrp();
        amsd amsdVar = new amsd();
        amsdVar.c(amrnVar);
        if (alfsVar != null) {
            amsdVar.c(alfsVar);
        }
        amsdVar.c(amrqVar);
        amsdVar.c(alfxVar);
        amsdVar.d(100, alfwVar);
        amsdVar.d(500, amrrVar);
        amsdVar.d(10, alfvVar);
        amsdVar.d(10, amrmVar);
        amsdVar.e(1, amrpVar);
        this.b = new alft(amuoVar, amsaVar, amsdVar.a());
    }

    public static boolean b(amuo amuoVar) {
        return f.contains(amuoVar.d);
    }
}
