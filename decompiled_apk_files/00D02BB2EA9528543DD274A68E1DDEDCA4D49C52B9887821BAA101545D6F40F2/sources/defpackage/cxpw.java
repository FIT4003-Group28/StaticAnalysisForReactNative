package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cxpw  reason: default package */
/* loaded from: classes5.dex */
public final class cxpw extends ShapeDrawable {
    private final String a;
    private final int b;
    private final Paint c;

    public cxpw(Context context, String str, int i, int i2) {
        super(new OvalShape());
        this.a = str;
        this.b = i2;
        getPaint().setColor(i);
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create("google-sans", 0));
        paint.setColor(akm.c(context, R.color.quantum_white_100));
        paint.setAlpha(255);
        paint.setTextSize(cxpq.b(context, str, i2));
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Rect rect = new Rect();
        Paint paint = this.c;
        String str = this.a;
        paint.getTextBounds(str, 0, str.length(), rect);
        String str2 = this.a;
        int length = str2.length();
        float f = this.b / 2;
        canvas.drawText(str2, 0, length, f, f - rect.exactCenterY(), this.c);
    }
}
