package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: bnr  reason: default package */
/* loaded from: classes3.dex */
public final class bnr extends bnl {
    private final RectF g;
    private final Paint h;
    private final float[] i;
    private final Path j;
    private final bno k;
    private blc<ColorFilter, ColorFilter> l;

    public bnr(bjr bjrVar, bno bnoVar) {
        super(bjrVar, bnoVar);
        this.g = new RectF();
        bkg bkgVar = new bkg();
        this.h = bkgVar;
        this.i = new float[8];
        this.j = new Path();
        this.k = bnoVar;
        bkgVar.setAlpha(0);
        bkgVar.setStyle(Paint.Style.FILL);
        bkgVar.setColor(bnoVar.k);
    }

    @Override // defpackage.bnl, defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        RectF rectF2 = this.g;
        bno bnoVar = this.k;
        rectF2.set(0.0f, 0.0f, bnoVar.i, bnoVar.j);
        this.a.mapRect(this.g);
        rectF.set(this.g);
    }

    @Override // defpackage.bnl, defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        super.f(t, bpvVar);
        if (t == bjv.B) {
            this.l = new blr(bpvVar);
        }
    }

    @Override // defpackage.bnl
    public final void j(Canvas canvas, Matrix matrix, int i) {
        blc<Integer, Integer> blcVar;
        int alpha = Color.alpha(this.k.k);
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.f.e == null ? 100 : blcVar.h().intValue())) / 100.0f) * 255.0f);
        this.h.setAlpha(intValue);
        blc<ColorFilter, ColorFilter> blcVar2 = this.l;
        if (blcVar2 != null) {
            this.h.setColorFilter(blcVar2.h());
        }
        if (intValue <= 0) {
            return;
        }
        float[] fArr = this.i;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        bno bnoVar = this.k;
        float f = bnoVar.i;
        fArr[2] = f;
        fArr[3] = 0.0f;
        fArr[4] = f;
        float f2 = bnoVar.j;
        fArr[5] = f2;
        fArr[6] = 0.0f;
        fArr[7] = f2;
        matrix.mapPoints(fArr);
        this.j.reset();
        Path path = this.j;
        float[] fArr2 = this.i;
        path.moveTo(fArr2[0], fArr2[1]);
        Path path2 = this.j;
        float[] fArr3 = this.i;
        path2.lineTo(fArr3[2], fArr3[3]);
        Path path3 = this.j;
        float[] fArr4 = this.i;
        path3.lineTo(fArr4[4], fArr4[5]);
        Path path4 = this.j;
        float[] fArr5 = this.i;
        path4.lineTo(fArr5[6], fArr5[7]);
        Path path5 = this.j;
        float[] fArr6 = this.i;
        path5.lineTo(fArr6[0], fArr6[1]);
        this.j.close();
        canvas.drawPath(this.j, this.h);
    }
}
