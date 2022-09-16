package c.d.h.e;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
/* loaded from: classes.dex */
public class p extends o {
    public p(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // c.d.h.e.o, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("RoundedNinePatchDrawable#draw");
        }
        if (!b()) {
            super.draw(canvas);
            if (!c.d.j.p.b.c()) {
                return;
            }
            c.d.j.p.b.a();
            return;
        }
        d();
        c();
        canvas.clipPath(this.f3064f);
        super.draw(canvas);
        if (!c.d.j.p.b.c()) {
            return;
        }
        c.d.j.p.b.a();
    }
}
