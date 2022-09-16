package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cbd  reason: default package */
/* loaded from: classes2.dex */
public abstract class cbd implements bye, byt, bzv {
    final Matrix a;
    final bxn b;
    final cbg c;
    public bza d;
    public cbd e;
    public cbd f;
    final bzm g;
    private final Path h = new Path();
    private final Matrix i = new Matrix();
    private final Paint j = new bxz(1);
    private final Paint k = new bxz(PorterDuff.Mode.DST_IN, null);
    private final Paint l = new bxz(PorterDuff.Mode.DST_OUT, null);
    private final Paint m;
    private final Paint n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final RectF r;
    private bze s;
    private List t;
    private final List u;
    private boolean v;

    public cbd(bxn bxnVar, cbg cbgVar) {
        boolean z = true;
        bxz bxzVar = new bxz(1);
        this.m = bxzVar;
        this.n = new bxz(PorterDuff.Mode.CLEAR);
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new RectF();
        this.a = new Matrix();
        this.u = new ArrayList();
        this.v = true;
        this.b = bxnVar;
        this.c = cbgVar;
        String.valueOf(cbgVar.c).concat("#draw");
        if (cbgVar.v == 3) {
            bxzVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            bxzVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        bzm b = cbgVar.h.b();
        this.g = b;
        b.d(this);
        List list = cbgVar.g;
        if (list != null && !list.isEmpty()) {
            bze bzeVar = new bze(cbgVar.g);
            this.s = bzeVar;
            for (byy byyVar : bzeVar.a) {
                byyVar.g(this);
            }
            for (byy byyVar2 : this.s.b) {
                h(byyVar2);
                byyVar2.g(this);
            }
        }
        if (!this.c.s.isEmpty()) {
            bza bzaVar = new bza(this.c.s);
            this.d = bzaVar;
            bzaVar.b = true;
            bzaVar.g(new cbc(this));
            m(((Float) this.d.e()).floatValue() != 1.0f ? false : z);
            h(this.d);
            return;
        }
        m(true);
    }

    private final void p() {
        if (this.t != null) {
            return;
        }
        if (this.f == null) {
            this.t = Collections.emptyList();
            return;
        }
        this.t = new ArrayList();
        for (cbd cbdVar = this.f; cbdVar != null; cbdVar = cbdVar.f) {
            this.t.add(cbdVar);
        }
    }

    private final void q(Canvas canvas) {
        canvas.drawRect(this.o.left - 1.0f, this.o.top - 1.0f, this.o.right + 1.0f, this.o.bottom + 1.0f, this.n);
        bwr.a();
    }

    private final void r() {
        this.b.invalidateSelf();
    }

    private final void s() {
        aej aejVar = this.b.a.m;
        String str = this.c.c;
    }

    @Override // defpackage.bzv
    public void a(Object obj, cdj cdjVar) {
        this.g.e(obj, cdjVar);
    }

    @Override // defpackage.bye
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        p();
        this.a.set(matrix);
        if (z) {
            List list = this.t;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.a.preConcat(((cbd) this.t.get(size)).g.a());
                }
            } else {
                cbd cbdVar = this.f;
                if (cbdVar != null) {
                    this.a.preConcat(cbdVar.g.a());
                }
            }
        }
        this.a.preConcat(this.g.a());
    }

    @Override // defpackage.byt
    public final void d() {
        r();
    }

    @Override // defpackage.bzv
    public final void e(bzu bzuVar, int i, List list, bzu bzuVar2) {
        cbd cbdVar = this.e;
        if (cbdVar != null) {
            bzu b = bzuVar2.b(cbdVar.g());
            if (bzuVar.d(this.e.g(), i)) {
                list.add(b.c(this.e));
            }
            if (bzuVar.f(g(), i)) {
                this.e.k(bzuVar, bzuVar.a(this.e.g(), i) + i, list, b);
            }
        }
        if (!bzuVar.e(g(), i)) {
            return;
        }
        if (!"__container".equals(g())) {
            bzuVar2 = bzuVar2.b(g());
            if (bzuVar.d(g(), i)) {
                list.add(bzuVar2.c(this));
            }
        }
        if (!bzuVar.f(g(), i)) {
            return;
        }
        k(bzuVar, i + bzuVar.a(g(), i), list, bzuVar2);
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
    }

    @Override // defpackage.byc
    public final String g() {
        return this.c.c;
    }

    public final void h(byy byyVar) {
        if (byyVar == null) {
            return;
        }
        this.u.add(byyVar);
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i);

    public final void j(byy byyVar) {
        this.u.remove(byyVar);
    }

    public void k(bzu bzuVar, int i, List list, bzu bzuVar2) {
    }

    public void l(float f) {
        bzm bzmVar = this.g;
        byy byyVar = bzmVar.e;
        if (byyVar != null) {
            byyVar.i(f);
        }
        byy byyVar2 = bzmVar.h;
        if (byyVar2 != null) {
            byyVar2.i(f);
        }
        byy byyVar3 = bzmVar.i;
        if (byyVar3 != null) {
            byyVar3.i(f);
        }
        byy byyVar4 = bzmVar.a;
        if (byyVar4 != null) {
            byyVar4.i(f);
        }
        byy byyVar5 = bzmVar.b;
        if (byyVar5 != null) {
            byyVar5.i(f);
        }
        byy byyVar6 = bzmVar.c;
        if (byyVar6 != null) {
            byyVar6.i(f);
        }
        byy byyVar7 = bzmVar.d;
        if (byyVar7 != null) {
            byyVar7.i(f);
        }
        bza bzaVar = bzmVar.f;
        if (bzaVar != null) {
            bzaVar.i(f);
        }
        bza bzaVar2 = bzmVar.g;
        if (bzaVar2 != null) {
            bzaVar2.i(f);
        }
        if (this.s != null) {
            for (int i = 0; i < this.s.a.size(); i++) {
                ((byy) this.s.a.get(i)).i(f);
            }
        }
        bza bzaVar3 = this.d;
        if (bzaVar3 != null) {
            bzaVar3.i(f);
        }
        cbd cbdVar = this.e;
        if (cbdVar != null) {
            cbdVar.l(f);
        }
        for (int i2 = 0; i2 < this.u.size(); i2++) {
            ((byy) this.u.get(i2)).i(f);
        }
    }

    public final void m(boolean z) {
        if (z != this.v) {
            this.v = z;
            r();
        }
    }

    final boolean n() {
        bze bzeVar = this.s;
        return bzeVar != null && !bzeVar.a.isEmpty();
    }

    final boolean o() {
        return this.e != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    @Override // defpackage.bye
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbd.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
