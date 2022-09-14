package com.facebook.imagepipeline.memory;
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final g0 f5214a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f5215b;

    /* renamed from: c  reason: collision with root package name */
    private final g0 f5216c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.d.g.c f5217d;

    /* renamed from: e  reason: collision with root package name */
    private final g0 f5218e;

    /* renamed from: f  reason: collision with root package name */
    private final h0 f5219f;

    /* renamed from: g  reason: collision with root package name */
    private final g0 f5220g;

    /* renamed from: h  reason: collision with root package name */
    private final h0 f5221h;
    private final String i;
    private final int j;
    private final int k;
    private final boolean l;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private g0 f5222a;

        /* renamed from: b  reason: collision with root package name */
        private h0 f5223b;

        /* renamed from: c  reason: collision with root package name */
        private g0 f5224c;

        /* renamed from: d  reason: collision with root package name */
        private c.d.d.g.c f5225d;

        /* renamed from: e  reason: collision with root package name */
        private g0 f5226e;

        /* renamed from: f  reason: collision with root package name */
        private h0 f5227f;

        /* renamed from: g  reason: collision with root package name */
        private g0 f5228g;

        /* renamed from: h  reason: collision with root package name */
        private h0 f5229h;
        private String i;
        private int j;
        private int k;
        private boolean l;

        private b() {
        }

        public e0 a() {
            return new e0(this);
        }
    }

    private e0(b bVar) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("PoolConfig()");
        }
        this.f5214a = bVar.f5222a == null ? k.a() : bVar.f5222a;
        this.f5215b = bVar.f5223b == null ? b0.c() : bVar.f5223b;
        this.f5216c = bVar.f5224c == null ? m.a() : bVar.f5224c;
        this.f5217d = bVar.f5225d == null ? c.d.d.g.d.a() : bVar.f5225d;
        this.f5218e = bVar.f5226e == null ? n.a() : bVar.f5226e;
        this.f5219f = bVar.f5227f == null ? b0.c() : bVar.f5227f;
        this.f5220g = bVar.f5228g == null ? l.a() : bVar.f5228g;
        this.f5221h = bVar.f5229h == null ? b0.c() : bVar.f5229h;
        this.i = bVar.i == null ? "legacy" : bVar.i;
        this.j = bVar.j;
        this.k = bVar.k > 0 ? bVar.k : 4194304;
        this.l = bVar.l;
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    public static b m() {
        return new b();
    }

    public int a() {
        return this.k;
    }

    public int b() {
        return this.j;
    }

    public g0 c() {
        return this.f5214a;
    }

    public h0 d() {
        return this.f5215b;
    }

    public String e() {
        return this.i;
    }

    public g0 f() {
        return this.f5216c;
    }

    public g0 g() {
        return this.f5218e;
    }

    public h0 h() {
        return this.f5219f;
    }

    public c.d.d.g.c i() {
        return this.f5217d;
    }

    public g0 j() {
        return this.f5220g;
    }

    public h0 k() {
        return this.f5221h;
    }

    public boolean l() {
        return this.l;
    }
}
