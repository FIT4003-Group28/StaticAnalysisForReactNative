package c.e.a.c.p;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import c.e.a.c.p.d;
/* loaded from: classes.dex */
public class b extends FrameLayout implements d {

    /* renamed from: b  reason: collision with root package name */
    private final c f4763b;

    @Override // c.e.a.c.p.d
    public void a() {
        this.f4763b.b();
        throw null;
    }

    @Override // c.e.a.c.p.d
    public void b() {
        this.f4763b.a();
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        c cVar = this.f4763b;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.f4763b.c();
        throw null;
    }

    @Override // c.e.a.c.p.d
    public int getCircularRevealScrimColor() {
        this.f4763b.d();
        throw null;
    }

    @Override // c.e.a.c.p.d
    public d.e getRevealInfo() {
        this.f4763b.e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.f4763b;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }

    @Override // c.e.a.c.p.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f4763b.a(drawable);
        throw null;
    }

    @Override // c.e.a.c.p.d
    public void setCircularRevealScrimColor(int i) {
        this.f4763b.a(i);
        throw null;
    }

    @Override // c.e.a.c.p.d
    public void setRevealInfo(d.e eVar) {
        this.f4763b.a(eVar);
        throw null;
    }
}
