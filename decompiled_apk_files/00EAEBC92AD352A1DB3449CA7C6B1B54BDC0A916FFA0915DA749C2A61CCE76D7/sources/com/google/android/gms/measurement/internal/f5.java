package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f5 extends d2 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f7293b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f5(d5 d5Var) {
        super(d5Var);
        this.f7802a.a(this);
    }

    protected abstract boolean A();

    protected void u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v() {
        return this.f7293b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x() {
        if (v()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void y() {
        if (!this.f7293b) {
            if (A()) {
                return;
            }
            this.f7802a.k();
            this.f7293b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void z() {
        if (!this.f7293b) {
            u();
            this.f7802a.k();
            this.f7293b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
