package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: noe  reason: default package */
/* loaded from: classes3.dex */
public final class noe extends nkh implements akai, nma, nmb, feg, ynl {
    private final yni A;
    private final aafo B;
    private final Set C;
    private final nnk D;
    private final aypf E;
    private final noi F;
    private final eml G;
    private final int H;
    private final feh I;

    /* renamed from: J  reason: collision with root package name */
    private fhg f234J;
    private nlx K;
    private aakw L;
    private Set M;
    private nlz N;
    private boolean O;
    private View P;
    private boolean Q;
    private boolean R;
    private final boolean S;
    private final boolean T;
    private npn U;
    private ne V;
    public final nlv d;
    public LoadingFrameLayout e;
    public SwipeRefreshLayout f;
    public RecyclerView g;
    public ajzq h;
    public nlw i;
    public LinearScrollToItemLayoutManager j;
    public final non k;
    public final azpd l;
    private final Context m;
    private final aari n;
    private final azqb o;
    private final azqb p;
    private final azqb q;
    private final nkl r;
    private final nkn s;
    private final nkp u;
    private final nnm v;
    private final fhh w;
    private final gew x;
    private final tdu y;
    private final npg z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noe(Context context, acti actiVar, nnm nnmVar, azqb azqbVar, fhh fhhVar, azqb azqbVar2, azqb azqbVar3, nkl nklVar, nkn nknVar, nkp nkpVar, gew gewVar, nlv nlvVar, tdu tduVar, npg npgVar, yni yniVar, aafo aafoVar, nnk nnkVar, aacz aaczVar, aadd aaddVar, non nonVar, eml emlVar, feh fehVar, noj nojVar, aari aariVar) {
        super(actiVar, aaddVar);
        noi a = nojVar.a(actiVar);
        this.m = context;
        this.v = nnmVar;
        this.o = azqbVar;
        this.w = fhhVar;
        this.p = azqbVar2;
        this.q = azqbVar3;
        this.r = nklVar;
        this.s = nknVar;
        this.u = nkpVar;
        this.x = gewVar;
        this.d = nlvVar;
        this.n = aariVar;
        this.y = tduVar;
        this.z = npgVar;
        this.A = yniVar;
        this.B = aafoVar;
        this.D = nnkVar;
        this.k = nonVar;
        this.C = new afy();
        this.E = new aypf();
        this.I = fehVar;
        apzt apztVar = aaczVar.b().z;
        this.S = (apztVar == null ? apzt.a : apztVar).h;
        asxj asxjVar = aaczVar.b().e;
        this.T = (asxjVar == null ? asxj.a : asxjVar).cP;
        this.H = context.getResources().getDimensionPixelSize(R.dimen.engagement_panel_scroll_cancel_padding);
        this.Q = true;
        this.F = a;
        this.G = emlVar;
        this.l = azpd.ar();
    }

