package com.google.android.apps.youtube.app.watch.nextgenwatch.flexy;

import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayerCollapsedStateMonitor implements airt, nul, f, ynl {
    private final azqb a;
    private final CreatorEndscreenOverlayPresenter b;
    private final ahyp c;
    private final yni d;
    private final airw e;
    private final aypf f = new aypf();
    private volatile boolean g;
    private final aacz h;

    public PlayerCollapsedStateMonitor(azqb azqbVar, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, ahyp ahypVar, yni yniVar, airw airwVar, aacz aaczVar) {
        this.a = azqbVar;
        this.b = creatorEndscreenOverlayPresenter;
        this.c = ahypVar;
        this.d = yniVar;
        this.e = airwVar;
        this.h = aaczVar;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new ayqb() { // from class: nuz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                PlayerCollapsedStateMonitor.this.i((ahhw) obj);
            }
        }, npy.g)};
    }

    @Override // defpackage.nul
    public final void h(boolean z) {
        CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.b;
        creatorEndscreenOverlayPresenter.k = z;
        if (creatorEndscreenOverlayPresenter.i) {
            creatorEndscreenOverlayPresenter.s();
        }
        if (!z || this.g) {
            return;
        }
        this.c.x();
    }

    public final void i(ahhw ahhwVar) {
        aika c = ahhwVar.c();
        if (c == null) {
            return;
        }
        this.g = c == aika.ENDED;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                i((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        ((nun) this.a.get()).k(this);
        if (eog.aq(this.h)) {
            this.f.c();
        } else {
            this.d.m(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        ((nun) this.a.get()).i(this);
        if (eog.aq(this.h)) {
            this.f.c();
            this.f.g(g(this.e));
            return;
        }
        this.d.g(this);
    }
}
