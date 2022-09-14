package com.facebook.imagepipeline.f;

import android.net.Uri;
import com.facebook.imagepipeline.m.ag;
import com.facebook.imagepipeline.m.aj;
import com.facebook.imagepipeline.m.at;
import com.facebook.imagepipeline.m.au;
import com.facebook.imagepipeline.m.aw;
import com.facebook.imagepipeline.n.b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProducerSequenceFactory.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> f2683a;

    /* renamed from: b  reason: collision with root package name */
    aj<com.facebook.imagepipeline.i.d> f2684b;

    /* renamed from: c  reason: collision with root package name */
    aj<com.facebook.imagepipeline.i.d> f2685c;

    /* renamed from: d  reason: collision with root package name */
    aj<Void> f2686d;
    aj<Void> e;
    aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> f;
    aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> g;
    aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> h;
    aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> i;
    aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> j;
    aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> k;
    aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> l;
    Map<aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>, aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>> m = new HashMap();
    Map<aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>, aj<Void>> n = new HashMap();
    private final l o;
    private final ag p;
    private final boolean q;
    private final boolean r;
    private final at s;
    private final boolean t;
    private aj<com.facebook.imagepipeline.i.d> u;

    public m(l lVar, ag agVar, boolean z, boolean z2, at atVar, boolean z3) {
        this.o = lVar;
        this.p = agVar;
        this.q = z;
        this.r = z2;
        this.s = atVar;
        this.t = z3;
    }

    public aj<Void> a(com.facebook.imagepipeline.n.b bVar) {
        c(bVar);
        int c2 = bVar.c();
        if (c2 == 0) {
            return c();
        }
        switch (c2) {
            case 2:
            case 3:
                return e();
            default:
                Uri b2 = bVar.b();
                throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + a(b2));
        }
    }

    private static void c(com.facebook.imagepipeline.n.b bVar) {
        com.facebook.common.d.i.a(bVar);
        com.facebook.common.d.i.a(bVar.m().a() <= b.EnumC0062b.ENCODED_MEMORY_CACHE.a());
    }

    public aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> b(com.facebook.imagepipeline.n.b bVar) {
        aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> d2 = d(bVar);
        return bVar.p() != null ? f(d2) : d2;
    }

    private aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> d(com.facebook.imagepipeline.n.b bVar) {
        com.facebook.common.d.i.a(bVar);
        Uri b2 = bVar.b();
        com.facebook.common.d.i.a(b2, "Uri is null.");
        int c2 = bVar.c();
        if (c2 == 0) {
            return a();
        }
        switch (c2) {
            case 2:
                return h();
            case 3:
                return g();
            case 4:
                return i();
            case 5:
                return l();
            case 6:
                return k();
            case 7:
                return m();
            case 8:
                return j();
            default:
                throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + a(b2));
        }
    }

    private synchronized aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a() {
        if (this.f2683a == null) {
            this.f2683a = b(d());
        }
        return this.f2683a;
    }

    private synchronized aj<com.facebook.imagepipeline.i.d> b() {
        if (this.f2685c == null) {
            this.f2685c = this.o.a(d(), this.s);
        }
        return this.f2685c;
    }

    private synchronized aj<Void> c() {
        if (this.e == null) {
            this.e = l.m(b());
        }
        return this.e;
    }

    private synchronized aj<com.facebook.imagepipeline.i.d> d() {
        if (this.u == null) {
            this.u = l.a(c(this.o.a(this.p)));
            this.u = this.o.a(this.u, this.q, this.t);
        }
        return this.u;
    }

    private synchronized aj<Void> e() {
        if (this.f2686d == null) {
            this.f2686d = l.m(f());
        }
        return this.f2686d;
    }

    private synchronized aj<com.facebook.imagepipeline.i.d> f() {
        if (this.f2684b == null) {
            this.f2684b = this.o.a(c(this.o.f()), this.s);
        }
        return this.f2684b;
    }

    private synchronized aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> g() {
        if (this.f == null) {
            this.f = a(this.o.f());
        }
        return this.f;
    }

    private synchronized aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> h() {
        if (this.g == null) {
            this.g = e(this.o.i());
        }
        return this.g;
    }

    private synchronized aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> i() {
        if (this.h == null) {
            this.h = a(this.o.c(), new aw[]{this.o.d(), this.o.e()});
        }
        return this.h;
    }

    private synchronized aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> j() {
        if (this.l == null) {
            this.l = a(this.o.g());
        }
        return this.l;
    }

    private synchronized aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> k() {
        if (this.i == null) {
            this.i = a(this.o.h());
        }
        return this.i;
    }

    private synchronized aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> l() {
        if (this.j == null) {
            this.j = a(this.o.b());
        }
        return this.j;
    }

    private synchronized aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> m() {
        if (this.k == null) {
            aj<com.facebook.imagepipeline.i.d> a2 = this.o.a();
            if (com.facebook.common.m.c.f2329a && (!this.r || com.facebook.common.m.c.f2332d == null)) {
                a2 = this.o.o(a2);
            }
            l lVar = this.o;
            this.k = b(this.o.a(l.a(a2), true, this.t));
        }
        return this.k;
    }

    private aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return a(ajVar, new aw[]{this.o.e()});
    }

    private aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a(aj<com.facebook.imagepipeline.i.d> ajVar, aw<com.facebook.imagepipeline.i.d>[] awVarArr) {
        return b(b(c(ajVar), awVarArr));
    }

    private aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> b(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return e(this.o.e(ajVar));
    }

    private aj<com.facebook.imagepipeline.i.d> c(aj<com.facebook.imagepipeline.i.d> ajVar) {
        if (com.facebook.common.m.c.f2329a && (!this.r || com.facebook.common.m.c.f2332d == null)) {
            ajVar = this.o.o(ajVar);
        }
        return this.o.i(this.o.j(d(ajVar)));
    }

    private aj<com.facebook.imagepipeline.i.d> d(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return this.o.f(this.o.h(this.o.g(ajVar)));
    }

    private aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> e(aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar) {
        return this.o.b(this.o.a(this.o.c(this.o.d(ajVar)), this.s));
    }

    private aj<com.facebook.imagepipeline.i.d> b(aj<com.facebook.imagepipeline.i.d> ajVar, aw<com.facebook.imagepipeline.i.d>[] awVarArr) {
        au n = this.o.n(this.o.a(l.a(ajVar), true, this.t));
        l lVar = this.o;
        return l.a(a(awVarArr), n);
    }

    private aj<com.facebook.imagepipeline.i.d> a(aw<com.facebook.imagepipeline.i.d>[] awVarArr) {
        return this.o.a(this.o.a(awVarArr), true, this.t);
    }

    private synchronized aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> f(aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar) {
        if (!this.m.containsKey(ajVar)) {
            this.m.put(ajVar, this.o.k(this.o.l(ajVar)));
        }
        return this.m.get(ajVar);
    }

    private static String a(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() > 30) {
            return valueOf.substring(0, 30) + "...";
        }
        return valueOf;
    }
}