    @Override // defpackage.nmc
    public final void A(apzg apzgVar) {
        final auqb auqbVar;
        aqvq aqvqVar = this.b;
        aqvqVar.getClass();
        this.F.e(apzgVar);
        this.R = true;
        this.B.b(aqvqVar.o);
        for (nnc nncVar : this.C) {
            nncVar.h();
            nncVar.e();
        }
        this.E.c();
        String d = ntr.d(aqvqVar);
        if (d != null) {
            this.k.d(aqvqVar);
            this.E.d(this.D.a(aqvqVar).i(aynq.LATEST).h(ntr.b(this.k.a())).u(new nli(d, 2)).Z(new ayqb() { // from class: nob
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    noe noeVar = noe.this;
                    int i = ((npv) obj).b;
                    LinearScrollToItemLayoutManager linearScrollToItemLayoutManager = noeVar.j;
                    if (linearScrollToItemLayoutManager == null) {
                        return;
                    }
                    noeVar.k.e();
                    linearScrollToItemLayoutManager.bA(noeVar.g, i);
                }
            }));
            if (aqvqVar.t) {
                this.z.a(d);
            }
        }
        if (this.S) {
            this.G.b();
        }
        if (apzgVar.qn(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
            auvd auvdVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
            if (auvdVar == null) {
                auvdVar = auvd.a;
            }
            if (auvdVar.b != 3) {
                return;
            }
            auvd auvdVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
            if (auvdVar2 == null) {
                auvdVar2 = auvd.a;
            }
            if (auvdVar2.b == 3) {
                auqbVar = (auqb) auvdVar2.c;
            } else {
                auqbVar = auqb.a;
            }
            if ((auqbVar.b & 1) == 0) {
                return;
            }
            this.g.requestLayout();
            ayvt ayvtVar = new ayvt(this.l.u(noc.b), false);
            azqc.n();
            ayvtVar.h(noc.a).e().R(new aypv() { // from class: noa
                @Override // defpackage.aypv
                public final void a() {
                    noe noeVar = noe.this;
                    auqb auqbVar2 = auqbVar;
                    noeVar.h.ln(auqbVar2.c, (auqbVar2.b & 4) != 0 ? auqbVar2.d : 0, null);
                }
            });
        }
    }

    @Override // defpackage.nmb
    public final void B() {
        ajzq ajzqVar = this.h;
        if (ajzqVar == null) {
            return;
        }
        ajzqVar.ll();
    }

    @Override // defpackage.nmc
    public final void C(nlz nlzVar) {
        this.N = nlzVar;
    }

    @Override // defpackage.nkh
    public final RecyclerView a() {
        RecyclerView recyclerView = this.g;
        recyclerView.getClass();
        return recyclerView;
    }

    @Override // defpackage.nmc
    public final nlx b() {
        return this.K;
    }

    @Override // defpackage.nkh
    public final LoadingFrameLayout d() {
        LoadingFrameLayout loadingFrameLayout = this.e;
        loadingFrameLayout.getClass();
        return loadingFrameLayout;
    }

    @Override // defpackage.nma
    public final void e(ajfz ajfzVar) {
        ajzq ajzqVar = this.h;
        if (ajzqVar != null) {
            ajzqVar.lr(ajfzVar);
        }
    }

    @Override // defpackage.nkh
    public final void g(nnc nncVar) {
        this.C.add(nncVar);
    }

    @Override // defpackage.nkh
    public final void h(npn npnVar) {
        this.U = npnVar;
    }

    @Override // defpackage.nkh
    public final void i(ne neVar) {
        if (this.V == null) {
            this.g.aE(neVar);
            this.V = neVar;
        }
    }

    @Override // defpackage.feg
    public final void kF() {
        npn npnVar = this.U;
        if (npnVar != null) {
            npnVar.i();
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ajwz ajwzVar = (ajwz) obj;
                LoadingFrameLayout loadingFrameLayout = this.e;
                if (loadingFrameLayout.e != 1) {
                    return null;
                }
                loadingFrameLayout.a();
                return null;
            } else if (i == 1) {
                ajxd ajxdVar = (ajxd) obj;
                LoadingFrameLayout loadingFrameLayout2 = this.e;
                if (loadingFrameLayout2.e != 1) {
                    return null;
                }
                loadingFrameLayout2.b(ajxdVar.c(), ajxdVar.d());
                return null;
            } else if (i == 2) {
                if (!((ajxe) obj).c() || this.f.b) {
                    return null;
                }
                this.e.c();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ajwz.class, ajxd.class, ajxe.class};
    }

    @Override // defpackage.akai
    public final void ll() {
        this.h.ll();
    }

    @Override // defpackage.akai
    public final boolean lm() {
        return false;
    }

