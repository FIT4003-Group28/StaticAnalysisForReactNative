package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: brac  reason: default package */
/* loaded from: classes4.dex */
public final class brac {
    static final String o = "brac";
    public final efg a;
    @dzsi
    public cqkf<jbk> b;
    @dzsi
    public cqkf<bssu> c;
    public final gga d;
    public final jar e;
    @dzsi
    public final dro f;
    @dzsi
    public final View g;
    public final ckmp h;
    public final bsnj i;
    public final brmd j;
    public final brat k;
    public final bsoi l;
    public final bsor m;
    @dzsi
    public final bxbd n = null;
    private final dxio<afwp> p;
    private final ggc q;
    @dzsi
    private final bsrl r;
    private final brcj s;
    private final bwrs<brln> t;
    private final bwrs<brlu> u;
    private final bsnh v;
    private final acyp w;
    private final bnlm x;

    public brac(dxio dxioVar, bnlm bnlmVar, bsni bsniVar, bsnk bsnkVar, efg efgVar, brat bratVar, ckmp ckmpVar, acyp acypVar, bsos bsosVar, brlk brlkVar, ggc ggcVar, Bundle bundle, gga ggaVar, gek gekVar, cqkf cqkfVar, cqkf cqkfVar2, brmd brmdVar, jar jarVar, dro droVar, bsrl bsrlVar, View view, jkf jkfVar, brcj brcjVar, bsoi bsoiVar) {
        this.q = ggcVar;
        this.p = dxioVar;
        this.x = bnlmVar;
        this.a = efgVar;
        this.k = bratVar;
        this.d = ggaVar;
        this.b = cqkfVar;
        this.c = cqkfVar2;
        this.j = brmdVar;
        this.e = jarVar;
        this.f = droVar;
        this.r = bsrlVar;
        this.g = view;
        this.s = brcjVar;
        this.l = bsoiVar;
        this.t = brlkVar.a();
        this.u = brlkVar.b();
        this.h = ckmpVar;
        this.w = acypVar;
        ckcw a = bsniVar.a.a();
        bsni.a(a, 1);
        bsni.a(bsniVar.b.a(), 2);
        bsni.a(bsniVar.c.a(), 3);
        cjqy a2 = bsniVar.d.a();
        bsni.a(a2, 4);
        cklq a3 = bsniVar.e.a();
        bsni.a(a3, 5);
        ckmp a4 = bsniVar.f.a();
        bsni.a(a4, 6);
        ckml a5 = bsniVar.g.a();
        bsni.a(a5, 7);
        brpm a6 = bsniVar.h.a();
        bsni.a(a6, 8);
        brlk a7 = bsniVar.i.a();
        bsni.a(a7, 9);
        bsni.a(ggaVar, 11);
        bsni.a(gekVar, 12);
        bsni.a(jkfVar, 14);
        bsni.a(brcjVar, 15);
        this.v = new bsnh(a, a2, a3, a4, a5, a6, a7, bundle, ggaVar, gekVar, view, jkfVar, brcjVar);
        Activity activity = (Activity) ((dxjd) bsnkVar.a).a;
        bsnk.a(activity, 1);
        bsnk.a(bsnkVar.b.a(), 2);
        cklq a8 = bsnkVar.c.a();
        bsnk.a(a8, 3);
        ckmp a9 = bsnkVar.d.a();
        bsnk.a(a9, 4);
        ckml a10 = bsnkVar.e.a();
        bsnk.a(a10, 5);
        brpm a11 = bsnkVar.f.a();
        bsnk.a(a11, 6);
        brlk a12 = bsnkVar.g.a();
        bsnk.a(a12, 7);
        bsnk.a(brcjVar, 8);
        bsnk.a(bsoiVar, 9);
        this.i = new bsnj(activity, a8, a9, a10, a11, a12, brcjVar, bsoiVar);
        cjqy a13 = bsosVar.a.a();
        bsos.a(a13, 1);
        brat a14 = bsosVar.b.a();
        bsos.a(a14, 2);
        cjqq a15 = bsosVar.c.a();
        bsos.a(a15, 3);
        bsos.a(bsosVar.d.a(), 4);
        brlk a16 = bsosVar.e.a();
        bsos.a(a16, 5);
        bsos.a(bsoiVar, 6);
        bsos.a(brcjVar, 7);
        this.m = new bsor(a13, a14, a15, a16, bsoiVar, brcjVar);
    }

    private final boolean f() {
        return e().c();
    }

    public final egj a(boolean z) {
        egj b = b();
        cqkf<bssu> cqkfVar = this.c;
        dbsk.s(cqkfVar);
        b.ay(cqkfVar.c(), R.id.search_restriction_content);
        b.J(this.v);
        if (z) {
            b.ak(jkc.j, jkc.j);
        } else {
            b.ak(jkc.d, jkc.j);
        }
        return b;
    }

    public final egj b() {
        brlu c = this.u.c();
        dbsk.s(c);
        ArrayList arrayList = new ArrayList();
        for (ilo iloVar : c.c()) {
            if (!iloVar.bc()) {
                arrayList.add(iloVar);
            }
        }
        egj egjVar = new egj(this.q);
        egjVar.w(null);
        egjVar.k(true);
        egjVar.A(c());
        brau d = brav.d();
        d.d(arrayList);
        d.c(c.aC());
        ((brah) d).a = c.aD();
        egjVar.S(d.a());
        boolean f = f();
        boolean e = e().e();
        if (e || f) {
            cqkf<jbk> cqkfVar = this.b;
            dbsk.s(cqkfVar);
            View c2 = cqkfVar.c();
            egjVar.G(c2, 6);
            egjVar.O(jjn.EXPANDED);
            if (f) {
                egjVar.n(c2);
                egjVar.D(ise.b.e(this.d));
            }
            if (e) {
                egjVar.D(0);
            }
        } else if (this.r != null) {
            egjVar.D(ise.b.e(this.d));
            egjVar.V(new brjp(), this.r);
            egjVar.F(null);
            egjVar.O(jjn.FULLY_EXPANDED);
            if (this.r.au() != null) {
                egjVar.ap(4);
            }
        }
        if (this.s.f() != null) {
            this.s.d();
            egjVar.R(this.s.f());
        }
        if (d()) {
            egjVar.Y(true);
        } else {
            egjVar.c(this.p.a().e());
        }
        if (this.w.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        return egjVar;
    }

    public final egf c() {
        egf a = egf.a();
        a.E = dpwz.MAP_CONTENT_SEARCH;
        djim djimVar = this.x.a;
        boolean z = false;
        if (djimVar != null && djimVar.u) {
            z = true;
        }
        a.B = z;
        a.v = dtyb.bj;
        a.m = !f();
        a.s = true;
        return a;
    }

    public final boolean d() {
        return this.d.getResources().getConfiguration().orientation == 2;
    }

    public final brln e() {
        brln c = this.t.c();
        dbsk.s(c);
        return c;
    }
}
