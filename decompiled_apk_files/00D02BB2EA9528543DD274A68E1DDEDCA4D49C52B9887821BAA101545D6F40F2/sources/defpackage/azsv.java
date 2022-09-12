package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: azsv  reason: default package */
/* loaded from: classes3.dex */
public final class azsv extends ges {
    public cqkj a;
    public efg b;
    public batv c;
    private batw d;
    private cqkf<batw> e;

    @Override // defpackage.ges
    public final void Nv() {
        ((azsw) btsx.b(azsw.class, this)).cz(this);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<batw> d = this.a.d(new azuz(), viewGroup, false);
        this.e = d;
        d.e(this.d);
        return this.e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        super.ak();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.F(null);
        egjVar.e(this);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.e.e(null);
        super.am();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        azxa azxaVar = (azxa) this.o.getSerializable("alias");
        ilo iloVar = (ilo) this.o.getSerializable("pmk");
        batv batvVar = this.c;
        dbsk.s(azxaVar);
        dbsk.s(iloVar);
        dxio a = ((dxjh) batvVar.a).a();
        batv.a(a, 1);
        gga a2 = batvVar.b.a();
        batv.a(a2, 2);
        batv.a(batvVar.c.a(), 3);
        batv.a(azxaVar, 4);
        batv.a(iloVar, 5);
        this.d = new batu(a, a2, azxaVar, iloVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxp.ai;
    }
}
