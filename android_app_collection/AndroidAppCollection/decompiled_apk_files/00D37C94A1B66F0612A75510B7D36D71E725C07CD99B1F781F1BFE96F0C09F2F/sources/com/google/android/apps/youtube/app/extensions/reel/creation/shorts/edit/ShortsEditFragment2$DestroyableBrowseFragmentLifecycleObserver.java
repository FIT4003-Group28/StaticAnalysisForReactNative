package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver implements f {
    public gzf a;
    public boolean b;
    private int c = 0;

    public ShortsEditFragment2$DestroyableBrowseFragmentLifecycleObserver(gzf gzfVar) {
        this.a = gzfVar;
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
        gzf gzfVar;
        int i = this.c - 1;
        this.c = i;
        if (i != 0 || (gzfVar = this.a) == null || !this.b) {
            return;
        }
        gzfVar.f();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.c++;
        gzf gzfVar = this.a;
        if (gzfVar == null || !this.b) {
            return;
        }
        gzfVar.e();
    }
}
