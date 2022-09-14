package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import javax.inject.Provider;
/* loaded from: classes.dex */
public final class r implements d.b.b<q> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Executor> f6774a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<c.e.a.a.i.w.j.c> f6775b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<s> f6776c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<c.e.a.a.i.x.b> f6777d;

    public r(Provider<Executor> provider, Provider<c.e.a.a.i.w.j.c> provider2, Provider<s> provider3, Provider<c.e.a.a.i.x.b> provider4) {
        this.f6774a = provider;
        this.f6775b = provider2;
        this.f6776c = provider3;
        this.f6777d = provider4;
    }

    public static r a(Provider<Executor> provider, Provider<c.e.a.a.i.w.j.c> provider2, Provider<s> provider3, Provider<c.e.a.a.i.x.b> provider4) {
        return new r(provider, provider2, provider3, provider4);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public q mo254get() {
        return new q(this.f6774a.mo254get(), this.f6775b.mo254get(), this.f6776c.mo254get(), this.f6777d.mo254get());
    }
}
