package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aypo  reason: default package */
/* loaded from: classes3.dex */
public class aypo implements ayms {
    public final gga a;
    public final axwq b;
    public final akfa c;
    public final akfc d;
    public final bvrb e;
    public final ayay f;
    public final dxio<axwo> g;
    public final dxio<afef> h;
    public final bwrs<baad> i;
    public final aydl j;
    public final cqkj k;
    public final ceet l;
    public final ayak m;
    @dzsi
    ayfo n;
    private final aymh o;
    private final axwi p;
    private final axwg q;
    private final bwqv r;
    private final axze s;
    private final btvo t;
    private final ayor u;
    @dzsi
    private final aymw v;
    private ayoq w;
    private ayoq x;
    private ayoq y;

    public aypo(gga ggaVar, aymh aymhVar, dxio<axwo> dxioVar, axwi axwiVar, axwq axwqVar, akfa akfaVar, akfc akfcVar, bvrb bvrbVar, ayay ayayVar, ayrf ayrfVar, ayak ayakVar, ayor ayorVar, axwg axwgVar, dxio<afef> dxioVar2, aydl aydlVar, bwqv bwqvVar, axze axzeVar, cqkj cqkjVar, ceet ceetVar, btvo btvoVar, bwrs<baad> bwrsVar) {
        this.a = ggaVar;
        this.o = aymhVar;
        this.p = axwiVar;
        this.b = axwqVar;
        this.c = akfaVar;
        this.d = akfcVar;
        this.e = bvrbVar;
        this.f = ayayVar;
        this.m = ayakVar;
        this.u = ayorVar;
        this.g = dxioVar;
        this.q = axwgVar;
        this.h = dxioVar2;
        this.i = bwrsVar;
        this.j = aydlVar;
        this.r = bwqvVar;
        this.s = axzeVar;
        this.k = cqkjVar;
        this.l = ceetVar;
        this.t = btvoVar;
        if (btlu.i(akfaVar.j()) == btlt.INCOGNITO) {
            this.v = null;
            return;
        }
        gga a = ayrfVar.a.a();
        ayrf.a(a, 1);
        cklf a2 = ayrfVar.b.a();
        ayrf.a(a2, 2);
        ayrf.a(bwrsVar, 3);
        this.v = new ayre(a, a2, bwrsVar);
    }

    public static boolean t(baad baadVar) {
        return baadVar.t() == baac.PUBLISHED;
    }

    private static boolean y(baad baadVar) {
        return baadVar.q() || baadVar.y();
    }

    private static boolean z(baad baadVar) {
        return baadVar.ab() && baadVar.X();
    }

    @Override // defpackage.ayms
    public String a() {
        return u().E(this.a.getApplicationContext());
    }

    @Override // defpackage.ayms
    public CharSequence b() {
        aymh aymhVar = this.o;
        baad u = u();
        return !u.y() ? aymhVar.g(u) : aymhVar.f(u, ibm.n());
    }

    @Override // defpackage.ayms
    public CharSequence c() {
        return this.o.e(u(), true);
    }

    @Override // defpackage.ayms
    @dzsi
    public cjtd d() {
        if (!this.o.h(u())) {
            return null;
        }
        return cjtd.a(dtxy.dX);
    }

    @Override // defpackage.ayms
    public String e() {
        return u().G();
    }

