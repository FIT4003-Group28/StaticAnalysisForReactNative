package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
/* compiled from: PG */
/* renamed from: blq  reason: default package */
/* loaded from: classes3.dex */
public final class blq {
    public blc<PointF, PointF> a;
    public blc<?, PointF> b;
    public blc<bpw, bpw> c;
    public blc<Float, Float> d;
    public blc<Integer, Integer> e;
    public final ble f;
    public final ble g;
    public final blc<?, Float> h;
    public final blc<?, Float> i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public blq(bmo bmoVar) {
        bmh bmhVar = bmoVar.a;
        this.a = bmhVar == null ? null : bmhVar.a();
        bmp<PointF, PointF> bmpVar = bmoVar.b;
        this.b = bmpVar == null ? null : bmpVar.a();
        bmj bmjVar = bmoVar.c;
        this.c = bmjVar == null ? null : bmjVar.a();
        bme bmeVar = bmoVar.d;
        this.d = bmeVar == null ? null : bmeVar.a();
        bme bmeVar2 = bmoVar.f;
        ble bleVar = (ble) (bmeVar2 == null ? null : bmeVar2.a());
        this.f = bleVar;
        if (bleVar != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        bme bmeVar3 = bmoVar.g;
        this.g = (ble) (bmeVar3 == null ? null : bmeVar3.a());
        bmg bmgVar = bmoVar.e;
        if (bmgVar != null) {
            this.e = bmgVar.a();
        }
        bme bmeVar4 = bmoVar.h;
        if (bmeVar4 != null) {
            this.h = bmeVar4.a();
        } else {
            this.h = null;
        }
        bme bmeVar5 = bmoVar.i;
        if (bmeVar5 != null) {
            this.i = bmeVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final void a(bnl bnlVar) {
        bnlVar.i(this.e);
        bnlVar.i(this.h);
        bnlVar.i(this.i);
        bnlVar.i(this.a);
        bnlVar.i(this.b);
        bnlVar.i(this.c);
        bnlVar.i(this.d);
        bnlVar.i(this.f);
        bnlVar.i(this.g);
    }

    public final void b(blb blbVar) {
        blc<Integer, Integer> blcVar = this.e;
        if (blcVar != null) {
            blcVar.a(blbVar);
        }
        blc<?, Float> blcVar2 = this.h;
        if (blcVar2 != null) {
            blcVar2.a(blbVar);
        }
        blc<?, Float> blcVar3 = this.i;
        if (blcVar3 != null) {
            blcVar3.a(blbVar);
        }
        blc<PointF, PointF> blcVar4 = this.a;
        if (blcVar4 != null) {
            blcVar4.a(blbVar);
        }
        blc<?, PointF> blcVar5 = this.b;
        if (blcVar5 != null) {
            blcVar5.a(blbVar);
        }
        blc<bpw, bpw> blcVar6 = this.c;
        if (blcVar6 != null) {
            blcVar6.a(blbVar);
        }
        blc<Float, Float> blcVar7 = this.d;
        if (blcVar7 != null) {
            blcVar7.a(blbVar);
        }
        ble bleVar = this.f;
        if (bleVar != null) {
            bleVar.a(blbVar);
        }
        ble bleVar2 = this.g;
        if (bleVar2 != null) {
            bleVar2.a(blbVar);
        }
    }

    public final Matrix c() {
        float k;
        this.j.reset();
        blc<?, PointF> blcVar = this.b;
        if (blcVar != null) {
            PointF h = blcVar.h();
            if (h.x != 0.0f || h.y != 0.0f) {
                this.j.preTranslate(h.x, h.y);
            }
        }
        blc<Float, Float> blcVar2 = this.d;
        if (blcVar2 != null) {
            if (blcVar2 instanceof blr) {
                k = blcVar2.h().floatValue();
            } else {
                k = ((ble) blcVar2).k();
            }
            if (k != 0.0f) {
                this.j.preRotate(k);
            }
        }
        if (this.f != null) {
            ble bleVar = this.g;
            float cos = bleVar == null ? 0.0f : (float) Math.cos(Math.toRadians((-bleVar.k()) + 90.0f));
            ble bleVar2 = this.g;
            float sin = bleVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-bleVar2.k()) + 90.0f));
            double tan = Math.tan(Math.toRadians(this.f.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = cos;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.k.setValues(fArr);
            f();
            float[] fArr2 = this.n;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.l.setValues(fArr2);
            f();
            float[] fArr3 = this.n;
            fArr3[0] = cos;
            fArr3[1] = f;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.m.setValues(fArr3);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            this.j.preConcat(this.m);
        }
        blc<bpw, bpw> blcVar3 = this.c;
        if (blcVar3 != null) {
            bpw h2 = blcVar3.h();
            float f2 = h2.a;
            if (f2 != 1.0f || h2.b != 1.0f) {
                this.j.preScale(f2, h2.b);
            }
        }
        blc<PointF, PointF> blcVar4 = this.a;
        if (blcVar4 != null) {
            PointF h3 = blcVar4.h();
            if (h3.x != 0.0f || h3.y != 0.0f) {
                this.j.preTranslate(-h3.x, -h3.y);
            }
        }
        return this.j;
    }

    public final Matrix d(float f) {
        blc<?, PointF> blcVar = this.b;
        PointF pointF = null;
        PointF h = blcVar == null ? null : blcVar.h();
        blc<bpw, bpw> blcVar2 = this.c;
        bpw h2 = blcVar2 == null ? null : blcVar2.h();
        this.j.reset();
        if (h != null) {
            this.j.preTranslate(h.x * f, h.y * f);
        }
        if (h2 != null) {
            double d = f;
            this.j.preScale((float) Math.pow(h2.a, d), (float) Math.pow(h2.b, d));
        }
        blc<Float, Float> blcVar3 = this.d;
        if (blcVar3 != null) {
            float floatValue = blcVar3.h().floatValue();
            blc<PointF, PointF> blcVar4 = this.a;
            if (blcVar4 != null) {
                pointF = blcVar4.h();
            }
            Matrix matrix = this.j;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> boolean e(T t, bpv<T> bpvVar) {
        blc blcVar;
        blc blcVar2;
        if (t == bjv.e) {
            blc<PointF, PointF> blcVar3 = this.a;
            if (blcVar3 == null) {
                this.a = new blr(bpvVar, new PointF());
                return true;
            }
            blcVar3.d = bpvVar;
            return true;
        } else if (t == bjv.f) {
            blc<?, PointF> blcVar4 = this.b;
            if (blcVar4 == null) {
                this.b = new blr(bpvVar, new PointF());
                return true;
            }
            blcVar4.d = bpvVar;
            return true;
        } else if (t == bjv.k) {
            blc<bpw, bpw> blcVar5 = this.c;
            if (blcVar5 == null) {
                this.c = new blr(bpvVar, new bpw());
                return true;
            }
            blcVar5.d = bpvVar;
            return true;
        } else if (t == bjv.l) {
            blc<Float, Float> blcVar6 = this.d;
            if (blcVar6 == null) {
                this.d = new blr(bpvVar, Float.valueOf(0.0f));
                return true;
            }
            blcVar6.d = bpvVar;
            return true;
        } else {
            if (t == bjv.c) {
                blcVar = this.e;
                if (blcVar == null) {
                    this.e = new blr(bpvVar, 100);
                    return true;
                }
            } else if ((t == bjv.y && (blcVar2 = this.h) != null) || ((t == bjv.z && (blcVar2 = this.i) != null) || (t == bjv.m && (blcVar2 = this.f) != null))) {
                blcVar2.d = bpvVar;
                return true;
            } else if (t != bjv.n || (blcVar = this.g) == null) {
                return false;
            }
            blcVar.d = bpvVar;
            return true;
        }
    }
}
