package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cprz  reason: default package */
/* loaded from: classes5.dex */
public abstract class cprz<D> implements cpre, cppl {
    public cprr a;
    private cpso<D> b;
    private final Map<D, cpry<D>> c = cpwj.a();
    private Map<D, cpry<D>> d = cpwj.a();
    private Map<D, cpry<D>> e = cpwj.a();
    private int f = 0;
    private int g = 255;
    private int h = 0;
    private int i = 255;
    private int l = 4;
    private final Rect j = new Rect();
    private final Rect k = new Rect();

    private final float a(D d, cpso<D> cpsoVar) {
        float round = Math.round(cpsoVar.s(d));
        float l = cpsoVar.l();
        if (l > 0.0f) {
            cprq cprqVar = cprq.LEFT_STEP_EDGE;
            int ordinal = this.a.c.ordinal();
            return ordinal != 0 ? ordinal != 2 ? round : round + (l / 2.0f) : round - (l / 2.0f);
        }
        return round;
    }

    private final void j(Canvas canvas, Collection<cpry<D>> collection, Paint paint, TextPaint textPaint) {
        for (cpry<D> cpryVar : collection) {
            d(canvas, cpryVar, this.j, this.k, this.l, paint);
            if (cpryVar.b != null) {
                e(canvas, cpryVar, this.j, this.k, this.l, textPaint);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.cprh<D> k(java.util.List<D> r9, java.util.List<? extends java.lang.CharSequence> r10, int r11, defpackage.cpso<D> r12, float r13, boolean r14) {
        /*
            r8 = this;
            int r0 = r9.size()
            int r1 = r10.size()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "domainValues and labels should have the same size"
            defpackage.cpwl.c(r0, r1)
            cprh r0 = new cprh
            r0.<init>()
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto Laf
            r1 = 0
        L20:
            int r4 = r9.size()
            if (r2 >= r4) goto Laf
            java.lang.Object r4 = r9.get(r2)
            java.lang.Object r5 = r10.get(r2)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            cpuy r5 = defpackage.cpuy.a(r5)
            r9.size()
            cpry r6 = new cpry
            r6.<init>(r4, r5)
            r6.c(r13)
            cprr r4 = r8.a
            android.text.TextPaint r4 = r4.i
            r8.i(r6, r12, r11, r4)
            java.util.List<cprt<D>> r4 = r0.b
            r4.add(r6)
            cprr r4 = r8.a
            int r4 = r4.g
            cpsf<java.lang.Float> r4 = r6.d
            if (r4 == 0) goto Laa
            if (r1 == 0) goto Laa
            cpsf<java.lang.Float> r5 = r1.d
            if (r5 != 0) goto L5a
            goto Laa
        L5a:
            D r4 = r4.a
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            cpsf<java.lang.Float> r5 = r1.d
            D r5 = r5.a
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r7 = 1101004800(0x41a00000, float:20.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L8c
            cpsf<java.lang.Float> r4 = r6.d
            D r4 = r4.b
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            float r4 = r4 + r7
            cpsf<java.lang.Float> r1 = r1.d
            D r1 = r1.a
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto Laa
            goto La5
        L8c:
            cpsf<java.lang.Float> r1 = r1.d
            D r1 = r1.b
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r1 + r7
            cpsf<java.lang.Float> r4 = r6.d
            D r4 = r4.a
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto Laa
        La5:
            r0.a = r3
            if (r14 == 0) goto Laa
            return r0
        Laa:
            int r2 = r2 + 1
            r1 = r6
            goto L20
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprz.k(java.util.List, java.util.List, int, cpso, float, boolean):cprh");
    }

    @Override // defpackage.cpre
    public void b(Canvas canvas, boolean z) {
        if (z) {
            Rect rect = this.j;
            int i = this.l;
            int i2 = i - 1;
            cprq cprqVar = cprq.LEFT_STEP_EDGE;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                canvas.drawLine(rect.left, rect.bottom, rect.right, rect.bottom, this.a.k);
            } else if (i2 == 1) {
                canvas.drawLine(rect.left, rect.top, rect.left, rect.bottom, this.a.k);
            } else if (i2 == 2) {
                canvas.drawLine(rect.left, rect.top, rect.right, rect.top, this.a.k);
            } else {
                canvas.drawLine(rect.right, rect.top, rect.right, rect.bottom, this.a.k);
            }
        }
        cprr cprrVar = this.a;
        Paint paint = cprrVar.j;
        TextPaint textPaint = cprrVar.i;
        int alpha = paint.getAlpha();
        int alpha2 = textPaint.getAlpha();
        paint.setAlpha(this.i);
        textPaint.setAlpha(this.g);
        j(canvas, this.e.values(), paint, textPaint);
        paint.setAlpha(alpha);
        textPaint.setAlpha(alpha2);
        j(canvas, this.d.values(), paint, textPaint);
        paint.setAlpha(this.h);
        textPaint.setAlpha(this.f);
        j(canvas, this.c.values(), paint, textPaint);
        paint.setAlpha(alpha);
        textPaint.setAlpha(alpha2);
    }

    @Override // defpackage.cpre
    public void c(int i, cpso<D> cpsoVar, List<cprt<D>> list, Rect rect, Rect rect2, Integer num) {
        float f;
        this.l = i;
        this.j.set(rect);
        this.k.set(rect2);
        this.c.putAll(this.d);
        this.c.putAll(this.e);
        this.d = cpwj.a();
        this.e = cpwj.a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            cpry<D> cpryVar = (cpry) list.get(i2);
            D d = cpryVar.a;
            if (cpsoVar.p(d) == 0) {
                cpry<D> remove = this.c.remove(d);
                if (remove != null) {
                    remove.a(a(cpryVar.a, cpsoVar));
                    remove.c(cpryVar.h);
                    remove.b = cpuy.a(cpryVar.b);
                    this.d.put(d, remove);
                } else {
                    cpso<D> cpsoVar2 = this.b;
                    D d2 = cpryVar.a;
                    float a = a(d2, cpsoVar);
                    cpryVar.b((cpsoVar2 == null || !cpsoVar2.q(d2)) ? a : a(d2, cpsoVar2));
                    cpryVar.a(a);
                    float f2 = cpryVar.h;
                    cpryVar.f = f2;
                    cpryVar.e = f2;
                    this.e.put(d, cpryVar);
                }
            }
        }
        for (D d3 : this.c.keySet()) {
            cpry<D> cpryVar2 = this.c.get(d3);
            D d4 = cpryVar2.a;
            if (cpsoVar.q(d4)) {
                f = a(d4, cpsoVar);
            } else {
                f = cpryVar2.e;
            }
            cpryVar2.a(f);
        }
        this.b = cpsoVar.o();
    }

    protected abstract void d(Canvas canvas, cpry<D> cpryVar, Rect rect, Rect rect2, int i, Paint paint);

    protected abstract void e(Canvas canvas, cpry<D> cpryVar, Rect rect, Rect rect2, int i, TextPaint textPaint);

    @Override // defpackage.cpre
    public final void f(cprr cprrVar) {
        this.a = cprrVar;
    }

    @Override // defpackage.cpre
    public final cprr g() {
        return this.a;
    }

    @Override // defpackage.cprg
    public final cprh<D> h(List<D> list, List<? extends CharSequence> list2, int i, cpso<D> cpsoVar) {
        float f = this.a.f;
        cprh<D> k = k(list, list2, i, cpsoVar, 0.0f, f != 0.0f);
        return (!k.a || f == 0.0f) ? k : k(list, list2, i, cpsoVar, f, false);
    }

    protected abstract void i(cpry<D> cpryVar, cpso<D> cpsoVar, int i, TextPaint textPaint);

    @Override // defpackage.cppl
    public final void setAnimationPercent(float f) {
        for (cpry<D> cpryVar : this.c.values()) {
            cpryVar.setAnimationPercent(f);
        }
        for (cpry<D> cpryVar2 : this.d.values()) {
            cpryVar2.setAnimationPercent(f);
        }
        for (cpry<D> cpryVar3 : this.e.values()) {
            cpryVar3.setAnimationPercent(f);
        }
        if (f >= 1.0f) {
            this.c.clear();
        }
        int alpha = this.a.j.getAlpha();
        double d = f;
        Double.isNaN(d);
        double d2 = 1.0d - d;
        double d3 = alpha;
        Double.isNaN(d3);
        this.h = (int) (d3 * d2);
        this.i = (int) (alpha * f);
        int alpha2 = this.a.i.getAlpha();
        double d4 = alpha2;
        Double.isNaN(d4);
        this.f = (int) (d4 * d2);
        this.g = (int) (alpha2 * f);
    }
}
