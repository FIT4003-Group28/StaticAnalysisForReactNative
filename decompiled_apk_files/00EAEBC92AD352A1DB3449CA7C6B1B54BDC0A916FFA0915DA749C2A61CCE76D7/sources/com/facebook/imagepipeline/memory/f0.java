package com.facebook.imagepipeline.memory;
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f5235a;

    /* renamed from: b  reason: collision with root package name */
    private d f5236b;

    /* renamed from: c  reason: collision with root package name */
    private j f5237c;

    /* renamed from: d  reason: collision with root package name */
    private q f5238d;

    /* renamed from: e  reason: collision with root package name */
    private a0 f5239e;

    /* renamed from: f  reason: collision with root package name */
    private c.d.d.g.h f5240f;

    /* renamed from: g  reason: collision with root package name */
    private c.d.d.g.k f5241g;

    /* renamed from: h  reason: collision with root package name */
    private c.d.d.g.a f5242h;

    public f0(e0 e0Var) {
        c.d.d.d.i.a(e0Var);
        this.f5235a = e0Var;
    }

    private v b(int i) {
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException("Invalid MemoryChunkType");
            }
            return b();
        }
        return e();
    }

    public c.d.d.g.h a(int i) {
        if (this.f5240f == null) {
            this.f5240f = new y(b(i), g());
        }
        return this.f5240f;
    }

    public d a() {
        d oVar;
        if (this.f5236b == null) {
            String e2 = this.f5235a.e();
            char c2 = 65535;
            switch (e2.hashCode()) {
                case -1868884870:
                    if (e2.equals("legacy_default_params")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1106578487:
                    if (e2.equals("legacy")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (e2.equals("experimental")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (e2.equals("dummy_with_tracking")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (e2.equals("dummy")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                oVar = new o();
            } else if (c2 == 1) {
                oVar = new p();
            } else if (c2 != 2) {
                oVar = c2 != 3 ? new h(this.f5235a.i(), this.f5235a.c(), this.f5235a.d()) : new h(this.f5235a.i(), k.a(), this.f5235a.d());
            } else {
                oVar = new s(this.f5235a.b(), this.f5235a.a(), b0.c(), this.f5235a.l() ? this.f5235a.i() : null);
            }
            this.f5236b = oVar;
        }
        return this.f5236b;
    }

    public j b() {
        if (this.f5237c == null) {
            this.f5237c = new j(this.f5235a.i(), this.f5235a.g(), this.f5235a.h());
        }
        return this.f5237c;
    }

    public q c() {
        if (this.f5238d == null) {
            this.f5238d = new q(this.f5235a.i(), this.f5235a.f());
        }
        return this.f5238d;
    }

    public int d() {
        return this.f5235a.f().f5254e;
    }

    public a0 e() {
        if (this.f5239e == null) {
            this.f5239e = new a0(this.f5235a.i(), this.f5235a.g(), this.f5235a.h());
        }
        return this.f5239e;
    }

    public c.d.d.g.h f() {
        return a(0);
    }

    public c.d.d.g.k g() {
        if (this.f5241g == null) {
            this.f5241g = new c.d.d.g.k(h());
        }
        return this.f5241g;
    }

    public c.d.d.g.a h() {
        if (this.f5242h == null) {
            this.f5242h = new r(this.f5235a.i(), this.f5235a.j(), this.f5235a.k());
        }
        return this.f5242h;
    }
}
