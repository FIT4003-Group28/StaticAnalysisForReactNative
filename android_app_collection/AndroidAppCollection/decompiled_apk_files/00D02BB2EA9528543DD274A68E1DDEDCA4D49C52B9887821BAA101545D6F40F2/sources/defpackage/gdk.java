package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: gdk  reason: default package */
/* loaded from: classes6.dex */
public final class gdk extends Drawable {
    private final Context a;
    private final int e;
    private final int f;
    private final cqss g;
    private int h;
    private boolean i;
    private final Paint b = new Paint();
    private final Rect c = new Rect();
    private final GradientDrawable d = new GradientDrawable();
    @dzsi
    private Integer j = null;

    public gdk(Context context, cqss cqssVar, int i, int i2) {
        this.a = context;
        this.g = cqssVar;
        this.e = i2;
        this.f = i;
    }

    public final void a(int i, boolean z) {
        this.h = i;
        this.i = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.h != 0) {
            int b = this.g.b(this.a);
            Integer num = this.j;
            Integer valueOf = Integer.valueOf(b);
            if (!dbsd.a(num, valueOf)) {
                this.j = valueOf;
                this.b.setColor(b);
                this.d.setColors(new int[]{b, b & 16777215});
            }
            int save = canvas.save();
            this.c.set(getBounds());
            Rect rect = this.c;
            rect.top = rect.bottom - this.h;
            canvas.clipRect(this.c);
            this.c.set(getBounds());
            this.c.bottom -= this.f;
            if (this.i) {
                this.c.bottom -= this.e;
            }
            canvas.drawRect(this.c, this.b);
            if (this.i) {
                this.c.set(getBounds());
                this.c.bottom -= this.f;
                Rect rect2 = this.c;
                rect2.top = rect2.bottom - this.e;
                this.d.setBounds(this.c);
                this.d.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (this.h != getBounds().height() || this.i) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@dzsi ColorFilter colorFilter) {
    }
}
