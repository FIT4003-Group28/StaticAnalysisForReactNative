package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bki  reason: default package */
/* loaded from: classes3.dex */
public abstract class bki implements blb, bks, bkm {
    protected final bnl a;
    final Paint b;
    private final bjr g;
    private final float[] i;
    private final blc<?, Float> j;
    private final blc<?, Integer> k;
    private final List<blc<?, Float>> l;
    private final blc<?, Float> m;
    private blc<ColorFilter, ColorFilter> n;
    private final PathMeasure c = new PathMeasure();
    private final Path d = new Path();
    private final Path e = new Path();
    private final RectF f = new RectF();
    private final List<bkh> h = new ArrayList();

    public bki(bjr bjrVar, bnl bnlVar, Paint.Cap cap, Paint.Join join, float f, bmg bmgVar, bme bmeVar, List<bme> list, bme bmeVar2) {
        bkg bkgVar = new bkg(1);
        this.b = bkgVar;
        this.g = bjrVar;
        this.a = bnlVar;
        bkgVar.setStyle(Paint.Style.STROKE);
        bkgVar.setStrokeCap(cap);
        bkgVar.setStrokeJoin(join);
        bkgVar.setStrokeMiter(f);
        this.k = bmgVar.a();
        this.j = bmeVar.a();
        if (bmeVar2 == null) {
            this.m = null;
        } else {
            this.m = bmeVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(list.get(i).a());
        }
        bnlVar.i(this.k);
        bnlVar.i(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            bnlVar.i(this.l.get(i2));
        }
        blc<?, Float> blcVar = this.m;
        if (blcVar != null) {
            bnlVar.i(blcVar);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.l.get(i3).a(this);
        }
        blc<?, Float> blcVar2 = this.m;
        if (blcVar2 != null) {
            blcVar2.a(this);
        }
    }