    @Override // defpackage.nmc
    public final void n() {
        nlz nlzVar = this.N;
        if (nlzVar != null) {
            nlzVar.a();
        }
        for (nnc nncVar : this.C) {
            nncVar.pc();
        }
        ne neVar = this.V;
        if (neVar != null) {
            this.g.aG(neVar);
            this.V = null;
            this.P = null;
        }
        aqvq aqvqVar = this.b;
        if (aqvqVar != null && (aqvqVar.c & 16384) != 0) {
            aafo aafoVar = this.B;
            apzg apzgVar = aqvqVar.q;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        }
        this.k.f();
        if (this.S) {
            this.G.a();
        }
    }

    @Override // defpackage.feg
    public final void nr() {
        npn npnVar = this.U;
        if (npnVar != null) {
            npnVar.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ajsa] */
    @Override // defpackage.nmc
    public final void o(apzg apzgVar) {
        if (this.f == null) {
            RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(this.m).inflate(R.layout.section_list, (ViewGroup) null, false);
            this.g = recyclerView;
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nnx
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    noe noeVar = noe.this;
                    int abs = Math.abs(i3 - i);
                    int abs2 = Math.abs(i4 - i2);
                    azpd azpdVar = noeVar.l;
                    boolean z = false;
                    if (view.getVisibility() == 0 && abs > 0 && abs2 > 0) {
                        z = true;
                    }
                    azpdVar.c(Boolean.valueOf(z));
                }
            });
            LinearScrollToItemLayoutManager q = LinearScrollToItemLayoutManager.q(this.m);
            this.j = q;
            this.g.ag(q);
            zn znVar = (zn) this.g.E;
            if (znVar != null) {
                znVar.x();
            }
            SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(this.m);
            this.f = swipeRefreshLayout;
            swipeRefreshLayout.j(zhn.j(this.m, R.attr.ytTextPrimary).orElse(-16777216));
            this.f.k(zhn.j(this.m, R.attr.ytTextPrimaryInverse).orElse(-1));
            this.f.setBackgroundColor(zhn.j(this.m, R.attr.ytBrandBackgroundSolid).orElse(-16777216));
            this.f.addView(this.g);
            LoadingFrameLayout loadingFrameLayout = new LoadingFrameLayout(this.m);
            this.e = loadingFrameLayout;
            loadingFrameLayout.addView(this.f);
            nlw nlwVar = this.i;
            if (nlwVar != null) {
                this.e.addView(nlwVar.a());
            }
            this.e.f(new akgj() { // from class: nnz
                @Override // defpackage.akgj
                public final void qX() {
                    noe.this.h.lk();
                }
            });
            this.f234J = this.w.a(this.f);
            gew gewVar = this.x;
            RecyclerView recyclerView2 = this.g;
            aari aariVar = this.n;
            gev b = gewVar.b(recyclerView2, aariVar, this.v.a(aariVar, this.a, this), this.a, ((ajyi) this.o.get()).get(), this, this.f234J, ajkb.ENGAGEMENT, this.y, this.m, noi.a());
            this.h = b;
            this.f234J.d(b);
            Set<ajrt> set = this.M;
            if (set != null) {
                set.clear();
                for (ajrt ajrtVar : set) {
                    this.h.u(ajrtVar);
                }
            }
            this.k.c(this.e, this.g);
            this.h.x(new nod(this));
        }
        this.A.i(this, this.h.F);
        this.h.K(this.L);
        this.h.N(this.Q);
        this.K.g(this);
        this.I.a(this);
        this.F.b();
    }

    @Override // defpackage.nmc
    public final View oX() {
        return this.e;
    }

    @Override // defpackage.nmc
    public final void oY(ajrt ajrtVar) {
        if (ajrtVar == null) {
            return;
        }
        ajzq ajzqVar = this.h;
        if (ajzqVar != null) {
            ajzqVar.u(ajrtVar);
            return;
        }
        if (this.M == null) {
            this.M = new HashSet();
        }
        this.M.add(ajrtVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.nkg, defpackage.nmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.aqvq r5, defpackage.asjj r6) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noe.p(aqvq, asjj):void");
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final void q(boolean z) {
        this.O = z;
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final boolean r() {
        return this.f234J.b != 3;
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final boolean u(aqvq aqvqVar, apzg apzgVar) {
        x(aqvqVar, apzgVar, true);
        return true;
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final boolean v() {
        aqvq aqvqVar = this.b;
        if (aqvqVar == null) {
            return true;
        }
        int B = amnt.B(aqvqVar.n);
        if (B == 0) {
            B = 1;
        }
        int i = B - 1;
        if (i != 2) {
            return i != 3;
        }
        xw xwVar = this.g.n;
        View view = this.P;
        if (view == null || (xwVar != null && xw.bm(view) != 0)) {
            this.P = xwVar.S(0);
        }
        View view2 = this.P;
        return view2 == null || view2.getTop() < (-this.H);
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final boolean w() {
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.nkg, defpackage.nmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.aqvq r4, defpackage.apzg r5, boolean r6) {
        /*
            r3 = this;
            r4.getClass()
            aqvq r0 = r3.b
            if (r0 == 0) goto L32
            aqvp r1 = r4.f
            if (r1 != 0) goto Ld
            aqvp r1 = defpackage.aqvp.a
        Ld:
            aqvp r2 = r0.f
            if (r2 != 0) goto L13
            aqvp r2 = defpackage.aqvp.a
        L13:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L32
            aqvo r1 = r4.g
            if (r1 != 0) goto L1f
            aqvo r1 = defpackage.aqvo.a
        L1f:
            aqvo r0 = r0.g
            if (r0 != 0) goto L25
            aqvo r0 = defpackage.aqvo.a
        L25:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2c
            goto L32
        L2c:
            asjj r6 = r3.c
            super.p(r4, r6)
            goto L4a
        L32:
            java.util.Set r0 = r3.C
            r0.clear()
            asjj r0 = r3.c
            r3.p(r4, r0)
            if (r6 == 0) goto L43
            ajzq r4 = r3.h
            r4.l()
        L43:
            ajzq r4 = r3.h
            aakw r6 = r3.L
            r4.K(r6)
        L4a:
            if (r5 == 0) goto L86
            boolean r4 = r3.R
            if (r4 == 0) goto L81
            noi r4 = r3.F
            r4.d()
            noi r4 = r3.F
            r4.f()
            aqvq r4 = r3.b
            r4.getClass()
            noi r6 = r3.F
            asjj r0 = r3.c
            r6.g(r4, r0)
            noi r4 = r3.F
            r4.e(r5)
            java.util.Set r4 = r3.C
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L86
            java.lang.Object r5 = r4.next()
            nnc r5 = (defpackage.nnc) r5
            r5.e()
            goto L71
        L81:
            noi r4 = r3.F
            r4.f()
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noe.x(aqvq, apzg, boolean):void");
    }

    @Override // defpackage.nmc
    public final void y() {
        for (nnc nncVar : this.C) {
            nncVar.pd();
        }
        this.C.clear();
        ajzq ajzqVar = this.h;
        if (ajzqVar != null) {
            ajzqVar.j();
        }
        fhg fhgVar = this.f234J;
        if (fhgVar != null) {
            fhgVar.b();
        }
        this.I.b(this);
        this.A.m(this);
        aqvq aqvqVar = this.b;
        if (aqvqVar != null && (aqvqVar.c & 32768) != 0) {
            aafo aafoVar = this.B;
            apzg apzgVar = aqvqVar.r;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        }
        this.F.c();
    }

    @Override // defpackage.nmc
    public final void z() {
        String d;
        this.F.d();
        this.R = false;
        this.f.l(false);
        this.f.clearAnimation();
        aqvq aqvqVar = this.b;
        if (aqvqVar != null) {
            this.B.b(aqvqVar.p);
        }
        for (nnc nncVar : this.C) {
            nncVar.d();
        }
        if (aqvqVar != null && (d = ntr.d(aqvqVar)) != null && this.z.c(d)) {
            this.z.b(d);
        }
        this.E.c();
    }
}
