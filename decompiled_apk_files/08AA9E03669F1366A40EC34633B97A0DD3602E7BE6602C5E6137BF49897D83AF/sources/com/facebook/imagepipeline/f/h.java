package com.facebook.imagepipeline.f;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.common.m.b;
import com.facebook.imagepipeline.d.o;
import com.facebook.imagepipeline.d.u;
import com.facebook.imagepipeline.d.x;
import com.facebook.imagepipeline.f.i;
import com.facebook.imagepipeline.m.ag;
import com.facebook.imagepipeline.m.t;
import com.facebook.imagepipeline.memory.r;
import com.facebook.imagepipeline.memory.s;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ImagePipelineConfig.java */
/* loaded from: classes.dex */
public class h {
    private static b x = new b();

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.a.a.d f2653a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f2654b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.common.d.k<u> f2655c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.imagepipeline.d.f f2656d;
    private final Context e;
    private final boolean f;
    private final f g;
    private final com.facebook.common.d.k<u> h;
    private final e i;
    private final o j;
    private final com.facebook.imagepipeline.h.b k;
    private final com.facebook.common.d.k<Boolean> l;
    private final com.facebook.b.b.c m;
    private final com.facebook.common.g.c n;
    private final ag o;
    private final com.facebook.imagepipeline.c.f p;
    private final s q;
    private final com.facebook.imagepipeline.h.d r;
    private final Set<com.facebook.imagepipeline.j.c> s;
    private final boolean t;
    private final com.facebook.b.b.c u;
    private final com.facebook.imagepipeline.h.c v;
    private final i w;

    private h(a aVar) {
        com.facebook.imagepipeline.d.f fVar;
        o oVar;
        com.facebook.common.g.c cVar;
        s sVar;
        com.facebook.common.m.b a2;
        this.w = aVar.w.a();
        this.f2653a = aVar.f2658a;
        this.f2655c = aVar.f2660c == null ? new com.facebook.imagepipeline.d.i((ActivityManager) aVar.e.getSystemService("activity")) : aVar.f2660c;
        this.f2654b = aVar.f2659b == null ? Bitmap.Config.ARGB_8888 : aVar.f2659b;
        if (aVar.f2661d == null) {
            fVar = com.facebook.imagepipeline.d.j.a();
        } else {
            fVar = aVar.f2661d;
        }
        this.f2656d = fVar;
        this.e = (Context) com.facebook.common.d.i.a(aVar.e);
        this.g = aVar.u == null ? new com.facebook.imagepipeline.f.b(new d()) : aVar.u;
        this.f = aVar.f;
        this.h = aVar.g == null ? new com.facebook.imagepipeline.d.k() : aVar.g;
        if (aVar.i == null) {
            oVar = x.i();
        } else {
            oVar = aVar.i;
        }
        this.j = oVar;
        this.k = aVar.j;
        this.l = aVar.k == null ? new com.facebook.common.d.k<Boolean>() { // from class: com.facebook.imagepipeline.f.h.1
            @Override // com.facebook.common.d.k
            /* renamed from: a */
            public Boolean b() {
                return true;
            }
        } : aVar.k;
        this.m = aVar.l == null ? b(aVar.e) : aVar.l;
        if (aVar.m == null) {
            cVar = com.facebook.common.g.d.a();
        } else {
            cVar = aVar.m;
        }
        this.n = cVar;
        this.o = aVar.n == null ? new t() : aVar.n;
        this.p = aVar.o;
        if (aVar.p == null) {
            sVar = new s(r.i().a());
        } else {
            sVar = aVar.p;
        }
        this.q = sVar;
        this.r = aVar.q == null ? new com.facebook.imagepipeline.h.f() : aVar.q;
        this.s = aVar.r == null ? new HashSet<>() : aVar.r;
        this.t = aVar.s;
        this.u = aVar.t == null ? this.m : aVar.t;
        this.v = aVar.v;
        this.i = aVar.h == null ? new com.facebook.imagepipeline.f.a(this.q.c()) : aVar.h;
        com.facebook.common.m.b i = this.w.i();
        if (i != null) {
            a(i, this.w, new com.facebook.imagepipeline.c.d(p()));
        } else if (!this.w.f() || !com.facebook.common.m.c.f2329a || (a2 = com.facebook.common.m.c.a()) == null) {
        } else {
            a(a2, this.w, new com.facebook.imagepipeline.c.d(p()));
        }
    }

