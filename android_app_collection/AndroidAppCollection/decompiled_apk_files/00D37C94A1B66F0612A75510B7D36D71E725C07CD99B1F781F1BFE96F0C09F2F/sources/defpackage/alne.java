package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: alne  reason: default package */
/* loaded from: classes.dex */
public final class alne {
    private final alnm[] a = new alnm[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final alnm g = new alnm();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public alne() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new alnm();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    private final boolean c(Path path, int i) {
        this.k.reset();
        this.a[i].c(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private static final float d(int i) {
        return (i + 1) * 90;
    }

    public final void a(alnc alncVar, float f, RectF rectF, Path path) {
        b(alncVar, f, rectF, null, path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    public final void b(alnc alncVar, float f, RectF rectF, almv almvVar, Path path) {
        int i;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        ?? r5 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            (i2 != 1 ? i2 != 2 ? i2 != 3 ? alncVar.k : alncVar.j : alncVar.m : alncVar.l).a(this.a[i2], f, (i2 != 1 ? i2 != 2 ? i2 != 3 ? alncVar.c : alncVar.b : alncVar.e : alncVar.d).a(rectF));
            float d = d(i2);
            this.b[i2].reset();
            PointF pointF = this.d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            this.b[i2].setTranslate(this.d.x, this.d.y);
            this.b[i2].preRotate(d);
            float[] fArr = this.h;
            alnm alnmVar = this.a[i2];
            fArr[0] = alnmVar.b;
            fArr[1] = alnmVar.c;
            this.b[i2].mapPoints(fArr);
            this.c[i2].reset();
            Matrix matrix = this.c[i2];
            float[] fArr2 = this.h;
            matrix.setTranslate(fArr2[0], fArr2[1]);
            this.c[i2].preRotate(d(i2));
            i2++;
        }
        int i3 = 0;
        for (i = 4; i3 < i; i = 4) {
            float[] fArr3 = this.h;
            alnm alnmVar2 = this.a[i3];
            char c = r5 == true ? 1 : 0;
            char c2 = r5 == true ? 1 : 0;
            fArr3[c] = 0.0f;
            fArr3[1] = alnmVar2.a;
            this.b[i3].mapPoints(fArr3);
            if (i3 == 0) {
                float[] fArr4 = this.h;
                path.moveTo(fArr4[r5], fArr4[1]);
            } else {
                float[] fArr5 = this.h;
                path.lineTo(fArr5[r5], fArr5[1]);
            }
            this.a[i3].c(this.b[i3], path);
            if (almvVar != null) {
                alnm alnmVar3 = this.a[i3];
                Matrix matrix2 = this.b[i3];
                almvVar.a.d.set(i3, (boolean) r5);
                almvVar.a.b[i3] = alnmVar3.a(matrix2);
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.h;
            alnm alnmVar4 = this.a[i3];
            fArr6[r5] = alnmVar4.b;
            fArr6[1] = alnmVar4.c;
            this.b[i3].mapPoints(fArr6);
            float[] fArr7 = this.i;
            alnm alnmVar5 = this.a[i5];
            fArr7[r5] = 0.0f;
            fArr7[1] = alnmVar5.a;
            this.b[i5].mapPoints(fArr7);
            float[] fArr8 = this.h;
            float f2 = fArr8[r5];
            float[] fArr9 = this.i;
            int i6 = i3;
            float max = Math.max(((float) Math.hypot(f2 - fArr9[r5], fArr8[1] - fArr9[1])) - 0.001f, 0.0f);
            float[] fArr10 = this.h;
            alnm alnmVar6 = this.a[i6];
            fArr10[0] = alnmVar6.b;
            fArr10[1] = alnmVar6.c;
            this.b[i6].mapPoints(fArr10);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - this.h[0]);
            } else {
                Math.abs(rectF.centerY() - this.h[1]);
            }
            this.g.e();
            if (i6 == 1) {
                almu almuVar = alncVar.h;
            } else if (i6 == 2) {
                almu almuVar2 = alncVar.i;
            } else if (i6 != 3) {
                almu almuVar3 = alncVar.g;
            } else {
                almu almuVar4 = alncVar.f;
            }
            this.g.d(max, 0.0f);
            this.j.reset();
            this.g.c(this.c[i6], this.j);
            if (!this.l || (!c(this.j, i6) && !c(this.j, i5))) {
                this.g.c(this.c[i6], path);
            } else {
                Path path2 = this.j;
                path2.op(path2, this.f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.h;
                fArr11[0] = 0.0f;
                fArr11[1] = this.g.a;
                this.c[i6].mapPoints(fArr11);
                Path path3 = this.e;
                float[] fArr12 = this.h;
                path3.moveTo(fArr12[0], fArr12[1]);
                this.g.c(this.c[i6], this.e);
            }
            if (almvVar != null) {
                alnm alnmVar7 = this.g;
                Matrix matrix3 = this.c[i6];
                almvVar.a.d.set(i6 + 4, false);
                almvVar.a.c[i6] = alnmVar7.a(matrix3);
            }
            i3 = i4;
            r5 = 0;
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }
}
