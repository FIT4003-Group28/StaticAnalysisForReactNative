package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: exi  reason: default package */
/* loaded from: classes6.dex */
final class exi<T> implements dzsj<T> {
    final /* synthetic */ exj a;
    private final int b;

    public exi(exj exjVar, int i) {
        this.a = exjVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return (T) new bbzf(this.a.c.ad());
                }
                exj exjVar = this.a;
                bvrb tn = exjVar.c.eW.a.tn();
                dxjg.e(tn);
                return (T) new bbzi(tn, exjVar.c.eW.pc(), exjVar.c.eW.oZ());
            }
            exj exjVar2 = this.a;
            Application a = exjVar2.c.eW.a.a();
            dxjg.e(a);
            ahjq wf = exjVar2.c.eW.wf();
            bvrb tn2 = exjVar2.c.eW.a.tn();
            dxjg.e(tn2);
            return (T) new bbzd(a, wf, tn2, exjVar2.c.eW.oZ());
        }
        exj exjVar3 = this.a;
        dzsj<gga> ad = exjVar3.c.ad();
        dzsj<bvrb> R = exjVar3.c.eW.R();
        fyu fyuVar = exjVar3.c.eW;
        dzsj dzsjVar = fyuVar.dK;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 715);
            fyuVar.dK = dzsjVar;
        }
        dzsj dzsjVar2 = exjVar3.a;
        if (dzsjVar2 == null) {
            dzsjVar2 = new exi(exjVar3, 1);
            exjVar3.a = dzsjVar2;
        }
        dzsj c = dxjh.c(dzsjVar2);
        dzsj dzsjVar3 = exjVar3.b;
        if (dzsjVar3 == null) {
            dzsjVar3 = new exi(exjVar3, 2);
            exjVar3.b = dzsjVar3;
        }
        return (T) new bbwo(ad, R, dzsjVar, c, dxjh.c(dzsjVar3));
    }
}
