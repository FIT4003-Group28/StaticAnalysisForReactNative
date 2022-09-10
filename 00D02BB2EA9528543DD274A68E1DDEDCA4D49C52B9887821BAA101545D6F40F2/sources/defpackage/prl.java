package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: prl  reason: default package */
/* loaded from: classes7.dex */
public final class prl implements Runnable {
    final /* synthetic */ gn a;
    final /* synthetic */ amsy b;
    final /* synthetic */ int c;
    final /* synthetic */ gfw d;
    final /* synthetic */ prm e;

    public prl(prm prmVar, gn gnVar, amsy amsyVar, int i, gfw gfwVar) {
        this.e = prmVar;
        this.a = gnVar;
        this.b = amsyVar;
        this.c = i;
        this.d = gfwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.J()) {
            return;
        }
        prm prmVar = this.e;
        amsy amsyVar = this.b;
        int i = this.c;
        gfw gfwVar = this.d;
        bvrj.UI_THREAD.c();
        ((pqh) prmVar.c).a.g().h(gfu.b(pqk.class, gfu.DIALOG_FRAGMENT, new gfs[0]), 1);
        if (i < 0) {
            return;
        }
        pra praVar = prmVar.c;
        dpkf h = amsyVar.h(i);
        dccx F = dcdc.F();
        for (dpjn dpjnVar : h.c) {
            dpjx dpjxVar = dpjnVar.b;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            F.g(amvh.M(dpjxVar, prmVar.a));
        }
        dcdc f = F.f();
        pqh pqhVar = (pqh) praVar;
        bwqv bwqvVar = pqhVar.b;
        pqk pqkVar = new pqk();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "dym_items", dcdc.r(f));
        bundle.putInt("waypoint_index", i);
        pqkVar.B(bundle);
        pqkVar.Nz(gfwVar);
        pqkVar.aJ(pqhVar.a);
        prmVar.d.b(new sre());
    }
}
