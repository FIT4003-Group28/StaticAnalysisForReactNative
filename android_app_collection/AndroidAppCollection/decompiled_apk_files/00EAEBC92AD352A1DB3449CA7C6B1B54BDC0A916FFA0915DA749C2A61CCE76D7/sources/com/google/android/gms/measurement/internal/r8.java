package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* loaded from: classes.dex */
final class r8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ComponentName f7655b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p8 f7656c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r8(p8 p8Var, ComponentName componentName) {
        this.f7656c = p8Var;
        this.f7655b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7656c.f7594c.a(this.f7655b);
    }
}
