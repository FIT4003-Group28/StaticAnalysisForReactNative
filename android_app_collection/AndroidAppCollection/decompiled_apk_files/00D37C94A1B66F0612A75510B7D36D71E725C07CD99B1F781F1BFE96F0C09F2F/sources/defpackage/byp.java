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
/* renamed from: byp  reason: default package */
/* loaded from: classes2.dex */
public final class byp implements bye, bym, byj, byt, byk {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final bxn c;
    private final cbd d;
    private final String e;
    private final boolean f;
    private final byy g;
    private final byy h;
    private final bzm i;
    private byd j;

    public byp(bxn bxnVar, cbd cbdVar, cav cavVar) {
        this.c = bxnVar;
        this.d = cbdVar;
        this.e = cavVar.a;
        this.f = cavVar.e;
        byy a = cavVar.b.a();
        this.g = a;
        cbdVar.h(a);
        a.g(this);
        byy a2 = cavVar.c.a();
        this.h = a2;
        cbdVar.h(a2);
        a2.g(this);
        bzm b = cavVar.d.b();
        this.i = b;
        b.c(cbdVar);
        b.d(this);
    }

    @Override // defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        byy byyVar;
        if (this.i.e(obj, cdjVar)) {
            return;
        }
        if (obj == bxs.s) {
            byyVar = this.g;
        } else if (obj != bxs.t) {
            return;
        } else {
            byyVar = this.h;
        }
        byyVar.d = cdjVar;
    }

    @Override // defpackage.bye
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        float floatValue3 = ((Float) this.i.h.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.i.i.e()).floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(matrix);
                float f = i2;
                this.a.preConcat(this.i.b(f + floatValue2));
                this.j.b(canvas, this.a, (int) (i * cdc.c(floatValue3, floatValue4, f / floatValue)));
            } else {
                return;
            }
        }
    }

    @Override // defpackage.bye
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.byt
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.bzv
    public final void e(bzu bzuVar, int i, List list, bzu bzuVar2) {
        cdc.h(bzuVar, i, list, bzuVar2, this);
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.byc
    public final String g() {
        return this.e;
    }

    @Override // defpackage.byj
    public final void h(ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((byc) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new byd(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.bym
    public final Path i() {
        Path i = this.j.i();
        this.b.reset();
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 >= 0) {
                this.a.set(this.i.b(i2 + floatValue2));
                this.b.addPath(i, this.a);
            } else {
                return this.b;
            }
        }
    }
}
