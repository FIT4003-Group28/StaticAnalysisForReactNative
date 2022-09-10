package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnl  reason: default package */
/* loaded from: classes3.dex */
public abstract class bnl implements bkm, blb, blz {
    final Matrix a;
    final bjr b;
    final bno c;
    public bnl d;
    public bnl e;
    final blq f;
    private final Path g = new Path();
    private final Matrix h = new Matrix();
    private final Paint i = new bkg(1);
    private final Paint j = new bkg(PorterDuff.Mode.DST_IN, null);
    private final Paint k = new bkg(PorterDuff.Mode.DST_OUT, null);
    private final Paint l;
    private final Paint m;
    private final RectF n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private bli r;
    private List<bnl> s;
    private final List<blc<?, ?>> t;
    private boolean u;

    public bnl(bjr bjrVar, bno bnoVar) {
        boolean z = true;
        bkg bkgVar = new bkg(1);
        this.l = bkgVar;
        this.m = new bkg(PorterDuff.Mode.CLEAR);
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.a = new Matrix();
        this.t = new ArrayList();
        this.u = true;
        this.b = bjrVar;
        this.c = bnoVar;
        String str = bnoVar.c;
        if (bnoVar.v == 3) {
            bkgVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            bkgVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        blq a = bnoVar.h.a();
        this.f = a;
        a.b(this);
        List<bmw> list = bnoVar.g;
        if (list != null && !list.isEmpty()) {
            bli bliVar = new bli(bnoVar.g);
            this.r = bliVar;
            for (blc<bnc, Path> blcVar : bliVar.a) {
                blcVar.a(this);
            }
            for (blc<?, ?> blcVar2 : this.r.b) {
                i(blcVar2);
                blcVar2.a(this);
            }
        }
        if (!this.c.s.isEmpty()) {
            ble bleVar = new ble(this.c.s);
            bleVar.b = true;
            bleVar.a(new bnk(this, bleVar));
            l(bleVar.h().floatValue() != 1.0f ? false : z);
            i(bleVar);
            return;
        }
        l(true);
    }

    private final void o() {
        this.b.invalidateSelf();
    }

    private final void p(Canvas canvas) {
        canvas.drawRect(this.n.left - 1.0f, this.n.top - 1.0f, this.n.right + 1.0f, this.n.bottom + 1.0f, this.m);
        bim.a();
    }

    private final void q() {
        if (this.s != null) {
            return;
        }
        if (this.e == null) {
            this.s = Collections.emptyList();
            return;
        }
        this.s = new ArrayList();
        for (bnl bnlVar = this.e; bnlVar != null; bnlVar = bnlVar.e) {
            this.s.add(bnlVar);
        }
    }

    private final void r() {
        bkb bkbVar = this.b.a.a;
        String str = this.c.c;
        if (!bkbVar.a) {
            return;
        }
        bpq bpqVar = bkbVar.c.get(str);
        if (bpqVar == null) {
            bpqVar = new bpq();
            bkbVar.c.put(str, bpqVar);
        }
        int i = bpqVar.a + 1;
        bpqVar.a = i;
        if (i == Integer.MAX_VALUE) {
            bpqVar.a = 1073741823;
        }
        if (!str.equals("__container")) {
            return;
        }
        for (bka bkaVar : bkbVar.b) {
            bkaVar.a();
        }
    }

    @Override // defpackage.blb
    public final void a() {
        o();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
    }

    @Override // defpackage.bkm
    public void d(RectF rectF, Matrix matrix, boolean z) {
        this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
        q();
        this.a.set(matrix);
        if (z) {
            List<bnl> list = this.s;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.a.preConcat(this.s.get(size).f.c());
                }
            } else {
                bnl bnlVar = this.e;
                if (bnlVar != null) {
                    this.a.preConcat(bnlVar.f.c());
                }
            }
        }
        this.a.preConcat(this.f.c());
    }

    @Override // defpackage.blz
    public final void e(bly blyVar, int i, List<bly> list, bly blyVar2) {
        if (!blyVar.c(g(), i)) {
            return;
        }
        if (!"__container".equals(g())) {
            blyVar2 = blyVar2.a(g());
            if (blyVar.e(g(), i)) {
                list.add(blyVar2.b(this));
            }
        }
        if (!blyVar.f(g(), i)) {
            return;
        }
        n(blyVar, i + blyVar.d(g(), i), list, blyVar2);
    }

    @Override // defpackage.blz
    public <T> void f(T t, bpv<T> bpvVar) {
        this.f.e(t, bpvVar);
    }

    @Override // defpackage.bkk
    public final String g() {
        return this.c.c;
    }

    final boolean h() {
        return this.d != null;
    }

    public final void i(blc<?, ?> blcVar) {
        if (blcVar == null) {
            return;
        }
        this.t.add(blcVar);
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i);

    final boolean k() {
        bli bliVar = this.r;
        return bliVar != null && !bliVar.a.isEmpty();
    }

    public final void l(boolean z) {
        if (z != this.u) {
            this.u = z;
            o();
        }
    }

    public void m(float f) {
        blq blqVar = this.f;
        blc<Integer, Integer> blcVar = blqVar.e;
        if (blcVar != null) {
            blcVar.b(f);
        }
        blc<?, Float> blcVar2 = blqVar.h;
        if (blcVar2 != null) {
            blcVar2.b(f);
        }
        blc<?, Float> blcVar3 = blqVar.i;
        if (blcVar3 != null) {
            blcVar3.b(f);
        }
        blc<PointF, PointF> blcVar4 = blqVar.a;
        if (blcVar4 != null) {
            blcVar4.b(f);
        }
        blc<?, PointF> blcVar5 = blqVar.b;
        if (blcVar5 != null) {
            blcVar5.b(f);
        }
        blc<bpw, bpw> blcVar6 = blqVar.c;
        if (blcVar6 != null) {
            blcVar6.b(f);
        }
        blc<Float, Float> blcVar7 = blqVar.d;
        if (blcVar7 != null) {
            blcVar7.b(f);
        }
        ble bleVar = blqVar.f;
        if (bleVar != null) {
            bleVar.b(f);
        }
        ble bleVar2 = blqVar.g;
        if (bleVar2 != null) {
            bleVar2.b(f);
        }
        if (this.r != null) {
            for (int i = 0; i < this.r.a.size(); i++) {
                this.r.a.get(i).b(f);
            }
        }
        float f2 = this.c.l;
        if (f2 != 0.0f) {
            f /= f2;
        }
        bnl bnlVar = this.d;
        if (bnlVar != null) {
            bnlVar.m(bnlVar.c.l * f);
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            this.t.get(i2).b(f);
        }
    }

    public void n(bly blyVar, int i, List<bly> list, bly blyVar2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0111, code lost:
        if (r15 != r10) goto L36;
     */
    @Override // defpackage.bkm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnl.c(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
