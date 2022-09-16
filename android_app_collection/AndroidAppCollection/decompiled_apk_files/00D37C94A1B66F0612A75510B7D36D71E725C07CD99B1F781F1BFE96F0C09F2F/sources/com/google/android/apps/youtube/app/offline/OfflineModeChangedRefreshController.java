package com.google.android.apps.youtube.app.offline;

import android.view.View;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import j$.time.Duration;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflineModeChangedRefreshController implements f, ete, ynl {
    private static final Duration b = Duration.ofMillis(50);
    private final gbq c;
    private final ezh d;
    private final feb e;
    private final aadd f;
    private final airr g;
    private final oet h;
    private final okf i;
    private final yni j;
    private final airw k;
    private final ipn l;
    private final ind m;
    private final ise n;
    private final aacz q;
    private final aypf o = new aypf();
    private volatile int p = 0;
    public volatile aijx a = aijx.NEW;

    public OfflineModeChangedRefreshController(gbq gbqVar, ezh ezhVar, feb febVar, aacz aaczVar, aadd aaddVar, airr airrVar, oet oetVar, okf okfVar, yni yniVar, airw airwVar, ipn ipnVar, ind indVar, ise iseVar) {
        this.c = gbqVar;
        this.d = ezhVar;
        this.e = febVar;
        this.q = aaczVar;
        this.f = aaddVar;
        this.g = airrVar;
        this.h = oetVar;
        this.i = okfVar;
        this.j = yniVar;
        this.k = airwVar;
        this.l = ipnVar;
        this.m = indVar;
        this.n = iseVar;
    }

    @Override // defpackage.ete
    public final void g(boolean z) {
        oan l;
        WatchNextResponseModel c;
        apzg apzgVar;
        boolean z2 = false;
        if (z) {
            this.i.i(false);
            return;
        }
        this.i.i(true);
        if (this.c.c() == null) {
            return;
        }
        this.c.o();
        gbd e = this.c.e();
        if (this.l.a.isInstance(e)) {
            e = (gbd) e.mL().f("master_fragment_tag");
        }
        if (this.n.a.isInstance(e)) {
            dp s = this.n.a.isInstance(e) ? ((irq) e).s() : null;
            if (s instanceof gbd) {
                e = s;
            }
        }
        if (this.m.a.isInstance(e)) {
            Duration duration = b;
            if (e instanceof imz) {
                final imz imzVar = (imz) e;
                if (imzVar.ap() && imzVar.I() != null) {
                    View view = e.O;
                    imzVar.getClass();
                    view.postDelayed(new Runnable() { // from class: inc
                        @Override // java.lang.Runnable
                        public final void run() {
                            imz.this.l();
                        }
                    }, duration.toMillis());
                }
            }
        }
        if (!this.d.g().h()) {
            return;
        }
        if (this.p == 8 || this.p == 4) {
            z2 = true;
        }
        if (this.d.g().h() && z2) {
            oeu oeuVar = this.h.a;
            if (oeuVar == null || oeuVar.k() != 2) {
                if (this.g.O() && this.a != aijx.VIDEO_PLAYBACK_ERROR) {
                    asxp asxpVar = this.f.a().e;
                    if (asxpVar == null) {
                        asxpVar = asxp.a;
                    }
                    if (asxpVar.W) {
                        return;
                    }
                }
                this.e.a();
                this.g.a();
                return;
            }
            this.g.ab();
            this.g.a();
            return;
        }
        oeu oeuVar2 = this.h.a;
        if (oeuVar2 == null || (l = oeuVar2.l()) == null || (c = l.c()) == null || (apzgVar = c.c) == null || !apzgVar.qn(attg.a)) {
            return;
        }
        this.g.aa();
    }

    public final void h(ahia ahiaVar) {
        this.p = ahiaVar.a();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                h((ahia) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahia.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (!eog.aq(this.q)) {
            this.j.m(this);
        }
        this.o.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.q)) {
            this.o.d(this.k.G().j.aa(new jak(this), ick.g));
        } else {
            this.j.g(this);
        }
        this.o.d(this.k.ao().I().G(aypa.a()).aa(new jak(this, 1), ick.g));
    }
}
