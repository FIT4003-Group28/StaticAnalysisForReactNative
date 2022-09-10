package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: bkx  reason: default package */
/* loaded from: classes3.dex */
public final class bkx implements bkm, bku, bkr, blb, bks {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final bjr c;
    private final bnl d;
    private final String e;
    private final boolean f;
    private final blc<Float, Float> g;
    private final blc<Float, Float> h;
    private final blq i;
    private bkl j;

    public bkx(bjr bjrVar, bnl bnlVar, bnb bnbVar) {
        this.c = bjrVar;
        this.d = bnlVar;
        this.e = bnbVar.a;
        this.f = bnbVar.e;
        blc<Float, Float> a = bnbVar.b.a();
        this.g = a;
        bnlVar.i(a);
        a.a(this);
        blc<Float, Float> a2 = bnbVar.c.a();
        this.h = a2;
        bnlVar.i(a2);
        a2.a(this);
        blq a3 = bnbVar.d.a();
        this.i = a3;
        a3.a(bnlVar);
        a3.b(this);
    }

    @Override // defpackage.blb
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.bkm
    public final void c(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        float floatValue3 = this.i.h.h().floatValue() / 100.0f;
        float floatValue4 = this.i.i.h().floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(matrix);
                float f = i2;
                this.a.preConcat(this.i.d(f + floatValue2));
                this.j.c(canvas, this.a, (int) (i * bpr.c(floatValue3, floatValue4, f / floatValue)));
            } else {
                return;
            }
        }
    }

    @Override // defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // defpackage.blz
    public final void e(bly blyVar, int i, List<bly> list, bly blyVar2) {
        bpr.i(blyVar, i, list, blyVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        blc<Float, Float> blcVar;
        if (this.i.e(t, bpvVar)) {
            return;
        }
        if (t == bjv.q) {
            blcVar = this.g;
        } else if (t != bjv.r) {
            return;
        } else {
            blcVar = this.h;
        }
        blcVar.d = bpvVar;
    }

    @Override // defpackage.bkk
    public final String g() {
        return this.e;
    }

    @Override // defpackage.bkr
    public final void h(ListIterator<bkk> listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new bkl(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.bku
    public final Path j() {
        Path j = this.j.j();
        this.b.reset();
        float floatValue = this.g.h().floatValue();
        float floatValue2 = this.h.h().floatValue();
        int i = (int) floatValue;
        while (true) {
            i--;
            if (i >= 0) {
                this.a.set(this.i.d(i + floatValue2));
                this.b.addPath(j, this.a);
            } else {
                return this.b;
            }
        }
    }
}
