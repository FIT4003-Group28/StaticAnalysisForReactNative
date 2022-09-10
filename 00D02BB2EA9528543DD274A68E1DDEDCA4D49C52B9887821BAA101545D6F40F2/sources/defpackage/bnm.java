package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnm  reason: default package */
/* loaded from: classes3.dex */
public final class bnm extends bnl {
    private blc<Float, Float> g;
    private final List<bnl> h;
    private final RectF i;
    private final RectF j;
    private Paint k;

    public bnm(bjr bjrVar, bno bnoVar, List<bno> list, bis bisVar) {
        super(bjrVar, bnoVar);
        bnl bnlVar;
        bnl bnmVar;
        String str;
        this.h = new ArrayList();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Paint();
        bme bmeVar = bnoVar.r;
        if (bmeVar != null) {
            blc<Float, Float> a = bmeVar.a();
            this.g = a;
            i(a);
            this.g.a(this);
        } else {
            this.g = null;
        }
        aik aikVar = new aik(bisVar.h.size());
        int size = list.size() - 1;
        bnl bnlVar2 = null;
        while (true) {
            if (size >= 0) {
                bno bnoVar2 = list.get(size);
                int i = bnoVar2.u;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    bnmVar = new bnm(bjrVar, bnoVar2, bisVar.b.get(bnoVar2.f), bisVar);
                } else if (i2 == 1) {
                    bnmVar = new bnr(bjrVar, bnoVar2);
                } else if (i2 == 2) {
                    bnmVar = new bnn(bjrVar, bnoVar2);
                } else if (i2 == 3) {
                    bnmVar = new bnp(bjrVar, bnoVar2);
                } else if (i2 == 4) {
                    bnmVar = new bnq(bjrVar, bnoVar2);
                } else if (i2 != 5) {
                    switch (i) {
                        case 1:
                            str = "PRE_COMP";
                            break;
                        case 2:
                            str = "SOLID";
                            break;
                        case 3:
                            str = "IMAGE";
                            break;
                        case 4:
                            str = "NULL";
                            break;
                        case 5:
                            str = "SHAPE";
                            break;
                        case 6:
                            str = "TEXT";
                            break;
                        default:
                            str = "UNKNOWN";
                            break;
                    }
                    StringBuilder sb = new StringBuilder(str.length() + 19);
                    sb.append("Unknown layer type ");
                    sb.append(str);
                    bpo.a(sb.toString());
                    bnmVar = null;
                } else {
                    bnmVar = new bnu(bjrVar, bnoVar2);
                }
                if (bnmVar != null) {
                    aikVar.d(bnmVar.c.d, bnmVar);
                    if (bnlVar2 != null) {
                        bnlVar2.d = bnmVar;
                        bnlVar2 = null;
                    } else {
                        this.h.add(0, bnmVar);
                        int i3 = bnoVar2.v;
                        int i4 = i3 - 1;
                        if (i3 == 0) {
                            throw null;
                        }
                        if (i4 == 1 || i4 == 2) {
                            bnlVar2 = bnmVar;
                        }
                    }
                }
                size--;
            } else {
                for (int i5 = 0; i5 < aikVar.e(); i5++) {
                    bnl bnlVar3 = (bnl) aikVar.b(aikVar.f(i5));
                    if (bnlVar3 != null && (bnlVar = (bnl) aikVar.b(bnlVar3.c.e)) != null) {
                        bnlVar3.e = bnlVar;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.bnl, defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        int size = this.h.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.h.get(size).d(this.i, this.a, true);
                rectF.union(this.i);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.bnl, defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        super.f(t, bpvVar);
        if (t == bjv.A) {
            blr blrVar = new blr(bpvVar);
            this.g = blrVar;
            i(blrVar);
        }
    }

    @Override // defpackage.bnl
    public final void j(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.j;
        bno bnoVar = this.c;
        rectF.set(0.0f, 0.0f, bnoVar.n, bnoVar.o);
        matrix.mapRect(this.j);
        int i2 = 255;
        boolean z = false;
        if (this.b.p && this.h.size() > 1) {
            if (i != 255) {
                z = true;
            } else {
                i = 255;
            }
        }
        if (z) {
            this.k.setAlpha(i);
            bps.k(canvas, this.j, this.k);
        } else {
            canvas.save();
        }
        if (true != z) {
            i2 = i;
        }
        int size = this.h.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.j.isEmpty() || canvas.clipRect(this.j)) {
                    this.h.get(size).c(canvas, matrix, i2);
                }
            } else {
                canvas.restore();
                bim.a();
                return;
            }
        }
    }

    @Override // defpackage.bnl
    public final void m(float f) {
        super.m(f);
        if (this.g != null) {
            f = ((this.g.h().floatValue() * this.c.b.l) - this.c.b.j) / (this.b.a.g() + 0.01f);
        }
        bno bnoVar = this.c;
        float f2 = bnoVar.l;
        if (f2 != 0.0f) {
            f /= f2;
        }
        if (this.g == null) {
            f -= bnoVar.m / bnoVar.b.g();
        }
        int size = this.h.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.h.get(size).m(f);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.bnl
    public final void n(bly blyVar, int i, List<bly> list, bly blyVar2) {
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            this.h.get(i2).e(blyVar, i, list, blyVar2);
        }
    }
}
