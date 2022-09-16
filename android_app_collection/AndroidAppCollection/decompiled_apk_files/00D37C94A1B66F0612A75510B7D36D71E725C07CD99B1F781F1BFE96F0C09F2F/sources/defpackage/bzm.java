package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
/* compiled from: PG */
/* renamed from: bzm  reason: default package */
/* loaded from: classes2.dex */
public final class bzm {
    public byy a;
    public byy b;
    public byy c;
    public byy d;
    public byy e;
    public final bza f;
    public final bza g;
    public final byy h;
    public final byy i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public bzm(caj cajVar) {
        cac cacVar = cajVar.a;
        this.a = cacVar == null ? null : cacVar.a();
        cak cakVar = cajVar.b;
        this.b = cakVar == null ? null : cakVar.a();
        cae caeVar = cajVar.c;
        this.c = caeVar == null ? null : caeVar.a();
        bzz bzzVar = cajVar.d;
        this.d = bzzVar == null ? null : bzzVar.a();
        bzz bzzVar2 = cajVar.f;
        bza bzaVar = (bza) (bzzVar2 == null ? null : bzzVar2.a());
        this.f = bzaVar;
        if (bzaVar != null) {
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
        bzz bzzVar3 = cajVar.g;
        this.g = (bza) (bzzVar3 == null ? null : bzzVar3.a());
        cab cabVar = cajVar.e;
        if (cabVar != null) {
            this.e = cabVar.a();
        }
        bzz bzzVar4 = cajVar.h;
        if (bzzVar4 != null) {
            this.h = bzzVar4.a();
        } else {
            this.h = null;
        }
        bzz bzzVar5 = cajVar.i;
        if (bzzVar5 != null) {
            this.i = bzzVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        float k;
        this.j.reset();
        byy byyVar = this.b;
        if (byyVar != null) {
            PointF pointF = (PointF) byyVar.e();
            if (pointF.x != 0.0f || pointF.y != 0.0f) {
                this.j.preTranslate(pointF.x, pointF.y);
            }
        }
        byy byyVar2 = this.d;
        if (byyVar2 != null) {
            if (byyVar2 instanceof bzn) {
                k = ((Float) byyVar2.e()).floatValue();
            } else {
                k = ((bza) byyVar2).k();
            }
            if (k != 0.0f) {
                this.j.preRotate(k);
            }
        }
        if (this.f != null) {
            bza bzaVar = this.g;
            float cos = bzaVar == null ? 0.0f : (float) Math.cos(Math.toRadians((-bzaVar.k()) + 90.0f));
            bza bzaVar2 = this.g;
            float sin = bzaVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-bzaVar2.k()) + 90.0f));
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
        byy byyVar3 = this.c;
        if (byyVar3 != null) {
            cdk cdkVar = (cdk) byyVar3.e();
            float f2 = cdkVar.a;
            if (f2 != 1.0f || cdkVar.b != 1.0f) {
                this.j.preScale(f2, cdkVar.b);
            }
        }
        byy byyVar4 = this.a;
        if (byyVar4 != null) {
            PointF pointF2 = (PointF) byyVar4.e();
            if (pointF2.x != 0.0f || pointF2.y != 0.0f) {
                this.j.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.j;
    }

    public final Matrix b(float f) {
        byy byyVar = this.b;
        PointF pointF = null;
        PointF pointF2 = byyVar == null ? null : (PointF) byyVar.e();
        byy byyVar2 = this.c;
        cdk cdkVar = byyVar2 == null ? null : (cdk) byyVar2.e();
        this.j.reset();
        if (pointF2 != null) {
            this.j.preTranslate(pointF2.x * f, pointF2.y * f);
        }
        if (cdkVar != null) {
            double d = f;
            this.j.preScale((float) Math.pow(cdkVar.a, d), (float) Math.pow(cdkVar.b, d));
        }
        byy byyVar3 = this.d;
        if (byyVar3 != null) {
            float floatValue = ((Float) byyVar3.e()).floatValue();
            byy byyVar4 = this.a;
            if (byyVar4 != null) {
                pointF = (PointF) byyVar4.e();
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

    public final void c(cbd cbdVar) {
        cbdVar.h(this.e);
        cbdVar.h(this.h);
        cbdVar.h(this.i);
        cbdVar.h(this.a);
        cbdVar.h(this.b);
        cbdVar.h(this.c);
        cbdVar.h(this.d);
        cbdVar.h(this.f);
        cbdVar.h(this.g);
    }

    public final void d(byt bytVar) {
        byy byyVar = this.e;
        if (byyVar != null) {
            byyVar.g(bytVar);
        }
        byy byyVar2 = this.h;
        if (byyVar2 != null) {
            byyVar2.g(bytVar);
        }
        byy byyVar3 = this.i;
        if (byyVar3 != null) {
            byyVar3.g(bytVar);
        }
        byy byyVar4 = this.a;
        if (byyVar4 != null) {
            byyVar4.g(bytVar);
        }
        byy byyVar5 = this.b;
        if (byyVar5 != null) {
            byyVar5.g(bytVar);
        }
        byy byyVar6 = this.c;
        if (byyVar6 != null) {
            byyVar6.g(bytVar);
        }
        byy byyVar7 = this.d;
        if (byyVar7 != null) {
            byyVar7.g(bytVar);
        }
        bza bzaVar = this.f;
        if (bzaVar != null) {
            bzaVar.g(bytVar);
        }
        bza bzaVar2 = this.g;
        if (bzaVar2 != null) {
            bzaVar2.g(bytVar);
        }
    }

    public final boolean e(Object obj, cdj cdjVar) {
        byy byyVar;
        byy byyVar2;
        if (obj == bxs.e) {
            byy byyVar3 = this.a;
            if (byyVar3 != null) {
                byyVar3.d = cdjVar;
                return true;
            }
            new PointF();
            this.a = new bzn(cdjVar, null);
            return true;
        } else if (obj == bxs.f) {
            byy byyVar4 = this.b;
            if (byyVar4 != null) {
                byyVar4.d = cdjVar;
                return true;
            }
            new PointF();
            this.b = new bzn(cdjVar, null);
            return true;
        } else {
            if (obj == bxs.g) {
                byy byyVar5 = this.b;
                if (byyVar5 instanceof bzk) {
                    bzk bzkVar = (bzk) byyVar5;
                    cdj cdjVar2 = bzkVar.e;
                    bzkVar.e = cdjVar;
                    return true;
                }
            }
            if (obj == bxs.h) {
                byy byyVar6 = this.b;
                if (byyVar6 instanceof bzk) {
                    bzk bzkVar2 = (bzk) byyVar6;
                    cdj cdjVar3 = bzkVar2.f;
                    bzkVar2.f = cdjVar;
                    return true;
                }
            }
            if (obj == bxs.m) {
                byy byyVar7 = this.c;
                if (byyVar7 != null) {
                    byyVar7.d = cdjVar;
                    return true;
                }
                new cdk();
                this.c = new bzn(cdjVar, null);
                return true;
            } else if (obj == bxs.n) {
                byy byyVar8 = this.d;
                if (byyVar8 == null) {
                    this.d = new bzn(cdjVar, null);
                    return true;
                }
                byyVar8.d = cdjVar;
                return true;
            } else {
                if (obj == bxs.c) {
                    byyVar = this.e;
                    if (byyVar == null) {
                        this.e = new bzn(cdjVar, null);
                        return true;
                    }
                } else if ((obj == bxs.A && (byyVar2 = this.h) != null) || ((obj == bxs.B && (byyVar2 = this.i) != null) || (obj == bxs.o && (byyVar2 = this.f) != null))) {
                    byyVar2.d = cdjVar;
                    return true;
                } else if (obj != bxs.p || (byyVar = this.g) == null) {
                    return false;
                }
                byyVar.d = cdjVar;
                return true;
            }
        }
    }
}
