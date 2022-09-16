package c.d.h.a.a;

import android.content.Context;
import android.net.Uri;
import c.d.h.c.b;
import c.d.j.f.h;
import c.d.j.o.c;
import java.util.Set;
/* loaded from: classes.dex */
public class e extends c.d.h.c.b<e, c.d.j.o.c, c.d.d.h.a<c.d.j.k.b>, c.d.j.k.e> {
    private final h s;
    private final g t;
    private c.d.d.d.e<c.d.j.j.a> u;
    private c.d.h.a.a.i.b v;
    private c.d.h.a.a.i.f w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2917a = new int[b.c.values().length];

        static {
            try {
                f2917a[b.c.FULL_FETCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2917a[b.c.DISK_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2917a[b.c.BITMAP_MEMORY_CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(Context context, g gVar, h hVar, Set<c.d.h.c.d> set) {
        super(context, set);
        this.s = hVar;
        this.t = gVar;
    }

    public static c.b a(b.c cVar) {
        int i = a.f2917a[cVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c.b.DISK_CACHE;
            }
            if (i == 3) {
                return c.b.BITMAP_MEMORY_CACHE;
            }
            throw new RuntimeException("Cache level" + cVar + "is not supported. ");
        }
        return c.b.FULL_FETCH;
    }

    private c.d.b.a.d n() {
        c.d.j.o.c f2 = f();
        c.d.j.d.f f3 = this.s.f();
        if (f3 == null || f2 == null) {
            return null;
        }
        return f2.f() != null ? f3.b(f2, c()) : f3.a(f2, c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.c.b
    public c.d.e.c<c.d.d.h.a<c.d.j.k.b>> a(c.d.h.h.a aVar, String str, c.d.j.o.c cVar, Object obj, b.c cVar2) {
        return this.s.a(cVar, obj, a(cVar2), b(aVar));
    }

    @Override // c.d.h.h.d
    /* renamed from: a */
    public e mo129a(Uri uri) {
        c.d.j.o.c a2;
        if (uri == null) {
            a2 = null;
        } else {
            c.d.j.o.d b2 = c.d.j.o.d.b(uri);
            b2.a(c.d.j.e.f.f());
            a2 = b2.a();
        }
        super.b((e) a2);
        return this;
    }

    public e a(c.d.h.a.a.i.f fVar) {
        this.w = fVar;
        i();
        return this;
    }

    protected c.d.j.l.c b(c.d.h.h.a aVar) {
        if (aVar instanceof d) {
            return ((d) aVar).p();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.c.b
    /* renamed from: j */
    public d mo130j() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            c.d.h.h.a g2 = g();
            String m = c.d.h.c.b.m();
            d a2 = g2 instanceof d ? (d) g2 : this.t.a();
            a2.a(a(a2, m), m, n(), c(), this.u, this.v);
            a2.a(this.w);
            return a2;
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }
}
