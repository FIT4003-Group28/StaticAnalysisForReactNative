package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f7760b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7761c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7762d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f7763e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f7764f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ j6 f7765g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w6(j6 j6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f7765g = j6Var;
        this.f7760b = atomicReference;
        this.f7761c = str;
        this.f7762d = str2;
        this.f7763e = str3;
        this.f7764f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7765g.f7802a.E().a(this.f7760b, this.f7761c, this.f7762d, this.f7763e, this.f7764f);
    }
}
