package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o9 extends p9 {

    /* renamed from: c  reason: collision with root package name */
    private boolean f7561c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o9(r9 r9Var) {
        super(r9Var);
        this.f7595b.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        return this.f7561c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        if (p()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void r() {
        if (!this.f7561c) {
            s();
            this.f7595b.r();
            this.f7561c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    protected abstract boolean s();
}
