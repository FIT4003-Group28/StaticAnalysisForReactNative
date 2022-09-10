package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
/* compiled from: PG */
/* renamed from: arhi  reason: default package */
/* loaded from: classes2.dex */
public final class arhi extends hxf {
    public efg b;
    public cqkj c;
    public arhy d;
    arhx e;

    @Override // defpackage.ges
    protected final void Nv() {
        ((arhj) btsx.b(arhj.class, this)).cm(this);
    }

    @Override // defpackage.hxf
    protected final jib g() {
        return jib.g(J(), "");
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf e = this.c.e(new arho());
        e.e(this.e);
        return e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        arhy arhyVar = this.d;
        arhh arhhVar = new arhh(this);
        dsrj<dvbv> dsrjVar = ((dvcj) bvrs.b(this.o.getByteArray("feature_details_proto"), (dssr) dvcj.d.cu(7))).c;
        Application a = arhyVar.a.a();
        arhy.a(a, 1);
        arhz a2 = arhyVar.b.a();
        arhy.a(a2, 2);
        arhy.a(arhhVar, 3);
        arhy.a(dsrjVar, 4);
        this.e = new arhx(a, a2, arhhVar, dsrjVar);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.ey;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.x(egr.a);
        egjVar.f(false);
        efgVar.a(egjVar.a());
    }
}
