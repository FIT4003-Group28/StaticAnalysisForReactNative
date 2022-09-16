package com.facebook.imagepipeline.f;

import android.content.Context;
import android.os.Build;
import android.support.v4.i.j;
import com.facebook.imagepipeline.d.n;
import com.facebook.imagepipeline.d.r;
import com.facebook.imagepipeline.d.t;
import com.facebook.imagepipeline.d.y;
import com.facebook.imagepipeline.m.at;
import com.facebook.imagepipeline.memory.s;
/* compiled from: ImagePipelineFactory.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static j f2672a;

    /* renamed from: b  reason: collision with root package name */
    private final at f2673b;

    /* renamed from: c  reason: collision with root package name */
    private final h f2674c;

    /* renamed from: d  reason: collision with root package name */
    private com.facebook.imagepipeline.d.h<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> f2675d;
    private t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> e;
    private com.facebook.imagepipeline.d.h<com.facebook.b.a.d, com.facebook.common.g.g> f;
    private t<com.facebook.b.a.d, com.facebook.common.g.g> g;
    private com.facebook.imagepipeline.d.e h;
    private com.facebook.b.b.i i;
    private com.facebook.imagepipeline.h.b j;
    private g k;
    private l l;
    private m m;
    private com.facebook.imagepipeline.d.e n;
    private com.facebook.b.b.i o;
    private r p;
    private com.facebook.imagepipeline.c.f q;
    private com.facebook.imagepipeline.k.e r;
    private com.facebook.imagepipeline.a.a.b s;

    public static j a() {
        return (j) com.facebook.common.d.i.a(f2672a, "ImagePipelineFactory was not initialized!");
    }

    public static void a(Context context) {
        a(h.a(context).a());
    }

    public static void a(h hVar) {
        f2672a = new j(hVar);
    }

    public j(h hVar) {
        this.f2674c = (h) com.facebook.common.d.i.a(hVar);
        this.f2673b = new at(hVar.i().e());
    }

    public com.facebook.imagepipeline.a.a.b b() {
        if (this.s == null) {
            this.s = com.facebook.imagepipeline.a.a.c.a(j(), this.f2674c.i());
        }
        return this.s;
    }

    public com.facebook.imagepipeline.d.h<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> c() {
        if (this.f2675d == null) {
            this.f2675d = com.facebook.imagepipeline.d.a.a(this.f2674c.b(), this.f2674c.n(), j(), this.f2674c.v().a());
        }
        return this.f2675d;
    }

    public t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> d() {
        if (this.e == null) {
            this.e = com.facebook.imagepipeline.d.b.a(c(), this.f2674c.j());
        }
        return this.e;
    }

    public com.facebook.imagepipeline.d.h<com.facebook.b.a.d, com.facebook.common.g.g> e() {
        if (this.f == null) {
            this.f = com.facebook.imagepipeline.d.m.a(this.f2674c.h(), this.f2674c.n(), j());
        }
        return this.f;
    }

    public t<com.facebook.b.a.d, com.facebook.common.g.g> f() {
        if (this.g == null) {
            this.g = n.a(e(), this.f2674c.j());
        }
        return this.g;
    }

    private com.facebook.imagepipeline.h.b n() {
        if (this.j == null) {
            if (this.f2674c.k() != null) {
                this.j = this.f2674c.k();
            } else {
                com.facebook.imagepipeline.a.a.d a2 = b() != null ? b().a() : null;
                if (this.f2674c.u() == null) {
                    this.j = new com.facebook.imagepipeline.h.a(a2, k(), this.f2674c.a());
                } else {
                    this.j = new com.facebook.imagepipeline.h.a(a2, k(), this.f2674c.a(), this.f2674c.u().a());
                    com.facebook.h.d.a().a(this.f2674c.u().b());
                }
            }
        }
        return this.j;
    }

    public com.facebook.imagepipeline.d.e g() {
        if (this.h == null) {
            this.h = new com.facebook.imagepipeline.d.e(h(), this.f2674c.p().e(), this.f2674c.p().f(), this.f2674c.i().a(), this.f2674c.i().b(), this.f2674c.j());
        }
        return this.h;
    }

    public com.facebook.b.b.i h() {
        if (this.i == null) {
            this.i = this.f2674c.f().a(this.f2674c.m());
        }
        return this.i;
    }

    public g i() {
        if (this.k == null) {
            this.k = new g(p(), this.f2674c.r(), this.f2674c.l(), d(), f(), g(), q(), this.f2674c.c(), this.f2673b, com.facebook.common.d.l.a(false));
        }
        return this.k;
    }

    public static com.facebook.imagepipeline.c.f a(s sVar, com.facebook.imagepipeline.k.e eVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new com.facebook.imagepipeline.c.a(sVar.a());
        }
        if (Build.VERSION.SDK_INT >= 11) {
            return new com.facebook.imagepipeline.c.e(new com.facebook.imagepipeline.c.b(sVar.e()), eVar);
        }
        return new com.facebook.imagepipeline.c.c();
    }

    public com.facebook.imagepipeline.c.f j() {
        if (this.q == null) {
            this.q = a(this.f2674c.p(), k());
        }
        return this.q;
    }

    public static com.facebook.imagepipeline.k.e a(s sVar, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            int c2 = sVar.c();
            return new com.facebook.imagepipeline.k.a(sVar.a(), c2, new j.b(c2));
        } else if (z && Build.VERSION.SDK_INT < 19) {
            return new com.facebook.imagepipeline.k.c();
        } else {
            return new com.facebook.imagepipeline.k.d(sVar.b());
        }
    }

    public com.facebook.imagepipeline.k.e k() {
        if (this.r == null) {
            this.r = a(this.f2674c.p(), this.f2674c.v().f());
        }
        return this.r;
    }

    private l o() {
        if (this.l == null) {
            this.l = new l(this.f2674c.d(), this.f2674c.p().g(), n(), this.f2674c.q(), this.f2674c.g(), this.f2674c.s(), this.f2674c.v().g(), this.f2674c.i(), this.f2674c.p().e(), d(), f(), g(), q(), m(), this.f2674c.v().d(), this.f2674c.c(), j(), this.f2674c.v().b());
        }
        return this.l;
    }

    private m p() {
        if (this.m == null) {
            this.m = new m(o(), this.f2674c.o(), this.f2674c.s(), this.f2674c.v().f(), this.f2673b, this.f2674c.v().e());
        }
        return this.m;
    }

    public com.facebook.b.b.i l() {
        if (this.o == null) {
            this.o = this.f2674c.f().a(this.f2674c.t());
        }
        return this.o;
    }

    private com.facebook.imagepipeline.d.e q() {
        if (this.n == null) {
            this.n = new com.facebook.imagepipeline.d.e(l(), this.f2674c.p().e(), this.f2674c.p().f(), this.f2674c.i().a(), this.f2674c.i().b(), this.f2674c.j());
        }
        return this.n;
    }

    public r m() {
        if (this.p == null) {
            this.p = this.f2674c.v().c() ? new com.facebook.imagepipeline.d.s(this.f2674c.d(), this.f2674c.i().a(), this.f2674c.i().b()) : new y();
        }
        return this.p;
    }
}
