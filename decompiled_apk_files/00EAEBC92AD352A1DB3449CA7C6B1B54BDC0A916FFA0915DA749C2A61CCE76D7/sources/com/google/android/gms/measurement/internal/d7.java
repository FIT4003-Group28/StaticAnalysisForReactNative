package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class d7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7246b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7247c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d7(j6 j6Var, boolean z) {
        this.f7247c = j6Var;
        this.f7246b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean g2 = this.f7247c.f7802a.g();
        boolean f2 = this.f7247c.f7802a.f();
        this.f7247c.f7802a.a(this.f7246b);
        if (f2 == this.f7246b) {
            this.f7247c.f7802a.c().B().a("Default data collection state already set to", Boolean.valueOf(this.f7246b));
        }
        if (this.f7247c.f7802a.g() == g2 || this.f7247c.f7802a.g() != this.f7247c.f7802a.f()) {
            this.f7247c.f7802a.c().y().a("Default data collection is different than actual status", Boolean.valueOf(this.f7246b), Boolean.valueOf(g2));
        }
        this.f7247c.M();
    }
}
