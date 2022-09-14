package com.facebook.imagepipeline.f;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.d.aa;
import com.facebook.imagepipeline.d.q;
import com.facebook.imagepipeline.d.r;
import com.facebook.imagepipeline.d.t;
import com.facebook.imagepipeline.d.z;
import com.facebook.imagepipeline.m.ab;
import com.facebook.imagepipeline.m.ac;
import com.facebook.imagepipeline.m.ad;
import com.facebook.imagepipeline.m.af;
import com.facebook.imagepipeline.m.ag;
import com.facebook.imagepipeline.m.ah;
import com.facebook.imagepipeline.m.ai;
import com.facebook.imagepipeline.m.aj;
import com.facebook.imagepipeline.m.an;
import com.facebook.imagepipeline.m.ao;
import com.facebook.imagepipeline.m.ar;
import com.facebook.imagepipeline.m.as;
import com.facebook.imagepipeline.m.at;
import com.facebook.imagepipeline.m.au;
import com.facebook.imagepipeline.m.av;
import com.facebook.imagepipeline.m.aw;
import com.facebook.imagepipeline.m.ay;
import com.facebook.imagepipeline.m.n;
import com.facebook.imagepipeline.m.o;
import com.facebook.imagepipeline.m.v;
import com.facebook.imagepipeline.m.w;
import com.facebook.imagepipeline.m.x;
import com.facebook.imagepipeline.m.y;
/* compiled from: ProducerFactory.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private ContentResolver f2679a;

    /* renamed from: b  reason: collision with root package name */
    private Resources f2680b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager f2681c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.g.a f2682d;
    private final com.facebook.imagepipeline.h.b e;
    private final com.facebook.imagepipeline.h.d f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final e j;
    private final com.facebook.common.g.h k;
    private final com.facebook.imagepipeline.d.e l;
    private final com.facebook.imagepipeline.d.e m;
    private final com.facebook.imagepipeline.d.l n;
    private final t<com.facebook.b.a.d, com.facebook.common.g.g> o;
    private final t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> p;
    private final com.facebook.imagepipeline.d.f q;
    private final r r;
    private final q s;
    private final com.facebook.imagepipeline.c.f t;

    public l(Context context, com.facebook.common.g.a aVar, com.facebook.imagepipeline.h.b bVar, com.facebook.imagepipeline.h.d dVar, boolean z, boolean z2, boolean z3, e eVar, com.facebook.common.g.h hVar, t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> tVar, t<com.facebook.b.a.d, com.facebook.common.g.g> tVar2, com.facebook.imagepipeline.d.e eVar2, com.facebook.imagepipeline.d.e eVar3, r rVar, q qVar, com.facebook.imagepipeline.d.f fVar, com.facebook.imagepipeline.c.f fVar2, int i) {
        this.f2679a = context.getApplicationContext().getContentResolver();
        this.f2680b = context.getApplicationContext().getResources();
        this.f2681c = context.getApplicationContext().getAssets();
        this.f2682d = aVar;
        this.e = bVar;
        this.f = dVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = eVar;
        this.k = hVar;
        this.p = tVar;
        this.o = tVar2;
        this.l = eVar2;
        this.m = eVar3;
        this.r = rVar;
        this.s = qVar;
        this.q = fVar;
        this.t = fVar2;
        if (i > 0) {
            this.n = new aa(eVar2, eVar3, fVar, i);
        } else {
            this.n = new z(eVar2, eVar3, fVar);
        }
    }

    public static com.facebook.imagepipeline.m.a a(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return new com.facebook.imagepipeline.m.a(ajVar);
    }

    public com.facebook.imagepipeline.m.f b(aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar) {
        return new com.facebook.imagepipeline.m.f(this.p, this.q, ajVar);
    }

    public com.facebook.imagepipeline.m.g c(aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar) {
        return new com.facebook.imagepipeline.m.g(this.q, ajVar);
    }

    public com.facebook.imagepipeline.m.h d(aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar) {
        return new com.facebook.imagepipeline.m.h(this.p, this.q, ajVar);
    }

    public static com.facebook.imagepipeline.m.i a(aj<com.facebook.imagepipeline.i.d> ajVar, aj<com.facebook.imagepipeline.i.d> ajVar2) {
        return new com.facebook.imagepipeline.m.i(ajVar, ajVar2);
    }

    public com.facebook.imagepipeline.m.k a() {
        return new com.facebook.imagepipeline.m.k(this.k);
    }

    public com.facebook.imagepipeline.m.l e(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return new com.facebook.imagepipeline.m.l(this.f2682d, this.j.c(), this.e, this.f, this.g, this.h, this.i, ajVar);
    }

    public n f(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return new n(ajVar, this.n);
    }

    public o g(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return new o(ajVar, this.n);
    }

    public ad h(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return new ad(this.l, this.m, this.q, this.r, this.s, this.n, ajVar);
    }

    public com.facebook.imagepipeline.m.q i(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return new com.facebook.imagepipeline.m.q(this.q, ajVar);
    }

    public com.facebook.imagepipeline.m.r j(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return new com.facebook.imagepipeline.m.r(this.o, this.q, ajVar);
    }

    public v b() {
        return new v(this.j.a(), this.k, this.f2681c);
    }

    public w c() {
        return new w(this.j.a(), this.k, this.f2679a);
    }

    public x d() {
        return new x(this.j.a(), this.k, this.f2679a);
    }

    public y e() {
        return new y(this.j.a(), this.k, this.f2679a);
    }

    public av a(aw<com.facebook.imagepipeline.i.d>[] awVarArr) {
        return new av(awVarArr);
    }

    public com.facebook.imagepipeline.m.aa f() {
        return new com.facebook.imagepipeline.m.aa(this.j.a(), this.k);
    }

    public an g() {
        return new an(this.j.a(), this.k, this.f2679a);
    }

    public ab h() {
        return new ab(this.j.a(), this.k, this.f2680b);
    }

    public ac i() {
        return new ac(this.j.a());
    }

    public af a(ag agVar) {
        return new af(this.k, this.f2682d, agVar);
    }

    public ah k(aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar) {
        return new ah(this.p, this.q, ajVar);
    }

    public ai l(aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> ajVar) {
        return new ai(ajVar, this.t, this.j.d());
    }

    public ao a(aj<com.facebook.imagepipeline.i.d> ajVar, boolean z, boolean z2) {
        return new ao(this.j.d(), this.k, z && !this.g, ajVar, z2);
    }

    public static <T> ar<T> m(aj<T> ajVar) {
        return new ar<>(ajVar);
    }

    public <T> as<T> a(aj<T> ajVar, at atVar) {
        return new as<>(ajVar, atVar);
    }

    public <T> au<T> n(aj<T> ajVar) {
        return new au<>(5, this.j.e(), ajVar);
    }

    public ay o(aj<com.facebook.imagepipeline.i.d> ajVar) {
        return new ay(this.j.d(), this.k, ajVar);
    }
}
