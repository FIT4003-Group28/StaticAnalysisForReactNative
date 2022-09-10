package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bphi  reason: default package */
/* loaded from: classes3.dex */
public final class bphi extends bpdz<bpwq> {
    public bphn al;
    public bpho am;

    public static bphi aT(bwrs<bvrt<bpuk>> bwrsVar, bwqv bwqvVar, dnqe dnqeVar) {
        bphi bphiVar = new bphi();
        bphiVar.B(w(bwqvVar, bwrsVar, dnqeVar));
        return bphiVar;
    }

    @Override // defpackage.bpdz
    public final dbsg<akqi> aJ() {
        return this.ai.b ? dbpy.a : this.al.d().h(bphg.a);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return false;
    }

    @Override // defpackage.bpdz
    protected final /* bridge */ /* synthetic */ bpwq g(dbsg dbsgVar) {
        dcdc<drkz> c = bpvi.c(this.ai);
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        bpho bphoVar = this.am;
        bphh bphhVar = new bphh(this, ggaVar);
        bpho.a(bphoVar.a.a(), 1);
        ff ffVar = (ff) ((dxjd) bphoVar.b).a;
        bpho.a(ffVar, 2);
        bpho.a(c, 3);
        bpho.a(this, 4);
        bpho.a(bphhVar, 5);
        bphn bphnVar = new bphn(ffVar, c, this, bphhVar);
        this.al = bphnVar;
        bphnVar.e((Bundle) dbsgVar.c(this.o));
        return this.al;
    }

    @Override // defpackage.bpdz
    protected final cqiw<bpwq> i() {
        return new bprn();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.bD;
    }

    @Override // defpackage.bpdz, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.al.f(bundle);
    }
}
