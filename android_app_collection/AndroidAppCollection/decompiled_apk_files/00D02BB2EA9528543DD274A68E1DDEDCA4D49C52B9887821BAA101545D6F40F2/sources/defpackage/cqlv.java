package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cqlv  reason: default package */
/* loaded from: classes.dex */
public final class cqlv extends cqlr {
    public cqlv(Drawable drawable) {
        super(drawable);
    }

    @Override // defpackage.cqlr, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.scale(-1.0f, 1.0f, bounds.exactCenterX(), bounds.exactCenterY());
        super.draw(canvas);
        canvas.restore();
    }
}
