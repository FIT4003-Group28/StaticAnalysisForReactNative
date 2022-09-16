package com.google.android.apps.youtube.app.player.overlay.fullscreenengagement;

import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.FullscreenEngagementViewPresenter;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class FullscreenEngagementViewPresenter implements aigm, f, ezb, klr {
    public final klt a;
    public final aigl b;
    private final int c;
    private final aypf d = new aypf();
    private final ecl e;
    private final airw f;
    private arbm g;
    private boolean h;

    public FullscreenEngagementViewPresenter(klt kltVar, aigl aiglVar, ecl eclVar, airw airwVar) {
        this.a = kltVar;
        this.b = aiglVar;
        this.c = aiglVar.getContext().getResources().getDimensionPixelSize(R.dimen.fullscreen_engagement_action_bar_height);
        this.e = eclVar;
        this.f = airwVar;
    }

    private final void i() {
        arbm arbmVar = this.g;
        boolean z = true;
        boolean z2 = arbmVar != null && this.h;
        if (arbmVar == null || !this.b.c.d()) {
            if (this.g == null) {
                this.a.g(null);
            }
            klt kltVar = this.a;
            if (this.g == null || this.b.c.e()) {
                z = false;
            }
            kltVar.h(false, z2, z);
            return;
        }
        this.a.g(this.g);
        this.a.h(true, z2, true);
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
    }

    public final void g(arbm arbmVar, boolean z) {
        if (akzj.f(arbmVar, this.g)) {
            return;
        }
        this.g = arbmVar;
        if (z) {
            arbi b = klb.b(arbmVar);
            int i = 0;
            boolean z2 = b != null && b.b.size() > 0;
            aigl aiglVar = this.b;
            if (z2) {
                i = this.c;
            }
            if (aiglVar.h != i) {
                aiglVar.h = i;
                aiglVar.h();
            }
        }
        i();
    }

    @Override // defpackage.ezb
    public final void h(ezw ezwVar) {
        g(null, false);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.d.c();
        this.e.a = null;
    }

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
        if (i == i2 && this.h == i3) {
            return;
        }
        boolean z = true;
        if (1 != i3) {
            z = false;
        }
        this.h = z;
        i();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.d.c();
        this.d.d(this.f.ao().I().G(aypa.a()).aa(new ayqb() { // from class: klu
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aube aubeVar;
                aube aubeVar2;
                arbm arbmVar;
                FullscreenEngagementViewPresenter fullscreenEngagementViewPresenter = FullscreenEngagementViewPresenter.this;
                ahhm ahhmVar = (ahhm) obj;
                if (ahhmVar.a() == null) {
                    return;
                }
                asgt asgtVar = ahhmVar.a().a;
                asgf asgfVar = asgtVar.f;
                if (asgfVar == null) {
                    asgfVar = asgf.a;
                }
                if (asgfVar.b == 78882851) {
                    aubeVar = (aube) asgfVar.c;
                } else {
                    aubeVar = aube.a;
                }
                aunb aunbVar = aubeVar.k;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (!aunbVar.qn(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementOverlayRenderer)) {
                    arbmVar = null;
                } else {
                    asgf asgfVar2 = asgtVar.f;
                    if (asgfVar2 == null) {
                        asgfVar2 = asgf.a;
                    }
                    if (asgfVar2.b == 78882851) {
                        aubeVar2 = (aube) asgfVar2.c;
                    } else {
                        aubeVar2 = aube.a;
                    }
                    aunb aunbVar2 = aubeVar2.k;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    arbmVar = (arbm) aunbVar2.qm(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementOverlayRenderer);
                }
                fullscreenEngagementViewPresenter.g(arbmVar, true);
            }
        }, kjt.c));
        this.e.a = this.a;
    }
}
