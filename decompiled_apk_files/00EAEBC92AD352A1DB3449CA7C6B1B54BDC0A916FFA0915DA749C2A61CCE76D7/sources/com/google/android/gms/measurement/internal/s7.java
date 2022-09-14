package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f7688b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ q7 f7689c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q7 f7690d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f7691e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ p7 f7692f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s7(p7 p7Var, Bundle bundle, q7 q7Var, q7 q7Var2, long j) {
        this.f7692f = p7Var;
        this.f7688b = bundle;
        this.f7689c = q7Var;
        this.f7690d = q7Var2;
        this.f7691e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7692f.a(this.f7688b, this.f7689c, this.f7690d, this.f7691e);
    }
}
