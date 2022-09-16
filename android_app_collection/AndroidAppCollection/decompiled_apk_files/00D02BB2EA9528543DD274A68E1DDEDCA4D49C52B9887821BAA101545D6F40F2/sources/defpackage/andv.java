package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: andv  reason: default package */
/* loaded from: classes2.dex */
public final class andv extends andr {
    public dxio<bpyf> a;

    @Override // defpackage.andr, defpackage.ges
    public final void Nv() {
        ((andw) btsx.b(andw.class, this)).bZ(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.andr
    public final boolean bu(akqq akqqVar) {
        if (super.bu(akqqVar)) {
            ily ilyVar = new ily();
            akqq akqqVar2 = this.au;
            dbsk.s(akqqVar2);
            ilyVar.q(akqqVar2);
            this.aO = ilyVar.d();
            bv(true);
            return true;
        }
        return false;
    }

    @Override // defpackage.andr, defpackage.ancv, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.aC = new andu(this, (anee) this.o.getSerializable("args"));
        this.g = this.aC;
    }

    @Override // defpackage.andr, defpackage.ancv, defpackage.ges
    public final ddho p() {
        return dtya.cu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.andr
    public final void q() {
        dnqb b = dnqb.b(this.o.getInt("rdp_entry point_type"));
        akqq akqqVar = this.au;
        dbsk.s(akqqVar);
        this.a.a().e(b, akqqVar);
    }

    @Override // defpackage.andr, defpackage.ancv, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.aO == null) {
            this.aC.G();
        }
    }
}
