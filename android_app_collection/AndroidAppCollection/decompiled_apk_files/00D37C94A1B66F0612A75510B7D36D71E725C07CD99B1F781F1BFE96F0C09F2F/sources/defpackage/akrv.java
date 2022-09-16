package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
/* compiled from: PG */
/* renamed from: akrv  reason: default package */
/* loaded from: classes.dex */
public final class akrv extends sdp {
    private final Rect b = new Rect();
    private final sgl c = new sgl();

    @Override // defpackage.sdp, defpackage.sdn
    protected final void g(Canvas canvas, sdm sdmVar, Rect rect, Rect rect2, int i, TextPaint textPaint) {
        Paint.Align align;
        float f = sdmVar.g;
        float round = Math.round(sdmVar.e);
        if (f == 90.0f || f == -90.0f) {
            align = Paint.Align.CENTER;
        } else {
            align = Paint.Align.LEFT;
        }
        Paint.Align align2 = align;
        int i2 = f == 90.0f ? 3 : f == -90.0f ? 1 : 2;
        sdg sdgVar = this.a;
        float f2 = rect.left + (sdgVar.c > 0 ? sdgVar.d : 0);
        this.b.set(rect.left, rect2.top, rect.right, rect2.bottom);
        CharSequence charSequence = sdmVar.b;
        if (charSequence != null) {
            sgl sglVar = this.c;
            Rect rect3 = this.b;
            boolean z = this.a.g;
            sglVar.a(charSequence, canvas, f2, round, rect3, textPaint, align2, i2, f, true);
        }
    }

    @Override // defpackage.sdp, defpackage.sdn
    protected final void h(Canvas canvas, sdm sdmVar, Rect rect, Rect rect2, int i, Paint paint) {
        int i2;
        float round = Math.round(sdmVar.e);
        if (this.a.c > 0) {
            canvas.drawLine(rect.left + i2, round, rect.left, round, paint);
        }
        canvas.drawLine(rect.right - this.a.c, round, rect2.right, round, paint);
    }
}
