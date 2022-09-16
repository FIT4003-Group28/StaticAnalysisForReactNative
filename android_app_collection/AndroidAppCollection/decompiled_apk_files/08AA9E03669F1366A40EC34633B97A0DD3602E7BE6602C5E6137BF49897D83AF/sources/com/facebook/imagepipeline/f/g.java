package com.facebook.imagepipeline.f;

import android.net.Uri;
import com.android.internal.util.Predicate;
import com.facebook.imagepipeline.d.t;
import com.facebook.imagepipeline.m.aj;
import com.facebook.imagepipeline.m.ap;
import com.facebook.imagepipeline.m.at;
import com.facebook.imagepipeline.n.b;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ImagePipeline.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final CancellationException f2645a = new CancellationException("Prefetching is not enabled");

    /* renamed from: b  reason: collision with root package name */
    private final m f2646b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.j.c f2647c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.d.k<Boolean> f2648d;
    private final t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> e;
    private final t<com.facebook.b.a.d, com.facebook.common.g.g> f;
    private final com.facebook.imagepipeline.d.e g;
    private final com.facebook.imagepipeline.d.e h;
    private final com.facebook.imagepipeline.d.f i;
    private final at j;
    private final com.facebook.common.d.k<Boolean> k;
    private AtomicLong l = new AtomicLong();

    public g(m mVar, Set<com.facebook.imagepipeline.j.c> set, com.facebook.common.d.k<Boolean> kVar, t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> tVar, t<com.facebook.b.a.d, com.facebook.common.g.g> tVar2, com.facebook.imagepipeline.d.e eVar, com.facebook.imagepipeline.d.e eVar2, com.facebook.imagepipeline.d.f fVar, at atVar, com.facebook.common.d.k<Boolean> kVar2) {
        this.f2646b = mVar;
        this.f2647c = new com.facebook.imagepipeline.j.b(set);
        this.f2648d = kVar;
        this.e = tVar;
        this.f = tVar2;
        this.g = eVar;
        this.h = eVar2;
        this.i = fVar;
        this.j = atVar;
        this.k = kVar2;
    }

    private String f() {
        return String.valueOf(this.l.getAndIncrement());
    }

    public com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a(com.facebook.imagepipeline.n.b bVar, Object obj) {
        return a(bVar, obj, b.EnumC0062b.BITMAP_MEMORY_CACHE);
    }

    public com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> b(com.facebook.imagepipeline.n.b bVar, Object obj) {
        return a(bVar, obj, b.EnumC0062b.FULL_FETCH);
    }

    public com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a(com.facebook.imagepipeline.n.b bVar, Object obj, b.EnumC0062b enumC0062b) {
        try {
            return a(this.f2646b.b(bVar), bVar, enumC0062b, obj);
        } catch (Exception e) {
            return com.facebook.c.d.a(e);
        }
    }

    public com.facebook.c.c<Void> c(com.facebook.imagepipeline.n.b bVar, Object obj) {
        return a(bVar, obj, com.facebook.imagepipeline.e.c.MEDIUM);
    }

    public com.facebook.c.c<Void> a(com.facebook.imagepipeline.n.b bVar, Object obj, com.facebook.imagepipeline.e.c cVar) {
        if (!this.f2648d.b().booleanValue()) {
            return com.facebook.c.d.a(f2645a);
        }
        try {
            return a(this.f2646b.a(bVar), bVar, b.EnumC0062b.FULL_FETCH, obj, cVar);
        } catch (Exception e) {
            return com.facebook.c.d.a(e);
        }
    }

    public void a() {
        Predicate<com.facebook.b.a.d> predicate = new Predicate<com.facebook.b.a.d>() { // from class: com.facebook.imagepipeline.f.g.1
            /* renamed from: a */
            public boolean apply(com.facebook.b.a.d dVar) {
                return true;
            }
        };
        this.e.a(predicate);
        this.f.a(predicate);
    }

    public void b() {
        this.g.a();
        this.h.a();
    }

    public void c() {
        a();
        b();
    }

    public boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.e.b(c(uri));
    }

    public t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> d() {
        return this.e;
    }

    public boolean a(com.facebook.imagepipeline.n.b bVar) {
        if (bVar == null) {
            return false;
        }
        com.facebook.common.h.a<com.facebook.imagepipeline.i.b> a2 = this.e.a((t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b>) this.i.a(bVar, null));
        try {
            return com.facebook.common.h.a.a((com.facebook.common.h.a<?>) a2);
        } finally {
            com.facebook.common.h.a.c(a2);
        }
    }

    public boolean b(Uri uri) {
        return a(uri, b.a.SMALL) || a(uri, b.a.DEFAULT);
    }

    public boolean a(Uri uri, b.a aVar) {
        return b(com.facebook.imagepipeline.n.c.a(uri).a(aVar).n());
    }

    public boolean b(com.facebook.imagepipeline.n.b bVar) {
        com.facebook.b.a.d c2 = this.i.c(bVar, null);
        switch (bVar.a()) {
            case DEFAULT:
                return this.g.b(c2);
            case SMALL:
                return this.h.b(c2);
            default:
                return false;
        }
    }

    private <T> com.facebook.c.c<com.facebook.common.h.a<T>> a(aj<com.facebook.common.h.a<T>> ajVar, com.facebook.imagepipeline.n.b bVar, b.EnumC0062b enumC0062b, Object obj) {
        boolean z;
        com.facebook.imagepipeline.j.c c2 = c(bVar);
        try {
            b.EnumC0062b a2 = b.EnumC0062b.a(bVar.m(), enumC0062b);
            String f = f();
            if (!bVar.j() && bVar.d() == null && com.facebook.common.l.f.a(bVar.b())) {
                z = false;
                return com.facebook.imagepipeline.g.c.a(ajVar, new ap(bVar, f, c2, obj, a2, false, z, bVar.l()), c2);
            }
            z = true;
            return com.facebook.imagepipeline.g.c.a(ajVar, new ap(bVar, f, c2, obj, a2, false, z, bVar.l()), c2);
        } catch (Exception e) {
            return com.facebook.c.d.a(e);
        }
    }

    private com.facebook.c.c<Void> a(aj<Void> ajVar, com.facebook.imagepipeline.n.b bVar, b.EnumC0062b enumC0062b, Object obj, com.facebook.imagepipeline.e.c cVar) {
        com.facebook.imagepipeline.j.c c2 = c(bVar);
        try {
            return com.facebook.imagepipeline.g.d.a(ajVar, new ap(bVar, f(), c2, obj, b.EnumC0062b.a(bVar.m(), enumC0062b), true, false, cVar), c2);
        } catch (Exception e) {
            return com.facebook.c.d.a(e);
        }
    }

    private com.facebook.imagepipeline.j.c c(com.facebook.imagepipeline.n.b bVar) {
        if (bVar.q() == null) {
            return this.f2647c;
        }
        return new com.facebook.imagepipeline.j.b(this.f2647c, bVar.q());
    }

    private Predicate<com.facebook.b.a.d> c(final Uri uri) {
        return new Predicate<com.facebook.b.a.d>() { // from class: com.facebook.imagepipeline.f.g.2
            /* renamed from: a */
            public boolean apply(com.facebook.b.a.d dVar) {
                return dVar.a(uri);
            }
        };
    }

    public com.facebook.imagepipeline.d.f e() {
        return this.i;
    }
}
