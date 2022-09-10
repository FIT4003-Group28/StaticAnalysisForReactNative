package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: avua  reason: default package */
/* loaded from: classes3.dex */
public final class avua extends ges {
    public cqkj a;
    private cqkf<avue> ad;
    public efg b;
    public akfc c;
    public dxio<avik> d;
    @dzsi
    private alad e;
    @dzsi
    private String f;
    private avue g;

    @Override // defpackage.ges
    protected final void Nv() {
        dxix.a(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.g = new avuh(J(), this, this.c, this.e, this.f, this.d);
        cqkf<avue> c = this.a.c(new avud(), null);
        this.ad = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        this.e = (alad) bundle2.getSerializable("camera");
        this.f = bundle2.getString("area_name");
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.bv;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.e(this.g);
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.e(null);
        super.u();
    }
}
