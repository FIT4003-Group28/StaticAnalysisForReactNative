package c.d.j.f;

import android.content.Context;
import android.graphics.Bitmap;
import c.d.d.l.b;
import c.d.j.d.h;
import c.d.j.d.q;
import c.d.j.f.j;
import c.d.j.n.f0;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class i {
    private static c D = new c(null);
    private final boolean A;
    private final c.d.c.a B;
    private final c.d.j.h.a C;

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap.Config f3292a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.d.d.l<q> f3293b;

    /* renamed from: c  reason: collision with root package name */
    private final h.c f3294c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.j.d.f f3295d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f3296e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3297f;

    /* renamed from: g  reason: collision with root package name */
    private final g f3298g;

    /* renamed from: h  reason: collision with root package name */
    private final c.d.d.d.l<q> f3299h;
    private final f i;
    private final c.d.j.d.n j;
    private final c.d.j.i.c k;
    private final c.d.j.q.d l;
    private final Integer m;
    private final c.d.d.d.l<Boolean> n;
    private final c.d.b.b.c o;
    private final c.d.d.g.c p;
    private final int q;
    private final f0 r;
    private final int s;
    private final com.facebook.imagepipeline.memory.f0 t;
    private final c.d.j.i.e u;
    private final Set<c.d.j.l.c> v;
    private final boolean w;
    private final c.d.b.b.c x;
    private final c.d.j.i.d y;
    private final j z;

    /* loaded from: classes.dex */
    class a implements c.d.d.d.l<Boolean> {
        a(i iVar) {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // c.d.d.d.l
        /* renamed from: get */
        public Boolean mo139get() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        private final j.b A;
        private boolean B;
        private c.d.c.a C;
        private c.d.j.h.a D;

        /* renamed from: a  reason: collision with root package name */
        private Bitmap.Config f3300a;

        /* renamed from: b  reason: collision with root package name */
        private c.d.d.d.l<q> f3301b;

        /* renamed from: c  reason: collision with root package name */
        private h.c f3302c;

        /* renamed from: d  reason: collision with root package name */
        private c.d.j.d.f f3303d;

        /* renamed from: e  reason: collision with root package name */
        private final Context f3304e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3305f;

        /* renamed from: g  reason: collision with root package name */
        private c.d.d.d.l<q> f3306g;

        /* renamed from: h  reason: collision with root package name */
        private f f3307h;
        private c.d.j.d.n i;
        private c.d.j.i.c j;
        private c.d.j.q.d k;
        private Integer l;
        private c.d.d.d.l<Boolean> m;
        private c.d.b.b.c n;
        private c.d.d.g.c o;
        private Integer p;
        private f0 q;
        private c.d.j.c.f r;
        private com.facebook.imagepipeline.memory.f0 s;
        private c.d.j.i.e t;
        private Set<c.d.j.l.c> u;
        private boolean v;
        private c.d.b.b.c w;
        private g x;
        private c.d.j.i.d y;
        private int z;

        private b(Context context) {
            this.f3305f = false;
            this.l = null;
            this.p = null;
            this.v = true;
            this.z = -1;
            this.A = new j.b(this);
            this.B = true;
            this.D = new c.d.j.h.b();
            c.d.d.d.i.a(context);
            this.f3304e = context;
        }

        /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public b a(f0 f0Var) {
            this.q = f0Var;
            return this;
        }

        public b a(Set<c.d.j.l.c> set) {
            this.u = set;
            return this;
        }

        public b a(boolean z) {
            this.f3305f = z;
            return this;
        }

        public i a() {
            return new i(this, null);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private boolean f3308a;

        private c() {
            this.f3308a = false;
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public boolean a() {
            return this.f3308a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private i(c.d.j.f.i.b r4) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.j.f.i.<init>(c.d.j.f.i$b):void");
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    public static c C() {
        return D;
    }

    private static int a(b bVar, j jVar) {
        return bVar.p != null ? bVar.p.intValue() : jVar.m() ? 1 : 0;
    }

    private static c.d.b.b.c a(Context context) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return c.d.b.b.c.a(context).a();
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }

    private static c.d.j.q.d a(b bVar) {
        if (bVar.k == null || bVar.l == null) {
            if (bVar.k == null) {
                return null;
            }
            return bVar.k;
        }
        throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
    }

    private static void a(c.d.d.l.b bVar, j jVar, c.d.d.l.a aVar) {
        c.d.d.l.c.f2871b = bVar;
        b.a i = jVar.i();
        if (i != null) {
            bVar.a(i);
        }
        if (aVar != null) {
            bVar.a(aVar);
        }
    }

    public static b b(Context context) {
        return new b(context, null);
    }

    public boolean A() {
        return this.f3297f;
    }

    public boolean B() {
        return this.w;
    }

    public Bitmap.Config a() {
        return this.f3292a;
    }

    public c.d.d.d.l<q> b() {
        return this.f3293b;
    }

    public h.c c() {
        return this.f3294c;
    }

    public c.d.j.d.f d() {
        return this.f3295d;
    }

    public c.d.c.a e() {
        return this.B;
    }

    public c.d.j.h.a f() {
        return this.C;
    }

    public Context g() {
        return this.f3296e;
    }

    public c.d.d.d.l<q> h() {
        return this.f3299h;
    }

    public f i() {
        return this.i;
    }

    public j j() {
        return this.z;
    }

    public g k() {
        return this.f3298g;
    }

    public c.d.j.d.n l() {
        return this.j;
    }

    public c.d.j.i.c m() {
        return this.k;
    }

    public c.d.j.i.d n() {
        return this.y;
    }

    public c.d.j.q.d o() {
        return this.l;
    }

    public Integer p() {
        return this.m;
    }

    public c.d.d.d.l<Boolean> q() {
        return this.n;
    }

    public c.d.b.b.c r() {
        return this.o;
    }

    public int s() {
        return this.q;
    }

    public c.d.d.g.c t() {
        return this.p;
    }

    public f0 u() {
        return this.r;
    }

    public com.facebook.imagepipeline.memory.f0 v() {
        return this.t;
    }

    public c.d.j.i.e w() {
        return this.u;
    }

    public Set<c.d.j.l.c> x() {
        return Collections.unmodifiableSet(this.v);
    }

    public c.d.b.b.c y() {
        return this.x;
    }

    public boolean z() {
        return this.A;
    }
}
