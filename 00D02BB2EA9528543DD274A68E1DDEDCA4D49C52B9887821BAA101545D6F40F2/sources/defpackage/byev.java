package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: byev  reason: default package */
/* loaded from: classes4.dex */
public final class byev extends gew {
    public static final dcqe c = dcqe.c("byev");
    private cqkf<byil> ad;
    private cqkf<byil> ae;
    private final egq af = new byeu(this);
    public efg d;
    public cqkj e;
    public bykf f;
    public byke g;

    @Override // defpackage.gew
    public final void Qm() {
        if (!this.aD) {
            return;
        }
        this.g.h();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.g = this.f.a(byny.d(this.o));
        this.ad = this.e.c(new byel(), null);
        this.ae = this.e.c(new bygy(), null);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyc.bz;
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.e(this.g);
        this.ae.e(this.g);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(null);
        egjVar.F(this.ad.c());
        egjVar.aw(this.ae.c(), false);
        egjVar.A(byew.a());
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.J(this.af);
        this.d.a(egjVar.a());
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void u() {
        this.g.g();
        cqkf<byil> cqkfVar = this.ad;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        cqkf<byil> cqkfVar2 = this.ae;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
        }
        super.u();
    }
}
