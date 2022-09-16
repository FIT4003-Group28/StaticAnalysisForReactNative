package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Provider;
/* loaded from: classes.dex */
public final class j implements d.b.b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f6704a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<c.e.a.a.i.y.a> f6705b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<c.e.a.a.i.y.a> f6706c;

    public j(Provider<Context> provider, Provider<c.e.a.a.i.y.a> provider2, Provider<c.e.a.a.i.y.a> provider3) {
        this.f6704a = provider;
        this.f6705b = provider2;
        this.f6706c = provider3;
    }

    public static j a(Provider<Context> provider, Provider<c.e.a.a.i.y.a> provider2, Provider<c.e.a.a.i.y.a> provider3) {
        return new j(provider, provider2, provider3);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public i mo254get() {
        return new i(this.f6704a.mo254get(), this.f6705b.mo254get(), this.f6706c.mo254get());
    }
}
