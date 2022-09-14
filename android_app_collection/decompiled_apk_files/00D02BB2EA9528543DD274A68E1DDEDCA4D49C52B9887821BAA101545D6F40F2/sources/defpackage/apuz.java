package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: apuz  reason: default package */
/* loaded from: classes2.dex */
public final class apuz extends ges {
    public efg a;
    public cqkj b;
    public apvs c;
    public aprw d;
    public dxio<aprz> e;
    cqkf<apvm> f;
    apvr g;

    public static apuz g() {
        dbsk.l(true);
        apuz apuzVar = new apuz();
        apuzVar.B(new Bundle());
        return apuzVar;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        cqkf<apvm> e = this.b.e(new apvj());
        this.f = e;
        return e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        apvs apvsVar = this.c;
        gga a = apvsVar.a.a();
        apvs.a(a, 1);
        apvo a2 = apvsVar.b.a();
        apvs.a(a2, 2);
        apvs.a(apvsVar.c.a(), 3);
        apvr apvrVar = new apvr(a, a2);
        this.g = apvrVar;
        this.e.a().a(this.d.c(), apvrVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.dj;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egf a = egf.a();
        a.s = true;
        egjVar.A(a);
        egu a2 = egjVar.a();
        cqkf<apvm> cqkfVar = this.f;
        if (cqkfVar == null || cqkfVar.c() == null) {
            return;
        }
        this.f.e(this.g);
        this.a.a(a2);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        cqkf<apvm> cqkfVar = this.f;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        super.u();
    }
}
