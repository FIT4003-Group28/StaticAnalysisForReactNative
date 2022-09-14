package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p7 f7725b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u7(p7 p7Var) {
        this.f7725b = p7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q7 q7Var;
        p7 p7Var = this.f7725b;
        q7Var = p7Var.j;
        p7Var.f7588e = q7Var;
    }
}