    @Override // defpackage.blb
    public final void a() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        bkh bkhVar = null;
        bla blaVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            bkk bkkVar = list.get(size);
            if (bkkVar instanceof bla) {
                bla blaVar2 = (bla) bkkVar;
                if (blaVar2.e == 2) {
                    blaVar = blaVar2;
                }
            }
        }
        if (blaVar != null) {
            blaVar.c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            bkk bkkVar2 = list2.get(size2);
            if (bkkVar2 instanceof bla) {
                bla blaVar3 = (bla) bkkVar2;
                if (blaVar3.e == 2) {
                    if (bkhVar != null) {
                        this.h.add(bkhVar);
                    }
                    bkh bkhVar2 = new bkh(blaVar3);
                    blaVar3.c(this);
                    bkhVar = bkhVar2;
                }
            }
            if (bkkVar2 instanceof bku) {
                if (bkhVar == null) {
                    bkhVar = new bkh(blaVar);
                }
                bkhVar.a.add((bku) bkkVar2);
            }
        }
        if (bkhVar != null) {
            this.h.add(bkhVar);
        }
    }

    @Override // defpackage.bkm
    public void c(Canvas canvas, Matrix matrix, int i) {
        boolean z = false;
        bps.a[0] = 0.0f;
        bps.a[1] = 0.0f;
        bps.a[2] = 37394.73f;
        bps.a[3] = 39575.234f;
        matrix.mapPoints(bps.a);
        if (bps.a[0] == bps.a[2] || bps.a[1] == bps.a[3]) {
            bim.a();
            return;
        }
        blg blgVar = (blg) this.k;
        float j = (i / 255.0f) * blgVar.j(blgVar.d(), blgVar.f());
        float f = 100.0f;
        this.b.setAlpha(bpr.j((int) ((j / 100.0f) * 255.0f)));
        this.b.setStrokeWidth(((ble) this.j).k() * bps.c(matrix));
        if (this.b.getStrokeWidth() <= 0.0f) {
            bim.a();
            return;
        }
        if (this.l.isEmpty()) {
            bim.a();
        } else {
            float c = bps.c(matrix);
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.i[i2] = this.l.get(i2).h().floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr = this.i;
                    if (fArr[i2] < 1.0f) {
                        fArr[i2] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.i;
                    if (fArr2[i2] < 0.1f) {
                        fArr2[i2] = 0.1f;
                    }
                }
                float[] fArr3 = this.i;
                fArr3[i2] = fArr3[i2] * c;
            }
            blc<?, Float> blcVar = this.m;
            this.b.setPathEffect(new DashPathEffect(this.i, blcVar == null ? 0.0f : blcVar.h().floatValue() * c));
            bim.a();
        }
        blc<ColorFilter, ColorFilter> blcVar2 = this.n;
        if (blcVar2 != null) {
            this.b.setColorFilter(blcVar2.h());
        }
        int i3 = 0;
        while (i3 < this.h.size()) {
            bkh bkhVar = this.h.get(i3);
            if (bkhVar.b != null) {
                this.d.reset();
                int size = bkhVar.a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.d.addPath(bkhVar.a.get(size).j(), matrix);
                }
                this.c.setPath(this.d, z);
                float length = this.c.getLength();
                while (this.c.nextContour()) {
                    length += this.c.getLength();
                }
                float floatValue = (bkhVar.b.d.h().floatValue() * length) / 360.0f;
                float floatValue2 = ((bkhVar.b.b.h().floatValue() * length) / f) + floatValue;
                float floatValue3 = ((bkhVar.b.c.h().floatValue() * length) / f) + floatValue;
                int size2 = bkhVar.a.size() - 1;
                float f2 = 0.0f;
                while (size2 >= 0) {
                    this.e.set(bkhVar.a.get(size2).j());
                    this.e.transform(matrix);
                    this.c.setPath(this.e, z);
                    float length2 = this.c.getLength();
                    if (floatValue3 > length) {
                        float f3 = floatValue3 - length;
                        if (f3 < f2 + length2 && f2 < f3) {
                            bps.e(this.e, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                            canvas.drawPath(this.e, this.b);
                            f2 += length2;
                            size2--;
                            z = false;
                        }
                    }
                    float f4 = f2 + length2;
                    if (f4 >= floatValue2 && f2 <= floatValue3) {
                        if (f4 > floatValue3 || floatValue2 >= f2) {
                            bps.e(this.e, floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2, floatValue3 > f4 ? 1.0f : (floatValue3 - f2) / length2, 0.0f);
                            canvas.drawPath(this.e, this.b);
                        } else {
                            canvas.drawPath(this.e, this.b);
                        }
                    }
                    f2 += length2;
                    size2--;
                    z = false;
                }
                bim.a();
            } else {
                this.d.reset();
                int size3 = bkhVar.a.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    this.d.addPath(bkhVar.a.get(size3).j(), matrix);
                }
                bim.a();
                canvas.drawPath(this.d, this.b);
                bim.a();
            }
            i3++;
            f = 100.0f;
            z = false;
        }
        bim.a();
    }

    @Override // defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.d.reset();
        for (int i = 0; i < this.h.size(); i++) {
            bkh bkhVar = this.h.get(i);
            for (int i2 = 0; i2 < bkhVar.a.size(); i2++) {
                this.d.addPath(bkhVar.a.get(i2).j(), matrix);
            }
        }
        this.d.computeBounds(this.f, false);
        float k = ((ble) this.j).k();
        RectF rectF2 = this.f;
        float f = k / 2.0f;
        rectF2.set(rectF2.left - f, this.f.top - f, this.f.right + f, this.f.bottom + f);
        rectF.set(this.f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        bim.a();
    }

    @Override // defpackage.blz
    public final void e(bly blyVar, int i, List<bly> list, bly blyVar2) {
        bpr.i(blyVar, i, list, blyVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blz
    public <T> void f(T t, bpv<T> bpvVar) {
        if (t == bjv.d) {
            this.k.d = bpvVar;
        } else if (t == bjv.o) {
            this.j.d = bpvVar;
        } else if (t != bjv.B) {
        } else {
            blr blrVar = new blr(bpvVar);
            this.n = blrVar;
            blrVar.a(this);
            this.a.i(this.n);
        }
    }
}
