package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
/* loaded from: classes.dex */
public final class n implements d.b.b<m> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f6761a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<com.google.android.datatransport.runtime.backends.e> f6762b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<c.e.a.a.i.w.j.c> f6763c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<s> f6764d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<Executor> f6765e;

    /* renamed from: f  reason: collision with root package name */
    private final Provider<c.e.a.a.i.x.b> f6766f;

    /* renamed from: g  reason: collision with root package name */
    private final Provider<c.e.a.a.i.y.a> f6767g;

    public n(Provider<Context> provider, Provider<com.google.android.datatransport.runtime.backends.e> provider2, Provider<c.e.a.a.i.w.j.c> provider3, Provider<s> provider4, Provider<Executor> provider5, Provider<c.e.a.a.i.x.b> provider6, Provider<c.e.a.a.i.y.a> provider7) {
        this.f6761a = provider;
        this.f6762b = provider2;
        this.f6763c = provider3;
        this.f6764d = provider4;
        this.f6765e = provider5;
        this.f6766f = provider6;
        this.f6767g = provider7;
    }

    public static n a(Provider<Context> provider, Provider<com.google.android.datatransport.runtime.backends.e> provider2, Provider<c.e.a.a.i.w.j.c> provider3, Provider<s> provider4, Provider<Executor> provider5, Provider<c.e.a.a.i.x.b> provider6, Provider<c.e.a.a.i.y.a> provider7) {
        return new n(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public m mo254get() {
        return new m(this.f6761a.mo254get(), this.f6762b.mo254get(), this.f6763c.mo254get(), this.f6764d.mo254get(), this.f6765e.mo254get(), this.f6766f.mo254get(), this.f6767g.mo254get());
    }
}
