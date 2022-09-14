package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ q7 f7650b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q7 f7651c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f7652d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f7653e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ p7 f7654f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r7(p7 p7Var, q7 q7Var, q7 q7Var2, long j, boolean z) {
        this.f7654f = p7Var;
        this.f7650b = q7Var;
        this.f7651c = q7Var2;
        this.f7652d = j;
        this.f7653e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7654f.a(this.f7650b, this.f7651c, this.f7652d, this.f7653e, (Bundle) null);
    }
}
