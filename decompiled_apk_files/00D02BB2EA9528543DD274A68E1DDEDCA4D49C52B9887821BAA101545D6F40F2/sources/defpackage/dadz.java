package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: dadz  reason: default package */
/* loaded from: classes.dex */
public final class dadz {
    private final daeh[] a = new daeh[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final daeh g = new daeh();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public dadz() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new daeh();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    private final boolean c(Path path, int i) {
        this.k.reset();
        this.a[i].b(this.b[i], this.k);
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

    public final void a(dadx dadxVar, float f, RectF rectF, Path path) {
        b(dadxVar, f, rectF, null, path);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    public final void b(dadx dadxVar, float f, RectF rectF, dado dadoVar, Path path) {
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
            (i2 != 1 ? i2 != 2 ? i2 != 3 ? dadxVar.c : dadxVar.b : dadxVar.e : dadxVar.d).a(this.a[i2], f, (i2 != 1 ? i2 != 2 ? i2 != 3 ? dadxVar.g : dadxVar.f : dadxVar.i : dadxVar.h).a(rectF));
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
            daeh daehVar = this.a[i2];
            fArr[0] = daehVar.b;
            fArr[1] = daehVar.c;
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
            daeh daehVar2 = this.a[i3];
            char c = r5 == true ? 1 : 0;
            char c2 = r5 == true ? 1 : 0;
            fArr3[c] = 0.0f;
            fArr3[1] = daehVar2.a;
            this.b[i3].mapPoints(fArr3);
            if (i3 == 0) {
                float[] fArr4 = this.h;
                path.moveTo(fArr4[r5], fArr4[1]);
            } else {
                float[] fArr5 = this.h;
                path.lineTo(fArr5[r5], fArr5[1]);
            }
            this.a[i3].b(this.b[i3], path);
            if (dadoVar != null) {
                daeh daehVar3 = this.a[i3];
                Matrix matrix2 = this.b[i3];
                dadoVar.a.z.set(i3, (boolean) r5);
                dadoVar.a.x[i3] = daehVar3.c(matrix2);
            }
            int i4 = i3 + 1;
            int i5 = i4 % 4;
            float[] fArr6 = this.h;
            daeh daehVar4 = this.a[i3];
            fArr6[r5] = daehVar4.b;
            fArr6[1] = daehVar4.c;
            this.b[i3].mapPoints(fArr6);
            float[] fArr7 = this.i;
            daeh daehVar5 = this.a[i5];
            fArr7[r5] = 0.0f;
            fArr7[1] = daehVar5.a;
            this.b[i5].mapPoints(fArr7);
            float[] fArr8 = this.h;
            float f2 = fArr8[r5];
            float[] fArr9 = this.i;
            int i6 = i3;
            float max = Math.max(((float) Math.hypot(f2 - fArr9[r5], fArr8[1] - fArr9[1])) - 0.001f, 0.0f);
            float[] fArr10 = this.h;
            daeh daehVar6 = this.a[i6];
            fArr10[0] = daehVar6.b;
            fArr10[1] = daehVar6.c;
            this.b[i6].mapPoints(fArr10);
            if (i6 == 1 || i6 == 3) {
                rectF.centerX();
            } else {
                rectF.centerY();
            }
            this.g.e();
            if (i6 == 1) {
                dadn dadnVar = dadxVar.l;
            } else if (i6 == 2) {
                dadn dadnVar2 = dadxVar.m;
            } else if (i6 != 3) {
                dadn dadnVar3 = dadxVar.k;
            } else {
                dadn dadnVar4 = dadxVar.j;
            }
            this.g.a(max, 0.0f);
            this.j.reset();
            this.g.b(this.c[i6], this.j);
            if (!this.l || (!c(this.j, i6) && !c(this.j, i5))) {
                this.g.b(this.c[i6], path);
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
                this.g.b(this.c[i6], this.e);
            }
            if (dadoVar != null) {
                daeh daehVar7 = this.g;
                Matrix matrix3 = this.c[i6];
                dadoVar.a.z.set(i6 + 4, false);
                dadoVar.a.y[i6] = daehVar7.c(matrix3);
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
