package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cxpx  reason: default package */
/* loaded from: classes5.dex */
public final class cxpx extends BitmapDrawable {
    private final Drawable a;
    private final Paint b;
    private final int c;

    public cxpx(Context context, int i, int i2) {
        this.c = i2;
        Drawable b = sl.b(context, R.drawable.peoplekit_default_avatar);
        this.a = b;
        b.mutate();
        b.setAlpha(138);
        b.setTint(akm.c(context, R.color.quantum_white_100));
        b.setTintMode(PorterDuff.Mode.SRC_IN);
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setAlpha(255);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.c / 2;
        canvas.drawCircle(f, f, f, this.b);
        Drawable drawable = this.a;
        int i = this.c;
        drawable.setBounds(0, 0, i, i);
        this.a.draw(canvas);
    }
}
