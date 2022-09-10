package defpackage;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfcz  reason: default package */
/* loaded from: classes3.dex */
public class bfcz extends bfcb implements bfcf {
    @dzsi
    private bexz A;
    @dzsi
    private acpa B;
    private boolean C;
    private boolean D;
    public final Activity b;
    public final bfda c;
    public final bfdf d;
    public final bfbb e;
    public final dxio<akfa> f;
    public final bvrb g;
    public final dxio<bzmm> h;
    @dzsi
    bwrs<ilo> i;
    @dzsi
    public bfcs j;
    @dzsi
    public bfbj k;
    @dzsi
    public baal l;
    public boolean m;
    public boolean n;
    public int o;
    private final beya p;
    private final bfaq q;
    private final beyb r;
    private final beye s;
    private final bfct t;
    private final beyh u;
    private final akfc v;
    private final cjqq w;
    private final dxio<ania> x;
    private final cjtd y;
    private final bexy z;

    public bfcz(Activity activity, beya beyaVar, bfaq bfaqVar, beyb beybVar, beye beyeVar, bfct bfctVar, bfdb bfdbVar, bfdf bfdfVar, bfbc bfbcVar, beyh beyhVar, dxio<akfa> dxioVar, akfc akfcVar, dxio<bzmm> dxioVar2, bvrb bvrbVar, cjqq cjqqVar, dxio<ania> dxioVar3) {
        super(activity);
        this.z = new bfcx(this);
        this.i = null;
        this.m = true;
        this.n = true;
        this.C = false;
        this.D = false;
        this.o = 0;
        this.b = activity;
        this.p = beyaVar;
        this.q = bfaqVar;
        this.r = beybVar;
        this.s = beyeVar;
        this.d = bfdfVar;
        bfbb a = bfbcVar.a(bfby.PLACESHEET_HEADER);
        this.e = a;
        this.u = beyhVar;
        this.f = dxioVar;
        this.v = akfcVar;
        this.g = bvrbVar;
        this.h = dxioVar2;
        this.w = cjqqVar;
        this.x = dxioVar3;
        this.t = bfctVar;
        this.y = cjtd.a(dtxu.T);
        Activity activity2 = (Activity) ((dxjd) bfdbVar.a).a;
        bfdb.a(activity2, 1);
        cqat a2 = bfdbVar.b.a();
        bfdb.a(a2, 2);
        cqhn a3 = bfdbVar.c.a();
        bfdb.a(a3, 3);
        cqhu a4 = bfdbVar.d.a();
        bfdb.a(a4, 4);
        bfaq a5 = bfdbVar.e.a();
        bfdb.a(a5, 5);
        gga a6 = bfdbVar.f.a();
        bfdb.a(a6, 6);
        bvrb a7 = bfdbVar.g.a();
        bfdb.a(a7, 7);
        dxio a8 = ((dxjh) bfdbVar.h).a();
        bfdb.a(a8, 8);
        dxio a9 = ((dxjh) bfdbVar.i).a();
        bfdb.a(a9, 9);
        bfdb.a(bfdfVar, 10);
        bfdb.a(a, 11);
        this.c = new bfda(activity2, a2, a3, a4, a5, a6, a7, a8, a9, bfdfVar, a);
    }

