package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelWatchActivityLifecycleObserver implements f {
    private final gts a;
    private final aafo b;
    private final aadd c;

    public ReelWatchActivityLifecycleObserver(gts gtsVar, aafo aafoVar, aadd aaddVar) {
        this.a = gtsVar;
        this.b = aafoVar;
        this.c = aaddVar;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        for (Runnable runnable : this.a.b.values()) {
            if (runnable != null) {
                runnable.run();
            }
        }
        auld auldVar = this.c.a().u;
        if (auldVar == null) {
            auldVar = auld.a;
        }
        if (auldVar.j) {
            gts gtsVar = this.a;
            aafo aafoVar = this.b;
            synchronized (gtsVar.f) {
                amzt listIterator = gtsVar.d.listIterator();
                while (listIterator.hasNext()) {
                    ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) listIterator.next();
                    int i = reelWatchEndpointOuterClass$ReelWatchEndpoint.b;
                    if ((i & 8) != 0 && (i & 131072) != 0 && gtsVar.f.contains(reelWatchEndpointOuterClass$ReelWatchEndpoint.e)) {
                        apzg apzgVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.r;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aafoVar.a(apzgVar);
                    }
                }
                gtsVar.f.clear();
            }
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
}
