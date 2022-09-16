package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nlj  reason: default package */
/* loaded from: classes3.dex */
public final class nlj extends nkh implements nma, nmb, feg, nrb, ynl {
    private nlx A;
    private nlz B;
    private boolean C;
    private View D;
    private boolean E;
    private boolean F;
    private final boolean G;
    private final boolean H;
    private npn I;

    /* renamed from: J  reason: collision with root package name */
    private ne f232J;
    public LoadingFrameLayout d;
    public nlw e;
    public final non f;
    public final nrd g;
    private final Context h;
    private final aari i;
    private final azqb j;
    private final azqb k;
    private final nkl l;
    private final nkn m;
    private final nkp n;
    private final nnm o;
    private final nlv p;
    private final npg q;
    private final yni r;
    private final aafo s;
    private final Set t;
    private final nnk u;
    private final aypf v;
    private final noi w;
    private final eml x;
    private final int y;
    private final feh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlj(Context context, acti actiVar, nnm nnmVar, azqb azqbVar, azqb azqbVar2, nkl nklVar, nkn nknVar, nkp nkpVar, nlv nlvVar, npg npgVar, yni yniVar, aafo aafoVar, nnk nnkVar, aacz aaczVar, aadd aaddVar, non nonVar, eml emlVar, feh fehVar, noj nojVar, nre nreVar, aari aariVar) {
        super(actiVar, aaddVar);
        noi a = nojVar.a(actiVar);
        this.h = context;
        this.o = nnmVar;
        this.j = azqbVar;
        this.k = azqbVar2;
        this.l = nklVar;
        this.m = nknVar;
        this.n = nkpVar;
        this.p = nlvVar;
        this.i = aariVar;
        this.q = npgVar;
        this.r = yniVar;
        this.s = aafoVar;
        this.u = nnkVar;
        this.f = nonVar;
        afy afyVar = new afy();
        this.t = afyVar;
        this.v = new aypf();
        this.z = fehVar;
        apzt apztVar = aaczVar.b().z;
        this.G = (apztVar == null ? apzt.a : apztVar).h;
        asxj asxjVar = aaczVar.b().e;
        this.H = (asxjVar == null ? asxj.a : asxjVar).cP;
        this.y = context.getResources().getDimensionPixelSize(R.dimen.engagement_panel_scroll_cancel_padding);
        this.E = true;
        this.w = a;
        this.x = emlVar;
        Context context2 = (Context) nreVar.a.get();
        context2.getClass();
        acti actiVar2 = (acti) nreVar.b.get();
        actiVar2.getClass();
        azqb azqbVar3 = nreVar.c;
        gew gewVar = (gew) nreVar.d.get();
        gewVar.getClass();
        tdu tduVar = (tdu) nreVar.f.get();
        tduVar.getClass();
        nrd nrdVar = new nrd(context2, actiVar2, azqbVar3, gewVar, (fhh) nreVar.e.get(), tduVar, aariVar);
        this.g = nrdVar;
        afyVar.add(nrdVar);
    }

    private final void E() {
        LoadingFrameLayout loadingFrameLayout = this.d;
        if (loadingFrameLayout == null) {
            return;
        }
        loadingFrameLayout.removeAllViews();
        this.d.addView(this.g.g());
        LoadingFrameLayout loadingFrameLayout2 = this.d;
        final nrd nrdVar = this.g;
        loadingFrameLayout2.f(new akgj() { // from class: nlg
            @Override // defpackage.akgj
            public final void qX() {
                ajzq ajzqVar = nrd.this.e;
                if (ajzqVar != null) {
                    ajzqVar.lk();
                }
            }
        });
        this.f.c(this.d, a());
        a().U = this.f232J;
        nlw nlwVar = this.e;
        if (nlwVar == null) {
            return;
        }
        this.d.addView(nlwVar.a());
    }

