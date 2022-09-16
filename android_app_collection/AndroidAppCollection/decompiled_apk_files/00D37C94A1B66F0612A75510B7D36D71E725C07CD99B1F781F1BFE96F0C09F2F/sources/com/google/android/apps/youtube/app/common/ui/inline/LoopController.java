package com.google.android.apps.youtube.app.common.ui.inline;

import com.google.android.apps.youtube.app.common.ui.inline.LoopController;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LoopController implements f, fze {
    public final azqb a;
    public apyo b;
    public boolean c;
    private final azqb d;
    private aypg e;

    public LoopController(azqb azqbVar, azqb azqbVar2, InlinePlaybackLifecycleController inlinePlaybackLifecycleController) {
        this.a = azqbVar;
        this.d = azqbVar2;
        inlinePlaybackLifecycleController.l(this);
    }

    private final void g() {
        if (this.b == null) {
            return;
        }
        this.c = false;
        ((ahvz) this.a.get()).a();
        this.b = null;
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

    @Override // defpackage.fze
    public final void lh(fyp fypVar, int i) {
        if (i == 0) {
            g();
        } else if (i != 1) {
        } else {
            apyo apyoVar = null;
            if (fypVar.b.b() != null && fypVar.b.b().qn(WatchEndpointOuterClass.watchEndpoint)) {
                awel awelVar = (awel) fypVar.b.b().qm(WatchEndpointOuterClass.watchEndpoint);
                awed awedVar = awelVar.s;
                if (awedVar == null) {
                    awedVar = awed.a;
                }
                apyo apyoVar2 = awedVar.b;
                if (apyoVar2 == null) {
                    apyoVar2 = apyo.a;
                }
                int ad = almu.ad(apyoVar2.c);
                if (ad != 0 && ad == 3) {
                    awed awedVar2 = awelVar.s;
                    if (awedVar2 == null) {
                        awedVar2 = awed.a;
                    }
                    apyoVar = awedVar2.b;
                    if (apyoVar == null) {
                        apyoVar = apyo.a;
                    }
                }
            }
            this.b = apyoVar;
        }
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        azof.f((AtomicReference) this.e);
        g();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.e = ((kpc) this.d.get()).ae(fuj.c, fuj.d).h(aiwv.l(1)).aa(new ayqb() { // from class: fzp
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                int ad;
                LoopController loopController = LoopController.this;
                ahhg ahhgVar = (ahhg) obj;
                apyo apyoVar = loopController.b;
                if (apyoVar == null || (ad = almu.ad(apyoVar.c)) == 0 || ad != 3) {
                    return;
                }
                loopController.c = true;
                apyo apyoVar2 = loopController.b;
                ((ahvz) loopController.a.get()).b(apyoVar2.e, apyoVar2.f);
            }
        }, fzc.e);
    }
}
