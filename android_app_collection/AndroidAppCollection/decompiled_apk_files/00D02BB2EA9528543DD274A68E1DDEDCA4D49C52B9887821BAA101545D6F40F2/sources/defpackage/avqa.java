package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: avqa  reason: default package */
/* loaded from: classes3.dex */
public final class avqa {
    private final Application a;
    private final btvo b;
    private final btxn c;

    public avqa(Application application, btvo btvoVar, btxn btxnVar) {
        this.a = application;
        this.b = btvoVar;
        this.c = btxnVar;
    }

    public final dvfc a() {
        dvfr bZ = dvfs.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvfs dvfsVar = (dvfs) bZ.b;
        dvfsVar.a |= 1;
        dvfsVar.b = 18;
        dvfb bZ2 = dvfc.e.bZ();
        dmxf paintParameters = this.b.getPaintParameters();
        dmxp dmxpVar = paintParameters.b;
        if (dmxpVar == null) {
            dmxpVar = dmxp.c;
        }
        dmxh dmxhVar = dmxpVar.a;
        if (dmxhVar == null) {
            dmxhVar = dmxh.j;
        }
        dmyw dmywVar = dmxhVar.f;
        if (dmywVar == null) {
            dmywVar = dmyw.d;
        }
        boolean z = dmywVar.c;
        dvfp bZ3 = dvfq.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvfq dvfqVar = (dvfq) bZ3.b;
        int i = dvfqVar.a | 1;
        dvfqVar.a = i;
        dvfqVar.b = 3L;
        paintParameters.getClass();
        dvfqVar.c = paintParameters;
        dvfqVar.a = i | 2;
        dmxb a = this.c.a(this.b.getPaintParameters(), this.a.getResources().getConfiguration().locale);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvfq dvfqVar2 = (dvfq) bZ3.b;
        a.getClass();
        dvfqVar2.d = a;
        dvfqVar2.a |= 4;
        dvfq bK = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvfc dvfcVar = (dvfc) bZ2.b;
        bK.getClass();
        dvfcVar.b = bK;
        dvfcVar.a |= 1;
        dvfs bK2 = bZ.bK();
        bK2.getClass();
        dvfcVar.c = bK2;
        dvfcVar.a |= 2;
        dvft bZ4 = dvfu.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dvfu dvfuVar = (dvfu) bZ4.b;
        dvfuVar.a |= 1;
        dvfuVar.b = 7L;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvfc dvfcVar2 = (dvfc) bZ2.b;
        dvfu bK3 = bZ4.bK();
        bK3.getClass();
        dvfcVar2.d = bK3;
        dvfcVar2.a |= 4;
        return bZ2.bK();
    }
}
