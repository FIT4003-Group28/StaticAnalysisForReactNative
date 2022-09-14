package com.facebook.imagepipeline.memory;
/* compiled from: PoolConfig.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final t f2965a;

    /* renamed from: b  reason: collision with root package name */
    private final u f2966b;

    /* renamed from: c  reason: collision with root package name */
    private final t f2967c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.g.c f2968d;
    private final t e;
    private final u f;
    private final t g;
    private final u h;

    private r(a aVar) {
        t tVar;
        u uVar;
        t tVar2;
        com.facebook.common.g.c cVar;
        t tVar3;
        u uVar2;
        t tVar4;
        u uVar3;
        if (aVar.f2969a == null) {
            tVar = f.a();
        } else {
            tVar = aVar.f2969a;
        }
        this.f2965a = tVar;
        if (aVar.f2970b == null) {
            uVar = p.a();
        } else {
            uVar = aVar.f2970b;
        }
        this.f2966b = uVar;
        if (aVar.f2971c == null) {
            tVar2 = h.a();
        } else {
            tVar2 = aVar.f2971c;
        }
        this.f2967c = tVar2;
        if (aVar.f2972d == null) {
            cVar = com.facebook.common.g.d.a();
        } else {
            cVar = aVar.f2972d;
        }
        this.f2968d = cVar;
        if (aVar.e == null) {
            tVar3 = i.a();
        } else {
            tVar3 = aVar.e;
        }
        this.e = tVar3;
        if (aVar.f == null) {
            uVar2 = p.a();
        } else {
            uVar2 = aVar.f;
        }
        this.f = uVar2;
        if (aVar.g == null) {
            tVar4 = g.a();
        } else {
            tVar4 = aVar.g;
        }
        this.g = tVar4;
        if (aVar.h == null) {
            uVar3 = p.a();
        } else {
            uVar3 = aVar.h;
        }
        this.h = uVar3;
    }

    public t a() {
        return this.f2965a;
    }

    public u b() {
        return this.f2966b;
    }

    public com.facebook.common.g.c c() {
        return this.f2968d;
    }

    public t d() {
        return this.e;
    }

    public u e() {
        return this.f;
    }

    public t f() {
        return this.f2967c;
    }

    public t g() {
        return this.g;
    }

    public u h() {
        return this.h;
    }

    public static a i() {
        return new a();
    }

    /* compiled from: PoolConfig.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private t f2969a;

        /* renamed from: b  reason: collision with root package name */
        private u f2970b;

        /* renamed from: c  reason: collision with root package name */
        private t f2971c;

        /* renamed from: d  reason: collision with root package name */
        private com.facebook.common.g.c f2972d;
        private t e;
        private u f;
        private t g;
        private u h;

        private a() {
        }

        public r a() {
            return new r(this);
        }
    }
}
