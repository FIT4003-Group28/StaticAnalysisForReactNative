package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkv  reason: default package */
/* loaded from: classes3.dex */
public final class bkv implements bku, blb, bks {
    private final String b;
    private final bjr c;
    private final boolean d;
    private final blc<?, Float> e;
    private final blc<?, PointF> f;
    private final blc<?, Float> g;
    private final blc<?, Float> h;
    private final blc<?, Float> i;
    private final blc<?, Float> j;
    private final blc<?, Float> k;
    private boolean m;
    private final int n;
    private final Path a = new Path();
    private final bkj l = new bkj();

    public bkv(bjr bjrVar, bnl bnlVar, bmz bmzVar) {
        this.c = bjrVar;
        this.b = bmzVar.a;
        int i = bmzVar.j;
        this.n = i;
        this.d = bmzVar.i;
        blc<Float, Float> a = bmzVar.b.a();
        this.e = a;
        blc<PointF, PointF> a2 = bmzVar.c.a();
        this.f = a2;
        blc<Float, Float> a3 = bmzVar.d.a();
        this.g = a3;
        blc<Float, Float> a4 = bmzVar.f.a();
        this.i = a4;
        blc<Float, Float> a5 = bmzVar.h.a();
        this.k = a5;
        if (i == 1) {
            this.h = bmzVar.e.a();
            this.j = bmzVar.g.a();
        } else {
            this.h = null;
            this.j = null;
        }
        bnlVar.i(a);
        bnlVar.i(a2);
        bnlVar.i(a3);
        bnlVar.i(a4);
        bnlVar.i(a5);
        if (i == 1) {
            bnlVar.i(this.h);
            bnlVar.i(this.j);
        }
        a.a(this);
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        if (i == 1) {
            this.h.a(this);
            this.j.a(this);
        }
    }

    @Override // defpackage.blb
    public final void a() {
        this.m = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        for (int i = 0; i < list.size(); i++) {
            bkk bkkVar = list.get(i);
            if (bkkVar instanceof bla) {
                bla blaVar = (bla) bkkVar;
                if (blaVar.e == 1) {
                    this.l.a(blaVar);
                    blaVar.c(this);
                }
            }
        }
    }

