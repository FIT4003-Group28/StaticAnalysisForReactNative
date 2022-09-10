package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adnk  reason: default package */
/* loaded from: classes2.dex */
public final class adnk implements adab, aeeo {
    private final adnp a;
    private final aeep b;
    private awwb c;
    private final qbv d;

    public adnk(adnp adnpVar, aeep aeepVar, qbv qbvVar) {
        this.a = adnpVar;
        this.b = aeepVar;
        this.d = qbvVar;
    }

    @Override // defpackage.aczy
    public final List<cqix<adnl>> a(List<cqix<?>> list) {
        if (this.d.c()) {
            return dcdc.f(cqgr.fT(new admm(), this.a));
        }
        return dcdc.f(cqgr.fT(new admw(), this.a));
    }

    @Override // defpackage.aczy
    public final boolean b() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean d() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean e() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean f() {
        return false;
    }

    @Override // defpackage.adab
    public final Set<awvv<?>> g() {
        return dcep.C(awvv.G, awvv.H);
    }

    @Override // defpackage.adab
    public final Set<awvv<?>> h() {
        return dcmr.a;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.c = awwbVar;
        l();
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        this.c = awwbVar;
        final aeep aeepVar = this.b;
        if (aeepVar.b || awwh.a(awwbVar, g())) {
            return;
        }
        k(true);
        aeepVar.b = true;
        aeepVar.a.a().a(new Runnable(aeepVar, this) { // from class: aeen
            private final aeep a;
            private final aeeo b;

            {
                this.a = aeepVar;
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aeep aeepVar2 = this.a;
                aeeo aeeoVar = this.b;
                ((adnk) aeeoVar).l();
                aeeoVar.k(false);
                aeepVar2.b = false;
            }
        }, bvrj.UI_THREAD, 800L);
    }

    @Override // defpackage.aeeo
    public final void k(boolean z) {
        this.a.v(z);
        cqkx.p(this.a);
    }

    public final void l() {
        awwb awwbVar = this.c;
        if (awwbVar != null) {
            this.a.u(awwbVar);
            cqkx.p(this.a);
        }
    }
}
