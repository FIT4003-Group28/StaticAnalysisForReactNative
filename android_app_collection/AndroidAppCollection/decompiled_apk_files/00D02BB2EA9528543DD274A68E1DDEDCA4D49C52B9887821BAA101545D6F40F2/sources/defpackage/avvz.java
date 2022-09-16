package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: avvz  reason: default package */
/* loaded from: classes3.dex */
public final class avvz extends hxf implements ggg {
    private avxz ad;
    public eeu b;
    public cqkj c;
    public efg d;
    public dzsj<avxz> e;
    public gga f;
    private cqkf<avxp> g;

    public static avvz aR() {
        avvz avvzVar = new avvz();
        avvzVar.aJ();
        return avvzVar;
    }

    @Override // defpackage.ges
    protected final void Nv() {
        dxix.a(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        avxz avxzVar = this.ad;
        if (avxzVar != null) {
            avxzVar.t();
        }
        super.am();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        String string = J().getString(R.string.SETTINGS);
        jhm a = jhm.a();
        a.a = string;
        a.b = string;
        a.h = 2;
        a.d(new View.OnClickListener(this) { // from class: avvy
            private final avvz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                avvz avvzVar = this.a;
                if (avvzVar.U()) {
                    avvzVar.f.D(new awfw());
                }
            }
        });
        a.c = cqrt.g(2131231743, ibl.b());
        a.f = cjtd.a(dtxx.ba);
        jho c = a.c();
        jhz a2 = jhz.a();
        a2.a = J().getString(R.string.OFFLINE_MAPS_TITLE);
        a2.f(new jmn(getClass()));
        a2.c(c);
        return a2.b();
    }

    @Override // defpackage.hxf
    public final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<avxp> c = this.c.c(new avxo(), null);
        this.g = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ad = this.e.a();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.aU;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.z();
        this.ad.x();
        this.g.e(this.ad);
        View view = this.P;
        if (view != null && this.b.h()) {
            efg efgVar = this.d;
            egj egjVar = new egj(this);
            egjVar.ag(null);
            egjVar.w(view);
            egjVar.L(3);
            efgVar.a(egjVar.a());
        }
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        this.g.e(null);
        this.ad.A();
        super.u();
    }
}
