package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import javax.inject.Provider;
/* loaded from: classes.dex */
public final class l implements d.b.b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f6712a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<i> f6713b;

    public l(Provider<Context> provider, Provider<i> provider2) {
        this.f6712a = provider;
        this.f6713b = provider2;
    }

    public static l a(Provider<Context> provider, Provider<i> provider2) {
        return new l(provider, provider2);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public k mo254get() {
        return new k(this.f6712a.mo254get(), this.f6713b.mo254get());
    }
}
