package c.e.a.c.p.e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import c.e.a.c.p.c;
import c.e.a.c.p.d;
/* loaded from: classes.dex */
public class a extends c.e.a.c.n.a implements d {
    private final c o;

    @Override // c.e.a.c.p.d
    public void a() {
        this.o.b();
        throw null;
    }

    @Override // c.e.a.c.p.d
    public void b() {
        this.o.a();
        throw null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        c cVar = this.o;
        if (cVar == null) {
            super.draw(canvas);
        } else {
            cVar.a(canvas);
            throw null;
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        this.o.c();
        throw null;
    }

    @Override // c.e.a.c.p.d
    public int getCircularRevealScrimColor() {
        this.o.d();
        throw null;
    }

    @Override // c.e.a.c.p.d
    public d.e getRevealInfo() {
        this.o.e();
        throw null;
    }

    @Override // android.view.View
    public boolean isOpaque() {
        c cVar = this.o;
        if (cVar == null) {
            return super.isOpaque();
        }
        cVar.f();
        throw null;
    }

    @Override // c.e.a.c.p.d
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.o.a(drawable);
        throw null;
    }

    @Override // c.e.a.c.p.d
    public void setCircularRevealScrimColor(int i) {
        this.o.a(i);
        throw null;
    }

    @Override // c.e.a.c.p.d
    public void setRevealInfo(d.e eVar) {
        this.o.a(eVar);
        throw null;
    }
}
