package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rnz  reason: default package */
/* loaded from: classes7.dex */
public final class rnz extends rmf<sak> {
    public sdy a;
    public rnv ae;
    private sdx af;

    @Override // defpackage.rmf, defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        rnv rnvVar = this.ae;
        rnvVar.d = rnvVar.b.e(new rnt());
        return super.ag(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        rnv rnvVar = this.ae;
        if (!rnv.e.compareAndSet(1, 0) || !rnvVar.c()) {
            return false;
        }
        rnv.f(this);
        rnvVar.d(this);
        return true;
    }

    @Override // defpackage.rmf
    protected final cqiw<sak> g() {
        return new rsl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.rmf
    public final egu i(egj egjVar) {
        if (this.ae.c() || rnv.e.get() == -1) {
            rnv rnvVar = this.ae;
            egj egjVar2 = new egj(this);
            cqkf<cqkp> cqkfVar = rnvVar.d;
            dbsk.s(cqkfVar);
            egjVar2.w(cqkfVar.c());
            egjVar2.ag(null);
            return egjVar2.a();
        }
        egjVar.F(null);
        egjVar.C(null);
        egjVar.ag(w());
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.ak(jkc.q, jkc.q);
        return egjVar.a();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxl.dC;
    }

    @Override // defpackage.rmf
    protected final /* bridge */ /* synthetic */ sak q(rzp rzpVar) {
        sdy sdyVar = this.a;
        rnv rnvVar = this.ae;
        Application a = sdyVar.a.a();
        sdy.a(a, 1);
        btvo a2 = sdyVar.b.a();
        sdy.a(a2, 2);
        qjk a3 = sdyVar.c.a();
        sdy.a(a3, 3);
        axvy a4 = sdyVar.d.a();
        sdy.a(a4, 4);
        cqhn a5 = sdyVar.e.a();
        sdy.a(a5, 5);
        sic a6 = sdyVar.f.a();
        sdy.a(a6, 6);
        sfd a7 = sdyVar.g.a();
        sdy.a(a7, 7);
        ros a8 = sdyVar.h.a();
        sdy.a(a8, 8);
        sbz a9 = sdyVar.i.a();
        sdy.a(a9, 9);
        dxio a10 = ((dxjh) sdyVar.j).a();
        sdy.a(a10, 10);
        Executor a11 = sdyVar.k.a();
        sdy.a(a11, 11);
        Executor a12 = sdyVar.l.a();
        sdy.a(a12, 12);
        cjnx a13 = sdyVar.m.a();
        sdy.a(a13, 13);
        axwq a14 = sdyVar.n.a();
        sdy.a(a14, 14);
        Activity activity = (Activity) ((dxjd) sdyVar.o).a;
        sdy.a(activity, 15);
        sdy.a(rnvVar, 16);
        sdy.a(this, 17);
        sdy.a(rzpVar, 18);
        sdx sdxVar = new sdx(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, activity, rnvVar, this, rzpVar);
        this.af = sdxVar;
        return sdxVar;
    }

    @Override // defpackage.rmf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.af.h();
        final rnv rnvVar = this.ae;
        if (rnv.e.compareAndSet(-1, 0)) {
            rnvVar.c.execute(new Runnable(rnvVar, this) { // from class: rnr
                private final rnv a;
                private final rmf b;

                {
                    this.a = rnvVar;
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    rmf rmfVar = this.b;
                    if (rmfVar.aD) {
                        gfq.m(rmfVar);
                    }
                }
            });
        } else if (rnvVar.c()) {
            rnvVar.d(this);
        }
        this.af.A(!this.ae.b());
    }
}
