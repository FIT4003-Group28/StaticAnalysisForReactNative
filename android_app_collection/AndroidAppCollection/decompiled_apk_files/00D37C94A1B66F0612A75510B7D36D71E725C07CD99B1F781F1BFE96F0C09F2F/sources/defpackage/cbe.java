package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cbe  reason: default package */
/* loaded from: classes2.dex */
public final class cbe extends cbd {
    private byy h;
    private final List i;
    private final RectF j;
    private final RectF k;

    public cbe(bxn bxnVar, cbg cbgVar, List list, bwx bwxVar) {
        super(bxnVar, cbgVar);
        cbd cbdVar;
        cbd cbeVar;
        String str;
        this.i = new ArrayList();
        this.j = new RectF();
        this.k = new RectF();
        new Paint();
        bzz bzzVar = cbgVar.r;
        if (bzzVar != null) {
            byy a = bzzVar.a();
            this.h = a;
            h(a);
            this.h.g(this);
        } else {
            this.h = null;
        }
        agb agbVar = new agb(bwxVar.f.size());
        int size = list.size() - 1;
        cbd cbdVar2 = null;
        while (true) {
            if (size >= 0) {
                cbg cbgVar2 = (cbg) list.get(size);
                int i = cbgVar2.u;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    cbeVar = new cbe(bxnVar, cbgVar2, (List) bwxVar.a.get(cbgVar2.f), bwxVar);
                } else if (i2 == 1) {
                    cbeVar = new cbj(bxnVar, cbgVar2);
                } else if (i2 == 2) {
                    cbeVar = new cbf(bxnVar, cbgVar2);
                } else if (i2 == 3) {
                    cbeVar = new cbh(bxnVar, cbgVar2);
                } else if (i2 == 4) {
                    cbeVar = new cbi(bxnVar, cbgVar2);
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
                    cda.a(sb.toString());
                    cbeVar = null;
                } else {
                    cbeVar = new cbm(bxnVar, cbgVar2);
                }
                if (cbeVar != null) {
                    agbVar.k(cbeVar.c.d, cbeVar);
                    if (cbdVar2 != null) {
                        cbdVar2.e = cbeVar;
                        cbdVar2 = null;
                    } else {
                        this.i.add(0, cbeVar);
                        int i3 = cbgVar2.v;
                        int i4 = i3 - 1;
                        if (i3 == 0) {
                            throw null;
                        }
                        if (i4 == 1 || i4 == 2) {
                            cbdVar2 = cbeVar;
                        }
                    }
                }
                size--;
            } else {
                for (int i5 = 0; i5 < agbVar.c(); i5++) {
                    cbd cbdVar3 = (cbd) agbVar.f(agbVar.d(i5));
                    if (cbdVar3 != null && (cbdVar = (cbd) agbVar.f(cbdVar3.c.e)) != null) {
                        cbdVar3.f = cbdVar;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.cbd, defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        super.a(obj, cdjVar);
        if (obj == bxs.C) {
            bzn bznVar = new bzn(cdjVar);
            this.h = bznVar;
            bznVar.g(this);
            h(this.h);
        }
    }

    @Override // defpackage.cbd, defpackage.bye
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        int size = this.i.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
                ((cbd) this.i.get(size)).c(this.j, this.a, true);
                rectF.union(this.j);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.cbd
    public final void i(Canvas canvas, Matrix matrix, int i) {
        RectF rectF = this.k;
        cbg cbgVar = this.c;
        rectF.set(0.0f, 0.0f, cbgVar.n, cbgVar.o);
        matrix.mapRect(this.k);
        canvas.save();
        int size = this.i.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (this.k.isEmpty() || canvas.clipRect(this.k)) {
                    ((cbd) this.i.get(size)).b(canvas, matrix, i);
                }
            } else {
                canvas.restore();
                bwr.a();
                return;
            }
        }
    }

    @Override // defpackage.cbd
    public final void k(bzu bzuVar, int i, List list, bzu bzuVar2) {
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            ((cbd) this.i.get(i2)).e(bzuVar, i, list, bzuVar2);
        }
    }

    @Override // defpackage.cbd
    public final void l(float f) {
        super.l(f);
        if (this.h != null) {
            f = ((((Float) this.h.e()).floatValue() * this.c.b.j) - this.c.b.h) / (this.b.a.b() + 0.01f);
        }
        if (this.h == null) {
            cbg cbgVar = this.c;
            f -= cbgVar.m / cbgVar.b.b();
        }
        cbg cbgVar2 = this.c;
        if (cbgVar2.l != 0.0f && !"__container".equals(cbgVar2.c)) {
            f /= this.c.l;
        }
        int size = this.i.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((cbd) this.i.get(size)).l(f);
            } else {
                return;
            }
        }
    }
}
