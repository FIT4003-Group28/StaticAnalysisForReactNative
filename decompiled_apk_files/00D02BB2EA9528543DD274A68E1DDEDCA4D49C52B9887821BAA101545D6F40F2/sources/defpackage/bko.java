package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bko  reason: default package */
/* loaded from: classes3.dex */
public final class bko implements bkm, blb, bks {
    private final Path a;
    private final Paint b;
    private final bnl c;
    private final String d;
    private final boolean e;
    private final List<bku> f;
    private final blc<Integer, Integer> g;
    private final blc<Integer, Integer> h;
    private blc<ColorFilter, ColorFilter> i;
    private final bjr j;

    public bko(bjr bjrVar, bnl bnlVar, bnd bndVar) {
        Path path = new Path();
        this.a = path;
        this.b = new bkg(1);
        this.f = new ArrayList();
        this.c = bnlVar;
        this.d = bndVar.b;
        this.e = bndVar.e;
        this.j = bjrVar;
        if (bndVar.c == null || bndVar.d == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(bndVar.a);
        blc<Integer, Integer> a = bndVar.c.a();
        this.g = a;
        a.a(this);
        bnlVar.i(a);
        blc<Integer, Integer> a2 = bndVar.d.a();
        this.h = a2;
        a2.a(this);
        bnlVar.i(a2);
    }

    @Override // defpackage.blb
    public final void a() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.bkk
    public final void b(List<bkk> list, List<bkk> list2) {
        for (int i = 0; i < list2.size(); i++) {
            bkk bkkVar = list2.get(i);
            if (bkkVar instanceof bku) {
                this.f.add((bku) bkkVar);
            }
        }
    }

    @Override // defpackage.bkm
    public final void c(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((bld) this.g).k());
        this.b.setAlpha(bpr.j((int) ((((i / 255.0f) * this.h.h().intValue()) / 100.0f) * 255.0f)));
        blc<ColorFilter, ColorFilter> blcVar = this.i;
        if (blcVar != null) {
            this.b.setColorFilter(blcVar.h());
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(this.f.get(i2).j(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        bim.a();
    }

    @Override // defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(this.f.get(i).j(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.blz
    public final void e(bly blyVar, int i, List<bly> list, bly blyVar2) {
        bpr.i(blyVar, i, list, blyVar2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.blz
    public final <T> void f(T t, bpv<T> bpvVar) {
        if (t == bjv.a) {
            this.g.d = bpvVar;
        } else if (t == bjv.d) {
            this.h.d = bpvVar;
        } else if (t != bjv.B) {
        } else {
            blr blrVar = new blr(bpvVar);
            this.i = blrVar;
            blrVar.a(this);
            this.c.i(this.i);
        }
    }

    @Override // defpackage.bkk
    public final String g() {
        return this.d;
    }
}
