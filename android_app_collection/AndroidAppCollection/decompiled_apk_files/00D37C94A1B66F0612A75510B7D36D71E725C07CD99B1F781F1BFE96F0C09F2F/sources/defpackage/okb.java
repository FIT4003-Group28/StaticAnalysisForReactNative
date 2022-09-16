package defpackage;

import android.app.assist.AssistContent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.apps.youtube.app.watchwhile.MdxMainController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: okb  reason: default package */
/* loaded from: classes3.dex */
public abstract class okb extends ems {
    public yni g;
    public axnm h;
    public axnm i;
    public Handler j;
    public axnm k;
    public axnm l;
    public axnm m;
    public axnm n;
    public axnm o;
    public axnm p;
    public axnm q;
    public axnm r;
    public axnm s;
    public axnm t;
    public azqb u;
    boolean v = false;
    private final List WC = new ArrayList();

    private final void d(admj admjVar, adij adijVar, adma admaVar) {
        ((admc) this.o.get()).a(new ivk(admjVar, (fpf) this.m.get(), adijVar, (fpg) this.n.get(), this.j, admaVar));
    }

    private final void e(admj admjVar, adij adijVar, azqb azqbVar, adma admaVar) {
        ((admc) this.o.get()).a(new ivq(admjVar, adijVar, this, azqbVar, admaVar, (akfo) this.p.get()));
    }

    protected ggr n() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ems, defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ogp ogpVar = (ogp) this.t.get();
        if (ogpVar.e.compareAndSet(false, true) && ogpVar.a()) {
            asxj asxjVar = ogpVar.f.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (asxjVar.cR) {
                MdxMainController mdxMainController = (MdxMainController) ogpVar.a.get();
                mdxMainController.a.get();
                mdxMainController.b.get();
                mdxMainController.c.get();
                mdxMainController.d.get();
                mdxMainController.e.get();
                mdxMainController.f.get();
                mdxMainController.g.get();
                mdxMainController.h.get();
                mdxMainController.i.get();
                mdxMainController.j.get();
                mdxMainController.k.get();
            }
            asxj asxjVar2 = ogpVar.f.b().e;
            if (asxjVar2 == null) {
                asxjVar2 = asxj.a;
            }
            final auzb b = auzb.b(asxjVar2.bw);
            if (b == null) {
                b = auzb.STARTUP_SIGNAL_UNKNOWN;
            }
            int ordinal = b.ordinal();
            aynr h = (ordinal == 1 || ordinal == 2 || ordinal == 3) ? ogpVar.c.g().I(new ayqf() { // from class: ogo
                @Override // defpackage.ayqf
                public final boolean a(Object obj) {
                    return ((auzb) obj) == auzb.this;
                }
            }).ag(1L).h() : null;
            if (h != null) {
                asxj asxjVar3 = ogpVar.f.b().e;
                if (asxjVar3 == null) {
                    asxjVar3 = asxj.a;
                }
                int i = asxjVar3.bx;
                if (i > 0) {
                    h = h.F(i, TimeUnit.MILLISECONDS);
                }
                ogpVar.d.d(h.C().B(aypa.a()).R(new ogn(ogpVar, 1)));
            } else {
                ogpVar.b.getLifecycle().c((apx) ogpVar.a.get());
            }
        }
        boolean a = ((ogp) this.t.get()).a();
        this.v = a;
        if (a) {
            return;
        }
        this.h.get();
        this.i.get();
        this.k.get();
        this.l.get();
        this.m.get();
        this.n.get();
        this.o.get();
        this.p.get();
        this.q.get();
        this.r.get();
        this.s.get();
        mC().a((fry) this.k.get());
        ((adft) this.i.get()).d(this, acuo.a(6827), acuo.a(3832));
        this.u = new azqb() { // from class: oka
            @Override // defpackage.azqb
            public final Object get() {
                return ((iwa) okb.this.k.get()).b();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public void onDestroy() {
        if (!this.v) {
            ((admc) this.o.get()).d();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, android.app.Activity
    public void onPause() {
        axnm axnmVar;
        if (!this.v && !ggs.i() && (axnmVar = this.o) != null) {
            ((admc) axnmVar.get()).a.c();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        ggr n = n();
        if (n == null) {
            return;
        }
        String str = n.a;
        if (str != null) {
            assistContent.setStructuredData(str);
        }
        assistContent.setWebUri(n.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ems, defpackage.dt, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ems, defpackage.oa, defpackage.dt, android.app.Activity
    public void onStart() {
        adij[] values;
        super.onStart();
        if (!this.v) {
            ((adgc) this.h.get()).N();
            ((adft) this.i.get()).g();
            ((iwb) this.l.get()).a();
            this.g.g(this.m.get());
            ((admc) this.o.get()).a.a();
            adma admaVar = new adma(this);
            for (adij adijVar : adij.values()) {
                azqb r = r(adijVar);
                if (r != null) {
                    e(admj.CAST_TOOLTIP, adijVar, r, admaVar);
                    e(admj.CAST_TOOLTIP_REPRESSED, adijVar, r, admaVar);
                    d(admj.CAST_CLING, adijVar, admaVar);
                    d(admj.CAST_CLING_REPRESSED, adijVar, admaVar);
                    this.WC.add(p(admj.CAST_SNACKBAR, adijVar, r, admaVar));
                    this.WC.add(p(admj.CAST_SNACKBAR_REPRESSED, adijVar, r, admaVar));
                }
            }
            for (Object obj : this.WC) {
                this.g.g(obj);
            }
            ((admc) this.o.get()).b();
            ((acxv) this.q.get()).a();
            ((adjj) this.r.get()).f();
            ((adnd) this.s.get()).c = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public void onStop() {
        if (!this.v) {
            ((adjj) this.r.get()).g();
            ((admc) this.o.get()).c();
            ((admc) this.o.get()).d();
            ((adgc) this.h.get()).O();
            this.g.m(this.m.get());
            ((adft) this.i.get()).h();
            ((iwb) this.l.get()).b();
            ((admc) this.o.get()).a.b();
            if (ggs.i()) {
                ((admc) this.o.get()).a.c();
            }
            for (Object obj : this.WC) {
                this.g.m(obj);
            }
            this.WC.clear();
            ((adnd) this.s.get()).a(this);
        }
        super.onStop();
    }

    protected abstract ivn p(admj admjVar, adij adijVar, azqb azqbVar, adma admaVar);

    protected azqb r(adij adijVar) {
        throw null;
    }
}
