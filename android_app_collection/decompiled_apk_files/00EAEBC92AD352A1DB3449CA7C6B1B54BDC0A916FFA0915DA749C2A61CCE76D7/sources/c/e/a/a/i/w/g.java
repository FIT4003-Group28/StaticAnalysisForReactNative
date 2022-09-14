package c.e.a.a.i.w;

import javax.inject.Provider;
/* loaded from: classes.dex */
public final class g implements d.b.b<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<c.e.a.a.i.y.a> f3753a;

    public g(Provider<c.e.a.a.i.y.a> provider) {
        this.f3753a = provider;
    }

    public static g a(Provider<c.e.a.a.i.y.a> provider) {
        return new g(provider);
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g a(c.e.a.a.i.y.a aVar) {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.g a2 = f.a(aVar);
        d.b.d.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.g mo254get() {
        return a(this.f3753a.mo254get());
    }
}
