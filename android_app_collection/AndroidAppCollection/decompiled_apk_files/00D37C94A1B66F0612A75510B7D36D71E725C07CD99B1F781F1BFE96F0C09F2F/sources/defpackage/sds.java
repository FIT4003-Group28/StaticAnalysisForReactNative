package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
/* compiled from: PG */
/* renamed from: sds  reason: default package */
/* loaded from: classes4.dex */
public class sds extends sdn {
    private final Rect b = new Rect();
    private final sgl c = new sgl();

    protected static final int m(int i, float f) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                return f == 0.0f ? 3 : 2;
            } else if (i2 == 1) {
                if (f == 90.0f) {
                    return 3;
                }
                return f == -90.0f ? 1 : 2;
            } else if (i2 == 2) {
                return f == 0.0f ? 1 : 2;
            } else if (f == 90.0f) {
                return 1;
            } else {
                return f == -90.0f ? 3 : 2;
            }
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.sdn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void g(android.graphics.Canvas r14, defpackage.sdm r15, android.graphics.Rect r16, android.graphics.Rect r17, int r18, android.text.TextPaint r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            float r10 = r1.g
            float r5 = r1.e
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            android.graphics.Paint$Align r8 = r13.l(r4, r10, r15)
            int r9 = m(r4, r10)
            int r6 = r4 + (-1)
            if (r4 == 0) goto L93
            if (r6 == 0) goto L67
            r4 = 1
            if (r6 == r4) goto L51
            r4 = 2
            if (r6 == r4) goto L3b
            int r4 = r2.right
            sdg r6 = r0.a
            int r6 = r6.d
            int r4 = r4 - r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r2.left
            int r11 = r3.top
            int r2 = r2.right
            int r3 = r3.bottom
            r6.set(r7, r11, r2, r3)
            goto L7f
        L3b:
            int r4 = r2.top
            sdg r6 = r0.a
            int r6 = r6.d
            int r4 = r4 + r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r3.left
            int r11 = r2.top
            int r3 = r3.right
            int r2 = r2.bottom
            r6.set(r7, r11, r3, r2)
            goto L7c
        L51:
            int r4 = r2.left
            sdg r6 = r0.a
            int r6 = r6.d
            int r4 = r4 + r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r2.left
            int r11 = r3.top
            int r2 = r2.right
            int r3 = r3.bottom
            r6.set(r7, r11, r2, r3)
            goto L7f
        L67:
            int r4 = r2.bottom
            sdg r6 = r0.a
            int r6 = r6.d
            int r4 = r4 - r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r3.left
            int r11 = r2.top
            int r3 = r3.right
            int r2 = r2.bottom
            r6.set(r7, r11, r3, r2)
        L7c:
            r12 = r5
            r5 = r4
            r4 = r12
        L7f:
            java.lang.CharSequence r2 = r1.b
            if (r2 == 0) goto L92
            sgl r1 = r0.c
            android.graphics.Rect r6 = r0.b
            sdg r3 = r0.a
            boolean r3 = r3.g
            r11 = 1
            r3 = r14
            r7 = r19
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L92:
            return
        L93:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sds.g(android.graphics.Canvas, sdm, android.graphics.Rect, android.graphics.Rect, int, android.text.TextPaint):void");
    }

    @Override // defpackage.sdn
    protected void h(Canvas canvas, sdm sdmVar, Rect rect, Rect rect2, int i, Paint paint) {
        float round = Math.round(sdmVar.e);
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                canvas.drawLine(round, rect.bottom - this.a.c, round, rect.bottom, paint);
                return;
            } else if (i2 == 1) {
                canvas.drawLine(rect.left + this.a.c, round, rect.left, round, paint);
                return;
            } else if (i2 == 2) {
                canvas.drawLine(round, rect.top + this.a.c, round, rect.top, paint);
                return;
            } else {
                canvas.drawLine(rect.right - this.a.c, round, rect.right, round, paint);
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.sdn
    protected final void j(sdm sdmVar, set setVar, int i, TextPaint textPaint) {
        float a = setVar.a(sdmVar.a);
        if (sdmVar.b != null) {
            Paint.Align l = l(i, sdmVar.h, sdmVar);
            int m = m(i, sdmVar.h);
            float f = sdmVar.h;
            sgj b = this.c.b(sgm.a(sdmVar.b), textPaint, l, m, f);
            if (i == 1 || i == 3) {
                float f2 = a + b.b;
                sdmVar.d = new sek(Float.valueOf(f2), Float.valueOf(f2 + b.a));
                sdmVar.c = new sbz(b.h, b.g + this.a.d);
                return;
            }
            float f3 = a + b.e;
            sdmVar.d = new sek(Float.valueOf(f3), Float.valueOf(f3 + b.d));
            sdmVar.c = new sbz(b.h + this.a.d, b.g);
            return;
        }
        sdmVar.c = new sbz(0, 0);
        Float valueOf = Float.valueOf(a);
        sdmVar.d = new sek(valueOf, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Paint.Align l(int i, float f, sdm sdmVar) {
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? (f == 90.0f || f == -90.0f) ? Paint.Align.CENTER : Paint.Align.RIGHT : f == 0.0f ? Paint.Align.CENTER : f > 0.0f ? Paint.Align.LEFT : Paint.Align.RIGHT : (f == 90.0f || f == -90.0f) ? Paint.Align.CENTER : Paint.Align.LEFT : f == 0.0f ? Paint.Align.CENTER : f > 0.0f ? Paint.Align.RIGHT : Paint.Align.LEFT;
        }
        throw null;
    }
}
