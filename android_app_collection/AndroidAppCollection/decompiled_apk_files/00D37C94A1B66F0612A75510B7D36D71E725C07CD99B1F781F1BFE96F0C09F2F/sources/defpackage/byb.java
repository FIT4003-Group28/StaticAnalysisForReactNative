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
/* renamed from: byb  reason: default package */
/* loaded from: classes2.dex */
public abstract class byb implements byt, byk, bye {
    protected final cbd a;
    final Paint b;
    private final bxn g;
    private final float[] i;
    private final byy j;
    private final byy k;
    private final List l;
    private final byy m;
    private byy n;
    private final PathMeasure c = new PathMeasure();
    private final Path d = new Path();
    private final Path e = new Path();
    private final RectF f = new RectF();
    private final List h = new ArrayList();

    public byb(bxn bxnVar, cbd cbdVar, Paint.Cap cap, Paint.Join join, float f, cab cabVar, bzz bzzVar, List list, bzz bzzVar2) {
        bxz bxzVar = new bxz(1);
        this.b = bxzVar;
        this.g = bxnVar;
        this.a = cbdVar;
        bxzVar.setStyle(Paint.Style.STROKE);
        bxzVar.setStrokeCap(cap);
        bxzVar.setStrokeJoin(join);
        bxzVar.setStrokeMiter(f);
        this.k = cabVar.a();
        this.j = bzzVar.a();
        if (bzzVar2 == null) {
            this.m = null;
        } else {
            this.m = bzzVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.l.add(((bzz) list.get(i)).a());
        }
        cbdVar.h(this.k);
        cbdVar.h(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            cbdVar.h((byy) this.l.get(i2));
        }
        byy byyVar = this.m;
        if (byyVar != null) {
            cbdVar.h(byyVar);
        }
        this.k.g(this);
        this.j.g(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((byy) this.l.get(i3)).g(this);
        }
        byy byyVar2 = this.m;
        if (byyVar2 != null) {
            byyVar2.g(this);
        }
    }

    @Override // defpackage.bzv
    public void a(Object obj, cdj cdjVar) {
        if (obj == bxs.d) {
            this.k.d = cdjVar;
        } else if (obj == bxs.q) {
            this.j.d = cdjVar;
        } else if (obj != bxs.E) {
        } else {
            byy byyVar = this.n;
            if (byyVar != null) {
                this.a.j(byyVar);
            }
            bzn bznVar = new bzn(cdjVar);
            this.n = bznVar;
            bznVar.g(this);
            this.a.h(this.n);
        }
    }

