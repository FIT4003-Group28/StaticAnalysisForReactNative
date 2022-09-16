package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: alex  reason: default package */
/* loaded from: classes2.dex */
public final class alex extends alfr {
    public static final dcep<dgau> a = dcep.D(dgau.TURN, dgau.PEDESTRIAN_OVERPASS_UNDERPASS, dgau.PEDESTRIAN_ACCESS_PATH);
    public final alft b;

    public alex(amub amubVar, amuo amuoVar, Rect rect, @dzsi String str, amuo amuoVar2, boolean z) {
        super(amubVar, amuoVar, str, z);
        amsa amsaVar = new amsa();
        amrq amrqVar = new amrq();
        amrx amrxVar = new amrx();
        alfu alfuVar = new alfu(amubVar, amuoVar2);
        alfx alfxVar = new alfx(rect, dcdc.t(amubVar.o));
        alfw alfwVar = new alfw(dcdc.t(amubVar.k), amuoVar2);
        amrm amrmVar = new amrm();
        akrk akrkVar = amubVar.l;
        amrr amrrVar = new amrr(akrkVar, dcdc.f(akrkVar), 0.0f, 0.0f);
        alfv alfvVar = new alfv(amuoVar2, amubVar.l);
        amrp amrpVar = new amrp();
        amsd amsdVar = new amsd();
        amsdVar.c(amrqVar);
        amsdVar.b(0, amrxVar, 0.5f);
        amsdVar.b(0, alfuVar, 0.5f);
        amsdVar.c(alfxVar);
        amsdVar.c(alfwVar);
        amsdVar.d(500, amrmVar);
        amsdVar.d(500, amrrVar);
        amsdVar.d(10, alfvVar);
        amsdVar.e(1, amrpVar);
        this.b = new alft(amuoVar2, amsaVar, amsdVar.a());
    }
}
