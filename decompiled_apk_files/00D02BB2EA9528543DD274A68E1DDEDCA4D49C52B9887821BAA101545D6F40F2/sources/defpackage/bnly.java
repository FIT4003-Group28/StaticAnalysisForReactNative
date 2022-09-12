package defpackage;

import android.graphics.Rect;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.apps.maps.R;
import java.util.Collection;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bnly  reason: default package */
/* loaded from: classes3.dex */
public final class bnly implements bzml, akue, akzx {
    public final dxio<btvo> a;
    public final dxio<akox> b;
    public final dxio<bzmm> c;
    public final dxio<bvjj> d;
    public final dxio<cqat> e;
    public final gga f;
    public final dxio<akzh> g;
    public final dxio<btrm> h;
    public final dxio<cjqq> i;
    public final dxio<cjqy> j;
    @dzsi
    public akud m;
    @dzsi
    public cqkf<bnmf> n;
    private final dxio<Executor> s;
    private final dxio<cqkj> t;
    private final dxio<jdj> u;
    private final dxio<bnmh> v;
    private final dxio<gll> w;
    private final dxio<cpv> x;
    @dzsi
    private jdi y;
    public final dbty<OrientationEventListener> k = dbud.a(new bnlv(this));
    public final dbty<View.OnLayoutChangeListener> l = dbud.a(new bnlx(this));
    public boolean o = false;
    public boolean p = false;
    public long q = -1;
    public int r = 0;

