package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: sdn  reason: default package */
/* loaded from: classes4.dex */
public abstract class sdn implements scy, sbn {
    public sdg a;
    private set b;
    private final Map c = shp.h();
    private Map d = shp.h();
    private Map e = shp.h();
    private int f = 0;
    private int g = PrivateKeyType.INVALID;
    private int h = 0;
    private int i = PrivateKeyType.INVALID;
    private int l = 4;
    private final Rect j = new Rect();
    private final Rect k = new Rect();

    private final float l(Object obj, set setVar) {
        float round = Math.round(setVar.a(obj));
        if (setVar.c() > 0.0f) {
            int i = this.a.k;
        }
        return round;
    }

    private final void m(Canvas canvas, Collection collection, Paint paint, TextPaint textPaint) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sdm sdmVar = (sdm) it.next();
            h(canvas, sdmVar, this.j, this.k, this.l, paint);
            if (sdmVar.b != null) {
                g(canvas, sdmVar, this.j, this.k, this.l, textPaint);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.sdb n(java.util.List r9, java.util.List r10, int r11, defpackage.set r12, float r13, boolean r14) {
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
            defpackage.sho.a(r0, r1)
            sdb r0 = new sdb
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
            sgm r5 = defpackage.sgm.a(r5)
            int r6 = r9.size()
            sdm r4 = r8.k(r4, r5, r2, r6)
            r4.c(r13)
            sdg r5 = r8.a
            android.text.TextPaint r5 = r5.h
            r8.j(r4, r12, r11, r5)
            java.util.List r5 = r0.b
            r5.add(r4)
            sdg r5 = r8.a
            int r5 = r5.f
            sek r5 = r4.d
            if (r5 == 0) goto Laa
            if (r1 == 0) goto Laa
            sek r6 = r1.d
            if (r6 != 0) goto L5a
            goto Laa
        L5a:
            java.lang.Object r5 = r5.a
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            sek r6 = r1.d
            java.lang.Object r6 = r6.a
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r7 = 1101004800(0x41a00000, float:20.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L8c
            sek r5 = r4.d
            java.lang.Object r5 = r5.b
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            float r5 = r5 + r7
            sek r1 = r1.d
            java.lang.Object r1 = r1.a
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto Laa
            goto La5
        L8c:
            sek r1 = r1.d
            java.lang.Object r1 = r1.b
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            float r1 = r1 + r7
            sek r5 = r4.d
            java.lang.Object r5 = r5.a
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Laa
        La5:
            r0.a = r3
            if (r14 == 0) goto Laa
            return r0
        Laa:
            int r2 = r2 + 1
            r1 = r4
            goto L20
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdn.n(java.util.List, java.util.List, int, set, float, boolean):sdb");
    }

    @Override // defpackage.scy
    public final sdg a() {
        return this.a;
    }

    @Override // defpackage.scy
    public final void c(sdg sdgVar) {
        this.a = sdgVar;
    }

    @Override // defpackage.scy
    public final void d(int i, set setVar, List list, Rect rect, Rect rect2) {
        float f;
        this.l = i;
        this.j.set(rect);
        this.k.set(rect2);
        this.c.putAll(this.d);
        this.c.putAll(this.e);
        this.d = shp.h();
        this.e = shp.h();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sdm sdmVar = (sdm) list.get(i2);
            Object obj = sdmVar.a;
            if (setVar.d(obj) == 0) {
                sdm sdmVar2 = (sdm) this.c.remove(obj);
                if (sdmVar2 != null) {
                    i(sdmVar2, sdmVar, setVar, i);
                    this.d.put(obj, sdmVar2);
                } else {
                    f(sdmVar, setVar, this.b, i);
                    this.e.put(obj, sdmVar);
                }
            }
        }
        for (Object obj2 : this.c.keySet()) {
            sdm sdmVar3 = (sdm) this.c.get(obj2);
            Object obj3 = sdmVar3.a;
            if (setVar.o(obj3)) {
                f = l(obj3, setVar);
            } else {
                f = sdmVar3.e;
            }
            sdmVar3.b(f);
        }
        this.b = setVar.h();
    }

    @Override // defpackage.sda
    public final sdb e(List list, List list2, int i, set setVar, boolean z) {
        float f = this.a.e;
        sdb n = n(list, list2, i, setVar, 0.0f, z || f != 0.0f);
        return (!n.a || f == 0.0f) ? n : n(list, list2, i, setVar, f, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(sdm sdmVar, set setVar, set setVar2, int i) {
        Object obj = sdmVar.a;
        float l = l(obj, setVar);
        sdmVar.a((setVar2 == null || !setVar2.o(obj)) ? l : l(obj, setVar2));
        sdmVar.b(l);
        float f = sdmVar.h;
        sdmVar.f = f;
        sdmVar.e = f;
    }

    protected abstract void g(Canvas canvas, sdm sdmVar, Rect rect, Rect rect2, int i, TextPaint textPaint);

    protected abstract void h(Canvas canvas, sdm sdmVar, Rect rect, Rect rect2, int i, Paint paint);

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(sdm sdmVar, sdm sdmVar2, set setVar, int i) {
        sdmVar.b(l(sdmVar2.a, setVar));
        sdmVar.c(sdmVar2.h);
        sdmVar.b = sgm.a(sdmVar2.b);
    }

    protected abstract void j(sdm sdmVar, set setVar, int i, TextPaint textPaint);

    protected sdm k(Object obj, CharSequence charSequence, int i, int i2) {
        return new sdm(obj, charSequence);
    }

    @Override // defpackage.sbn
    public final void setAnimationPercent(float f) {
        for (sdm sdmVar : this.c.values()) {
            sdmVar.setAnimationPercent(f);
        }
        for (sdm sdmVar2 : this.d.values()) {
            sdmVar2.setAnimationPercent(f);
        }
        for (sdm sdmVar3 : this.e.values()) {
            sdmVar3.setAnimationPercent(f);
        }
        if (f >= 1.0f) {
            this.c.clear();
        }
        int alpha = this.a.i.getAlpha();
        double d = f;
        Double.isNaN(d);
        double d2 = 1.0d - d;
        double d3 = alpha;
        Double.isNaN(d3);
        this.h = (int) (d3 * d2);
        this.i = (int) (alpha * f);
        int alpha2 = this.a.h.getAlpha();
        double d4 = alpha2;
        Double.isNaN(d4);
        this.f = (int) (d4 * d2);
        this.g = (int) (alpha2 * f);
    }

    @Override // defpackage.scy
    public final void b(Canvas canvas, boolean z) {
        if (z) {
            Rect rect = this.j;
            int i = this.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                canvas.drawLine(rect.left, rect.bottom, rect.right, rect.bottom, this.a.j);
            } else if (i2 == 1) {
                canvas.drawLine(rect.left, rect.top, rect.left, rect.bottom, this.a.j);
            } else if (i2 == 2) {
                canvas.drawLine(rect.left, rect.top, rect.right, rect.top, this.a.j);
            } else {
                canvas.drawLine(rect.right, rect.top, rect.right, rect.bottom, this.a.j);
            }
        }
        sdg sdgVar = this.a;
        Paint paint = sdgVar.i;
        TextPaint textPaint = sdgVar.h;
        int alpha = paint.getAlpha();
        int alpha2 = textPaint.getAlpha();
        paint.setAlpha(this.i);
        textPaint.setAlpha(this.g);
        m(canvas, this.e.values(), paint, textPaint);
        paint.setAlpha(alpha);
        textPaint.setAlpha(alpha2);
        m(canvas, this.d.values(), paint, textPaint);
        paint.setAlpha(this.h);
        textPaint.setAlpha(this.f);
        m(canvas, this.c.values(), paint, textPaint);
        paint.setAlpha(alpha);
        textPaint.setAlpha(alpha2);
    }
}
