package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: dfkn  reason: default package */
/* loaded from: classes6.dex */
public final class dfkn {
    public String a;
    private final Picture b = new Picture();
    private final String c;
    private final TextPaint d;
    private final int e;
    private final boolean f;
    @dzsi
    private final Bitmap g;
    private float h;
    private float i;

    public dfkn(String str, @dzsi Bitmap bitmap, boolean z) {
        this.h = 0.0f;
        this.i = 0.0f;
        TextPaint textPaint = new TextPaint(5);
        this.d = textPaint;
        this.a = "";
        this.g = bitmap;
        this.f = z;
        b();
        if (bitmap != null) {
            boolean z2 = true;
            dbsk.e(bitmap.getWidth() > 0, "Invalid icon width: ", bitmap.getHeight());
            dbsk.e(bitmap.getHeight() <= 0 ? false : z2, "Invalid icon height: ", bitmap.getHeight());
            this.i = 123.621f;
            this.h = (bitmap.getWidth() * 123.621f) / bitmap.getHeight();
        }
        String charSequence = TextUtils.ellipsize(str, textPaint, bitmap != null ? 730.5f - (this.h + 46.875f) : 730.5f, TextUtils.TruncateAt.END).toString();
        this.c = charSequence;
        b();
        float measureText = textPaint.measureText(charSequence) + 37.5f;
        this.e = (int) Math.max(bitmap != null ? measureText + this.h + 46.875f : measureText, 384.0f);
    }

    private final void b() {
        this.d.setColor(-1);
        this.d.setTextAlign(Paint.Align.CENTER);
        this.d.setTypeface(Typeface.create("roboto", 1));
        this.d.setTextSize(55.6875f);
    }

    public final Picture a() {
        float f;
        Canvas beginRecording = this.b.beginRecording(this.e, 192);
        beginRecording.drawColor(0, PorterDuff.Mode.SRC);
        float f2 = this.e / 2.0f;
        float f3 = 18.75f;
        if (this.g != null) {
            float f4 = this.h;
            float f5 = ((f - 37.5f) - 46.875f) - f4;
            if (this.f) {
                f3 = f5 + 18.75f + 46.875f;
                f2 = (f5 / 2.0f) + 18.75f;
            } else {
                f2 = f4 + 18.75f + 46.875f + (f5 / 2.0f);
            }
        }
        b();
        Paint.FontMetrics fontMetrics = this.d.getFontMetrics();
        float f6 = (-(fontMetrics.top + fontMetrics.bottom)) + 23.4375f;
        beginRecording.drawText(this.c, f2, f6, this.d);
        this.d.setColor(-1);
        this.d.setTextAlign(Paint.Align.CENTER);
        this.d.setTypeface(Typeface.create("roboto", 0));
        this.d.setTextSize(43.33875f);
        Paint.FontMetrics fontMetrics2 = this.d.getFontMetrics();
        beginRecording.drawText(this.a, f2, f6 + 37.5f + (-(fontMetrics2.top + fontMetrics2.bottom)), this.d);
        Bitmap bitmap = this.g;
        if (bitmap != null) {
            beginRecording.drawBitmap(bitmap, (Rect) null, new RectF(f3, 23.4375f, this.h + f3, this.i + 23.4375f), (Paint) null);
        }
        this.b.endRecording();
        return this.b;
    }
}
