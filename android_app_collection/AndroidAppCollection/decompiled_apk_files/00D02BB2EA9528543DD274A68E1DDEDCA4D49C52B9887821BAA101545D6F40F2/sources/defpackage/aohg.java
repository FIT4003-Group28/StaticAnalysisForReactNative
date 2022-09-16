package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aohg  reason: default package */
/* loaded from: classes2.dex */
public final class aohg extends ges {
    public aoib a;
    public Executor ad;
    public aoia ae;
    public anhy af;
    private cqkf<aohy> ag;
    public efg b;
    public cqkj c;
    public cjxo d;
    public anhg e;
    public cjnx f;
    public dehq g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<aohy> cqkfVar = this.ag;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.ag = null;
        }
        super.Qe();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf<aohy> c = this.c.c(new aohv(), viewGroup);
        this.ag = c;
        c.e(this.ae);
        return this.ag.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.af = anhy.q((aoum) dsuv.c(this.o, "params", aoum.k, dsqa.c()));
        dehn h = deha.h(this.f.h(), 3L, TimeUnit.SECONDS, this.g);
        aoib aoibVar = this.a;
        aohf aohfVar = new aohf(this);
        ache a = aoibVar.a.a();
        aoib.a(a, 1);
        bzqa a2 = aoibVar.b.a();
        aoib.a(a2, 2);
        aohw a3 = aoibVar.c.a();
        aoib.a(a3, 3);
        bvjj a4 = aoibVar.d.a();
        aoib.a(a4, 4);
        anhg a5 = aoibVar.e.a();
        aoib.a(a5, 5);
        aoib.a(h, 6);
        aoib.a(aohfVar, 7);
        this.ae = new aoia(a, a2, a3, a4, a5, h, aohfVar);
        h.Pk(new Runnable(this) { // from class: aohe
            private final aohg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cqkx.p(this.a.ae);
            }
        }, this.ad);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyi.bv;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (btpf.a(J())) {
            this.d.a(7);
        }
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.f(false);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (btpf.a(J())) {
            this.d.b();
        }
        super.u();
    }
}
