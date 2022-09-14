package c.d.j.f;

import android.content.Context;
import c.d.d.l.b;
import c.d.j.d.p;
import c.d.j.f.i;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3309a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f3310b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3311c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.d.l.b f3312d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3313e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3314f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3315g;

    /* renamed from: h  reason: collision with root package name */
    private final int f3316h;
    private boolean i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final d m;
    private final c.d.d.d.l<Boolean> n;
    private final boolean o;
    private final boolean p;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: b  reason: collision with root package name */
        private b.a f3318b;

        /* renamed from: d  reason: collision with root package name */
        private c.d.d.l.b f3320d;
        private d m;
        public c.d.d.d.l<Boolean> n;
        public boolean o;
        public boolean p;

        /* renamed from: a  reason: collision with root package name */
        private boolean f3317a = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3319c = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f3321e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3322f = false;

        /* renamed from: g  reason: collision with root package name */
        private int f3323g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f3324h = 0;
        public boolean i = false;
        private int j = 2048;
        private boolean k = false;
        private boolean l = false;

        public b(i.b bVar) {
        }

        public j a() {
            return new j(this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements d {
        @Override // c.d.j.f.j.d
        public m a(Context context, c.d.d.g.a aVar, c.d.j.i.c cVar, c.d.j.i.e eVar, boolean z, boolean z2, boolean z3, f fVar, c.d.d.g.h hVar, p<c.d.b.a.d, c.d.j.k.b> pVar, p<c.d.b.a.d, c.d.d.g.g> pVar2, c.d.j.d.e eVar2, c.d.j.d.e eVar3, c.d.j.d.f fVar2, c.d.j.c.f fVar3, int i, int i2, boolean z4, int i3, c.d.j.f.a aVar2) {
            return new m(context, aVar, cVar, eVar, z, z2, z3, fVar, hVar, pVar, pVar2, eVar2, eVar3, fVar2, fVar3, i, i2, z4, i3, aVar2);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        m a(Context context, c.d.d.g.a aVar, c.d.j.i.c cVar, c.d.j.i.e eVar, boolean z, boolean z2, boolean z3, f fVar, c.d.d.g.h hVar, p<c.d.b.a.d, c.d.j.k.b> pVar, p<c.d.b.a.d, c.d.d.g.g> pVar2, c.d.j.d.e eVar2, c.d.j.d.e eVar3, c.d.j.d.f fVar2, c.d.j.c.f fVar3, int i, int i2, boolean z4, int i3, c.d.j.f.a aVar2);
    }

    private j(b bVar) {
        this.f3309a = bVar.f3317a;
        this.f3310b = bVar.f3318b;
        this.f3311c = bVar.f3319c;
        this.f3312d = bVar.f3320d;
        this.f3313e = bVar.f3321e;
        this.f3314f = bVar.f3322f;
        this.f3315g = bVar.f3323g;
        this.f3316h = bVar.f3324h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m == null ? new c() : bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
    }

    public boolean a() {
        return this.i;
    }

    public int b() {
        return this.f3316h;
    }

    public int c() {
        return this.f3315g;
    }

    public int d() {
        return this.j;
    }

    public d e() {
        return this.m;
    }

    public boolean f() {
        return this.f3314f;
    }

    public boolean g() {
        return this.f3313e;
    }

    public c.d.d.l.b h() {
        return this.f3312d;
    }

    public b.a i() {
        return this.f3310b;
    }

    public boolean j() {
        return this.f3311c;
    }

    public boolean k() {
        return this.o;
    }

    public c.d.d.d.l<Boolean> l() {
        return this.n;
    }

    public boolean m() {
        return this.k;
    }

    public boolean n() {
        return this.l;
    }

    public boolean o() {
        return this.f3309a;
    }

    public boolean p() {
        return this.p;
    }
}
