package com.google.android.apps.youtube.app.ui.inline;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.app.common.ui.inline.LoopController;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlinePlaybackController extends ne implements View.OnClickListener, fze, fzf, ezg, airt, f, ynl {
    private ggw A;
    public final ezh a;
    public final mdh b;
    public final mcj c;
    public final mdg d;
    public fyq e;
    public mda f;
    azqb g;
    public fyz h;
    private final ScrollSelectionController i;
    private final fyx j;
    private final fer k;
    private final ofu l;
    private final jwl m;
    private final aadd n;
    private final ivr o;
    private final InlinePlaybackLifecycleController p;
    private final mcn q;
    private final euc r;
    private final LoopController s;
    private final mch t;
    private final azqb u;
    private final acth v;
    private final Set w;
    private boolean x;
    private boolean y = true;
    private final aacz z;

    public InlinePlaybackController(ScrollSelectionController scrollSelectionController, fyy fyyVar, fyx fyxVar, fer ferVar, ofu ofuVar, ezh ezhVar, mcl mclVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mcj mcjVar, mdk mdkVar, mcn mcnVar, DefaultInlinePlayerControls defaultInlinePlayerControls, jwl jwlVar, mbw mbwVar, aadd aaddVar, ivr ivrVar, mcf mcfVar, euc eucVar, azqb azqbVar, LoopController loopController, mch mchVar, azqb azqbVar2, acth acthVar, aacz aaczVar) {
        this.i = scrollSelectionController;
        this.m = jwlVar;
        this.j = fyxVar;
        this.k = ferVar;
        this.l = ofuVar;
        this.a = ezhVar;
        this.p = inlinePlaybackLifecycleController;
        this.c = mcjVar;
        this.q = mcnVar;
        this.b = defaultInlinePlayerControls;
        this.n = aaddVar;
        this.o = ivrVar;
        this.r = eucVar;
        this.z = aaczVar;
        mdg mdgVar = new mdg(this);
        this.d = mdgVar;
        this.A = new ggw(mdgVar);
        this.g = azqbVar;
        this.s = loopController;
        this.t = mchVar;
        this.u = azqbVar2;
        this.v = acthVar;
        HashSet hashSet = new HashSet();
        this.w = hashSet;
        hashSet.add(mcfVar);
        inlinePlaybackLifecycleController.l(this);
        inlinePlaybackLifecycleController.l(mclVar);
        inlinePlaybackLifecycleController.l(mcjVar);
        inlinePlaybackLifecycleController.m(this);
        inlinePlaybackLifecycleController.m(defaultInlinePlayerControls);
        inlinePlaybackLifecycleController.m(mdkVar);
        inlinePlaybackLifecycleController.m(mcnVar);
        inlinePlaybackLifecycleController.m(mbwVar);
        inlinePlaybackLifecycleController.m(mcfVar);
        inlinePlaybackLifecycleController.m(mclVar);
        ezhVar.i(this);
        ezhVar.i(mdkVar);
        fyyVar.e.add(mcnVar);
    }

    private final boolean A() {
        return this.a.g().d() && this.f != null;
    }

    private final boolean B(final int i, boolean z, fyz fyzVar) {
        x();
        if ((i == 0 || i == 1) && !z && this.x) {
            this.h = fyzVar;
            this.A.c(new Runnable() { // from class: mde
                @Override // java.lang.Runnable
                public final void run() {
                    InlinePlaybackController inlinePlaybackController = InlinePlaybackController.this;
                    int i2 = i;
                    mda mdaVar = inlinePlaybackController.f;
                    if (mdaVar != null) {
                        mdaVar.b(i2, false);
                        fyz fyzVar2 = inlinePlaybackController.h;
                        if (fyzVar2 == null) {
                            return;
                        }
                        fyzVar2.a();
                        inlinePlaybackController.h = null;
                    }
                }
            }, 1000L);
            return false;
        }
        this.f.b(i, z);
        return true;
    }

    private final void x() {
        this.A.a();
        fyz fyzVar = this.h;
        if (fyzVar != null) {
            fyzVar.a();
            this.h = null;
        }
    }

    private final void y() {
        ajbf l = this.b.l();
        if (l == null || this.f == null || l.b() - this.f.a().c() <= eog.k(this.n)) {
            return;
        }
        this.m.i();
    }

    private final boolean z() {
        mda mdaVar = this.f;
        if (mdaVar != null) {
            arjm arjmVar = mdaVar.a.a().a;
            return arjmVar == arjm.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED || arjmVar == arjm.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION || arjmVar == arjm.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION;
        }
        return false;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new mdc(this), kjt.p), airwVar.s().d.aa(new mdc(this, 1), kjt.p)};
    }

    @Override // defpackage.fzf
    public final void h(fyp fypVar) {
        p();
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        boolean z = i == 2;
        this.x = z;
        if (!z) {
            this.A.b();
        }
    }

    @Override // defpackage.fzf
    public final boolean k(fyp fypVar, int i, fyz fyzVar) {
        boolean z = true;
        if (i == 0) {
            this.d.post(new Runnable() { // from class: mdd
                @Override // java.lang.Runnable
                public final void run() {
                    InlinePlaybackController.this.p();
                }
            });
        } else if (i == 3 && this.e != null && A()) {
            int g = this.p.g(fypVar.b);
            boolean f = this.j.f();
            this.e.h();
            boolean z2 = g == 1 || (f && !(eog.ay(this.z) && fypVar.b.a().d == arjy.INLINE_PLAYBACK_TRIGGER_STYLE_USER));
            if (this.a.g().d() && z2) {
                int i2 = g != 1 ? 0 : 2;
                if (this.p.g(fypVar.b) != 2) {
                    z = false;
                }
                return B(i2, z, fyzVar);
            }
        }
        return true;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                q((ahhf) obj);
                return null;
            } else if (i == 1) {
                r((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhf.class, ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.w.clear();
    }

    @Override // defpackage.fze
    public final void lh(fyp fypVar, int i) {
        boolean z;
        if (((fdu) this.g.get()).b == fdq.WATCH_WHILE) {
            if (i == 0) {
                euc eucVar = this.r;
                if (eog.G(eucVar.b)) {
                    eucVar.a.d(new etx());
                }
            } else if (i == 1) {
                euc eucVar2 = this.r;
                if (eog.G(eucVar2.b)) {
                    eucVar2.a.d(new eub());
                }
            } else if (i == 2) {
                euc eucVar3 = this.r;
                if (eog.G(eucVar3.b)) {
                    eucVar3.a.d(new eua());
                }
            } else if (i == 3) {
                euc eucVar4 = this.r;
                if (eog.G(eucVar4.b)) {
                    eucVar4.a.d(new etz());
                }
            }
            if (i != 1) {
                return;
            }
            ggt ggtVar = fypVar.b;
            this.f = new mda(this.k, this.b, ggtVar);
            if (z()) {
                mda mdaVar = this.f;
                boolean z2 = this.y;
                mdaVar.d = z2;
                this.t.b(z2);
                z = this.y;
            } else {
                this.t.b(true);
                z = true;
            }
            for (mdf mdfVar : this.w) {
                mdfVar.a(z);
            }
            if (this.p.g(ggtVar) != 1 && !this.a.g().c()) {
                return;
            }
            if (!this.f.a.j() && !this.f.a.i()) {
                return;
            }
            this.l.h(false);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u(!this.b.u());
    }

    public final void p() {
        mda mdaVar = this.f;
        if (mdaVar == null) {
            return;
        }
        if (mdaVar.c) {
            y();
            if (A()) {
                this.b.s(this.f.a());
            }
        }
        if (z()) {
            this.y = this.f.d;
        }
        x();
        this.f = null;
        if (!this.a.g().d()) {
            return;
        }
        this.l.h(false);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        this.o.a = ezxVar2.d();
        if (this.e == null) {
            return;
        }
        if (!ezxVar2.b() || !this.e.g()) {
            this.e.e();
        } else {
            this.e.d();
        }
        if (this.f == null || !ezxVar.d() || ezxVar2.d()) {
            return;
        }
        x();
        y();
        this.f.c();
    }

    public final void q(ahhf ahhfVar) {
        boolean a = ahhfVar.a();
        this.y = a;
        mda mdaVar = this.f;
        if (mdaVar != null) {
            mdaVar.d = a;
        }
    }

    public final void r(ahhw ahhwVar) {
        if (A()) {
            mda mdaVar = this.f;
            if (!mdaVar.c || !mdaVar.d() || this.e == null || !this.j.f() || ahhwVar.c() != aika.ENDED || this.s.c) {
                return;
            }
            this.e.b();
        }
    }

    public final void s(Map map) {
        mda mdaVar = this.f;
        if (mdaVar != null) {
            final ggt ggtVar = mdaVar.a;
            apzg c = ggtVar.c();
            if (this.c.b(ggtVar, (aafo) this.u.get(), this.v.oi(), map, new ajrn() { // from class: mdb
                @Override // defpackage.ajrn
                public final void oq(Map map2) {
                    InlinePlaybackController inlinePlaybackController = InlinePlaybackController.this;
                    inlinePlaybackController.c.a(ggtVar, map2);
                }
            })) {
                return;
            }
            ((aafo) this.u.get()).c(this.v.oi().f(c), map);
        }
    }

    public final void t(fyq fyqVar) {
        fyq fyqVar2 = this.e;
        if (fyqVar2 != fyqVar) {
            if (fyqVar2 != null) {
                ((RecyclerView) fyqVar2.a()).aG(this);
            }
            if (fyqVar != null) {
                ((RecyclerView) fyqVar.a()).aE(this);
            }
            fyq fyqVar3 = this.e;
            if (fyqVar3 != null) {
                fyqVar3.c(false);
            }
            this.p.o();
            this.e = fyqVar;
            this.i.h(fyqVar);
            this.q.g = fyqVar;
            if (fyqVar == null) {
                return;
            }
            fyqVar.c(true);
        }
    }

    public final void u(boolean z) {
        if (!A()) {
            return;
        }
        if (!z) {
            x();
            mda mdaVar = this.f;
            if (mdaVar == null || !mdaVar.c) {
                return;
            }
            mdaVar.b.q();
            return;
        }
        B(2, false, null);
    }

    public final void v(fyq fyqVar) {
        if (this.e == fyqVar) {
            t(null);
        }
    }

    public final boolean w() {
        mda mdaVar = this.f;
        return mdaVar != null && mdaVar.d;
    }
}
