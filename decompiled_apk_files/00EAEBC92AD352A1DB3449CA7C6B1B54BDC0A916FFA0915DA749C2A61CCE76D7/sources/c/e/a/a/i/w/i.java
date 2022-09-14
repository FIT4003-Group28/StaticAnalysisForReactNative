package c.e.a.a.i.w;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import javax.inject.Provider;
/* loaded from: classes.dex */
public final class i implements d.b.b<s> {

    /* renamed from: a  reason: collision with root package name */
    private final Provider<Context> f3754a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider<c.e.a.a.i.w.j.c> f3755b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f3756c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider<c.e.a.a.i.y.a> f3757d;

    public i(Provider<Context> provider, Provider<c.e.a.a.i.w.j.c> provider2, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> provider3, Provider<c.e.a.a.i.y.a> provider4) {
        this.f3754a = provider;
        this.f3755b = provider2;
        this.f3756c = provider3;
        this.f3757d = provider4;
    }

    public static i a(Provider<Context> provider, Provider<c.e.a.a.i.w.j.c> provider2, Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> provider3, Provider<c.e.a.a.i.y.a> provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static s a(Context context, c.e.a.a.i.w.j.c cVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.g gVar, c.e.a.a.i.y.a aVar) {
        s a2 = h.a(context, cVar, gVar, aVar);
        d.b.d.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // javax.inject.Provider
    /* renamed from: get */
    public s mo254get() {
        return a(this.f3754a.mo254get(), this.f3755b.mo254get(), this.f3756c.mo254get(), this.f3757d.mo254get());
    }
}
