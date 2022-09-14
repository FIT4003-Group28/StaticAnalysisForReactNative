package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class b6 extends y5 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f7192b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b6(d5 d5Var) {
        super(d5Var);
        this.f7802a.a(this);
    }

    protected void m() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n() {
        if (r()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void o() {
        if (!this.f7192b) {
            if (q()) {
                return;
            }
            this.f7802a.k();
            this.f7192b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void p() {
        if (!this.f7192b) {
            m();
            this.f7802a.k();
            this.f7192b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    protected abstract boolean q();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        return this.f7192b;
    }
}
