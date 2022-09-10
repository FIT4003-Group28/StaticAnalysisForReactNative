package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bpha  reason: default package */
/* loaded from: classes3.dex */
public final class bpha extends bpdz<bpwo> {
    public bokk al;
    public akqi am;
    public bphf an;
    private bphe ao;

    @Override // defpackage.bpdz
    public final dbsg<akqi> aJ() {
        return this.am.equals(akqi.a) ? dbpy.a : dbsg.i(this.am);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bphe bpheVar = this.ao;
        if (this.aD) {
            bpheVar.b.b(bpheVar.b());
            return true;
        }
        return false;
    }

    @Override // defpackage.bpdz
    protected final /* bridge */ /* synthetic */ bpwo g(dbsg dbsgVar) {
        bokm bokmVar = (bokm) bvrs.f((Bundle) dbsgVar.c(this.o), "NOTE_PROTO_KEY", (dssr) bokm.n.cu(7));
        dbsk.s(bokmVar);
        this.al = bokk.a(bokmVar);
        dpsn dpsnVar = (dpsn) bvrs.f(this.o, "SELECT_ROUTE_FEATURE_ID_PROTO_KEY", (dssr) dpsn.d.cu(7));
        dbsk.s(dpsnVar);
        this.am = akqi.j(dpsnVar);
        bphf bphfVar = this.an;
        bokk bokkVar = this.al;
        bpgz bpgzVar = new bpgz(this);
        bphf.a(bokkVar, 1);
        bphf.a(bpgzVar, 2);
        booa a = bphfVar.a.a();
        bphf.a(a, 3);
        bnyd a2 = bphfVar.b.a();
        bphf.a(a2, 4);
        ff ffVar = (ff) ((dxjd) bphfVar.c).a;
        bphf.a(ffVar, 5);
        bphf.a(bphfVar.d.a(), 6);
        bphe bpheVar = new bphe(bokkVar, bpgzVar, a, a2, ffVar);
        this.ao = bpheVar;
        return bpheVar;
    }

    @Override // defpackage.bpdz
    protected final cqiw<bpwo> i() {
        return new bprk();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.bt;
    }

    @Override // defpackage.bpdz, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.k(bundle, "NOTE_PROTO_KEY", this.al.b().bK());
    }
}
