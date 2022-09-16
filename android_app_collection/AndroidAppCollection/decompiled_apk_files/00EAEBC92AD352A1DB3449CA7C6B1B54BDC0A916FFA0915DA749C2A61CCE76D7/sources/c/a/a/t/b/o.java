package c.a.a.t.b;

import android.graphics.Path;
import android.graphics.PointF;
import c.a.a.t.c.a;
import c.a.a.v.k.i;
import c.a.a.v.k.q;
import java.util.List;
/* loaded from: classes.dex */
public class o implements n, a.InterfaceC0064a, k {

    /* renamed from: b  reason: collision with root package name */
    private final String f2353b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.g f2354c;

    /* renamed from: d  reason: collision with root package name */
    private final i.a f2355d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2356e;

    /* renamed from: f  reason: collision with root package name */
    private final c.a.a.t.c.a<?, Float> f2357f;

    /* renamed from: g  reason: collision with root package name */
    private final c.a.a.t.c.a<?, PointF> f2358g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a.a.t.c.a<?, Float> f2359h;
    private final c.a.a.t.c.a<?, Float> i;
    private final c.a.a.t.c.a<?, Float> j;
    private final c.a.a.t.c.a<?, Float> k;
    private final c.a.a.t.c.a<?, Float> l;
    private boolean n;

    /* renamed from: a  reason: collision with root package name */
    private final Path f2352a = new Path();
    private b m = new b();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2360a = new int[i.a.values().length];

