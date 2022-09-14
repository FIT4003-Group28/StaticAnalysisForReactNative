package c.e.a.a.i;

import android.content.Context;
import c.e.a.a.i.h;
import c.e.a.a.i.m;
import c.e.a.a.i.s;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class r implements q {

    /* renamed from: e  reason: collision with root package name */
    private static volatile s f3725e;

    /* renamed from: a  reason: collision with root package name */
    private final c.e.a.a.i.y.a f3726a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.y.a f3727b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.i.w.e f3728c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.m f3729d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(c.e.a.a.i.y.a aVar, c.e.a.a.i.y.a aVar2, c.e.a.a.i.w.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.m mVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.q qVar) {
        this.f3726a = aVar;
        this.f3727b = aVar2;
        this.f3728c = eVar;
        this.f3729d = mVar;
        qVar.a();
    }

    private h a(l lVar) {
        h.a i = h.i();
        i.a(this.f3726a.a());
        i.b(this.f3727b.a());
        i.a(lVar.f());
        i.a(new g(lVar.a(), lVar.c()));
        i.a(lVar.b().a());
        return i.a();
    }

    public static void a(Context context) {
        if (f3725e == null) {
            synchronized (r.class) {
                if (f3725e == null) {
                    s.a c2 = d.c();
                    c2.mo148a(context);
                    f3725e = c2.a();
                }
            }
        }
    }

    public static r b() {
        s sVar = f3725e;
        if (sVar != null) {
            return sVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<c.e.a.a.b> b(e eVar) {
        return eVar instanceof f ? Collections.unmodifiableSet(((f) eVar).a()) : Collections.singleton(c.e.a.a.b.a("proto"));
    }

    public c.e.a.a.g a(e eVar) {
        Set<c.e.a.a.b> b2 = b(eVar);
        m.a d2 = m.d();
        d2.a(eVar.getName());
        d2.a(eVar.b());
        return new n(b2, d2.a(), this);
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.m a() {
        return this.f3729d;
    }

    @Override // c.e.a.a.i.q
    public void a(l lVar, c.e.a.a.h hVar) {
        this.f3728c.a(lVar.e().a(lVar.b().c()), a(lVar), hVar);
    }
}
