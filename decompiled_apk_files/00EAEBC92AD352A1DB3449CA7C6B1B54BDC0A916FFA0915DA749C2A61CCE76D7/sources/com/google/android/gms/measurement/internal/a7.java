package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7166b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j6 f7167c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a7(j6 j6Var, boolean z) {
        this.f7167c = j6Var;
        this.f7166b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7167c.b(this.f7166b);
    }
}
