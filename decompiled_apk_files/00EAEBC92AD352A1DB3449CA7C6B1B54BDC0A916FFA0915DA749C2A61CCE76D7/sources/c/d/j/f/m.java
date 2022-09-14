package c.d.j.f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import c.d.j.d.p;
import c.d.j.n.a0;
import c.d.j.n.b0;
import c.d.j.n.c0;
import c.d.j.n.e0;
import c.d.j.n.f0;
import c.d.j.n.g0;
import c.d.j.n.h0;
import c.d.j.n.i0;
import c.d.j.n.j0;
import c.d.j.n.n0;
import c.d.j.n.o;
import c.d.j.n.o0;
import c.d.j.n.q;
import c.d.j.n.r;
import c.d.j.n.r0;
import c.d.j.n.s0;
import c.d.j.n.t0;
import c.d.j.n.u0;
import c.d.j.n.v;
import c.d.j.n.v0;
import c.d.j.n.w;
import c.d.j.n.w0;
import c.d.j.n.x;
import c.d.j.n.y;
import c.d.j.n.y0;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private ContentResolver f3339a;

    /* renamed from: b  reason: collision with root package name */
    private Resources f3340b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager f3341c;

    /* renamed from: d  reason: collision with root package name */
    private final c.d.d.g.a f3342d;

    /* renamed from: e  reason: collision with root package name */
    private final c.d.j.i.c f3343e;

    /* renamed from: f  reason: collision with root package name */
    private final c.d.j.i.e f3344f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f3345g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f3346h;
    private final boolean i;
    private final f j;
    private final c.d.d.g.h k;
    private final c.d.j.d.e l;
    private final c.d.j.d.e m;
    private final p<c.d.b.a.d, c.d.d.g.g> n;
    private final p<c.d.b.a.d, c.d.j.k.b> o;
    private final c.d.j.d.f p;
    private final c.d.j.c.f q;
    private final int r;
    private final int s;
    private boolean t;
    private final a u;
    private final int v;

    public m(Context context, c.d.d.g.a aVar, c.d.j.i.c cVar, c.d.j.i.e eVar, boolean z, boolean z2, boolean z3, f fVar, c.d.d.g.h hVar, p<c.d.b.a.d, c.d.j.k.b> pVar, p<c.d.b.a.d, c.d.d.g.g> pVar2, c.d.j.d.e eVar2, c.d.j.d.e eVar3, c.d.j.d.f fVar2, c.d.j.c.f fVar3, int i, int i2, boolean z4, int i3, a aVar2) {
        this.f3339a = context.getApplicationContext().getContentResolver();
        this.f3340b = context.getApplicationContext().getResources();
        this.f3341c = context.getApplicationContext().getAssets();
        this.f3342d = aVar;
        this.f3343e = cVar;
        this.f3344f = eVar;
        this.f3345g = z;
        this.f3346h = z2;
        this.i = z3;
        this.j = fVar;
        this.k = hVar;
        this.o = pVar;
        this.n = pVar2;
        this.l = eVar2;
        this.m = eVar3;
        this.p = fVar2;
        this.q = fVar3;
        this.r = i;
        this.s = i2;
        this.t = z4;
        this.v = i3;
        this.u = aVar2;
    }

    public static c.d.j.n.j a(j0<c.d.j.k.d> j0Var, j0<c.d.j.k.d> j0Var2) {
        return new c.d.j.n.j(j0Var, j0Var2);
    }

    public static c.d.j.n.a o(j0<c.d.j.k.d> j0Var) {
        return new c.d.j.n.a(j0Var);
    }

    public static <T> r0<T> p(j0<T> j0Var) {
        return new r0<>(j0Var);
    }

    public e0 a(f0 f0Var) {
        return new e0(this.k, this.f3342d, f0Var);
    }

    public c.d.j.n.f a(j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        return new c.d.j.n.f(this.o, this.p, j0Var);
    }

    public c.d.j.n.l a() {
        return new c.d.j.n.l(this.k);
    }

    public o0 a(j0<c.d.j.k.d> j0Var, boolean z, c.d.j.q.d dVar) {
        return new o0(this.j.d(), this.k, j0Var, z, dVar);
    }

    public <T> s0<T> a(j0<T> j0Var, t0 t0Var) {
        return new s0<>(j0Var, t0Var);
    }

    public v0 a(w0<c.d.j.k.d>[] w0VarArr) {
        return new v0(w0VarArr);
    }

    public c.d.j.n.g b(j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        return new c.d.j.n.g(this.p, j0Var);
    }

    public v b() {
        return new v(this.j.c(), this.k, this.f3341c);
    }

    public c.d.j.n.h c(j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        return new c.d.j.n.h(this.o, this.p, j0Var);
    }

    public w c() {
        return new w(this.j.c(), this.k, this.f3339a);
    }

    public c.d.j.n.i d(j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        return new c.d.j.n.i(j0Var, this.r, this.s, this.t);
    }

    public x d() {
        return new x(this.j.c(), this.k, this.f3339a);
    }

    public c.d.j.n.m e(j0<c.d.j.k.d> j0Var) {
        return new c.d.j.n.m(this.f3342d, this.j.a(), this.f3343e, this.f3344f, this.f3345g, this.f3346h, this.i, j0Var, this.v, this.u);
    }

    public y e() {
        return new y(this.j.c(), this.k, this.f3339a);
    }

    public a0 f() {
        return new a0(this.j.c(), this.k);
    }

    public o f(j0<c.d.j.k.d> j0Var) {
        return new o(this.l, this.m, this.p, j0Var);
    }

    public b0 g() {
        return new b0(this.j.c(), this.k, this.f3340b);
    }

    public c.d.j.n.p g(j0<c.d.j.k.d> j0Var) {
        return new c.d.j.n.p(this.l, this.m, this.p, j0Var);
    }

    public c0 h() {
        return new c0(this.j.c(), this.f3339a);
    }

    public q h(j0<c.d.j.k.d> j0Var) {
        return new q(this.p, j0Var);
    }

    public n0 i() {
        return new n0(this.j.c(), this.k, this.f3339a);
    }

    public r i(j0<c.d.j.k.d> j0Var) {
        return new r(this.n, this.p, j0Var);
    }

    public g0 j(j0<c.d.j.k.d> j0Var) {
        return new g0(this.l, this.p, this.k, this.f3342d, j0Var);
    }

    public h0 k(j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        return new h0(this.o, this.p, j0Var);
    }

    public i0 l(j0<c.d.d.h.a<c.d.j.k.b>> j0Var) {
        return new i0(j0Var, this.q, this.j.d());
    }

    public <T> u0<T> m(j0<T> j0Var) {
        return new u0<>(5, this.j.b(), j0Var);
    }

    public y0 n(j0<c.d.j.k.d> j0Var) {
        return new y0(this.j.d(), this.k, j0Var);
    }
}
