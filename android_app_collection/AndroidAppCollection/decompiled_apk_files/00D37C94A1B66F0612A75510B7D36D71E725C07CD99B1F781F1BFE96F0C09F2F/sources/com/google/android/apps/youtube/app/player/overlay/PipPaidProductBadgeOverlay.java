package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PipPaidProductBadgeOverlay implements fgd, ahyh, f {
    public boolean a;
    public boolean b;
    public boolean c;
    private final Context d;
    private final airw e;
    private final Handler f;
    private final aadd g;
    private final snc j;
    private View k;
    private ahyg l;
    private boolean n;
    private long o;
    private long p;
    private ezx m = ezx.NONE;
    private final aypf h = new aypf();
    private final Runnable i = new Runnable() { // from class: kfs
        @Override // java.lang.Runnable
        public final void run() {
            PipPaidProductBadgeOverlay.this.g();
        }
    };

    public PipPaidProductBadgeOverlay(Context context, airw airwVar, Handler handler, snc sncVar, aadd aaddVar) {
        this.d = context;
        this.e = airwVar;
        this.f = handler;
        this.j = sncVar;
        this.g = aaddVar;
        i();
    }

    private final void l() {
        if (nI()) {
            return;
        }
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.pip_paid_product_badge_overlay, (ViewGroup) null);
        this.k = inflate;
        ahyg ahygVar = this.l;
        if (ahygVar != null) {
            ahygVar.d(this, inflate);
        }
        this.a = this.k.getParent() != null;
        this.k.addOnAttachStateChangeListener(new kft(this));
    }

    private final boolean m() {
        asxp asxpVar = this.g.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        return asxpVar.aX;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public final void g() {
        if (!this.n) {
            return;
        }
        this.f.removeCallbacks(this.i);
        this.p = Math.max(0L, this.p - (this.j.c() - this.o));
        zag.o(this.k, false);
        this.n = false;
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        if (this.m == ezxVar) {
            return;
        }
        this.m = ezxVar;
        if (nI()) {
            return;
        }
        j();
    }

    public final void i() {
        g();
        this.p = 10000L;
    }

    public final void j() {
        if (!nI() && this.m.e() && m()) {
            l();
        }
        if (!nI()) {
            return;
        }
        if (!this.a || this.b || !this.c) {
            g();
        } else if (this.n || this.p <= 0 || !m()) {
        } else {
            this.n = true;
            this.o = this.j.c();
            zag.o(this.k, true);
            this.f.postDelayed(this.i, this.p);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.aizf
    public final View kZ() {
        l();
        return this.k;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return ezxVar.e();
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.h.c();
    }

    @Override // defpackage.ahyh
    public final boolean nI() {
        return this.k != null;
    }

    @Override // defpackage.ahyh
    public final void ns(ahyg ahygVar) {
        this.l = ahygVar;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.h.d(this.e.G().b.aa(new ayqb() { // from class: kfr
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                atuq atuqVar;
                PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay = PipPaidProductBadgeOverlay.this;
                ahhw ahhwVar = (ahhw) obj;
                if (ahhwVar.c() == aika.NEW) {
                    pipPaidProductBadgeOverlay.i();
                }
                boolean z = false;
                pipPaidProductBadgeOverlay.b = ahhwVar.c().a(aika.PLAYBACK_INTERRUPTED, aika.INTERSTITIAL_REQUESTED, aika.INTERSTITIAL_PLAYING);
                if (ahhwVar.b() != null) {
                    arzw arzwVar = ahhwVar.b().a.B;
                    if (arzwVar == null) {
                        arzwVar = arzw.a;
                    }
                    if (arzwVar.b == 130741768) {
                        atuqVar = (atuq) arzwVar.c;
                    } else {
                        atuqVar = atuq.a;
                    }
                    if (atuqVar.g) {
                        z = true;
                    }
                }
                pipPaidProductBadgeOverlay.c = z;
                pipPaidProductBadgeOverlay.j();
            }
        }, jww.o));
    }
}
