package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: byi  reason: default package */
/* loaded from: classes2.dex */
public final class byi extends byb {
    private final String c;
    private final boolean d;
    private final agb e;
    private final agb f;
    private final RectF g;
    private final int h;
    private final byy i;
    private final byy j;
    private final byy k;
    private bzn l;
    private final int m;

    public byi(bxn bxnVar, cbd cbdVar, caq caqVar) {
        super(bxnVar, cbdVar, lf.g(caqVar.l), lf.e(caqVar.m), caqVar.g, caqVar.c, caqVar.f, caqVar.h, caqVar.i);
        this.e = new agb();
        this.f = new agb();
        this.g = new RectF();
        this.c = caqVar.a;
        this.m = caqVar.k;
        this.d = caqVar.j;
        this.h = (int) (bxnVar.a.a() / 32.0f);
        byy a = caqVar.b.a();
        this.i = a;
        a.g(this);
        cbdVar.h(a);
        byy a2 = caqVar.d.a();
        this.j = a2;
        a2.g(this);
        cbdVar.h(a2);
        byy a3 = caqVar.e.a();
        this.k = a3;
        a3.g(this);
        cbdVar.h(a3);
    }

    private final int h() {
        int round = Math.round(this.j.c * this.h);
        int round2 = Math.round(this.k.c * this.h);
        int round3 = Math.round(this.i.c * this.h);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private final int[] i(int[] iArr) {
        bzn bznVar = this.l;
        if (bznVar != null) {
            Integer[] numArr = (Integer[]) bznVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.byb, defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        super.a(obj, cdjVar);
        if (obj == bxs.F) {
            bzn bznVar = this.l;
            if (bznVar != null) {
                this.a.j(bznVar);
            }
            bzn bznVar2 = new bzn(cdjVar);
            this.l = bznVar2;
            bznVar2.g(this);
            this.a.h(this.l);
        }
    }

    @Override // defpackage.byb, defpackage.bye
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        float f;
        float f2;
        if (this.d) {
            return;
        }
        c(this.g, matrix, false);
        if (this.m != 1) {
            long h = h();
            shader = (RadialGradient) this.f.f(h);
            if (shader == null) {
                PointF pointF = (PointF) this.j.e();
                PointF pointF2 = (PointF) this.k.e();
                cao caoVar = (cao) this.i.e();
                int[] i2 = i(caoVar.b);
                float[] fArr = caoVar.a;
                RadialGradient radialGradient = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - f, pointF2.y - f2), i2, fArr, Shader.TileMode.CLAMP);
                this.f.k(h, radialGradient);
                shader = radialGradient;
            }
        } else {
            long h2 = h();
            shader = (LinearGradient) this.e.f(h2);
            if (shader == null) {
                PointF pointF3 = (PointF) this.j.e();
                PointF pointF4 = (PointF) this.k.e();
                cao caoVar2 = (cao) this.i.e();
                shader = new LinearGradient(pointF3.x, pointF3.y, pointF4.x, pointF4.y, i(caoVar2.b), caoVar2.a, Shader.TileMode.CLAMP);
                this.e.k(h2, shader);
            }
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.byc
    public final String g() {
        return this.c;
    }
}
