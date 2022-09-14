package c.e.a.a.i.w.j;

import javax.inject.Provider;
/* loaded from: classes.dex */
public final class c0 implements d.b.b<b0> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<c.e.a.a.i.y.a> f3780a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<c.e.a.a.i.y.a> f3781b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<d> f3782c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<h0> f3783d;

    public c0(Provider<c.e.a.a.i.y.a> provider, Provider<c.e.a.a.i.y.a> provider2, Provider<d> provider3, Provider<h0> provider4) {
        this.f3780a = provider;
        this.f3781b = provider2;
        this.f3782c = provider3;
        this.f3783d = provider4;
    }

    public static c0 a(Provider<c.e.a.a.i.y.a> provider, Provider<c.e.a.a.i.y.a> provider2, Provider<d> provider3, Provider<h0> provider4) {
        return new c0(provider, provider2, provider3, provider4);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public b0 mo254get() {
        return new b0(this.f3780a.mo254get(), this.f3781b.mo254get(), this.f3782c.mo254get(), this.f3783d.mo254get());
    }
}
