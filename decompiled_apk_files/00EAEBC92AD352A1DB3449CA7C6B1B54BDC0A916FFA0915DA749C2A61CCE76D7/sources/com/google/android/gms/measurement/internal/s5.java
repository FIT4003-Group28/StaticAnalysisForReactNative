package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class s5 implements Callable<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p f7683a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7684b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ j5 f7685c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s5(j5 j5Var, p pVar, String str) {
        this.f7685c = j5Var;
        this.f7683a = pVar;
        this.f7684b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7685c.f7390a;
        r9Var.q();
        r9Var2 = this.f7685c.f7390a;
        r9Var2.k().a(this.f7683a, this.f7684b);
        throw null;
    }
}