    @Override // defpackage.bye
    public void b(Canvas canvas, Matrix matrix, int i) {
        float[] fArr = (float[]) cdh.a.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            bwr.a();
            return;
        }
        bzc bzcVar = (bzc) this.k;
        float k = (i / 255.0f) * bzcVar.k(bzcVar.d(), bzcVar.b());
        float f = 100.0f;
        this.b.setAlpha(cdc.k((int) ((k / 100.0f) * 255.0f)));
        this.b.setStrokeWidth(((bza) this.j).k() * cdh.c(matrix));
        if (this.b.getStrokeWidth() > 0.0f) {
            if (this.l.isEmpty()) {
                bwr.a();
            } else {
                float c = cdh.c(matrix);
                for (int i2 = 0; i2 < this.l.size(); i2++) {
                    this.i[i2] = ((Float) ((byy) this.l.get(i2)).e()).floatValue();
                    if (i2 % 2 == 0) {
                        float[] fArr2 = this.i;
                        if (fArr2[i2] < 1.0f) {
                            fArr2[i2] = 1.0f;
                        }
                    } else {
                        float[] fArr3 = this.i;
                        if (fArr3[i2] < 0.1f) {
                            fArr3[i2] = 0.1f;
                        }
                    }
                    float[] fArr4 = this.i;
                    fArr4[i2] = fArr4[i2] * c;
                }
                byy byyVar = this.m;
                this.b.setPathEffect(new DashPathEffect(this.i, byyVar == null ? 0.0f : ((Float) byyVar.e()).floatValue() * c));
                bwr.a();
            }
            byy byyVar2 = this.n;
            if (byyVar2 != null) {
                this.b.setColorFilter((ColorFilter) byyVar2.e());
            }
            int i3 = 0;
            while (i3 < this.h.size()) {
                bya byaVar = (bya) this.h.get(i3);
                if (byaVar.b != null) {
                    this.d.reset();
                    int size = byaVar.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        this.d.addPath(((bym) byaVar.a.get(size)).i(), matrix);
                    }
                    this.c.setPath(this.d, z);
                    float length = this.c.getLength();
                    while (this.c.nextContour()) {
                        length += this.c.getLength();
                    }
                    float floatValue = (((Float) byaVar.b.d.e()).floatValue() * length) / 360.0f;
                    float floatValue2 = ((((Float) byaVar.b.b.e()).floatValue() * length) / f) + floatValue;
                    float floatValue3 = ((((Float) byaVar.b.c.e()).floatValue() * length) / f) + floatValue;
                    int size2 = byaVar.a.size() - 1;
                    float f2 = 0.0f;
                    while (size2 >= 0) {
                        this.e.set(((bym) byaVar.a.get(size2)).i());
                        this.e.transform(matrix);
                        this.c.setPath(this.e, z);
                        float length2 = this.c.getLength();
                        if (floatValue3 > length) {
                            float f3 = floatValue3 - length;
                            if (f3 < f2 + length2 && f2 < f3) {
                                cdh.h(this.e, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                                canvas.drawPath(this.e, this.b);
                                f2 += length2;
                                size2--;
                                z = false;
                            }
                        }
                        float f4 = f2 + length2;
                        if (f4 >= floatValue2 && f2 <= floatValue3) {
                            if (f4 > floatValue3 || floatValue2 >= f2) {
                                cdh.h(this.e, floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2, floatValue3 > f4 ? 1.0f : (floatValue3 - f2) / length2, 0.0f);
                                canvas.drawPath(this.e, this.b);
                            } else {
                                canvas.drawPath(this.e, this.b);
                            }
                        }
                        f2 += length2;
                        size2--;
                        z = false;
                    }
                    bwr.a();
                } else {
                    this.d.reset();
                    int size3 = byaVar.a.size();
                    while (true) {
                        size3--;
                        if (size3 < 0) {
                            break;
                        }
                        this.d.addPath(((bym) byaVar.a.get(size3)).i(), matrix);
                    }
                    bwr.a();
                    canvas.drawPath(this.d, this.b);
                    bwr.a();
                }
                i3++;
                f = 100.0f;
                z = false;
            }
            bwr.a();
            return;
        }
        bwr.a();
    }

    @Override // defpackage.bye
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.d.reset();
        for (int i = 0; i < this.h.size(); i++) {
            bya byaVar = (bya) this.h.get(i);
            for (int i2 = 0; i2 < byaVar.a.size(); i2++) {
                this.d.addPath(((bym) byaVar.a.get(i2)).i(), matrix);
            }
        }
        this.d.computeBounds(this.f, false);
        float k = ((bza) this.j).k();
        RectF rectF2 = this.f;
        float f = k / 2.0f;
        rectF2.set(rectF2.left - f, this.f.top - f, this.f.right + f, this.f.bottom + f);
        rectF.set(this.f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        bwr.a();
    }

    @Override // defpackage.byt
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.bzv
    public final void e(bzu bzuVar, int i, List list, bzu bzuVar2) {
        cdc.h(bzuVar, i, list, bzuVar2, this);
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
        bya byaVar = null;
        bys bysVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            byc bycVar = (byc) list.get(size);
            if (bycVar instanceof bys) {
                bys bysVar2 = (bys) bycVar;
                if (bysVar2.e == 2) {
                    bysVar = bysVar2;
                }
            }
        }
        if (bysVar != null) {
            bysVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            byc bycVar2 = (byc) list2.get(size2);
            if (bycVar2 instanceof bys) {
                bys bysVar3 = (bys) bycVar2;
                if (bysVar3.e == 2) {
                    if (byaVar != null) {
                        this.h.add(byaVar);
                    }
                    bya byaVar2 = new bya(bysVar3);
                    bysVar3.a(this);
                    byaVar = byaVar2;
                }
            }
            if (bycVar2 instanceof bym) {
                if (byaVar == null) {
                    byaVar = new bya(bysVar);
                }
                byaVar.a.add((bym) bycVar2);
            }
        }
        if (byaVar != null) {
            this.h.add(byaVar);
        }
    }
}
