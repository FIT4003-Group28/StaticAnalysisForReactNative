package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dhm  reason: default package */
/* loaded from: classes6.dex */
public final class dhm {
    public final Context a;
    public final Executor b;
    public final Paint c;
    public final int d;
    private final bvsl e;
    private final Paint f;
    private final TextPaint g;
    private final TextPaint h;
    private final RectF i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final Path p;
    private int q;
    private float r;
    private float s;

    public dhm(Activity activity, bvsl bvslVar, Executor executor) {
        this.a = activity;
        this.e = bvslVar;
        this.b = executor;
        Resources resources = activity.getResources();
        this.f = d(resources.getColor(R.color.primary_background_color));
        d(resources.getColor(R.color.secondary_background_color));
        int color = resources.getColor(R.color.qu_grey_white_1000);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.label_text_size);
        TextPaint textPaint = new TextPaint(5);
        textPaint.setColor(color);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        textPaint.setTextSize(dimensionPixelSize);
        this.g = textPaint;
        int color2 = resources.getColor(R.color.qu_grey_white_1000);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.label_secondary_text_size);
        TextPaint textPaint2 = new TextPaint(5);
        textPaint2.setColor(color2);
        textPaint2.setTextAlign(Paint.Align.CENTER);
        textPaint2.setTypeface(Typeface.create("sans-serif", 0));
        textPaint2.setTextSize(dimensionPixelSize2);
        this.h = textPaint2;
        this.m = resources.getDimensionPixelSize(R.dimen.label_second_line_gap);
        this.k = resources.getDimensionPixelSize(R.dimen.label_horizontal_padding);
        this.l = resources.getDimensionPixelSize(R.dimen.label_vertical_padding);
        this.n = resources.getDimensionPixelSize(R.dimen.label_corner_radius);
        this.j = resources.getDimensionPixelSize(R.dimen.label_texture_width);
        this.o = resources.getDimensionPixelSize(R.dimen.label_arrow_length);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.circle_crop_border_size);
        this.d = dimensionPixelSize3;
        Paint paint = new Paint();
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(resources.getColor(R.color.circle_border_color));
        paint.setStrokeWidth(dimensionPixelSize3);
        paint.setAntiAlias(true);
        this.i = new RectF();
        float dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.label_arrow_base_width);
        float dimensionPixelSize5 = resources.getDimensionPixelSize(R.dimen.label_arrow_length);
        float f = (-dimensionPixelSize4) / 2.0f;
        float f2 = dimensionPixelSize4 / 2.0f;
        float f3 = dimensionPixelSize4 * 0.4074875f;
        float f4 = dimensionPixelSize4 * 0.3735f;
        Path path = new Path();
        path.moveTo(f, 0.0f);
        path.cubicTo(f + f3, 0.0f, f + f4, dimensionPixelSize5, 0.0f, dimensionPixelSize5);
        path.cubicTo(f2 - f4, dimensionPixelSize5, f2 - f3, 0.0f, f2, 0.0f);
        path.close();
        this.p = path;
    }

    private static Paint d(int i) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        paint.setAntiAlias(true);
        return paint;
    }

    private final void e(boolean z) {
        float abs = this.l + Math.abs(this.g.getFontMetrics().top);
        this.r = abs;
        float abs2 = abs + this.m + Math.abs(this.h.getFontMetrics().top);
        this.s = abs2;
        if (!z) {
            abs2 = this.r;
        }
        this.i.top = 0.0f;
        this.i.bottom = abs2 + this.l + this.g.getFontMetrics().bottom;
        this.q = Math.round(this.i.bottom) + this.o;
    }

    private final void f(Canvas canvas, Paint paint) {
        RectF rectF = this.i;
        float f = this.n;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.save();
        canvas.translate(this.j * 0.5f, (float) Math.floor(this.i.bottom));
        canvas.drawPath(this.p, paint);
        canvas.restore();
    }

    public final Picture a(String str) {
        Picture picture = new Picture();
        e(false);
        int i = this.j;
        int i2 = this.k;
        String charSequence = TextUtils.ellipsize(str, this.g, i - (i2 + i2), TextUtils.TruncateAt.END).toString();
        float measureText = this.g.measureText(charSequence);
        int i3 = this.k;
        float min = Math.min(measureText + i3 + i3, this.j);
        this.i.left = (this.j - min) / 2.0f;
        RectF rectF = this.i;
        rectF.right = rectF.left + min;
        Canvas beginRecording = picture.beginRecording(this.j, this.q);
        beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
        f(beginRecording, this.f);
        beginRecording.drawText(charSequence, this.i.centerX(), this.r, this.g);
        picture.endRecording();
        return picture;
    }

    public final Picture b(String str, String str2) {
        Paint paint = this.f;
        Picture picture = new Picture();
        e(true);
        int i = this.j;
        int i2 = this.k;
        float f = i - (i2 + i2);
        String charSequence = TextUtils.ellipsize(str, this.g, f, TextUtils.TruncateAt.END).toString();
        String charSequence2 = TextUtils.ellipsize(str2, this.h, f, TextUtils.TruncateAt.END).toString();
        int i3 = this.k;
        float f2 = i3 + i3;
        float min = Math.min(Math.max(this.g.measureText(charSequence) + f2, this.h.measureText(charSequence2) + f2), this.j);
        this.i.left = (this.j - min) / 2.0f;
        RectF rectF = this.i;
        rectF.right = rectF.left + min;
        Canvas beginRecording = picture.beginRecording(this.j, this.q);
        beginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
        f(beginRecording, paint);
        beginRecording.drawText(charSequence, this.i.centerX(), this.r, this.g);
        beginRecording.drawText(charSequence2, this.i.centerX(), this.s, this.h);
        picture.endRecording();
        return picture;
    }

    public final String c(float f) {
        return this.a.getString(R.string.AR_PLACE_PIN_LABEL, this.e.c(Math.round(f), null, false, true));
    }
}
