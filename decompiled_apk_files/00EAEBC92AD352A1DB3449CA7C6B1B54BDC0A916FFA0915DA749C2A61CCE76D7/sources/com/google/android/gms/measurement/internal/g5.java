package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ k6 f7314b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ d5 f7315c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g5(d5 d5Var, k6 k6Var) {
        this.f7315c = d5Var;
        this.f7314b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7315c.a(this.f7314b);
        this.f7315c.e();
    }
}
