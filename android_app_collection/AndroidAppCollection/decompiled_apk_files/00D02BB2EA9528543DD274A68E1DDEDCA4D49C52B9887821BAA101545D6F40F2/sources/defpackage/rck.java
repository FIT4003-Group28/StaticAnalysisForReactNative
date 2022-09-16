package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: rck  reason: default package */
/* loaded from: classes7.dex */
public final class rck extends gew implements egq {
    public rfa c;
    public efg d;
    public cqkj e;
    private rez f;
    private cqkf<rei> g;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gew
    public final void Qm() {
        if (!this.aD) {
            return;
        }
        this.f.g();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.f.g();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        dbsk.l(bundle2.containsKey("directionsStorageItem"));
        dbsk.l(bundle2.containsKey("tripIndex"));
        dbsk.l(bundle2.containsKey("updatedTimeMs"));
        amte amteVar = (amte) bundle2.getSerializable("directionsStorageItem");
        int i = bundle2.getInt("tripIndex");
        long j = bundle2.getLong("updatedTimeMs");
        dbsk.s(amteVar.b(i, J()));
        rfa rfaVar = this.c;
        Activity activity = (Activity) ((dxjd) rfaVar.a).a;
        rfa.a(activity, 1);
        ivg a = rfaVar.b.a();
        rfa.a(a, 2);
        cqhn a2 = rfaVar.c.a();
        rfa.a(a2, 3);
        dxio a3 = ((dxjh) rfaVar.d).a();
        rfa.a(a3, 4);
        zpy a4 = rfaVar.e.a();
        rfa.a(a4, 5);
        dxio a5 = ((dxjh) rfaVar.f).a();
        rfa.a(a5, 6);
        rfa.a(amteVar, 7);
        this.f = new rez(activity, a, a2, a3, a4, a5, amteVar, i, j);
        this.g = this.e.e(new ree());
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxl.bM;
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.f.d();
        this.g.e(this.f);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.g.c());
        egjVar.J(this);
        egf a = egf.a();
        a.o();
        a.m = false;
        egjVar.A(a);
        this.d.a(egjVar.a());
    }

    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.f.e();
        this.g.h();
    }
}
