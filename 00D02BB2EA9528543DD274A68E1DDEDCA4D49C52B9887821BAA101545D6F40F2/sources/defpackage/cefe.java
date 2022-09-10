package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cefe  reason: default package */
/* loaded from: classes4.dex */
public final class cefe extends ceez<djbl, djce> {
    public cefe(bvev bvevVar, cgrc cgrcVar, djbl djblVar) {
        super(cgrcVar, bvevVar, djblVar);
        djbk djbkVar = djblVar.b;
        cerw.a(djbkVar == null ? djbk.e : djbkVar);
    }

    @Override // defpackage.ceez
    public final void d() {
        cgre.g(this.a, djbl.class, this);
    }

    @Override // defpackage.ceez
    protected final dssr<djbl> e() {
        return (dssr) djbl.e.cu(7);
    }

    @Override // defpackage.ceez
    protected final /* bridge */ /* synthetic */ void f(djce djceVar) {
        djbl bK;
        djce djceVar2 = djceVar;
        if (djceVar2.d.isEmpty()) {
            bK = null;
        } else {
            djbl djblVar = (djbl) this.b;
            dsqp dsqpVar = (dsqp) djblVar.cu(5);
            dsqpVar.bC(djblVar);
            djbi djbiVar = (djbi) dsqpVar;
            String str = djceVar2.d;
            if (djbiVar.c) {
                djbiVar.bF();
                djbiVar.c = false;
            }
            djbl djblVar2 = (djbl) djbiVar.b;
            djbl djblVar3 = djbl.e;
            str.getClass();
            djblVar2.a |= 2;
            djblVar2.c = str;
            bK = djbiVar.bK();
        }
        this.c = bK;
    }

    @Override // defpackage.ceez
    public final void k(Bundle bundle) {
        super.k(bundle);
        djbk djbkVar = ((djbl) this.b).b;
        if (djbkVar == null) {
            djbkVar = djbk.e;
        }
        cerw.a(djbkVar);
    }

    @Override // defpackage.ceez
    /* renamed from: m */
    public final void l(djce djceVar) {
        btzy btzyVar;
        bvrj.UI_THREAD.c();
        int a = djcd.a(djceVar.b);
        if (a == 0 || a != 2) {
            int a2 = djcd.a(djceVar.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i == 2) {
                btzyVar = btzy.h;
            } else if (i == 3) {
                btzyVar = btzy.j;
            } else {
                btzyVar = btzy.a;
            }
            a(btzyVar);
            return;
        }
        super.c(djceVar);
    }
}
