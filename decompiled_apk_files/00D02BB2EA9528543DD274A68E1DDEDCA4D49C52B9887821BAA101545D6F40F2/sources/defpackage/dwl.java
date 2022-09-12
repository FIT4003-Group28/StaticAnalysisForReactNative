package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: dwl  reason: default package */
/* loaded from: classes6.dex */
public final class dwl {
    public String a;
    public float b;
    private final dae c;
    private final String d;
    private final TextPaint e;
    private final int f;

    public dwl(dae daeVar, String str) {
        this.c = daeVar;
        TextPaint textPaint = new TextPaint(5);
        this.e = textPaint;
        this.a = "";
        b();
        String charSequence = TextUtils.ellipsize(str, textPaint, 3896.0f, TextUtils.TruncateAt.END).toString();
        this.d = charSequence;
        b();
        float measureText = textPaint.measureText(charSequence) + 200.0f;
        int max = (int) Math.max(measureText, 2048.0f);
        this.f = max;
        if (daeVar.b() != null) {
            daeVar.b().setDefaultBufferSize(max, 1024);
        }
        float f = (measureText - 2048.0f) / 2048.0f;
        this.b = f;
        this.b = Math.min(1.0f, Math.max(0.0f, f));
        a();
    }

    private final void b() {
        this.e.setColor(-1);
        this.e.setTextAlign(Paint.Align.CENTER);
        this.e.setTypeface(Typeface.create("roboto", 1));
        this.e.setTextSize(297.0f);
    }

    public final void a() {
        Surface a = this.c.a();
        if (a == null) {
            return;
        }
        Canvas lockCanvas = a.lockCanvas(null);
        lockCanvas.drawColor(Color.parseColor("#1a73e8"), PorterDuff.Mode.SRC);
        b();
        Paint.FontMetrics fontMetrics = this.e.getFontMetrics();
        float f = (-(fontMetrics.top + fontMetrics.bottom)) + 125.0f;
        lockCanvas.drawText(this.d, this.f / 2.0f, f, this.e);
        this.e.setColor(-1);
        this.e.setTextAlign(Paint.Align.CENTER);
        this.e.setTypeface(Typeface.create("roboto", 0));
        this.e.setTextSize(231.14f);
        Paint.FontMetrics fontMetrics2 = this.e.getFontMetrics();
        lockCanvas.drawText(this.a, this.f / 2.0f, f + 200.0f + (-(fontMetrics2.top + fontMetrics2.bottom)), this.e);
        a.unlockCanvasAndPost(lockCanvas);
    }
}
