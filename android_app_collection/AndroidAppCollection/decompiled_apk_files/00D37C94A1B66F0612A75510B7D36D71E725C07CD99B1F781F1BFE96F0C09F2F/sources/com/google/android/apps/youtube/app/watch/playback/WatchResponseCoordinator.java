package com.google.android.apps.youtube.app.watch.playback;

import com.google.android.apps.youtube.app.watch.playback.WatchResponseCoordinator;
import j$.util.Optional;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WatchResponseCoordinator implements f {
    public final ahta a;
    public final oez b;
    private final airw c;
    private final aypf d = new aypf();
    private final boolean e;

    public WatchResponseCoordinator(axxb axxbVar, ahta ahtaVar, oez oezVar, airw airwVar) {
        this.a = ahtaVar;
        this.b = oezVar;
        this.c = airwVar;
        this.e = axxbVar.d().booleanValue();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        if (!this.e) {
            return;
        }
        this.d.g(this.c.ao().Z(new ayqb() { // from class: ofd
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                WatchResponseCoordinator watchResponseCoordinator = WatchResponseCoordinator.this;
                ahhm ahhmVar = (ahhm) obj;
                watchResponseCoordinator.a.u(ahhmVar);
                watchResponseCoordinator.b.m(ahhmVar, (acuv) Optional.ofNullable(null).orElse(null));
            }
        }));
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.d.c();
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
