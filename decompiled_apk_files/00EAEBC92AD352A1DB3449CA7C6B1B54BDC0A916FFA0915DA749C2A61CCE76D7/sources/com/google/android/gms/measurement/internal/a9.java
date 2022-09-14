package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class a9 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ r9 f7171b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Runnable f7172c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a9(v8 v8Var, r9 r9Var, Runnable runnable) {
        this.f7171b = r9Var;
        this.f7172c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7171b.q();
        this.f7171b.a(this.f7172c);
        this.f7171b.p();
    }
}
