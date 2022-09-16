package c.e.a.a.i.w.j;

import android.content.Context;
import javax.inject.Provider;
/* loaded from: classes.dex */
public final class i0 implements d.b.b<h0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f3799a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<String> f3800b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<Integer> f3801c;

    public i0(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f3799a = provider;
        this.f3800b = provider2;
        this.f3801c = provider3;
    }

    public static i0 a(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new i0(provider, provider2, provider3);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public h0 mo254get() {
        return new h0(this.f3799a.mo254get(), this.f3800b.mo254get(), this.f3801c.mo254get().intValue());
    }
}
