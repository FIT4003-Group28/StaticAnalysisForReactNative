package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7783b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7784c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7785d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f7786e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ j6 f7787f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x6(j6 j6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f7787f = j6Var;
        this.f7783b = atomicReference;
        this.f7784c = str;
        this.f7785d = str2;
        this.f7786e = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7787f.f7802a.E().a(this.f7783b, this.f7784c, this.f7785d, this.f7786e);
    }
}
