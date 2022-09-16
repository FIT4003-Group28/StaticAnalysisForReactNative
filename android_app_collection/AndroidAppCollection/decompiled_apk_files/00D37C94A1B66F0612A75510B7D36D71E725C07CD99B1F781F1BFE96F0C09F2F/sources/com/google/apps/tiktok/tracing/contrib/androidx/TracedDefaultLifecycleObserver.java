package com.google.apps.tiktok.tracing.contrib.androidx;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TracedDefaultLifecycleObserver implements f {
    private final f a;

    public TracedDefaultLifecycleObserver(f fVar) {
        aqxo.z(true, "Yo dawg.");
        this.a = fVar;
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        amna.f();
        try {
            this.a.kG(apyVar);
            amna.j();
        } catch (Throwable th) {
            try {
                amna.j();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        amna.f();
        try {
            this.a.lc(apyVar);
            amna.j();
        } catch (Throwable th) {
            try {
                amna.j();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        amna.f();
        try {
            this.a.ld(apyVar);
            amna.j();
        } catch (Throwable th) {
            try {
                amna.j();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        amna.f();
        amna.j();
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        amna.f();
        amna.j();
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        amna.f();
        try {
            this.a.nz(apyVar);
            amna.j();
        } catch (Throwable th) {
            try {
                amna.j();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