    @Override // defpackage.ayms
    public List<aymq> f() {
        aymr aymrVar;
        aymr aymrVar2;
        ayoo ayooVar;
        final baad u = u();
        if (z(u)) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        if (!u.B() && u.D() && this.q.e()) {
            ayoq ayoqVar = this.w;
            if (ayoqVar == null) {
                ayor ayorVar = this.u;
                aymr aymrVar3 = ayom.a;
                aymr aymrVar4 = ayom.b;
                cjtd a = cjtd.a(dtxy.eo);
                cjtd a2 = cjtd.a(dtxy.ep);
                ayop ayopVar = new ayop(this, u) { // from class: aypf
                    private final aypo a;
                    private final baad b;

                    {
                        this.a = this;
                        this.b = u;
                    }

                    @Override // defpackage.ayop
                    public final void a(ayon ayonVar) {
                        aypo aypoVar = this.a;
                        baad baadVar = this.b;
                        axwm f = axwn.f();
                        axvs axvsVar = (axvs) f;
                        axvsVar.a = dtxy.em;
                        axvsVar.b = dtxy.en;
                        f.b(3);
                        axvsVar.c = new Runnable(ayonVar) { // from class: ayou
                            private final ayon a;

                            {
                                this.a = ayonVar;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.a(ayoo.LOADING);
                            }
                        };
                        bvqj.c(aypoVar.g.a().m(baadVar, f.a()), new bvqg(ayonVar) { // from class: ayov
                            private final ayon a;

                            {
                                this.a = ayonVar;
                            }

                            @Override // defpackage.bvqg
                            public final void NU(Object obj) {
                                this.a.a(aypo.t((baad) obj) ? ayoo.ALTERNATE : ayoo.INITIAL);
                            }
                        }, aypoVar.e.h());
                    }
                };
                ayop ayopVar2 = new ayop(this, u) { // from class: ayoy
                    private final aypo a;
                    private final baad b;

                    {
                        this.a = this;
                        this.b = u;
                    }

                    @Override // defpackage.ayop
                    public final void a(ayon ayonVar) {
                        aypo aypoVar = this.a;
                        aypoVar.m.g(this.b).a();
                    }
                };
                if (t(u)) {
                    ayooVar = ayoo.ALTERNATE;
                } else {
                    ayooVar = ayoo.INITIAL;
                }
                this.w = ayorVar.a(aymrVar3, aymrVar4, a, a2, ayopVar, ayopVar2, ayooVar);
            } else {
                ayoqVar.h(t(u) ? ayoo.ALTERNATE : ayoo.INITIAL);
            }
            F.g(this.w);
        }
        if (!u.B() && u.D()) {
            F.g(new ayol(ayom.c, cjtd.a(dtyg.C), new ayok(this) { // from class: ayoz
                private final aypo a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayok
                public final void a() {
                    aypo aypoVar = this.a;
                    aypoVar.m.h(aypoVar.i).a();
                }
            }));
        }
        if (!u.B() && y(u) && !u.D()) {
            F.g(new ayol(ayom.d, cjtd.a(ayak.c(u)), new ayok(this, u) { // from class: aypa
                private final aypo a;
                private final baad b;

                {
                    this.a = this;
                    this.b = u;
                }

                @Override // defpackage.ayok
                public final void a() {
                    aypo aypoVar = this.a;
                    aypoVar.m.d(this.b).a();
                }
            }));
        }
        if (!u.B() && !u.y() && !u.j().contains(baaj.EXPERIENCE)) {
            ayoq ayoqVar2 = this.x;
            if (ayoqVar2 == null) {
                ayor ayorVar2 = this.u;
                boolean z = this.t.getPlaceListsParameters().o;
                if (z) {
                    aymrVar = ayom.g;
                } else {
                    aymrVar = ayom.e;
                }
                if (z) {
                    aymrVar2 = ayom.h;
                } else {
                    aymrVar2 = ayom.f;
                }
                this.x = ayorVar2.a(aymrVar, aymrVar2, cjtd.a(dtxy.dW), cjtd.a(dtxy.eA), s(), s(), u.z() ? ayoo.ALTERNATE : ayoo.INITIAL);
            } else {
                ayoqVar2.h(u.z() ? ayoo.ALTERNATE : ayoo.INITIAL);
            }
            F.g(this.x);
        }
        if (!u.B() && (u.y() || !u.j().contains(baaj.EXPERIENCE))) {
            final ddho ddhoVar = y(u) ? dtxy.es : dtxy.et;
            F.g(new ayol(ayom.i, cjtd.a(ddhoVar), new ayok(this, u, ddhoVar) { // from class: aypb
                private final aypo a;
                private final baad b;
                private final ddho c;

                {
                    this.a = this;
                    this.b = u;
                    this.c = ddhoVar;
                }

                @Override // defpackage.ayok
                public final void a() {
                    aypo aypoVar = this.a;
                    aypoVar.m.e(this.b, this.c).a();
                }
            }));
        }
        if (this.q.a() && (u.B() || u.A())) {
            ayoq ayoqVar3 = this.y;
            if (ayoqVar3 == null) {
                this.y = this.u.a(ayom.j, ayom.k, cjtd.a(dtxy.ec), cjtd.a(dtxy.ed), r(), new ayop(this) { // from class: aypd
                    private final aypo a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayop
                    public final void a(ayon ayonVar) {
                        aypo aypoVar = this.a;
                        iii iiiVar = new iii();
                        iiiVar.a = aypoVar.a.getString(R.string.LEAVE_LIST_CONFIRM_DIALOG_TITLE);
                        iiiVar.b = aypoVar.a.getString(R.string.LEAVE_LIST_CONFIRM_DIALOG_TEXT);
                        iiiVar.d(aypoVar.a.getString(R.string.LEAVE_LIST_CONFIRM_DIALOG_POSITIVE_SHORT), new View.OnClickListener(aypoVar, ayonVar) { // from class: ayow
                            private final aypo a;
                            private final ayon b;

                            {
                                this.a = aypoVar;
                                this.b = ayonVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                this.a.w(this.b);
                            }
                        }, cjtd.a(dtxy.ef));
                        iiiVar.c(aypoVar.a.getString(R.string.GO_BACK_BUTTON), null, cjtd.a(dtxy.ee));
                        iiiVar.a(aypoVar.a, aypoVar.k).k();
                    }
                }, u.A() ? ayoo.ALTERNATE : ayoo.INITIAL);
            } else {
                ayoqVar3.h(u.A() ? ayoo.ALTERNATE : ayoo.INITIAL);
            }
            F.g(this.y);
        }
        return F.f();
    }

