package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: byd  reason: default package */
/* loaded from: classes2.dex */
public final class byd implements bye, bym, byt, bzv {
    private final Matrix a;
    private final Path b;
    private final RectF c;
    private final String d;
    private final boolean e;
    private final List f;
    private final bxn g;
    private List h;
    private bzm i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byd(defpackage.bxn r8, defpackage.cbd r9, defpackage.cay r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.List r0 = r10.b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L11:
            int r6 = r0.size()
            if (r2 >= r6) goto L29
            java.lang.Object r6 = r0.get(r2)
            can r6 = (defpackage.can) r6
            byc r6 = r6.a(r8, r9)
            if (r6 == 0) goto L26
            r5.add(r6)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            java.util.List r10 = r10.b
        L2b:
            int r0 = r10.size()
            if (r1 >= r0) goto L42
            java.lang.Object r0 = r10.get(r1)
            can r0 = (defpackage.can) r0
            boolean r2 = r0 instanceof defpackage.caj
            if (r2 == 0) goto L3f
            caj r0 = (defpackage.caj) r0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byd.<init>(bxn, cbd, cay):void");
    }

    @Override // defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        bzm bzmVar = this.i;
        if (bzmVar != null) {
            bzmVar.e(obj, cdjVar);
        }
    }

    @Override // defpackage.bye
    public final void b(Canvas canvas, Matrix matrix, int i) {
        byy byyVar;
        if (this.e) {
            return;
        }
        this.a.set(matrix);
        bzm bzmVar = this.i;
        if (bzmVar != null) {
            this.a.preConcat(bzmVar.a());
            i = (int) (((((this.i.e == null ? 100 : ((Integer) byyVar.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = this.f.get(size);
            if (obj instanceof bye) {
                ((bye) obj).b(canvas, this.a, i);
            }
        }
    }

    @Override // defpackage.bye
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.a.set(matrix);
        bzm bzmVar = this.i;
        if (bzmVar != null) {
            this.a.preConcat(bzmVar.a());
        }
        this.c.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                byc bycVar = (byc) this.f.get(size);
                if (bycVar instanceof bye) {
                    ((bye) bycVar).c(this.c, this.a, z);
                    rectF.union(this.c);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.byt
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.bzv
    public final void e(bzu bzuVar, int i, List list, bzu bzuVar2) {
        if (bzuVar.e(this.d, i) || "__container".equals(this.d)) {
            if (!"__container".equals(this.d)) {
                bzuVar2 = bzuVar2.b(this.d);
                if (bzuVar.d(this.d, i)) {
                    list.add(bzuVar2.c(this));
                }
            }
            if (!bzuVar.f(this.d, i)) {
                return;
            }
            int a = i + bzuVar.a(this.d, i);
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                byc bycVar = (byc) this.f.get(i2);
                if (bycVar instanceof bzv) {
                    ((bzv) bycVar).e(bzuVar, a, list, bzuVar2);
                }
            }
        }
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f.size());
        arrayList.addAll(list);
        int size = this.f.size();
        while (true) {
            size--;
            if (size >= 0) {
                byc bycVar = (byc) this.f.get(size);
                bycVar.f(arrayList, this.f.subList(0, size));
                arrayList.add(bycVar);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.byc
    public final String g() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Matrix h() {
        bzm bzmVar = this.i;
        if (bzmVar != null) {
            return bzmVar.a();
        }
        this.a.reset();
        return this.a;
    }

    @Override // defpackage.bym
    public final Path i() {
        this.a.reset();
        bzm bzmVar = this.i;
        if (bzmVar != null) {
            this.a.set(bzmVar.a());
        }
        this.b.reset();
        if (this.e) {
            return this.b;
        }
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.b;
            }
            byc bycVar = (byc) this.f.get(size);
            if (bycVar instanceof bym) {
                this.b.addPath(((bym) bycVar).i(), this.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i = 0; i < this.f.size(); i++) {
                byc bycVar = (byc) this.f.get(i);
                if (bycVar instanceof bym) {
                    this.h.add((bym) bycVar);
                }
            }
        }
        return this.h;
    }

    public byd(bxn bxnVar, cbd cbdVar, String str, boolean z, List list, caj cajVar) {
        new bxz();
        new RectF();
        this.a = new Matrix();
        this.b = new Path();
        this.c = new RectF();
        this.d = str;
        this.g = bxnVar;
        this.e = z;
        this.f = list;
        if (cajVar != null) {
            bzm b = cajVar.b();
            this.i = b;
            b.c(cbdVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            byc bycVar = (byc) list.get(size);
            if (bycVar instanceof byj) {
                arrayList.add((byj) bycVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((byj) arrayList.get(size2)).h(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }
}
