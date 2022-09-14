package c.d.j.f;

import android.content.Context;
import android.os.Build;
import c.d.j.d.o;
import c.d.j.n.t0;
/* loaded from: classes.dex */
public class k {
    private static final Class<?> t = k.class;
    private static k u;

    /* renamed from: a  reason: collision with root package name */
    private final t0 f3325a;

    /* renamed from: b  reason: collision with root package name */
    private final i f3326b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3327c;

    /* renamed from: d  reason: collision with root package name */
    private c.d.j.d.h<c.d.b.a.d, c.d.j.k.b> f3328d;

    /* renamed from: e  reason: collision with root package name */
    private o<c.d.b.a.d, c.d.j.k.b> f3329e;

    /* renamed from: f  reason: collision with root package name */
    private c.d.j.d.h<c.d.b.a.d, c.d.d.g.g> f3330f;

    /* renamed from: g  reason: collision with root package name */
    private o<c.d.b.a.d, c.d.d.g.g> f3331g;

    /* renamed from: h  reason: collision with root package name */
    private c.d.j.d.e f3332h;
    private c.d.b.b.i i;
    private c.d.j.i.c j;
    private h k;
    private c.d.j.q.d l;
    private m m;
    private n n;
    private c.d.j.d.e o;
    private c.d.b.b.i p;
    private c.d.j.c.f q;
    private com.facebook.imagepipeline.platform.f r;
    private c.d.j.a.a.a s;

    public k(i iVar) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("ImagePipelineConfig()");
        }
        c.d.d.d.i.a(iVar);
        this.f3326b = iVar;
        this.f3325a = new t0(iVar.i().b());
        this.f3327c = new a(iVar.f());
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    public static synchronized void a(i iVar) {
        synchronized (k.class) {
            if (u != null) {
                c.d.d.e.a.c(t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            u = new k(iVar);
        }
    }

    public static synchronized void b(Context context) {
        synchronized (k.class) {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("ImagePipelineFactory#initialize");
            }
            a(i.b(context).a());
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }

    private c.d.j.a.a.a l() {
        if (this.s == null) {
            this.s = c.d.j.a.a.b.a(i(), this.f3326b.i(), a(), this.f3326b.j().p());
        }
        return this.s;
    }

    private c.d.j.i.c m() {
        c.d.j.i.c cVar;
        c.d.j.i.c cVar2;
        if (this.j == null) {
            if (this.f3326b.m() != null) {
                this.j = this.f3326b.m();
            } else {
                c.d.j.a.a.a l = l();
                if (l != null) {
                    cVar2 = l.b(this.f3326b.a());
                    cVar = l.a(this.f3326b.a());
                } else {
                    cVar = null;
                    cVar2 = null;
                }
                if (this.f3326b.n() != null) {
                    j();
                    this.f3326b.n().a();
                    throw null;
                }
                this.j = new c.d.j.i.b(cVar2, cVar, j());
            }
        }
        return this.j;
    }

    private c.d.j.q.d n() {
        if (this.l == null) {
            this.l = (this.f3326b.o() == null && this.f3326b.p() == null && this.f3326b.j().m()) ? new c.d.j.q.h(this.f3326b.j().d()) : new c.d.j.q.f(this.f3326b.j().d(), this.f3326b.j().g(), this.f3326b.o(), this.f3326b.p());
        }
        return this.l;
    }

    public static k o() {
        k kVar = u;
        c.d.d.d.i.a(kVar, "ImagePipelineFactory was not initialized!");
        return kVar;
    }

    private m p() {
        if (this.m == null) {
            this.m = this.f3326b.j().e().a(this.f3326b.g(), this.f3326b.v().h(), m(), this.f3326b.w(), this.f3326b.A(), this.f3326b.B(), this.f3326b.j().j(), this.f3326b.i(), this.f3326b.v().a(this.f3326b.s()), b(), e(), g(), r(), this.f3326b.d(), i(), this.f3326b.j().c(), this.f3326b.j().b(), this.f3326b.j().a(), this.f3326b.j().d(), c());
        }
        return this.m;
    }

    private n q() {
        boolean z = Build.VERSION.SDK_INT >= 24 && this.f3326b.j().f();
        if (this.n == null) {
            this.n = new n(this.f3326b.g().getApplicationContext().getContentResolver(), p(), this.f3326b.u(), this.f3326b.B(), this.f3326b.j().o(), this.f3325a, this.f3326b.A(), z, this.f3326b.j().n(), this.f3326b.z(), n());
        }
        return this.n;
    }

    private c.d.j.d.e r() {
        if (this.o == null) {
            this.o = new c.d.j.d.e(k(), this.f3326b.v().a(this.f3326b.s()), this.f3326b.v().g(), this.f3326b.i().c(), this.f3326b.i().e(), this.f3326b.l());
        }
        return this.o;
    }

    public c.d.j.d.h<c.d.b.a.d, c.d.j.k.b> a() {
        if (this.f3328d == null) {
            this.f3328d = c.d.j.d.a.a(this.f3326b.b(), this.f3326b.t(), this.f3326b.c());
        }
        return this.f3328d;
    }

    public c.d.j.j.a a(Context context) {
        c.d.j.a.a.a l = l();
        if (l == null) {
            return null;
        }
        return l.a(context);
    }

    public o<c.d.b.a.d, c.d.j.k.b> b() {
        if (this.f3329e == null) {
            this.f3329e = c.d.j.d.b.a(a(), this.f3326b.l());
        }
        return this.f3329e;
    }

    public a c() {
        return this.f3327c;
    }

    public c.d.j.d.h<c.d.b.a.d, c.d.d.g.g> d() {
        if (this.f3330f == null) {
            this.f3330f = c.d.j.d.l.a(this.f3326b.h(), this.f3326b.t());
        }
        return this.f3330f;
    }

    public o<c.d.b.a.d, c.d.d.g.g> e() {
        if (this.f3331g == null) {
            this.f3331g = c.d.j.d.m.a(d(), this.f3326b.l());
        }
        return this.f3331g;
    }

    public h f() {
        if (this.k == null) {
            this.k = new h(q(), this.f3326b.x(), this.f3326b.q(), b(), e(), g(), r(), this.f3326b.d(), this.f3325a, c.d.d.d.m.a(false), this.f3326b.j().l(), this.f3326b.e());
        }
        return this.k;
    }

    public c.d.j.d.e g() {
        if (this.f3332h == null) {
            this.f3332h = new c.d.j.d.e(h(), this.f3326b.v().a(this.f3326b.s()), this.f3326b.v().g(), this.f3326b.i().c(), this.f3326b.i().e(), this.f3326b.l());
        }
        return this.f3332h;
    }

    public c.d.b.b.i h() {
        if (this.i == null) {
            this.i = this.f3326b.k().a(this.f3326b.r());
        }
        return this.i;
    }

    public c.d.j.c.f i() {
        if (this.q == null) {
            this.q = c.d.j.c.g.a(this.f3326b.v(), j(), c());
        }
        return this.q;
    }

    public com.facebook.imagepipeline.platform.f j() {
        if (this.r == null) {
            this.r = com.facebook.imagepipeline.platform.g.a(this.f3326b.v(), this.f3326b.j().k());
        }
        return this.r;
    }

    public c.d.b.b.i k() {
        if (this.p == null) {
            this.p = this.f3326b.k().a(this.f3326b.y());
        }
        return this.p;
    }
}