    @Override // defpackage.blz
    public final void e(bly blyVar, int i, List<bly> list, bly blyVar2) {
        bpr.i(blyVar, i, list, blyVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        blc blcVar;
        blc<?, Float> blcVar2;
        blc<?, Float> blcVar3;
        if (t == bjv.s) {
            blcVar = this.e;
        } else if (t == bjv.t) {
            blcVar = this.g;
        } else if (t == bjv.j) {
            blcVar = this.f;
        } else if (t == bjv.u && (blcVar3 = this.h) != null) {
            blcVar3.d = bpvVar;
            return;
        } else if (t == bjv.v) {
            blcVar = this.i;
        } else if (t == bjv.w && (blcVar2 = this.j) != null) {
            blcVar2.d = bpvVar;
            return;
        } else if (t != bjv.x) {
            return;
        } else {
            blcVar = this.k;
        }
        blcVar.d = bpvVar;
    }

    @Override // defpackage.bkk
    public final String g() {
        return this.b;
    }

    @Override // defpackage.bku
    public final Path j() {
        float f;
        float f2;
        float f3;
        double d;
        float f4;
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        double d2;
        float f13;
        float f14;
        double d3;
        double d4;
        double d5;
        if (this.m) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.m = true;
            return this.a;
        }
        int i = this.n;
        if (i == 0) {
            throw null;
        }
        float f15 = 0.0f;
        if (i == 1) {
            float floatValue = this.e.h().floatValue();
            double floatValue2 = this.g.h().floatValue();
            Double.isNaN(floatValue2);
            double radians = Math.toRadians(floatValue2 - 90.0d);
            double d6 = floatValue;
            Double.isNaN(d6);
            float f16 = (float) (6.283185307179586d / d6);
            float f17 = f16 / 2.0f;
            float f18 = floatValue - ((int) floatValue);
            if (f18 != 0.0f) {
                double d7 = (1.0f - f18) * f17;
                Double.isNaN(d7);
                radians += d7;
            }
            float floatValue3 = this.i.h().floatValue();
            float floatValue4 = this.h.h().floatValue();
            blc<?, Float> blcVar = this.j;
            float floatValue5 = blcVar != null ? blcVar.h().floatValue() / 100.0f : 0.0f;
            float floatValue6 = this.k.h().floatValue() / 100.0f;
            if (f18 != 0.0f) {
                float f19 = ((floatValue3 - floatValue4) * f18) + floatValue4;
                double d8 = f19;
                double cos = Math.cos(radians);
                Double.isNaN(d8);
                float f20 = (float) (d8 * cos);
                double sin = Math.sin(radians);
                Double.isNaN(d8);
                f2 = (float) (d8 * sin);
                this.a.moveTo(f20, f2);
                double d9 = (f16 * f18) / 2.0f;
                Double.isNaN(d9);
                d = radians + d9;
                f4 = f19;
                f = f20;
                f3 = f17;
            } else {
                double d10 = floatValue3;
                double cos2 = Math.cos(radians);
                Double.isNaN(d10);
                f = (float) (cos2 * d10);
                double sin2 = Math.sin(radians);
                Double.isNaN(d10);
                f2 = (float) (d10 * sin2);
                this.a.moveTo(f, f2);
                f3 = f17;
                double d11 = f3;
                Double.isNaN(d11);
                d = radians + d11;
                f4 = 0.0f;
            }
            double ceil = Math.ceil(d6);
            double d12 = ceil + ceil;
            float f21 = f3;
            float f22 = f2;
            float f23 = f;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                double d13 = i2;
                if (d13 >= d12) {
                    break;
                }
                float f24 = floatValue3;
                if (true != z2) {
                    z = z2;
                    f5 = floatValue4;
                } else {
                    z = z2;
                    f5 = f24;
                }
                float f25 = (f4 == 0.0f || d13 != d12 + (-2.0d)) ? f21 : (f16 * f18) / 2.0f;
                if (f4 == 0.0f || d13 != d12 - 1.0d) {
                    f6 = f16;
                    f7 = f25;
                    f8 = f4;
                    f9 = f5;
                } else {
                    f6 = f16;
                    f7 = f25;
                    f9 = f4;
                    f8 = f9;
                }
                double d14 = f9;
                double cos3 = Math.cos(d);
                Double.isNaN(d14);
                float f26 = (float) (d14 * cos3);
                double sin3 = Math.sin(d);
                Double.isNaN(d14);
                float f27 = (float) (d14 * sin3);
                if (floatValue5 != 0.0f || floatValue6 != 0.0f) {
                    float f28 = f22;
                    f10 = floatValue6;
                    f11 = floatValue5;
                    float f29 = f23;
                    f12 = floatValue4;
                    double atan2 = (float) (Math.atan2(f28, f29) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin4 = (float) Math.sin(atan2);
                    d2 = d;
                    f13 = f27;
                    double atan22 = (float) (Math.atan2(f27, f26) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin5 = (float) Math.sin(atan22);
                    float f30 = true != z ? f10 : f11;
                    float f31 = true != z ? f11 : f10;
                    float f32 = (true != z ? f24 : f12) * f30 * 0.47829f;
                    float f33 = cos4 * f32;
                    float f34 = f32 * sin4;
                    float f35 = f5 * f31 * 0.47829f;
                    float f36 = cos5 * f35;
                    float f37 = f35 * sin5;
                    if (f18 != 0.0f) {
                        if (i2 == 0) {
                            f33 *= f18;
                            f34 *= f18;
                        } else if (d13 == d12 - 1.0d) {
                            f36 *= f18;
                            f37 *= f18;
                        }
                    }
                    this.a.cubicTo(f29 - f33, f28 - f34, f26 + f36, f13 + f37, f26, f13);
                    f14 = f7;
                } else {
                    this.a.lineTo(f26, f27);
                    d2 = d;
                    f10 = floatValue6;
                    f12 = floatValue4;
                    f11 = floatValue5;
                    f14 = f7;
                    f13 = f27;
                }
                double d15 = f14;
                Double.isNaN(d15);
                d = d2 + d15;
                z2 = !z;
                i2++;
                floatValue6 = f10;
                floatValue4 = f12;
                floatValue3 = f24;
                f4 = f8;
                f23 = f26;
                f22 = f13;
                f16 = f6;
                floatValue5 = f11;
            }
            PointF h = this.f.h();
            this.a.offset(h.x, h.y);
            this.a.close();
        } else {
            double floor = Math.floor(this.e.h().floatValue());
            double floatValue7 = this.g.h().floatValue();
            Double.isNaN(floatValue7);
            double radians2 = Math.toRadians(floatValue7 - 90.0d);
            double d16 = (int) floor;
            float floatValue8 = this.k.h().floatValue() / 100.0f;
            float floatValue9 = this.i.h().floatValue();
            double d17 = floatValue9;
            double cos6 = Math.cos(radians2);
            Double.isNaN(d17);
            float f38 = (float) (d17 * cos6);
            double sin6 = Math.sin(radians2);
            Double.isNaN(d17);
            float f39 = (float) (d17 * sin6);
            this.a.moveTo(f38, f39);
            Double.isNaN(d16);
            double d18 = (float) (6.283185307179586d / d16);
            Double.isNaN(d18);
            double d19 = radians2 + d18;
            double ceil2 = Math.ceil(d16);
            float f40 = f39;
            float f41 = f38;
            int i3 = 0;
            while (i3 < ceil2) {
                double cos7 = Math.cos(d19);
                Double.isNaN(d17);
                float f42 = (float) (cos7 * d17);
                double sin7 = Math.sin(d19);
                Double.isNaN(d17);
                float f43 = (float) (sin7 * d17);
                if (floatValue8 != f15) {
                    d5 = d17;
                    double atan23 = (float) (Math.atan2(f40, f41) - 1.5707963267948966d);
                    d4 = ceil2;
                    d3 = d19;
                    double atan24 = (float) (Math.atan2(f43, f42) - 1.5707963267948966d);
                    float f44 = floatValue9 * floatValue8 * 0.25f;
                    this.a.cubicTo(f41 - (((float) Math.cos(atan23)) * f44), f40 - (((float) Math.sin(atan23)) * f44), f42 + (((float) Math.cos(atan24)) * f44), f43 + (f44 * ((float) Math.sin(atan24))), f42, f43);
                } else {
                    d3 = d19;
                    d4 = ceil2;
                    d5 = d17;
                    this.a.lineTo(f42, f43);
                }
                Double.isNaN(d18);
                d19 = d3 + d18;
                i3++;
                f41 = f42;
                f40 = f43;
                d17 = d5;
                ceil2 = d4;
                f15 = 0.0f;
            }
            PointF h2 = this.f.h();
            this.a.offset(h2.x, h2.y);
            this.a.close();
        }
        this.a.close();
        this.l.b(this.a);
        this.m = true;
        return this.a;
    }
}
