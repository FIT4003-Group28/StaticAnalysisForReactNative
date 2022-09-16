package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: ajog  reason: default package */
/* loaded from: classes.dex */
public final class ajog implements ctz {
    private final ajmw a;
    private final ctv b;
    private final ajmx c;
    private final avhn d;
    private final ajmu e;
    private boolean f = false;

    public ajog(ctv ctvVar, ajmu ajmuVar, avhn avhnVar, ajmx ajmxVar, ajmw ajmwVar) {
        this.b = ctvVar;
        this.e = ajmuVar;
        this.d = avhnVar;
        this.c = ajmxVar;
        this.a = ajmwVar;
    }

    private final void i(ImageView imageView) {
        this.f = true;
        ajmw ajmwVar = this.a;
        if (ajmwVar != null) {
            ajmwVar.c(imageView);
        }
        this.c.d(imageView, this.e, this.d);
    }

    @Override // defpackage.ctz
    public final void a(Drawable drawable) {
        this.b.a(drawable);
        this.c.c((ImageView) this.b.a, this.e, this.d);
    }

    @Override // defpackage.ctz
    public final void b(Object obj, cug cugVar) {
        View view = this.b.a;
        if (!this.f) {
            i((ImageView) view);
        }
        this.b.b(obj, cugVar);
        ajmw ajmwVar = this.a;
        if (ajmwVar != null) {
            ajmwVar.b((ImageView) view);
        }
        this.c.e((ImageView) view, this.e, this.d);
    }

    @Override // defpackage.ctz
    public final cth c() {
        return this.b.c();
    }

    @Override // defpackage.ctz
    public final void d(cty ctyVar) {
        this.b.d(ctyVar);
    }

    @Override // defpackage.ctz
    public final void e(Drawable drawable) {
        View view = this.b.a;
        if (!this.f) {
            i((ImageView) view);
        }
        this.b.e(drawable);
        ajmw ajmwVar = this.a;
        if (ajmwVar != null) {
            ajmwVar.a((ImageView) view);
        }
        this.c.b((ImageView) view, this.e, this.d);
    }

    @Override // defpackage.ctz
    public final void f(Drawable drawable) {
        this.b.f(drawable);
        i((ImageView) this.b.a);
    }

    @Override // defpackage.ctz
    public final void g(cty ctyVar) {
        this.b.g(ctyVar);
    }

    @Override // defpackage.ctz
    public final void h(cth cthVar) {
        this.b.o(cthVar);
    }

    @Override // defpackage.cse
    public final void k() {
    }

    @Override // defpackage.cse
    public final void l() {
        this.b.l();
    }

    @Override // defpackage.cse
    public final void m() {
        this.b.m();
    }
}