    @Override // defpackage.nmc
    public final void A(apzg apzgVar) {
        auqb auqbVar;
        aqvq aqvqVar = this.b;
        aqvqVar.getClass();
        this.w.e(apzgVar);
        this.F = true;
        this.s.b(aqvqVar.o);
        for (nnc nncVar : this.t) {
            nncVar.h();
            nncVar.e();
        }
        this.v.c();
        String d = ntr.d(aqvqVar);
        if (d != null) {
            this.f.d(aqvqVar);
            this.v.d(this.u.a(aqvqVar).i(aynq.LATEST).h(ntr.b(this.f.a())).u(new nli(d)).Z(new ayqb() { // from class: nlh
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    nlj nljVar = nlj.this;
                    int i = ((npv) obj).b;
                    RecyclerView a = nljVar.a();
                    xw xwVar = a.n;
                    if (!(xwVar instanceof LinearScrollToItemLayoutManager)) {
                        return;
                    }
                    nljVar.f.e();
                    ((LinearScrollToItemLayoutManager) xwVar).bA(a, i);
                }
            }));
            if (aqvqVar.t) {
                this.q.a(d);
            }
        }
        if (this.G) {
            this.x.b();
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
            int i = auqbVar.b;
            if ((i & 1) == 0) {
                return;
            }
            nrd nrdVar = this.g;
            String str = auqbVar.c;
            int i2 = (i & 4) != 0 ? auqbVar.d : 0;
            ajzq ajzqVar = nrdVar.e;
            if (ajzqVar == null) {
                return;
            }
            ajzqVar.ln(str, i2, null);
        }
    }

    @Override // defpackage.nmb
    public final void B() {
        this.g.ll();
    }

    @Override // defpackage.nmc
    public final void C(nlz nlzVar) {
        this.B = nlzVar;
    }

    @Override // defpackage.nrb
    public final void D(aqti aqtiVar) {
        if (this.e != null) {
            return;
        }
        nlu a = this.p.a(this.a, this.c, new nlt() { // from class: nlf
            @Override // defpackage.nlt
            public final void a() {
                nlj nljVar = nlj.this;
                View g = nljVar.g.g();
                int paddingLeft = g.getPaddingLeft();
                int paddingTop = g.getPaddingTop();
                int paddingRight = g.getPaddingRight();
                nlw nlwVar = nljVar.e;
                g.setPadding(paddingLeft, paddingTop, paddingRight, nlwVar != null ? nlwVar.a().getHeight() : 0);
            }
        }, aqtiVar);
        this.e = a;
        g(a);
        if (!this.H || this.d == null) {
            return;
        }
        E();
        a.h();
    }

    @Override // defpackage.nkh
    public final RecyclerView a() {
        RecyclerView recyclerView = (RecyclerView) ampq.i(this.g.i).f();
        recyclerView.getClass();
        return recyclerView;
    }

    @Override // defpackage.nmc
    public final nlx b() {
        return this.A;
    }

    @Override // defpackage.nkh
    public final LoadingFrameLayout d() {
        LoadingFrameLayout loadingFrameLayout = this.d;
        loadingFrameLayout.getClass();
        return loadingFrameLayout;
    }

    @Override // defpackage.nma
    public final void e(ajfz ajfzVar) {
        ajzq ajzqVar = this.g.e;
        if (ajzqVar != null) {
            ajzqVar.lr(ajfzVar);
        }
    }

    @Override // defpackage.nkh
    public final void g(nnc nncVar) {
        this.t.add(nncVar);
    }

    @Override // defpackage.nkh
    public final void h(npn npnVar) {
        this.I = npnVar;
    }

    @Override // defpackage.nkh
    public final void i(ne neVar) {
        if (this.f232J == null) {
            a().U = neVar;
            this.f232J = neVar;
        }
    }

    @Override // defpackage.feg
    public final void kF() {
        npn npnVar = this.I;
        if (npnVar != null) {
            npnVar.i();
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ajwz ajwzVar = (ajwz) obj;
                LoadingFrameLayout loadingFrameLayout = this.d;
                if (loadingFrameLayout.e != 1) {
                    return null;
                }
                loadingFrameLayout.a();
                return null;
            } else if (i == 1) {
                ajxd ajxdVar = (ajxd) obj;
                LoadingFrameLayout loadingFrameLayout2 = this.d;
                if (loadingFrameLayout2.e != 1) {
                    return null;
                }
                loadingFrameLayout2.b(ajxdVar.c(), ajxdVar.d());
                return null;
            } else if (i == 2) {
                if (!((ajxe) obj).c()) {
                    return null;
                }
                SwipeRefreshLayout swipeRefreshLayout = this.g.h;
                if (swipeRefreshLayout != null && swipeRefreshLayout.b) {
                    return null;
                }
                this.d.c();
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

    @Override // defpackage.nmc
    public final void n() {
        nlz nlzVar = this.B;
        if (nlzVar != null) {
            nlzVar.a();
        }
        for (nnc nncVar : this.t) {
            nncVar.pc();
        }
        ne neVar = this.f232J;
        if (neVar != null) {
            a().aG(neVar);
            this.D = null;
        }
        aqvq aqvqVar = this.b;
        if (aqvqVar != null && (aqvqVar.c & 16384) != 0) {
            aafo aafoVar = this.s;
            apzg apzgVar = aqvqVar.q;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        }
        this.f.f();
        if (this.G) {
            this.x.a();
        }
    }

    @Override // defpackage.feg
    public final void nr() {
        npn npnVar = this.I;
        if (npnVar != null) {
            npnVar.l();
        }
    }

    @Override // defpackage.nmc
    public final void o(apzg apzgVar) {
        nrd nrdVar = this.g;
        nrdVar.g = this;
        nrdVar.f = this.o.a(this.i, this.a, this);
        this.g.g();
        if (this.d == null) {
            this.d = new LoadingFrameLayout(this.h);
            E();
        }
        ajzq ajzqVar = this.g.e;
        ampq j = ajzqVar == null ? amon.a : ampq.j(ajzqVar.F);
        if (j.h()) {
            this.r.i(this, j.c());
        }
        this.A.g(this);
        this.z.a(this);
        this.w.b();
    }

    @Override // defpackage.nmc
    public final View oX() {
        return this.d;
    }

    @Override // defpackage.nmc
    public final void oY(ajrt ajrtVar) {
        nrd nrdVar = this.g;
        ajzq ajzqVar = nrdVar.e;
        if (ajzqVar != null) {
            ajzqVar.u(ajrtVar);
        } else if (ajrtVar == null) {
        } else {
            nrdVar.a.add(ajrtVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.nkg, defpackage.nmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.aqvq r6, defpackage.asjj r7) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlj.p(aqvq, asjj):void");
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final void q(boolean z) {
        this.C = z;
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final boolean r() {
        fhg fhgVar = this.g.d;
        return (fhgVar == null || fhgVar.b == 3) ? false : true;
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
        xw xwVar = a().n;
        View view = this.D;
        if (view == null || (xwVar != null && xw.bm(view) != 0)) {
            this.D = xwVar.S(0);
        }
        View view2 = this.D;
        return view2 == null || view2.getTop() < (-this.y);
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final boolean w() {
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
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
            r3.p(r4, r6)
            goto L47
        L32:
            java.util.Set r0 = r3.t
            r0.clear()
            asjj r0 = r3.c
            r3.p(r4, r0)
            if (r6 == 0) goto L47
            nrd r4 = r3.g
            ajzq r4 = r4.e
            if (r4 == 0) goto L47
            r4.l()
        L47:
            if (r5 == 0) goto L83
            boolean r4 = r3.F
            if (r4 == 0) goto L7e
            noi r4 = r3.w
            r4.d()
            noi r4 = r3.w
            r4.f()
            aqvq r4 = r3.b
            r4.getClass()
            noi r6 = r3.w
            asjj r0 = r3.c
            r6.g(r4, r0)
            noi r4 = r3.w
            r4.e(r5)
            java.util.Set r4 = r3.t
            java.util.Iterator r4 = r4.iterator()
        L6e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L83
            java.lang.Object r5 = r4.next()
            nnc r5 = (defpackage.nnc) r5
            r5.e()
            goto L6e
        L7e:
            noi r4 = r3.w
            r4.f()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nlj.x(aqvq, apzg, boolean):void");
    }

    @Override // defpackage.nmc
    public final void y() {
        for (nnc nncVar : this.t) {
            nncVar.pd();
        }
        this.t.clear();
        this.z.b(this);
        this.r.m(this);
        aqvq aqvqVar = this.b;
        if (aqvqVar != null && (aqvqVar.c & 32768) != 0) {
            aafo aafoVar = this.s;
            apzg apzgVar = aqvqVar.r;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        }
        this.w.c();
    }

    @Override // defpackage.nmc
    public final void z() {
        String d;
        this.w.d();
        this.F = false;
        aqvq aqvqVar = this.b;
        if (aqvqVar != null) {
            this.s.b(aqvqVar.p);
        }
        for (nnc nncVar : this.t) {
            nncVar.d();
        }
        if (aqvqVar != null && (d = ntr.d(aqvqVar)) != null && this.q.c(d)) {
            this.q.b(d);
        }
        this.v.c();
    }
}
