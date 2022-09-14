package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class t6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ i6 f7708b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7709c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t6(j6 j6Var, i6 i6Var) {
        this.f7709c = j6Var;
        this.f7708b = i6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7709c.a(this.f7708b);
    }
}
