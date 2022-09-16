package com.facebook.f.f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.d.i;
import com.facebook.f.e.f;
import com.facebook.f.e.g;
import com.facebook.f.e.h;
import com.facebook.f.e.n;
import com.facebook.f.e.o;
/* compiled from: GenericDraweeHierarchy.java */
/* loaded from: classes.dex */
public class a implements com.facebook.f.h.c {

    /* renamed from: b  reason: collision with root package name */
    private final Resources f2456b;

    /* renamed from: c  reason: collision with root package name */
    private d f2457c;

    /* renamed from: d  reason: collision with root package name */
    private final c f2458d;
    private final f e;

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f2455a = new ColorDrawable(0);
    private final g f = new g(this.f2455a);

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar) {
        this.f2456b = bVar.a();
        this.f2457c = bVar.r();
        int i = 1;
        int size = (bVar.p() != null ? bVar.p().size() : 1) + (bVar.q() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[size + 6];
        drawableArr[0] = b(bVar.o(), null);
        drawableArr[1] = b(bVar.c(), bVar.d());
        drawableArr[2] = a(this.f, bVar.k(), bVar.m(), bVar.l(), bVar.n());
        drawableArr[3] = b(bVar.i(), bVar.j());
        drawableArr[4] = b(bVar.e(), bVar.f());
        drawableArr[5] = b(bVar.g(), bVar.h());
        if (size > 0) {
            if (bVar.p() != null) {
                i = 0;
                for (Drawable drawable : bVar.p()) {
                    drawableArr[i + 6] = b(drawable, null);
                    i++;
                }
            }
            if (bVar.q() != null) {
                drawableArr[i + 6] = b(bVar.q(), null);
            }
        }
        this.e = new f(drawableArr);
        this.e.c(bVar.b());
        this.f2458d = new c(e.a(this.e, this.f2457c));
        this.f2458d.mutate();
        e();
    }

    private Drawable a(Drawable drawable, o.b bVar, PointF pointF, Matrix matrix, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.a(e.a(drawable, bVar, pointF), matrix);
    }

    private Drawable b(Drawable drawable, o.b bVar) {
        return e.a(e.a(drawable, this.f2457c, this.f2456b), bVar);
    }

    private void d() {
        this.f.a(this.f2455a);
    }

    private void e() {
        if (this.e != null) {
            this.e.b();
            this.e.d();
            f();
            b(1);
            this.e.e();
            this.e.c();
        }
    }

    private void f() {
        c(1);
        c(2);
        c(3);
        c(4);
        c(5);
    }

    private void b(int i) {
        if (i >= 0) {
            this.e.d(i);
        }
    }

    private void c(int i) {
        if (i >= 0) {
            this.e.e(i);
        }
    }

    private void a(float f) {
        Drawable a2 = this.e.a(3);
        if (a2 == null) {
            return;
        }
        if (f >= 0.999f) {
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
        a2.setLevel(Math.round(f * 10000.0f));
    }

    @Override // com.facebook.f.h.b
    public Drawable a() {
        return this.f2458d;
    }

    @Override // com.facebook.f.h.c
    public void b() {
        d();
        e();
    }

    @Override // com.facebook.f.h.c
    public void a(Drawable drawable, float f, boolean z) {
        Drawable a2 = e.a(drawable, this.f2457c, this.f2456b);
        a2.mutate();
        this.f.a(a2);
        this.e.b();
        f();
        b(2);
        a(f);
        if (z) {
            this.e.e();
        }
        this.e.c();
    }

    @Override // com.facebook.f.h.c
    public void a(float f, boolean z) {
        if (this.e.a(3) == null) {
            return;
        }
        this.e.b();
        a(f);
        if (z) {
            this.e.e();
        }
        this.e.c();
    }

    @Override // com.facebook.f.h.c
    public void a(Throwable th) {
        this.e.b();
        f();
        if (this.e.a(5) != null) {
            b(5);
        } else {
            b(1);
        }
        this.e.c();
    }

    @Override // com.facebook.f.h.c
    public void b(Throwable th) {
        this.e.b();
        f();
        if (this.e.a(4) != null) {
            b(4);
        } else {
            b(1);
        }
        this.e.c();
    }

    @Override // com.facebook.f.h.c
    public void a(Drawable drawable) {
        this.f2458d.d(drawable);
    }

    private com.facebook.f.e.c d(int i) {
        com.facebook.f.e.c b2 = this.e.b(i);
        if (b2.a() instanceof h) {
            b2 = (h) b2.a();
        }
        return b2.a() instanceof n ? (n) b2.a() : b2;
    }

    private void a(int i, Drawable drawable) {
        if (drawable == null) {
            this.e.a(i, null);
            return;
        }
        d(i).a(e.a(drawable, this.f2457c, this.f2456b));
    }

    private n e(int i) {
        com.facebook.f.e.c d2 = d(i);
        if (d2 instanceof n) {
            return (n) d2;
        }
        return e.a(d2, o.b.f2451a);
    }

    public void a(int i) {
        this.e.c(i);
    }

    public void a(o.b bVar) {
        i.a(bVar);
        e(2).a(bVar);
    }

    public void a(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    public void a(Drawable drawable, o.b bVar) {
        a(1, drawable);
        e(1).a(bVar);
    }

    public void a(d dVar) {
        this.f2457c = dVar;
        e.a((com.facebook.f.e.c) this.f2458d, this.f2457c);
        for (int i = 0; i < this.e.a(); i++) {
            e.a(d(i), this.f2457c, this.f2456b);
        }
    }

    public d c() {
        return this.f2457c;
    }
}
