package c.a.a.v.k;

import android.graphics.PointF;
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f2468a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.v.j.m<PointF, PointF> f2469b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.v.j.f f2470c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2471d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2472e;

    public a(String str, c.a.a.v.j.m<PointF, PointF> mVar, c.a.a.v.j.f fVar, boolean z, boolean z2) {
        this.f2468a = str;
        this.f2469b = mVar;
        this.f2470c = fVar;
        this.f2471d = z;
        this.f2472e = z2;
    }

    @Override // c.a.a.v.k.b
    public c.a.a.t.b.c a(c.a.a.g gVar, c.a.a.v.l.a aVar) {
        return new c.a.a.t.b.f(gVar, aVar, this);
    }

    public String a() {
        return this.f2468a;
    }

    public c.a.a.v.j.m<PointF, PointF> b() {
        return this.f2469b;
    }

    public c.a.a.v.j.f c() {
        return this.f2470c;
    }

    public boolean d() {
        return this.f2472e;
    }

    public boolean e() {
        return this.f2471d;
    }
}
