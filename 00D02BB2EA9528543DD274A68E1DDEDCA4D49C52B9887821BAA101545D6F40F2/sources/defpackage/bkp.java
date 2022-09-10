package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkp  reason: default package */
/* loaded from: classes3.dex */
public final class bkp implements bkm, blb, bks {
    private final String a;
    private final boolean b;
    private final bnl c;
    private final aik<LinearGradient> d = new aik<>();
    private final aik<RadialGradient> e = new aik<>();
    private final Path f;
    private final Paint g;
    private final RectF h;
    private final List<bku> i;
    private final blc<bmt, bmt> j;
    private final blc<Integer, Integer> k;
    private final blc<PointF, PointF> l;
    private final blc<PointF, PointF> m;
    private blc<ColorFilter, ColorFilter> n;
    private blr o;
    private final bjr p;
    private final int q;
    private final int r;

    public bkp(bjr bjrVar, bnl bnlVar, bmu bmuVar) {
        Path path = new Path();
        this.f = path;
        this.g = new bkg(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.c = bnlVar;
        this.a = bmuVar.f;
        this.b = bmuVar.g;
        this.p = bjrVar;
        this.r = bmuVar.h;
        path.setFillType(bmuVar.a);
        this.q = (int) (bjrVar.a.e() / 32.0f);
        blc<bmt, bmt> a = bmuVar.b.a();
        this.j = a;
        a.a(this);
        bnlVar.i(a);
        blc<Integer, Integer> a2 = bmuVar.c.a();
        this.k = a2;
        a2.a(this);
        bnlVar.i(a2);
        blc<PointF, PointF> a3 = bmuVar.d.a();
        this.l = a3;
        a3.a(this);
        bnlVar.i(a3);
        blc<PointF, PointF> a4 = bmuVar.e.a();
        this.m = a4;
        a4.a(this);
        bnlVar.i(a4);
    }

    private final int h() {
        int round = Math.round(this.l.c * this.q);
        int round2 = Math.round(this.m.c * this.q);
        int round3 = Math.round(this.j.c * this.q);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private final int[] i(int[] iArr) {
        blr blrVar = this.o;
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

    @Override // defpackage.blb
    public final void a() {
        this.p.invalidateSelf();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        for (int i = 0; i < list2.size(); i++) {
            bkk bkkVar = list2.get(i);
            if (bkkVar instanceof bku) {
                this.i.add((bku) bkkVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bkm
    public final void c(Canvas canvas, Matrix matrix, int i) {
        RadialGradient b;
        if (this.b) {
            return;
        }
        this.f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f.addPath(this.i.get(i2).j(), matrix);
        }
        this.f.computeBounds(this.h, false);
        if (this.r != 1) {
            long h = h();
            b = this.e.b(h);
            if (b == null) {
                PointF h2 = this.l.h();
                PointF h3 = this.m.h();
                bmt h4 = this.j.h();
                int[] i3 = i(h4.b);
                float[] fArr = h4.a;
                float f = h2.x;
                float f2 = h2.y;
                float hypot = (float) Math.hypot(h3.x - f, h3.y - f2);
                b = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, i3, fArr, Shader.TileMode.CLAMP);
                this.e.d(h, b);
            }
        } else {
            long h5 = h();
            b = this.d.b(h5);
            if (b == null) {
                PointF h6 = this.l.h();
                PointF h7 = this.m.h();
                bmt h8 = this.j.h();
                LinearGradient linearGradient = new LinearGradient(h6.x, h6.y, h7.x, h7.y, i(h8.b), h8.a, Shader.TileMode.CLAMP);
                this.d.d(h5, linearGradient);
                b = linearGradient;
            }
        }
        b.setLocalMatrix(matrix);
        this.g.setShader(b);
        blc<ColorFilter, ColorFilter> blcVar = this.n;
        if (blcVar != null) {
            this.g.setColorFilter(blcVar.h());
        }
        this.g.setAlpha(bpr.j((int) ((((i / 255.0f) * this.k.h().intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.f, this.g);
        bim.a();
    }

    @Override // defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(this.i.get(i).j(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.blz
    public final void e(bly blyVar, int i, List<bly> list, bly blyVar2) {
        bpr.i(blyVar, i, list, blyVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        if (t == bjv.d) {
            this.k.d = bpvVar;
        } else if (t == bjv.B) {
            blr blrVar = new blr(bpvVar);
            this.n = blrVar;
            blrVar.a(this);
            this.c.i(this.n);
        } else if (t != bjv.C) {
        } else {
            blr blrVar2 = new blr(bpvVar);
            this.o = blrVar2;
            blrVar2.a(this);
            this.c.i(this.o);
        }
    }

    @Override // defpackage.bkk
    public final String g() {
        return this.a;
    }
}