        static {
            try {
                f2360a[i.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2360a[i.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.i iVar) {
        c.a.a.t.c.a<Float, Float> aVar2;
        this.f2354c = gVar;
        this.f2353b = iVar.c();
        this.f2355d = iVar.i();
        this.f2356e = iVar.j();
        this.f2357f = iVar.f().mo104a();
        this.f2358g = iVar.g().mo104a();
        this.f2359h = iVar.h().mo104a();
        this.j = iVar.d().mo104a();
        this.l = iVar.e().mo104a();
        if (this.f2355d == i.a.STAR) {
            this.i = iVar.a().mo104a();
            aVar2 = iVar.b().mo104a();
        } else {
            aVar2 = null;
            this.i = null;
        }
        this.k = aVar2;
        aVar.a(this.f2357f);
        aVar.a(this.f2358g);
        aVar.a(this.f2359h);
        aVar.a(this.j);
        aVar.a(this.l);
        if (this.f2355d == i.a.STAR) {
            aVar.a(this.i);
            aVar.a(this.k);
        }
        this.f2357f.a(this);
        this.f2358g.a(this);
        this.f2359h.a(this);
        this.j.a(this);
        this.l.a(this);
        if (this.f2355d == i.a.STAR) {
            this.i.a(this);
            this.k.a(this);
        }
    }

    private void c() {
        c.a.a.t.c.a<?, Float> aVar;
        double d2;
        double d3;
        double d4;
        int i;
        int floor = (int) Math.floor(this.f2357f.mo102f().floatValue());
        double radians = Math.toRadians((this.f2359h == null ? 0.0d : aVar.mo102f().floatValue()) - 90.0d);
        double d5 = floor;
        float floatValue = this.l.mo102f().floatValue() / 100.0f;
        float floatValue2 = this.j.mo102f().floatValue();
        double d6 = floatValue2;
        float cos = (float) (Math.cos(radians) * d6);
        float sin = (float) (Math.sin(radians) * d6);
        this.f2352a.moveTo(cos, sin);
        double d7 = (float) (6.283185307179586d / d5);
        double d8 = radians + d7;
        double ceil = Math.ceil(d5);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d8) * d6);
            double d9 = ceil;
            float sin2 = (float) (d6 * Math.sin(d8));
            if (floatValue != 0.0f) {
                d3 = d6;
                i = i2;
                d2 = d8;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d4 = d7;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f2 = floatValue2 * floatValue * 0.25f;
                this.f2352a.cubicTo(cos - (cos3 * f2), sin - (((float) Math.sin(atan2)) * f2), cos2 + (((float) Math.cos(atan22)) * f2), sin2 + (f2 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d2 = d8;
                d3 = d6;
                d4 = d7;
                i = i2;
                this.f2352a.lineTo(cos2, sin2);
            }
            d8 = d2 + d4;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d9;
            d6 = d3;
            d7 = d4;
        }
        PointF mo102f = this.f2358g.mo102f();
        this.f2352a.offset(mo102f.x, mo102f.y);
        this.f2352a.close();
    }

    private void d() {
        c.a.a.t.c.a<?, Float> aVar;
        double d2;
        int i;
        double d3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float floatValue = this.f2357f.mo102f().floatValue();
        double radians = Math.toRadians((this.f2359h == null ? 0.0d : aVar.mo102f().floatValue()) - 90.0d);
        double d4 = floatValue;
        float f14 = (float) (6.283185307179586d / d4);
        float f15 = f14 / 2.0f;
        float f16 = floatValue - ((int) floatValue);
        int i2 = (f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f16) * f15;
        }
        float floatValue2 = this.j.mo102f().floatValue();
        float floatValue3 = this.i.mo102f().floatValue();
        c.a.a.t.c.a<?, Float> aVar2 = this.k;
        float floatValue4 = aVar2 != null ? aVar2.mo102f().floatValue() / 100.0f : 0.0f;
        c.a.a.t.c.a<?, Float> aVar3 = this.l;
        float floatValue5 = aVar3 != null ? aVar3.mo102f().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f4 = ((floatValue2 - floatValue3) * f16) + floatValue3;
            i = i2;
            double d5 = f4;
            d2 = d4;
            f2 = (float) (d5 * Math.cos(radians));
            f3 = (float) (d5 * Math.sin(radians));
            this.f2352a.moveTo(f2, f3);
            d3 = radians + ((f14 * f16) / 2.0f);
        } else {
            d2 = d4;
            i = i2;
            double d6 = floatValue2;
            float cos = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.f2352a.moveTo(cos, sin);
            d3 = radians + f15;
            f2 = cos;
            f3 = sin;
            f4 = 0.0f;
        }
        double ceil = Math.ceil(d2) * 2.0d;
        boolean z = false;
        double d7 = d3;
        float f17 = f15;
        int i3 = 0;
        while (true) {
            double d8 = i3;
            if (d8 >= ceil) {
                PointF mo102f = this.f2358g.mo102f();
                this.f2352a.offset(mo102f.x, mo102f.y);
                this.f2352a.close();
                return;
            }
            float f18 = z ? floatValue2 : floatValue3;
            int i4 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i4 == 0 || d8 != ceil - 2.0d) {
                f5 = f17;
            } else {
                f5 = f17;
                f17 = (f14 * f16) / 2.0f;
            }
            if (i4 == 0 || d8 != ceil - 1.0d) {
                f6 = f14;
                f7 = floatValue3;
                f8 = f18;
                f9 = floatValue2;
            } else {
                f6 = f14;
                f9 = floatValue2;
                f7 = floatValue3;
                f8 = f4;
            }
            double d9 = f8;
            float f19 = f17;
            float cos2 = (float) (d9 * Math.cos(d7));
            float sin2 = (float) (d9 * Math.sin(d7));
            if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                this.f2352a.lineTo(cos2, sin2);
                f13 = sin2;
                f10 = floatValue4;
                f11 = floatValue5;
                f12 = f4;
            } else {
                f10 = floatValue4;
                f11 = floatValue5;
                double atan2 = (float) (Math.atan2(f3, f2) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f12 = f4;
                f13 = sin2;
                float f20 = f2;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f21 = z ? f10 : f11;
                float f22 = z ? f11 : f10;
                float f23 = (z ? f7 : f9) * f21 * 0.47829f;
                float f24 = cos3 * f23;
                float f25 = f23 * sin3;
                float f26 = (z ? f9 : f7) * f22 * 0.47829f;
                float f27 = cos4 * f26;
                float f28 = f26 * sin4;
                if (i != 0) {
                    if (i3 == 0) {
                        f24 *= f16;
                        f25 *= f16;
                    } else if (d8 == ceil - 1.0d) {
                        f27 *= f16;
                        f28 *= f16;
                    }
                }
                this.f2352a.cubicTo(f20 - f24, f3 - f25, cos2 + f27, f13 + f28, cos2, f13);
            }
            d7 += f19;
            z = !z;
            i3++;
            f2 = cos2;
            f4 = f12;
            floatValue2 = f9;
            f14 = f6;
            f17 = f5;
            floatValue3 = f7;
            floatValue4 = f10;
            floatValue5 = f11;
            f3 = f13;
        }
    }

    private void e() {
        this.n = false;
        this.f2354c.invalidateSelf();
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        e();
    }

    @Override // c.a.a.v.f
    public void a(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
        c.a.a.y.g.a(eVar, i, list, eVar2, this);
    }

    @Override // c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        c.a.a.t.c.a aVar;
        c.a.a.t.c.a<?, Float> aVar2;
        if (t == c.a.a.l.s) {
            aVar = this.f2357f;
        } else if (t == c.a.a.l.t) {
            aVar = this.f2359h;
        } else if (t != c.a.a.l.j) {
            if (t != c.a.a.l.u || (aVar2 = this.i) == null) {
                if (t == c.a.a.l.v) {
                    aVar = this.j;
                } else if (t != c.a.a.l.w || (aVar2 = this.k) == null) {
                    if (t != c.a.a.l.x) {
                        return;
                    }
                    aVar = this.l;
                }
            }
            aVar2.a((c.a.a.z.c<Float>) cVar);
            return;
        } else {
            aVar = this.f2358g;
        }
        aVar.a(cVar);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f() == q.a.SIMULTANEOUSLY) {
                    this.m.a(tVar);
                    tVar.a(this);
                }
            }
        }
    }

    @Override // c.a.a.t.b.n
    public Path b() {
        if (this.n) {
            return this.f2352a;
        }
        this.f2352a.reset();
        if (!this.f2356e) {
            int i = a.f2360a[this.f2355d.ordinal()];
            if (i == 1) {
                d();
            } else if (i == 2) {
                c();
            }
            this.f2352a.close();
            this.m.a(this.f2352a);
        }
        this.n = true;
        return this.f2352a;
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.f2353b;
    }
}
