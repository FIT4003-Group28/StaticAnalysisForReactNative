package c.e.a.a.i;

import javax.inject.Provider;
/* loaded from: classes.dex */
public final class t implements d.b.b<r> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<c.e.a.a.i.y.a> f3730a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<c.e.a.a.i.y.a> f3731b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<c.e.a.a.i.w.e> f3732c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.m> f3733d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> f3734e;

    public t(Provider<c.e.a.a.i.y.a> provider, Provider<c.e.a.a.i.y.a> provider2, Provider<c.e.a.a.i.w.e> provider3, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.m> provider4, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> provider5) {
        this.f3730a = provider;
        this.f3731b = provider2;
        this.f3732c = provider3;
        this.f3733d = provider4;
        this.f3734e = provider5;
    }

    public static t a(Provider<c.e.a.a.i.y.a> provider, Provider<c.e.a.a.i.y.a> provider2, Provider<c.e.a.a.i.w.e> provider3, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.m> provider4, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> provider5) {
        return new t(provider, provider2, provider3, provider4, provider5);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public r mo254get() {
        return new r(this.f3730a.mo254get(), this.f3731b.mo254get(), this.f3732c.mo254get(), this.f3733d.mo254get(), this.f3734e.mo254get());
    }
}
