package c.e.a.a.i.w;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;
import javax.inject.Provider;
/* loaded from: classes.dex */
public final class d implements d.b.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Executor> f3748a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<com.google.android.datatransport.runtime.backends.e> f3749b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<s> f3750c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<c.e.a.a.i.w.j.c> f3751d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider<c.e.a.a.i.x.b> f3752e;

    public d(Provider<Executor> provider, Provider<com.google.android.datatransport.runtime.backends.e> provider2, Provider<s> provider3, Provider<c.e.a.a.i.w.j.c> provider4, Provider<c.e.a.a.i.x.b> provider5) {
        this.f3748a = provider;
        this.f3749b = provider2;
        this.f3750c = provider3;
        this.f3751d = provider4;
        this.f3752e = provider5;
    }

    public static d a(Provider<Executor> provider, Provider<com.google.android.datatransport.runtime.backends.e> provider2, Provider<s> provider3, Provider<c.e.a.a.i.w.j.c> provider4, Provider<c.e.a.a.i.x.b> provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public c mo254get() {
        return new c(this.f3748a.mo254get(), this.f3749b.mo254get(), this.f3750c.mo254get(), this.f3751d.mo254get(), this.f3752e.mo254get());
    }
}