    public bnly(dxio<btvo> dxioVar, dxio<akox> dxioVar2, dxio<bzmm> dxioVar3, dxio<Executor> dxioVar4, dxio<bvjj> dxioVar5, dxio<cqat> dxioVar6, dxio<cqkj> dxioVar7, dxio<jdj> dxioVar8, gga ggaVar, dxio<bnmh> dxioVar9, dxio<akzh> dxioVar10, dxio<btrm> dxioVar11, dxio<cjqq> dxioVar12, dxio<cjqy> dxioVar13, dxio<gll> dxioVar14, dxio<cpv> dxioVar15) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.s = dxioVar4;
        this.d = dxioVar5;
        this.e = dxioVar6;
        this.t = dxioVar7;
        this.u = dxioVar8;
        this.f = ggaVar;
        this.v = dxioVar9;
        this.g = dxioVar10;
        this.h = dxioVar11;
        this.i = dxioVar12;
        this.j = dxioVar13;
        this.w = dxioVar14;
        this.x = dxioVar15;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.PROMOTED_PLACES_USER_EDUCATION_TOOLTIP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LEGALLY_REQUIRED;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return (this.a.a().getAdsParameters().a & 134217728) != 0;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (!d()) {
            return bzmk.NONE;
        }
        if (!k()) {
            return bzmk.NONE;
        }
        if (this.m == null) {
            return bzmk.NONE;
        }
        if (this.x.a().d(this.f)) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        int[] n;
        jdo jdoVar;
        if (bzmkVar == bzmk.VISIBLE && !i() && this.b.a().aj().av() != 3) {
            dbsk.s(this.m);
            dbsg<akqp> d = this.m.d();
            if (!d.a()) {
                return false;
            }
            gga ggaVar = this.f;
            if (!ggaVar.aZ || ggaVar.getResources().getConfiguration().orientation == 2 || (n = akyx.n(this.g.a().b(), d.b().a())) == null) {
                return false;
            }
            Rect b = this.w.a().b();
            b.offset(25, -25);
            if (!b.contains(n[0], n[1])) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) this.f.findViewById(R.id.ads_tutorial_container);
            dbsk.s(viewGroup);
            viewGroup.removeAllViews();
            viewGroup.setVisibility(0);
            cqkf<bnmf> c = this.t.a().c(new bnme(), null);
            this.n = c;
            if (c == null) {
                return false;
            }
            akra a = d.b().a();
            dbsk.s(this.m);
            if (a.b > this.g.a().g().b) {
                jdoVar = jdo.TOP;
            } else {
                jdoVar = jdo.BOTTOM;
            }
            this.u.a();
            jdi a2 = jdj.a(this.f, jdoVar, new PopupWindow.OnDismissListener(this) { // from class: bnlt
                private final bnly a;

                {
                    this.a = this;
                }

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    bnly bnlyVar = this.a;
                    if (bnlyVar.i()) {
                        bnlyVar.m = null;
                        ViewGroup viewGroup2 = (ViewGroup) bnlyVar.f.findViewById(R.id.ads_tutorial_container);
                        dbsk.s(viewGroup2);
                        bnlyVar.j.a().n(bnlyVar.i.a().f(viewGroup2).d(cjtd.a(dtxy.oF)), new cjte(deaf.TAP), cjtd.a(dtxy.oF));
                        viewGroup2.removeAllViews();
                        viewGroup2.setVisibility(4);
                        cqkf<bnmf> cqkfVar = bnlyVar.n;
                        if (cqkfVar != null) {
                            cqkfVar.e(null);
                        }
                        bnlyVar.c.a().f(dqkc.PROMOTED_PLACES_USER_EDUCATION_TOOLTIP);
                        long b2 = bnlyVar.e.a().b();
                        dujy dujyVar = bnlyVar.a.a().getAdsParameters().n;
                        if (dujyVar == null) {
                            dujyVar = dujy.g;
                        }
                        if (b2 - bnlyVar.q > dujyVar.f) {
                            bnlyVar.d.a().W(bvjk.kr, bnlyVar.d.a().s(bvjk.kr, 0) + 1);
                        }
                        bnlyVar.q = -1L;
                        bnlyVar.r = 0;
                    }
                }
            });
            View c2 = c.c();
            bnmh a3 = this.v.a();
            btvo a4 = a3.a.a();
            bnmh.a(a4, 2);
            dxio a5 = ((dxjh) a3.b).a();
            bnmh.a(a5, 3);
            dxio a6 = ((dxjh) a3.c).a();
            bnmh.a(a6, 4);
            gga a7 = a3.d.a();
            bnmh.a(a7, 5);
            c.e(new bnmg(a2, a4, a5, a6, a7));
            a2.c(c2);
            jdp jdpVar = a2.b;
            jdpVar.measure(0, 0);
            a2.d = jdpVar.getMeasuredWidth();
            a2.e = jdpVar.getMeasuredHeight();
            a2.b.setCornerRadiusDp(16);
            int i = n[1];
            if (jdoVar == jdo.BOTTOM) {
                i -= jmj.a(this.f, 25);
            }
            a2.d(viewGroup, n[0], i);
            this.q = this.e.a().b();
            this.y = a2;
            this.r = this.f.getResources().getConfiguration().orientation;
            return true;
        }
        return false;
    }

    @Override // defpackage.akue
    public final void g(final akvm akvmVar) {
        this.s.a().execute(new Runnable(this, akvmVar) { // from class: bnlr
            private final bnly a;
            private final akvm b;

            {
                this.a = this;
                this.b = akvmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bnly bnlyVar = this.a;
                akvm akvmVar2 = this.b;
                if (bnlyVar.i()) {
                    return;
                }
                akud akudVar = null;
                bnlyVar.m = null;
                if (!bnlyVar.k() || !bnlyVar.o) {
                    return;
                }
                for (dpwx dpwxVar : ((anbg) akvmVar2).a.e.a) {
                    dpwz b = dpwz.b(dpwxVar.b);
                    if (b == null) {
                        b = dpwz.UNKNOWN_MAP_CONTENT_TYPE;
                    }
                    if (b == dpwz.MAP_CONTENT_BROWSE) {
                        Collection<akud> a = akvmVar2.a().a();
                        akra akraVar = bnlyVar.g.a().p().j;
                        float f = 2.14748365E9f;
                        for (akud akudVar2 : a) {
                            akuf c = akudVar2.c();
                            if (c == akuf.PLACED_FULLY || c == akuf.PLACED_PARTIALLY) {
                                if (akxf.w(akudVar2.a()) != null) {
                                    dnbc v = akxf.v(akudVar2.a());
                                    if (v != null && (v.a & 1) != 0) {
                                        dnpo dnpoVar = v.b;
                                        if (dnpoVar == null) {
                                            dnpoVar = dnpo.t;
                                        }
                                        if (!dnpoVar.j) {
                                        }
                                    }
                                    dbsg<akqp> d = akudVar2.d();
                                    if (d.a()) {
                                        float A = akraVar.A(d.b().a());
                                        if (A < f) {
                                            akudVar = akudVar2;
                                            f = A;
                                        }
                                    }
                                }
                            }
                        }
                        dbsg j = dbsg.j(akudVar);
                        if (!j.a()) {
                            return;
                        }
                        bnlyVar.m = (akud) j.b();
                        bnlyVar.c.a().a(bnlyVar);
                        return;
                    }
                }
                bnlyVar.j();
            }
        });
    }

    public final void h(boolean z) {
        bvrj.UI_THREAD.c();
        this.o = z;
    }

    public final boolean i() {
        return this.q > 0;
    }

    public final void j() {
        jdi jdiVar = this.y;
        if (jdiVar != null) {
            jdiVar.f();
            this.y = null;
        }
    }

    public final boolean k() {
        bvrj.UI_THREAD.c();
        if (m()) {
            return false;
        }
        long b = this.e.a().b();
        long c = this.c.a().c(dqkc.PROMOTED_PLACES_USER_EDUCATION_TOOLTIP);
        dujy dujyVar = this.a.a().getAdsParameters().n;
        if (dujyVar == null) {
            dujyVar = dujy.g;
        }
        return c == -1 || (b - c) / 1000 >= dujyVar.d;
    }

    @Override // defpackage.akzx
    public final void l(akzs akzsVar) {
        this.s.a().execute(new Runnable(this) { // from class: bnls
            private final bnly a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bnly bnlyVar = this.a;
                if (bnlyVar.i()) {
                    bnlyVar.j();
                } else {
                    bnlyVar.c.a().a(bnlyVar);
                }
            }
        });
    }

    public final boolean m() {
        bvrj.UI_THREAD.c();
        if (!this.d.a().m(bvjk.kq, false)) {
            long s = this.d.a().s(bvjk.kr, 0);
            dujy dujyVar = this.a.a().getAdsParameters().n;
            if (dujyVar == null) {
                dujyVar = dujy.g;
            }
            return s >= dujyVar.c;
        }
        return true;
    }
}