    private static void a(com.facebook.common.m.b bVar, i iVar, com.facebook.common.m.a aVar) {
        com.facebook.common.m.c.f2332d = bVar;
        b.a h = iVar.h();
        if (h != null) {
            bVar.a(h);
        }
        if (aVar != null) {
            bVar.a(aVar);
        }
    }

    private static com.facebook.b.b.c b(Context context) {
        return com.facebook.b.b.c.a(context).a();
    }

    public Bitmap.Config a() {
        return this.f2654b;
    }

    public com.facebook.common.d.k<u> b() {
        return this.f2655c;
    }

    public com.facebook.imagepipeline.d.f c() {
        return this.f2656d;
    }

    public Context d() {
        return this.e;
    }

    public static b e() {
        return x;
    }

    public f f() {
        return this.g;
    }

    public boolean g() {
        return this.f;
    }

    public com.facebook.common.d.k<u> h() {
        return this.h;
    }

    public e i() {
        return this.i;
    }

    public o j() {
        return this.j;
    }

    public com.facebook.imagepipeline.h.b k() {
        return this.k;
    }

    public com.facebook.common.d.k<Boolean> l() {
        return this.l;
    }

    public com.facebook.b.b.c m() {
        return this.m;
    }

    public com.facebook.common.g.c n() {
        return this.n;
    }

    public ag o() {
        return this.o;
    }

    public s p() {
        return this.q;
    }

    public com.facebook.imagepipeline.h.d q() {
        return this.r;
    }

    public Set<com.facebook.imagepipeline.j.c> r() {
        return Collections.unmodifiableSet(this.s);
    }

    public boolean s() {
        return this.t;
    }

    public com.facebook.b.b.c t() {
        return this.u;
    }

    public com.facebook.imagepipeline.h.c u() {
        return this.v;
    }

    public i v() {
        return this.w;
    }

    public static a a(Context context) {
        return new a(context);
    }

    /* compiled from: ImagePipelineConfig.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2662a;

        private b() {
            this.f2662a = false;
        }

        public boolean a() {
            return this.f2662a;
        }
    }

    /* compiled from: ImagePipelineConfig.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private com.facebook.imagepipeline.a.a.d f2658a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap.Config f2659b;

        /* renamed from: c  reason: collision with root package name */
        private com.facebook.common.d.k<u> f2660c;

        /* renamed from: d  reason: collision with root package name */
        private com.facebook.imagepipeline.d.f f2661d;
        private final Context e;
        private boolean f;
        private com.facebook.common.d.k<u> g;
        private e h;
        private o i;
        private com.facebook.imagepipeline.h.b j;
        private com.facebook.common.d.k<Boolean> k;
        private com.facebook.b.b.c l;
        private com.facebook.common.g.c m;
        private ag n;
        private com.facebook.imagepipeline.c.f o;
        private s p;
        private com.facebook.imagepipeline.h.d q;
        private Set<com.facebook.imagepipeline.j.c> r;
        private boolean s;
        private com.facebook.b.b.c t;
        private f u;
        private com.facebook.imagepipeline.h.c v;
        private final i.a w;

        private a(Context context) {
            this.f = false;
            this.s = true;
            this.w = new i.a(this);
            this.e = (Context) com.facebook.common.d.i.a(context);
        }

        public a a(boolean z) {
            this.f = z;
            return this;
        }

        public a a(ag agVar) {
            this.n = agVar;
            return this;
        }

        public a a(Set<com.facebook.imagepipeline.j.c> set) {
            this.r = set;
            return this;
        }

        public h a() {
            return new h(this);
        }
    }
}