    @Override // defpackage.bfcb, defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.bfcb, defpackage.jad
    public cqkl c() {
        if (this.f.a().c()) {
            r();
        } else {
            this.v.k(new bfcy(this), null);
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        cjtd bZ;
        bwrs<ilo> bwrsVar = this.i;
        if (bwrsVar == null) {
            bZ = null;
        } else {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            bZ = c.bZ();
        }
        cjta c2 = cjtd.c(bZ);
        c2.d = this.a ? dtxy.nx : dtxy.dG;
        return c2.a();
    }

    @Override // defpackage.bfcb, defpackage.bfca
    public Boolean j() {
        bwrs<ilo> bwrsVar = this.i;
        boolean z = false;
        if (bwrsVar != null && this.q.b(bwrsVar) && !this.a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfcb, defpackage.bfca
    public CharSequence l() {
        return j().booleanValue() ? this.b.getString(R.string.WELCOME_OFFER_ICON_DESCRIPTION) : "";
    }

    @Override // defpackage.bfcf
    public Boolean m() {
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.bfcf
    public acpa n() {
        if (this.B == null) {
            SpannableStringBuilder a = this.r.a(R.string.LOCAL_FOLLOW_HELP_TOOLTIP_MESSAGE, this.y);
            this.B = new acpc(a, a.toString());
        }
        return this.B;
    }

    public bfch o() {
        return this.d;
    }

    public bfch p() {
        return this.c;
    }

    public void q(View view) {
        boolean z;
        bwrs<ilo> bwrsVar = this.i;
        if (bwrsVar == null) {
            return;
        }
        ilo c = bwrsVar.c();
        dbsk.s(c);
        final beyh beyhVar = this.u;
        beyhVar.f = c;
        boolean z2 = false;
        if (!beyhVar.d()) {
            z = false;
        } else {
            beyhVar.d.g().d(cjtd.a(dtxy.ng));
            String string = beyhVar.a.getString(R.string.WELCOME_OFFER_TOOLTIP_TEXT);
            int a = jmj.a(beyhVar.a, 2);
            jlo a2 = beyhVar.b.a(string, view);
            a2.i();
            a2.o(true);
            a2.p();
            a2.c(dbud.a(new dbty(beyhVar) { // from class: beyf
                private final beyh a;

                {
                    this.a = beyhVar;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    beyh beyhVar2 = this.a;
                    return Boolean.valueOf(beyhVar2.c.a(beyhVar2));
                }
            }));
            a2.e(new Runnable(beyhVar) { // from class: beyg
                private final beyh a;

                {
                    this.a = beyhVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c.f(dqkc.LOCAL_FOLLOW_WELCOME_OFFER_BUBBLE);
                }
            }, dege.a);
            a2.t(jln.GM2_BLUE);
            a2.l(a);
            if (!beyhVar.e.e(beyhVar.a)) {
                a2.m(3000);
            }
            a2.a();
            z = true;
        }
        this.D = z;
        if (!z) {
            final beye beyeVar = this.s;
            if (beyeVar.d()) {
                beyeVar.d.g().d(cjtd.a(dtxu.ah));
                String string2 = beyeVar.a.getString(R.string.LOCAL_FOLLOW_NEW_BUTTON_TEXT);
                int a3 = jmj.a(beyeVar.a, 2);
                jlo a4 = beyeVar.b.a(string2, view);
                a4.i();
                a4.o(true);
                a4.p();
                a4.c(dbud.a(new dbty(beyeVar) { // from class: beyc
                    private final beye a;

                    {
                        this.a = beyeVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        beye beyeVar2 = this.a;
                        return Boolean.valueOf(beyeVar2.c.a(beyeVar2));
                    }
                }));
                a4.e(new Runnable(beyeVar) { // from class: beyd
                    private final beye a;

                    {
                        this.a = beyeVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c.f(dqkc.LOCAL_FOLLOW_NEW_BUBBLE);
                    }
                }, dege.a);
                a4.t(jln.GM2_BLUE);
                a4.l(a3);
                if (!beyeVar.e.e(beyeVar.a)) {
                    a4.m(3000);
                }
                a4.a();
                z2 = true;
            }
            this.C = z2;
        }
        cqkx.p(this);
    }

    public final void r() {
        bexz bexzVar = this.A;
        dbsk.s(bexzVar);
        baal baalVar = this.l;
        dbsk.s(baalVar);
        final boolean g = this.a ? bexzVar.g(baalVar) : bexzVar.f(baalVar);
        this.g.b(new Runnable(this, g) { // from class: bfcu
            private final bfcz a;
            private final boolean b;

            {
                this.a = this;
                this.b = g;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bfcz bfczVar = this.a;
                if (!this.b) {
                    Activity activity = bfczVar.b;
                    cjxu.i(activity, activity.getString(R.string.LOCAL_FOLLOW_FAILURE_MESSAGE));
                    return;
                }
                if (bfczVar.a) {
                    bfczVar.o--;
                    bfczVar.a = false;
                    bfczVar.d.A();
                    bfczVar.c.A();
                    bfbj bfbjVar = bfczVar.k;
                    if (bfbjVar != null) {
                        bfbjVar.m(false);
                        ((bfbe) bfczVar.k.l()).n();
                    }
                } else {
                    bfcs bfcsVar = bfczVar.j;
                    if ((bfcsVar == null || !bfczVar.h.a().a(bfcsVar)) && !bfczVar.h.a().a(bfczVar.c)) {
                        if (bfczVar.j().booleanValue()) {
                            bfczVar.e.y(true);
                            bfbj bfbjVar2 = bfczVar.k;
                            if (bfbjVar2 != null) {
                                bfbjVar2.m(true);
                            }
                        } else {
                            bfczVar.h.a().a(bfczVar.d);
                        }
                    }
                    bfczVar.o++;
                    bfczVar.a = true;
                }
                cqkx.p(bfczVar);
            }
        }, bvrj.UI_THREAD);
    }

    public void s(bfau bfauVar) {
        this.k = (bfbj) bfauVar;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.i = bwrsVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        if (!c.cL()) {
            return;
        }
        dizx cM = c.cM();
        dbsk.s(cM);
        this.o = cM.b;
        bexz a = this.p.a(this.z);
        this.A = a;
        bfda bfdaVar = this.c;
        dbsk.s(a);
        bfdaVar.w(bwrsVar, a);
        this.d.w(bwrsVar);
        this.e.t(bwrsVar);
        bfbj bfbjVar = this.k;
        if (bfbjVar != null) {
            this.c.x(bfbjVar);
            this.e.s(this.k);
        }
        bfct bfctVar = this.t;
        bfbb bfbbVar = this.e;
        bexz bexzVar = this.A;
        dbsk.s(bexzVar);
        bfcs a2 = bfctVar.a(bfbbVar, bexzVar);
        this.j = a2;
        a2.s(this.d);
    }

    @Override // defpackage.bega
    public void u() {
        this.c.A();
        this.c.y();
        this.d.A();
        this.d.x();
        this.e.u();
        bfcs bfcsVar = this.j;
        if (bfcsVar != null) {
            bfcsVar.u();
            this.j.t();
            this.j = null;
        }
        this.A = null;
        this.m = true;
        this.n = true;
        this.C = false;
        this.D = false;
        this.i = null;
        this.l = null;
        this.a = false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        bwrs<ilo> bwrsVar;
        ilo c;
        boolean z = false;
        if (!this.x.a().a() || (bwrsVar = this.i) == null || (c = bwrsVar.c()) == null || !c.cL()) {
            return false;
        }
        dizx cM = c.cM();
        if (cM != null && cM.a) {
            bexz bexzVar = this.A;
            if (bexzVar != null && !bexzVar.a()) {
                cjqp g = this.w.g();
                cjta c2 = cjtd.c(c.bZ());
                c2.d = dtxy.dG;
                c2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                g.d(c2.a());
            }
            bexz bexzVar2 = this.A;
            if (bexzVar2 != null && bexzVar2.a()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfca
    public CharSequence k() {
        if (!this.a) {
            if (this.D) {
                return this.b.getString(R.string.WELCOME_OFFER_TOOLTIP_TEXT);
            }
            if (this.C) {
                return this.b.getString(R.string.LOCAL_FOLLOW_NEW_BUTTON_TEXT);
            }
        }
        return e();
    }
}
