package c.d.h.f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import c.d.h.e.g;
import c.d.h.e.h;
import c.d.h.e.i;
import c.d.h.e.q;
import c.d.h.e.r;
/* loaded from: classes.dex */
public class a implements c.d.h.h.c {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f3086a = new ColorDrawable(0);

    /* renamed from: b  reason: collision with root package name */
    private final Resources f3087b;

    /* renamed from: c  reason: collision with root package name */
    private d f3088c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3089d;

    /* renamed from: e  reason: collision with root package name */
    private final g f3090e;

    /* renamed from: f  reason: collision with root package name */
    private final h f3091f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("GenericDraweeHierarchy()");
        }
        this.f3087b = bVar.o();
        this.f3088c = bVar.r();
        this.f3091f = new h(this.f3086a);
        int i = 1;
        int size = (bVar.i() != null ? bVar.i().size() : 1) + (bVar.l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[size + 6];
        drawableArr[0] = b(bVar.e(), null);
        drawableArr[1] = b(bVar.j(), bVar.k());
        drawableArr[2] = a(this.f3091f, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = b(bVar.m(), bVar.n());
        drawableArr[4] = b(bVar.p(), bVar.q());
        drawableArr[5] = b(bVar.g(), bVar.h());
        if (size > 0) {
            if (bVar.i() != null) {
                i = 0;
                for (Drawable drawable : bVar.i()) {
                    drawableArr[i + 6] = b(drawable, null);
                    i++;
                }
            }
            if (bVar.l() != null) {
                drawableArr[i + 6] = b(bVar.l(), null);
            }
        }
        this.f3090e = new g(drawableArr);
        this.f3090e.e(bVar.f());
        this.f3089d = new c(e.a(this.f3090e, this.f3088c));
        this.f3089d.mutate();
        f();
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    private Drawable a(Drawable drawable, r.b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.a(drawable, bVar, pointF);
    }

    private void a(float f2) {
        Drawable a2 = this.f3090e.a(3);
        if (a2 == null) {
            return;
        }
        if (f2 >= 0.999f) {
            if (a2 instanceof Animatable) {
                ((Animatable) a2).stop();
            }
            c(3);
        } else {
            if (a2 instanceof Animatable) {
                ((Animatable) a2).start();
            }
            b(3);
        }
        a2.setLevel(Math.round(f2 * 10000.0f));
    }

    private void a(int i, Drawable drawable) {
        if (drawable == null) {
            this.f3090e.a(i, null);
            return;
        }
        d(i).a(e.b(drawable, this.f3088c, this.f3087b));
    }

    private Drawable b(Drawable drawable, r.b bVar) {
        return e.a(e.b(drawable, this.f3088c, this.f3087b), bVar);
    }

    private void b(int i) {
        if (i >= 0) {
            this.f3090e.c(i);
        }
    }

    private void c(int i) {
        if (i >= 0) {
            this.f3090e.d(i);
        }
    }

    private c.d.h.e.d d(int i) {
        c.d.h.e.d b2 = this.f3090e.b(i);
        if (b2.a() instanceof i) {
            b2 = (i) b2.a();
        }
        return b2.a() instanceof q ? (q) b2.a() : b2;
    }

    private void d() {
        c(1);
        c(2);
        c(3);
        c(4);
        c(5);
    }

    private q e(int i) {
        c.d.h.e.d d2 = d(i);
        return d2 instanceof q ? (q) d2 : e.a(d2, r.b.f3071a);
    }

    private void e() {
        this.f3091f.a(this.f3086a);
    }

    private void f() {
        g gVar = this.f3090e;
        if (gVar != null) {
            gVar.b();
            this.f3090e.d();
            d();
            b(1);
            this.f3090e.e();
            this.f3090e.c();
        }
    }

    @Override // c.d.h.h.b
    public Drawable a() {
        return this.f3089d;
    }

    @Override // c.d.h.h.c
    public void a(float f2, boolean z) {
        if (this.f3090e.a(3) == null) {
            return;
        }
        this.f3090e.b();
        a(f2);
        if (z) {
            this.f3090e.e();
        }
        this.f3090e.c();
    }

    public void a(int i) {
        this.f3090e.e(i);
    }

    @Override // c.d.h.h.c
    public void a(Drawable drawable) {
        this.f3089d.d(drawable);
    }

    @Override // c.d.h.h.c
    public void a(Drawable drawable, float f2, boolean z) {
        Drawable b2 = e.b(drawable, this.f3088c, this.f3087b);
        b2.mutate();
        this.f3091f.a(b2);
        this.f3090e.b();
        d();
        b(2);
        a(f2);
        if (z) {
            this.f3090e.e();
        }
        this.f3090e.c();
    }

    public void a(Drawable drawable, r.b bVar) {
        a(1, drawable);
        e(1).a(bVar);
    }

    public void a(r.b bVar) {
        c.d.d.d.i.a(bVar);
        e(2).a(bVar);
    }

    public void a(d dVar) {
        this.f3088c = dVar;
        e.a((c.d.h.e.d) this.f3089d, this.f3088c);
        for (int i = 0; i < this.f3090e.a(); i++) {
            e.a(d(i), this.f3088c, this.f3087b);
        }
    }

    @Override // c.d.h.h.c
    public void a(Throwable th) {
        this.f3090e.b();
        d();
        if (this.f3090e.a(4) != null) {
            b(4);
        } else {
            b(1);
        }
        this.f3090e.c();
    }

    @Override // c.d.h.h.c
    public void b() {
        e();
        f();
    }

    public void b(Drawable drawable) {
        a(0, drawable);
    }

    @Override // c.d.h.h.c
    public void b(Throwable th) {
        this.f3090e.b();
        d();
        if (this.f3090e.a(5) != null) {
            b(5);
        } else {
            b(1);
        }
        this.f3090e.c();
    }

    public d c() {
        return this.f3088c;
    }
}