    @Override // defpackage.ayms
    @dzsi
    public jic g() {
        String P;
        baad u = u();
        if (u.w() || u.o() == baab.CUSTOM) {
            btlu j = this.c.j();
            if (!u.D() || j == null || btlu.i(j) != btlt.GOOGLE) {
                P = u.P();
            } else {
                P = j.i;
            }
            return new jic(P, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998, 0);
        }
        int ordinal = u.o().ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            return null;
        }
        return new jic((String) null, ckqc.FULLY_QUALIFIED, cqrt.g(baam.a(u.o()), ibm.b()), 0);
    }

    @Override // defpackage.ayms
    @dzsi
    public View.OnClickListener h() {
        return new View.OnClickListener(this) { // from class: ayot
            private final aypo a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aypo aypoVar = this.a;
                aypoVar.l.i(aypoVar.u().N().d);
            }
        };
    }

    @Override // defpackage.ayms
    @dzsi
    public cjtd i() {
        return cjtd.a(dtxy.eB);
    }

    @Override // defpackage.ayms
    @dzsi
    public String j() {
        String v;
        String str = u().N().d;
        btlu j = this.c.j();
        if (!str.equals(j == null ? "" : j.j())) {
            String O = u().O();
            if (dbsj.d(O)) {
                return this.a.getString(R.string.LIST_AUTHOR_LINK_A11Y_DESCRIPTION_WITHOUT_AUTHOR_NAME, new Object[]{a()});
            }
            return this.a.getString(R.string.LIST_AUTHOR_LINK_A11Y_DESCRIPTION, new Object[]{O, a()});
        }
        btlu j2 = this.c.j();
        if (j2 == null || (v = j2.v()) == null) {
            return this.a.getString(R.string.LIST_AUTHOR_LINK_A11Y_DESCRIPTION_WITHOUT_AUTHOR_NAME, new Object[]{a()});
        }
        return this.a.getString(R.string.LIST_AUTHOR_LINK_A11Y_DESCRIPTION, new Object[]{v, a()});
    }

    @Override // defpackage.ayms
    public Boolean k() {
        return Boolean.valueOf((u().N().a & 4) != 0);
    }

    @Override // defpackage.ayms
    public Boolean l() {
        baad u = u();
        if (u.o().equals(baab.FAVORITES) || !u.j().contains(baaj.PLACE) || u.S() < 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ayms
    @dzsi
    public aymw m() {
        if (z(u())) {
            return null;
        }
        return this.v;
    }

    @Override // defpackage.ayms
    @dzsi
    public cqss n() {
        return baam.c(u().o());
    }

    @Override // defpackage.ayms
    public void o() {
        ayop r = r();
        ayoq ayoqVar = this.y;
        dbsk.s(ayoqVar);
        r.a(ayoqVar.i());
    }

    @Override // defpackage.ayms
    public Boolean p() {
        return this.j.c();
    }

    @Override // defpackage.ayms
    @dzsi
    public aydl q() {
        baad c = this.i.c();
        if (c == null || !c.C()) {
            return this.j;
        }
        this.j.i(false);
        this.j.h(c.N());
        this.s.a(c.n(), new dbsz(this) { // from class: ayos
            private final aypo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                aypo aypoVar = this.a;
                aypoVar.j.j((List) obj);
                cqkx.p(aypoVar);
            }
        }, new dbty(this) { // from class: ayox
            private final aypo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(cqkx.l(this.a).iterator().hasNext());
            }
        });
        return this.j;
    }

    final ayop r() {
        return new ayop(this) { // from class: aypc
            private final aypo a;

            {
                this.a = this;
            }

            @Override // defpackage.ayop
            public final void a(ayon ayonVar) {
                aypo aypoVar = this.a;
                if (!aypoVar.u().B()) {
                    return;
                }
                if (btlu.i(aypoVar.c.j()) == btlt.GOOGLE) {
                    aypoVar.v(ayonVar, false);
                } else {
                    aypoVar.d.k(new aypg(aypoVar, ayonVar), null);
                }
            }
        };
    }

    final ayop s() {
        return new ayop(this) { // from class: aype
            private final aypo a;

            {
                this.a = this;
            }

            @Override // defpackage.ayop
            public final void a(ayon ayonVar) {
                aypo aypoVar = this.a;
                btlt i = btlu.i(aypoVar.c.j());
                if (i == btlt.GOOGLE) {
                    ayonVar.a(ayoo.LOADING);
                    aypoVar.x(ayonVar);
                } else if (i == btlt.INCOGNITO) {
                    afdt afdtVar = afdt.a;
                    aypoVar.h.a().r();
                } else {
                    aypoVar.d.k(new aypl(aypoVar, ayonVar), null);
                }
            }
        };
    }

    public final baad u() {
        baad c = this.i.c();
        dbsk.s(c);
        return c;
    }

    public final void v(ayon ayonVar, boolean z) {
        bwqv bwqvVar = this.r;
        bwrs<baad> bwrsVar = this.i;
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "arg_local_list", bwrsVar);
        ayfo ayfoVar = new ayfo();
        ayfoVar.B(bundle);
        ayfoVar.d = new aypi(this, ayfoVar, ayonVar, z);
        this.n = ayfoVar;
        ayfoVar.aJ(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(ayon ayonVar) {
        ayonVar.a(ayoo.LOADING);
        baad u = u();
        deha.q(this.p.o(u), new aypj(this, ayonVar, u), this.e.h());
    }

    public final void x(ayon ayonVar) {
        deha.q(this.p.n(u()), new aypn(this, ayonVar, u()), this.e.h());
    }
}
