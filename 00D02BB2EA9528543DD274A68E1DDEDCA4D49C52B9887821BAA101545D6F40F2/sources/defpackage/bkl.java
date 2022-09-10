package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkl  reason: default package */
/* loaded from: classes3.dex */
public final class bkl implements bkm, bku, blb, blz {
    private Paint a;
    private RectF b;
    private final Matrix c;
    private final Path d;
    private final RectF e;
    private final String f;
    private final boolean g;
    private final List<bkk> h;
    private final bjr i;
    private List<bku> j;
    private blq k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bkl(defpackage.bjr r8, defpackage.bnl r9, defpackage.bne r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.List<bms> r0 = r10.b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L11:
            int r6 = r0.size()
            if (r2 >= r6) goto L29
            java.lang.Object r6 = r0.get(r2)
            bms r6 = (defpackage.bms) r6
            bkk r6 = r6.b(r8, r9)
            if (r6 == 0) goto L26
            r5.add(r6)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            java.util.List<bms> r10 = r10.b
        L2b:
            int r0 = r10.size()
            if (r1 >= r0) goto L42
            java.lang.Object r0 = r10.get(r1)
            bms r0 = (defpackage.bms) r0
            boolean r2 = r0 instanceof defpackage.bmo
            if (r2 == 0) goto L3f
            bmo r0 = (defpackage.bmo) r0
            r6 = r0
            goto L44
        L3f:
            int r1 = r1 + 1
            goto L2b
        L42:
            r10 = 0
            r6 = r10
        L44:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkl.<init>(bjr, bnl, bne):void");
    }

    @Override // defpackage.blb
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.h.size());
        arrayList.addAll(list);
        int size = this.h.size();
        while (true) {
            size--;
            if (size >= 0) {
                bkk bkkVar = this.h.get(size);
                bkkVar.b(arrayList, this.h.subList(0, size));
                arrayList.add(bkkVar);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.bkm
    public final void c(Canvas canvas, Matrix matrix, int i) {
        blc<Integer, Integer> blcVar;
        if (this.g) {
            return;
        }
        this.c.set(matrix);
        blq blqVar = this.k;
        if (blqVar != null) {
            this.c.preConcat(blqVar.c());
            i = (int) (((((this.k.e == null ? 100 : blcVar.h().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        int i2 = 255;
        boolean z = false;
        if (this.i.p) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= this.h.size()) {
                    break;
                } else if (!(this.h.get(i3) instanceof bkm) || (i4 = i4 + 1) < 2) {
                    i3++;
                } else if (i != 255) {
                    z = true;
                } else {
                    i = 255;
                }
            }
        }
        if (z) {
            this.b.set(0.0f, 0.0f, 0.0f, 0.0f);
            d(this.b, this.c, true);
            this.a.setAlpha(i);
            bps.k(canvas, this.b, this.a);
        }
        if (true != z) {
            i2 = i;
        }
        int size = this.h.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            bkk bkkVar = this.h.get(size);
            if (bkkVar instanceof bkm) {
                ((bkm) bkkVar).c(canvas, this.c, i2);
            }
        }
        if (!z) {
            return;
        }
        canvas.restore();
    }

    @Override // defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.c.set(matrix);
        blq blqVar = this.k;
        if (blqVar != null) {
            this.c.preConcat(blqVar.c());
        }
        this.e.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.h.size();
        while (true) {
            size--;
            if (size >= 0) {
                bkk bkkVar = this.h.get(size);
                if (bkkVar instanceof bkm) {
                    ((bkm) bkkVar).d(this.e, this.c, z);
                    rectF.union(this.e);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.blz
    public final void e(bly blyVar, int i, List<bly> list, bly blyVar2) {
        if (!blyVar.c(this.f, i)) {
            return;
        }
        if (!"__container".equals(this.f)) {
            blyVar2 = blyVar2.a(this.f);
            if (blyVar.e(this.f, i)) {
                list.add(blyVar2.b(this));
            }
        }
        if (!blyVar.f(this.f, i)) {
            return;
        }
        int d = i + blyVar.d(this.f, i);
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            bkk bkkVar = this.h.get(i2);
            if (bkkVar instanceof blz) {
                ((blz) bkkVar).e(blyVar, d, list, blyVar2);
            }
        }
    }

    @Override // defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        blq blqVar = this.k;
        if (blqVar != null) {
            blqVar.e(t, bpvVar);
        }
    }

    @Override // defpackage.bkk
    public final String g() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<bku> h() {
        if (this.j == null) {
            this.j = new ArrayList();
            for (int i = 0; i < this.h.size(); i++) {
                bkk bkkVar = this.h.get(i);
                if (bkkVar instanceof bku) {
                    this.j.add((bku) bkkVar);
                }
            }
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Matrix i() {
        blq blqVar = this.k;
        if (blqVar != null) {
            return blqVar.c();
        }
        this.c.reset();
        return this.c;
    }

    @Override // defpackage.bku
    public final Path j() {
        this.c.reset();
        blq blqVar = this.k;
        if (blqVar != null) {
            this.c.set(blqVar.c());
        }
        this.d.reset();
        if (this.g) {
            return this.d;
        }
        int size = this.h.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.d;
            }
            bkk bkkVar = this.h.get(size);
            if (bkkVar instanceof bku) {
                this.d.addPath(((bku) bkkVar).j(), this.c);
            }
        }
    }

    public bkl(bjr bjrVar, bnl bnlVar, String str, boolean z, List<bkk> list, bmo bmoVar) {
        this.a = new bkg();
        this.b = new RectF();
        this.c = new Matrix();
        this.d = new Path();
        this.e = new RectF();
        this.f = str;
        this.i = bjrVar;
        this.g = z;
        this.h = list;
        if (bmoVar != null) {
            blq a = bmoVar.a();
            this.k = a;
            a.a(bnlVar);
            this.k.b(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            bkk bkkVar = list.get(size);
            if (bkkVar instanceof bkr) {
                arrayList.add((bkr) bkkVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((bkr) arrayList.get(size2)).h(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
