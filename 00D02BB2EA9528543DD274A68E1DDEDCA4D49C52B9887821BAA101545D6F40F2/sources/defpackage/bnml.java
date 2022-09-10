package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bnml  reason: default package */
/* loaded from: classes3.dex */
final class bnml implements Runnable {
    final /* synthetic */ dvev a;
    final /* synthetic */ bnmm b;

    public bnml(bnmm bnmmVar, dvev dvevVar) {
        this.b = bnmmVar;
        this.a = dvevVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gfk g;
        if (this.b.w()) {
            bnmm bnmmVar = this.b;
            if (bnmmVar.q) {
                bnmmVar.e.A(bnmmVar.u);
            }
            dvev dvevVar = this.a;
            if (dvevVar.A) {
                cjta b = cjtd.b();
                dvev dvevVar2 = this.a;
                b.b = dvevVar2.k;
                b.g(dvevVar2.i);
                b.d = cjth.d(this.a.j);
                b.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                this.b.f.g().d(b.a());
                return;
            }
            int a = dveu.a(dvevVar.y);
            if (a == 0) {
                a = 2;
            }
            int i = a - 1;
            if (i == 1) {
                bnmm bnmmVar2 = this.b;
                bnmmVar2.r = new bnof(bnmmVar2.c, bnmmVar2.i, bnmmVar2.o, this.a, bnmmVar2.p);
                cqkf d = this.b.d.d(new bnnc(), this.b.i.b(), false);
                bnoe bnoeVar = this.b.r;
                if (bnoeVar != null) {
                    d.e(bnoeVar);
                }
                this.b.i.d(d.c());
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                bnmi bnmiVar = new bnmi();
                Bundle bundle = new Bundle();
                bundle.putByteArray("triggerKey", this.a.bS());
                bnmiVar.B(bundle);
                this.b.c.D(bnmiVar);
            } else if ((this.a.a & 268435456) == 0) {
            } else {
                cjqp g2 = this.b.f.g();
                cjta b2 = cjtd.b();
                b2.g(this.a.i);
                b2.b = this.a.k;
                g2.d(b2.a());
                dvev dvevVar3 = this.a;
                if (dvevVar3.h) {
                    String str = dvevVar3.z;
                    g = new gfk();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("url", str);
                    bundle2.putBoolean("loadAsResource", false);
                    bundle2.putBoolean("dismissable", false);
                    g.B(bundle2);
                } else {
                    g = gfk.g(dvevVar3.z, false);
                }
                this.b.c.D(g);
            }
        }
    }
}
