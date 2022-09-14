package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfbj  reason: default package */
/* loaded from: classes3.dex */
public class bfbj implements bfau {
    public final bfbe a;
    public final bgng b;
    public final bvrb c;
    @dzsi
    public ilo d;
    @dzsi
    public dipk e;
    private final Activity f;
    private final bfbb g;
    private final beya h;
    private final bfaq i;
    private final dxio<glj> j;
    private final jkl l;
    private final dxio<bzmm> m;
    @dzsi
    private bexz o;
    private final bexy n = new bfbh(this);
    private boolean p = false;
    private boolean q = false;
    private cjtd r = cjtd.b;
    private cjtd s = cjtd.b;
    private cjtd t = cjtd.b;
    private final bfbi k = new bfbi(this);

    public bfbj(Activity activity, cqhn cqhnVar, beya beyaVar, bfaq bfaqVar, bfbc bfbcVar, dxio<glj> dxioVar, bfbe bfbeVar, bgng bgngVar, bvrb bvrbVar, dxio<bzmm> dxioVar2) {
        this.f = activity;
        this.h = beyaVar;
        this.i = bfaqVar;
        this.g = bfbcVar.a(bfby.PLACESHEET_HEADER);
        this.j = dxioVar;
        this.a = bfbeVar;
        this.b = bgngVar;
        this.c = bvrbVar;
        this.m = dxioVar2;
        this.l = new jkl(bfbeVar);
    }

    private final cjtd o(ddho ddhoVar) {
        ilo iloVar = this.d;
        dbsk.s(iloVar);
        cjta c = cjtd.c(iloVar.a());
        c.d = ddhoVar;
        dipk dipkVar = this.e;
        dbsk.s(dipkVar);
        c.b = dipkVar.p;
        dipk dipkVar2 = this.e;
        dbsk.s(dipkVar2);
        c.g(dipkVar2.q);
        return c.a();
    }

    @Override // defpackage.bfau
    public Boolean a() {
        boolean z = false;
        if (this.d != null && this.e != null && this.q) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfau
    public Boolean b() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.bfau
    public CharSequence c() {
        dipk dipkVar = this.e;
        dbsk.s(dipkVar);
        return dipkVar.g;
    }

    @Override // defpackage.bfau
    public CharSequence d() {
        dipk dipkVar = this.e;
        dbsk.s(dipkVar);
        dior diorVar = dipkVar.l;
        if (diorVar == null) {
            diorVar = dior.g;
        }
        String str = diorVar.d;
        return str.isEmpty() ? this.f.getString(R.string.WELCOME_OFFER_VIEW_OFFER_TEXT) : str;
    }

    @Override // defpackage.bfau
    public cqkl e() {
        this.g.y(false);
        return cqkl.a;
    }

    @Override // defpackage.bfau
    public cjtd f() {
        return this.s;
    }

    @Override // defpackage.bfau
    public cqtd g() {
        if (this.p) {
            return cqrt.g(2131232738, ibm.m());
        }
        return cqrt.g(2131232731, ibm.m());
    }

    @Override // defpackage.bfau
    public cqkl h() {
        this.p = !this.p;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bfau
    public cjtd i() {
        return this.r;
    }

    @Override // defpackage.bfau
    public jht j() {
        jhu h = jhv.h();
        jhm jhmVar = new jhm();
        jhmVar.a = this.f.getString(R.string.WELCOME_OFFER_REPORT_TEXT);
        jhmVar.d(new View.OnClickListener(this) { // from class: bfbf
            private final bfbj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bfbj bfbjVar = this.a;
                bgng bgngVar = bfbjVar.b;
                dipk dipkVar = bfbjVar.e;
                dbsk.s(dipkVar);
                bgngVar.a(dipkVar);
            }
        });
        jhmVar.f = this.t;
        h.d(jhmVar.c());
        return ((jhi) h).b();
    }

    @Override // defpackage.bfau
    public View.OnAttachStateChangeListener k() {
        return this.k;
    }

    @Override // defpackage.bfau
    public bfat l() {
        return this.a;
    }

    public void m(boolean z) {
        this.q = z;
        cqkx.p(this);
    }

    public void n() {
        if (!this.k.a) {
            this.m.a().a(this.a);
        }
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        if (!this.i.a()) {
            return;
        }
        ilo c = bwrsVar.c();
        this.d = c;
        if (c == null) {
            return;
        }
        dbsg<dipk> c2 = bfaq.c(c);
        if (!c2.a()) {
            return;
        }
        this.e = c2.b();
        this.r = o(dtxy.mV);
        this.s = o(dtxy.mW);
        this.t = o(dtxy.mX);
        this.o = this.h.a(this.n);
        this.j.a().e(this.l);
        this.g.t(bwrsVar);
    }

    @Override // defpackage.bega
    public void u() {
        this.d = null;
        this.e = null;
        this.p = false;
        this.q = false;
        this.r = cjtd.b;
        this.s = cjtd.b;
        this.t = cjtd.b;
        this.o = null;
        this.j.a().j(this.l);
        this.a.n();
        this.k.a = false;
        this.g.u();
    }

    @Override // defpackage.bega
    public Boolean w() {
        bexz bexzVar;
        boolean z = false;
        if (this.i.a() && (bexzVar = this.o) != null && bexzVar.a() && this.e != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
