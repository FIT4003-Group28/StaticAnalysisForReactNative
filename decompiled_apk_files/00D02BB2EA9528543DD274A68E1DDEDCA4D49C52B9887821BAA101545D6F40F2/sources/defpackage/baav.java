package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: baav  reason: default package */
/* loaded from: classes3.dex */
public final class baav extends hxf {
    private cqkf<baep> ad;
    public acyp b;
    public gga c;
    public bagp d;
    public efg e;
    public cqkj f;
    private bago g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.ad.e(null);
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.a = Ro(R.string.MY_MAPS_LEAF_PAGE_TITLE);
        a.k = new jia(this) { // from class: baau
            private final baav a;

            {
                this.a = this;
            }

            @Override // defpackage.jia
            public final void a(View view) {
                baav baavVar = this.a;
                if (baavVar.aD) {
                    baavVar.c.g().e();
                }
            }
        };
        return a.b();
    }

    @Override // defpackage.hxf
    public final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<baep> e = this.f.e(new babk());
        this.ad = e;
        dbsk.s(e);
        return e.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.ah;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bagp bagpVar = this.d;
        bagp.a(bagpVar.a.a(), 1);
        btpc a = bagpVar.b.a();
        bagp.a(a, 2);
        Executor a2 = bagpVar.c.a();
        bagp.a(a2, 3);
        gga a3 = bagpVar.d.a();
        bagp.a(a3, 4);
        bbai a4 = bagpVar.e.a();
        bagp.a(a4, 5);
        bvbi a5 = bagpVar.f.a();
        bagp.a(a5, 6);
        bago bagoVar = new bago(a, a2, a3, a4, a5);
        this.g = bagoVar;
        bagoVar.d();
        this.ad.e(this.g);
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egf a6 = egf.a();
        a6.s = true;
        egjVar.A(a6);
        if (this.b.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        this.e.a(egjVar.a());
    }
}
