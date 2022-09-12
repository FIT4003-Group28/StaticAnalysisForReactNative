package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: baax  reason: default package */
/* loaded from: classes3.dex */
public final class baax extends hxf {
    public acyp b;
    public gga c;
    public bahn d;
    public efg e;
    public cqkj f;
    private cqkf<baeq> g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.g.e(null);
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.a = Ro(R.string.RESERVATIONS_LEAF_PAGE_TITLE);
        a.k = new jia(this) { // from class: baaw
            private final baax a;

            {
                this.a = this;
            }

            @Override // defpackage.jia
            public final void a(View view) {
                baax baaxVar = this.a;
                if (baaxVar.aD) {
                    baaxVar.c.g().e();
                }
            }
        };
        return a.b();
    }

    @Override // defpackage.hxf
    public final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<baeq> e = this.f.e(new babl());
        this.g = e;
        dbsk.s(e);
        return e.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.aj;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        bahn bahnVar = this.d;
        gga a = bahnVar.a.a();
        bahn.a(a, 1);
        bahn.a(bahnVar.b.a(), 2);
        bvjj a2 = bahnVar.c.a();
        bahn.a(a2, 3);
        akfa a3 = bahnVar.d.a();
        bahn.a(a3, 4);
        axwq a4 = bahnVar.e.a();
        bahn.a(a4, 5);
        baho a5 = bahnVar.f.a();
        bahn.a(a5, 6);
        barv a6 = bahnVar.g.a();
        bahn.a(a6, 7);
        bbbd a7 = bahnVar.h.a();
        bahn.a(a7, 8);
        bbbb a8 = bahnVar.i.a();
        bahn.a(a8, 9);
        ania a9 = bahnVar.j.a();
        bahn.a(a9, 10);
        bahm bahmVar = new bahm(a, a2, a3, a4, a5, a6, a7, a8, a9);
        bahmVar.f();
        this.g.e(bahmVar);
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egf a10 = egf.a();
        a10.s = true;
        egjVar.A(a10);
        if (this.b.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        this.e.a(egjVar.a());
    }
}
