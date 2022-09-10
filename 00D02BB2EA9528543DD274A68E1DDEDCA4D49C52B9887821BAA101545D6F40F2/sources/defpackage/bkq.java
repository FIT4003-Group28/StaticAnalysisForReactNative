package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
/* compiled from: PG */
/* renamed from: bkq  reason: default package */
/* loaded from: classes3.dex */
public final class bkq extends bki {
    private final String c;
    private final boolean d;
    private final aik<LinearGradient> e;
    private final aik<RadialGradient> f;
    private final RectF g;
    private final int h;
    private final blc<bmt, bmt> i;
    private final blc<PointF, PointF> j;
    private final blc<PointF, PointF> k;
    private blr l;
    private final int m;

    public bkq(bjr bjrVar, bnl bnlVar, bmv bmvVar) {
        super(bjrVar, bnlVar, bng.b(bmvVar.l), bnh.b(bmvVar.m), bmvVar.g, bmvVar.c, bmvVar.f, bmvVar.h, bmvVar.i);
        this.e = new aik<>();
        this.f = new aik<>();
        this.g = new RectF();
        this.c = bmvVar.a;
        this.m = bmvVar.k;
        this.d = bmvVar.j;
        this.h = (int) (bjrVar.a.e() / 32.0f);
        blc<bmt, bmt> a = bmvVar.b.a();
        this.i = a;
        a.a(this);
        bnlVar.i(a);
        blc<PointF, PointF> a2 = bmvVar.d.a();
        this.j = a2;
        a2.a(this);
        bnlVar.i(a2);
        blc<PointF, PointF> a3 = bmvVar.e.a();
        this.k = a3;
        a3.a(this);
        bnlVar.i(a3);
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
        blr blrVar = this.l;
        if (blrVar != null) {
            Integer[] numArr = (Integer[]) blrVar.h();
            int length = numArr.length;
            int i = 0;
            if (iArr.length == length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bki, defpackage.bkm
    public final void c(Canvas canvas, Matrix matrix, int i) {
        RadialGradient b;
        float f;
        float f2;
        if (this.d) {
            return;
        }
        d(this.g, matrix, false);
        if (this.m != 1) {
            long h = h();
            b = this.f.b(h);
            if (b == null) {
                PointF h2 = this.j.h();
                PointF h3 = this.k.h();
                bmt h4 = this.i.h();
                int[] i2 = i(h4.b);
                float[] fArr = h4.a;
                RadialGradient radialGradient = new RadialGradient(h2.x, h2.y, (float) Math.hypot(h3.x - f, h3.y - f2), i2, fArr, Shader.TileMode.CLAMP);
                this.f.d(h, radialGradient);
                b = radialGradient;
            }
        } else {
            long h5 = h();
            b = this.e.b(h5);
            if (b == null) {
                PointF h6 = this.j.h();
                PointF h7 = this.k.h();
                bmt h8 = this.i.h();
                b = new LinearGradient(h6.x, h6.y, h7.x, h7.y, i(h8.b), h8.a, Shader.TileMode.CLAMP);
                this.e.d(h5, b);
            }
        }
        b.setLocalMatrix(matrix);
        this.b.setShader(b);
        super.c(canvas, matrix, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bki, defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        super.f(t, bpvVar);
        if (t == bjv.C) {
            blr blrVar = new blr(bpvVar);
            this.l = blrVar;
            blrVar.a(this);
            this.a.i(this.l);
        }
    }

    @Override // defpackage.bkk
    public final String g() {
        return this.c;
    }
}
