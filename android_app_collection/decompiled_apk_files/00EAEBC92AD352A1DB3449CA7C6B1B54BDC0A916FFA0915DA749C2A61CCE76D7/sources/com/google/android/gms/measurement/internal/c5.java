package com.google.android.gms.measurement.internal;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c5 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final String f7213a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a5 f7214b;

    public c5(a5 a5Var, String str) {
        this.f7214b = a5Var;
        com.google.android.gms.common.internal.s.a(str);
        this.f7213a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f7214b.c().s().a(this.f7213a, th);
    }
}
