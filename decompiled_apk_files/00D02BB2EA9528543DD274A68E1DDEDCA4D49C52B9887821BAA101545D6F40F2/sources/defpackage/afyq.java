package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: afyq  reason: default package */
/* loaded from: classes2.dex */
public final class afyq extends ges {
    public ahch a;
    public ahcg ad;
    private cqkf<agza> ae;
    private cqkf<agzb> af;
    private final afyp ag = new afyp(this);
    private final afyo ah = new afyo(this);
    public btrm b;
    public dxio<akfa> c;
    public agaw d;
    public efg e;
    public cqkj f;
    public dehq g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((afyr) btsx.b(afyr.class, this)).bS(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        this.ae = this.f.e(new agfx());
        cqkf<agzb> e = this.f.e(new agfv());
        this.af = e;
        return e.c();
    }

    public final void g(@dzsi btlu btluVar) {
        if (!this.aD) {
            return;
        }
        boolean e = this.d.e(btluVar);
        ahcg ahcgVar = this.ad;
        if (ahcgVar == null || !dbsd.a(ahcgVar.c(), btluVar) || !dbsd.a(this.ad.d(), Boolean.valueOf(e))) {
            ahch ahchVar = this.a;
            ahcd a = ahchVar.a.a();
            ahch.a(a, 1);
            ahcf a2 = ahchVar.b.a();
            ahch.a(a2, 2);
            ahcg ahcgVar2 = new ahcg(a, a2, btluVar, e);
            this.ad = ahcgVar2;
            ahcgVar2.f();
        } else {
            agyy a3 = this.ad.a();
            if (a3 != null) {
                a3.f();
            }
        }
        this.ae.e(this.ad.e());
        this.af.e(this.ad);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.br;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        crzm<btlu> C = this.c.a().C();
        btrm btrmVar = this.b;
        afyo afyoVar = this.ah;
        dceq a = dcet.a();
        a.b(azre.class, new afys(azre.class, afyoVar, bvrj.UI_THREAD));
        btrmVar.g(afyoVar, a.a());
        g(C.l());
        C.a(this.ag, this.g);
        efg efgVar = this.e;
        egj egjVar = new egj(this);
        egjVar.G(this.ae.c(), 5);
        egjVar.w(this.af.c());
        egjVar.ag(null);
        egjVar.f(false);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.ad.b();
        this.ae.e(null);
        this.af.e(null);
        this.b.a(this.ah);
        this.c.a().C().c(this.ag);
    }
}
