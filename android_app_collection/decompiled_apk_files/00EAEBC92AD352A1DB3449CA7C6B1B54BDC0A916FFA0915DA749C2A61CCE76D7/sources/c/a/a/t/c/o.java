package c.a.a.t.c;

import android.graphics.Matrix;
import android.graphics.PointF;
import c.a.a.t.c.a;
import java.util.Collections;
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f2400a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f2401b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f2402c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f2403d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f2404e;

    /* renamed from: f  reason: collision with root package name */
    private a<PointF, PointF> f2405f;

    /* renamed from: g  reason: collision with root package name */
    private a<?, PointF> f2406g;

    /* renamed from: h  reason: collision with root package name */
    private a<c.a.a.z.d, c.a.a.z.d> f2407h;
    private a<Float, Float> i;
    private a<Integer, Integer> j;
    private c k;
    private c l;
    private a<?, Float> m;
    private a<?, Float> n;

    public o(c.a.a.v.j.l lVar) {
        this.f2405f = lVar.b() == null ? null : lVar.b().mo104a();
        this.f2406g = lVar.e() == null ? null : lVar.e().mo104a();
        this.f2407h = lVar.g() == null ? null : lVar.g().mo104a();
        this.i = lVar.f() == null ? null : lVar.f().mo104a();
        this.k = lVar.h() == null ? null : (c) lVar.h().mo104a();
        if (this.k != null) {
            this.f2401b = new Matrix();
            this.f2402c = new Matrix();
            this.f2403d = new Matrix();
            this.f2404e = new float[9];
        } else {
            this.f2401b = null;
            this.f2402c = null;
            this.f2403d = null;
            this.f2404e = null;
        }
        this.l = lVar.i() == null ? null : (c) lVar.i().mo104a();
        if (lVar.d() != null) {
            this.j = lVar.d().mo104a();
        }
        if (lVar.j() != null) {
            this.m = lVar.j().mo104a();
        } else {
            this.m = null;
        }
        if (lVar.c() != null) {
            this.n = lVar.c().mo104a();
        } else {
            this.n = null;
        }
    }

    private void e() {
        for (int i = 0; i < 9; i++) {
            this.f2404e[i] = 0.0f;
        }
    }

    public Matrix a(float f2) {
        a<?, PointF> aVar = this.f2406g;
        PointF pointF = null;
        PointF mo102f = aVar == null ? null : aVar.mo102f();
        a<c.a.a.z.d, c.a.a.z.d> aVar2 = this.f2407h;
        c.a.a.z.d mo102f2 = aVar2 == null ? null : aVar2.mo102f();
        this.f2400a.reset();
        if (mo102f != null) {
            this.f2400a.preTranslate(mo102f.x * f2, mo102f.y * f2);
        }
        if (mo102f2 != null) {
            double d2 = f2;
            this.f2400a.preScale((float) Math.pow(mo102f2.a(), d2), (float) Math.pow(mo102f2.b(), d2));
        }
        a<Float, Float> aVar3 = this.i;
        if (aVar3 != null) {
            float floatValue = aVar3.mo102f().floatValue();
            a<PointF, PointF> aVar4 = this.f2405f;
            if (aVar4 != null) {
                pointF = aVar4.mo102f();
            }
            Matrix matrix = this.f2400a;
            float f3 = floatValue * f2;
            float f4 = 0.0f;
            float f5 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f4 = pointF.y;
            }
            matrix.preRotate(f3, f5, f4);
        }
        return this.f2400a;
    }

    public a<?, Float> a() {
        return this.n;
    }

    public void a(a.InterfaceC0064a interfaceC0064a) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.a(interfaceC0064a);
        }
        a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a(interfaceC0064a);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.a(interfaceC0064a);
        }
        a<PointF, PointF> aVar4 = this.f2405f;
        if (aVar4 != null) {
            aVar4.a(interfaceC0064a);
        }
        a<?, PointF> aVar5 = this.f2406g;
        if (aVar5 != null) {
            aVar5.a(interfaceC0064a);
        }
        a<c.a.a.z.d, c.a.a.z.d> aVar6 = this.f2407h;
        if (aVar6 != null) {
            aVar6.a(interfaceC0064a);
        }
        a<Float, Float> aVar7 = this.i;
        if (aVar7 != null) {
            aVar7.a(interfaceC0064a);
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.a(interfaceC0064a);
        }
        c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.a(interfaceC0064a);
        }
    }

    public void a(c.a.a.v.l.a aVar) {
        aVar.a(this.j);
        aVar.a(this.m);
        aVar.a(this.n);
        aVar.a(this.f2405f);
        aVar.a(this.f2406g);
        aVar.a(this.f2407h);
        aVar.a(this.i);
        aVar.a(this.k);
        aVar.a(this.l);
    }

    public <T> boolean a(T t, c.a.a.z.c<T> cVar) {
        c cVar2;
        a aVar;
        c cVar3;
        a<?, Float> aVar2;
        if (t == c.a.a.l.f2283e) {
            aVar = this.f2405f;
            if (aVar == null) {
                this.f2405f = new p(cVar, new PointF());
                return true;
            }
        } else if (t == c.a.a.l.f2284f) {
            aVar = this.f2406g;
            if (aVar == null) {
                this.f2406g = new p(cVar, new PointF());
                return true;
            }
        } else if (t == c.a.a.l.k) {
            aVar = this.f2407h;
            if (aVar == null) {
                this.f2407h = new p(cVar, new c.a.a.z.d());
                return true;
            }
        } else if (t == c.a.a.l.l) {
            aVar = this.i;
            if (aVar == null) {
                this.i = new p(cVar, Float.valueOf(0.0f));
                return true;
            }
        } else if (t != c.a.a.l.f2281c) {
            if (t != c.a.a.l.y || (aVar2 = this.m) == null) {
                if (t != c.a.a.l.z || (aVar2 = this.n) == null) {
                    if (t == c.a.a.l.m && (cVar3 = this.k) != null) {
                        if (cVar3 == null) {
                            this.k = new c(Collections.singletonList(new c.a.a.z.a(Float.valueOf(0.0f))));
                        }
                        aVar = this.k;
                    } else if (t != c.a.a.l.n || (cVar2 = this.l) == null) {
                        return false;
                    } else {
                        if (cVar2 == null) {
                            this.l = new c(Collections.singletonList(new c.a.a.z.a(Float.valueOf(0.0f))));
                        }
                        aVar = this.l;
                    }
                } else if (aVar2 == null) {
                    this.n = new p(cVar, 100);
                    return true;
                }
            } else if (aVar2 == null) {
                this.m = new p(cVar, 100);
                return true;
            }
            aVar2.a((c.a.a.z.c<Float>) cVar);
            return true;
        } else {
            aVar = this.j;
            if (aVar == null) {
                this.j = new p(cVar, 100);
                return true;
            }
        }
        aVar.a(cVar);
        return true;
    }

    public Matrix b() {
        this.f2400a.reset();
        a<?, PointF> aVar = this.f2406g;
        if (aVar != null) {
            PointF mo102f = aVar.mo102f();
            if (mo102f.x != 0.0f || mo102f.y != 0.0f) {
                this.f2400a.preTranslate(mo102f.x, mo102f.y);
            }
        }
        a<Float, Float> aVar2 = this.i;
        if (aVar2 != null) {
            float floatValue = aVar2 instanceof p ? aVar2.mo102f().floatValue() : ((c) aVar2).i();
            if (floatValue != 0.0f) {
                this.f2400a.preRotate(floatValue);
            }
        }
        if (this.k != null) {
            c cVar = this.l;
            float cos = cVar == null ? 0.0f : (float) Math.cos(Math.toRadians((-cVar.i()) + 90.0f));
            c cVar2 = this.l;
            float sin = cVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-cVar2.i()) + 90.0f));
            e();
            float[] fArr = this.f2404e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f2401b.setValues(fArr);
            e();
            float[] fArr2 = this.f2404e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians(this.k.i()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f2402c.setValues(fArr2);
            e();
            float[] fArr3 = this.f2404e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f2403d.setValues(fArr3);
            this.f2402c.preConcat(this.f2401b);
            this.f2403d.preConcat(this.f2402c);
            this.f2400a.preConcat(this.f2403d);
        }
        a<c.a.a.z.d, c.a.a.z.d> aVar3 = this.f2407h;
        if (aVar3 != null) {
            c.a.a.z.d mo102f2 = aVar3.mo102f();
            if (mo102f2.a() != 1.0f || mo102f2.b() != 1.0f) {
                this.f2400a.preScale(mo102f2.a(), mo102f2.b());
            }
        }
        a<PointF, PointF> aVar4 = this.f2405f;
        if (aVar4 != null) {
            PointF mo102f3 = aVar4.mo102f();
            if (mo102f3.x != 0.0f || mo102f3.y != 0.0f) {
                this.f2400a.preTranslate(-mo102f3.x, -mo102f3.y);
            }
        }
        return this.f2400a;
    }

    public void b(float f2) {
        a<Integer, Integer> aVar = this.j;
        if (aVar != null) {
            aVar.a(f2);
        }
        a<?, Float> aVar2 = this.m;
        if (aVar2 != null) {
            aVar2.a(f2);
        }
        a<?, Float> aVar3 = this.n;
        if (aVar3 != null) {
            aVar3.a(f2);
        }
        a<PointF, PointF> aVar4 = this.f2405f;
        if (aVar4 != null) {
            aVar4.a(f2);
        }
        a<?, PointF> aVar5 = this.f2406g;
        if (aVar5 != null) {
            aVar5.a(f2);
        }
        a<c.a.a.z.d, c.a.a.z.d> aVar6 = this.f2407h;
        if (aVar6 != null) {
            aVar6.a(f2);
        }
        a<Float, Float> aVar7 = this.i;
        if (aVar7 != null) {
            aVar7.a(f2);
        }
        c cVar = this.k;
        if (cVar != null) {
            cVar.a(f2);
        }
        c cVar2 = this.l;
        if (cVar2 != null) {
            cVar2.a(f2);
        }
    }

    public a<?, Integer> c() {
        return this.j;
    }

    public a<?, Float> d() {
        return this.m;
    }
}
