package c.d.h.f;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import c.d.h.e.h;
import c.d.h.e.u;
import c.d.h.e.v;
/* loaded from: classes.dex */
public class c extends h implements u {

    /* renamed from: e  reason: collision with root package name */
    Drawable f3100e;

    /* renamed from: f  reason: collision with root package name */
    private v f3101f;

    public c(Drawable drawable) {
        super(drawable);
        this.f3100e = null;
    }

    @Override // c.d.h.e.u
    public void a(v vVar) {
        this.f3101f = vVar;
    }

    public void d(Drawable drawable) {
        this.f3100e = drawable;
        invalidateSelf();
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (!isVisible()) {
            return;
        }
        v vVar = this.f3101f;
        if (vVar != null) {
            vVar.a();
        }
        super.draw(canvas);
        Drawable drawable = this.f3100e;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(getBounds());
        this.f3100e.draw(canvas);
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // c.d.h.e.h, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        v vVar = this.f3101f;
        if (vVar != null) {
            vVar.a(z);
        }
        return super.setVisible(z, z2);
    }
}
