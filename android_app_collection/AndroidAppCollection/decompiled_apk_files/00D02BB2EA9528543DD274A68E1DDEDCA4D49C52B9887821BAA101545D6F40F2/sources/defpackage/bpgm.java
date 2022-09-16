package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bpgm  reason: default package */
/* loaded from: classes3.dex */
public final class bpgm extends bpdz<bpwn> {
    public bpgt al;
    public bpgu am;
    private bptw an;

    @Override // defpackage.bpdz
    public final dbsg<akqi> aJ() {
        return (this.al.h().c != boxh.WHOLE_ROUTE || !this.an.d().a()) ? dbpy.a : this.an.d();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.al.n.b();
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return false;
    }

    @Override // defpackage.bpdz
    protected final /* bridge */ /* synthetic */ bpwn g(dbsg dbsgVar) {
        Bundle bundle = (Bundle) dbsgVar.c(this.o);
        bpua bpuaVar = (bpua) bvrs.f(bundle, "NAME_MODEL_PROTO_KEY", (dssr) bpua.g.cu(7));
        dbsk.s(bpuaVar);
        bptw i = bptw.i(bpuaVar);
        this.an = i;
        bpgu bpguVar = this.am;
        bpgl bpglVar = new bpgl(this);
        bpuk bpukVar = this.ai;
        dnqe dnqeVar = this.aj;
        bpgu.a(this, 1);
        bpgu.a(i, 2);
        bpgu.a(this, 3);
        bpgu.a(bpglVar, 4);
        bpgu.a(bpukVar, 5);
        bpgu.a(dnqeVar, 6);
        Activity activity = (Activity) ((dxjd) bpguVar.a).a;
        bpgu.a(activity, 7);
        ff ffVar = (ff) ((dxjd) bpguVar.b).a;
        bpgu.a(ffVar, 8);
        jmx a = bpguVar.c.a();
        bpgu.a(a, 9);
        bpgk a2 = bpguVar.d.a();
        bpgu.a(a2, 10);
        booa a3 = bpguVar.e.a();
        bpgu.a(a3, 11);
        bpto a4 = bpguVar.f.a();
        bpgu.a(a4, 12);
        bptg a5 = bpguVar.g.a();
        bpgu.a(a5, 13);
        bpsw a6 = bpguVar.h.a();
        bpgu.a(a6, 14);
        cqhn a7 = bpguVar.i.a();
        bpgu.a(a7, 15);
        bpgt bpgtVar = new bpgt(this, i, this, bpglVar, bpukVar, dnqeVar, activity, ffVar, a, a2, a3, a4, a5, a6, a7);
        this.al = bpgtVar;
        bpgtVar.j.a(bundle);
        cqhn cqhnVar = bpgtVar.m;
        cqkx.p(bpgtVar);
        return this.al;
    }

    @Override // defpackage.bpdz
    protected final cqiw<bpwn> i() {
        return new bprf();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.bp;
    }

    @Override // defpackage.bpdz, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bvrs.k(bundle, "NAME_MODEL_PROTO_KEY", this.an.h().bK());
        bundle.putInt("selected_extent_type", this.al.j.b);
    }
}
