package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: xc  reason: default package */
/* loaded from: classes.dex */
public final class xc {
    public aeo a;
    private final View b;
    private aeo e;
    private aeo f;
    private int d = -1;
    private final xi c = xi.b();

    public xc(View view) {
        this.b = view;
    }

    public final void a(AttributeSet attributeSet, int i) {
        aeq b = aeq.b(this.b.getContext(), attributeSet, sj.z, i, 0);
        View view = this.b;
        od.a(view, view.getContext(), sj.z, attributeSet, b.b, i, 0);
        try {
            if (b.p(0)) {
                this.d = b.o(0, -1);
                ColorStateList e = this.c.e(this.b.getContext(), this.d);
                if (e != null) {
                    f(e);
                }
            }
            if (b.p(1)) {
                od.W(this.b, b.j(1));
            }
            if (b.p(2)) {
                od.Y(this.b, ze.d(b.i(2, -1), null));
            }
        } finally {
            b.q();
        }
    }

    public final void b(int i) {
        this.d = i;
        xi xiVar = this.c;
        f(xiVar != null ? xiVar.e(this.b.getContext(), i) : null);
        e();
    }

    public final void c(ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new aeo();
        }
        aeo aeoVar = this.a;
        aeoVar.a = colorStateList;
        aeoVar.d = true;
        e();
    }

    public final void d(PorterDuff.Mode mode) {
        if (this.a == null) {
            this.a = new aeo();
        }
        aeo aeoVar = this.a;
        aeoVar.b = mode;
        aeoVar.c = true;
        e();
    }

    public final void e() {
        Drawable background = this.b.getBackground();
        if (background != null) {
            if (Build.VERSION.SDK_INT <= 21 || this.e != null) {
                if (this.f == null) {
                    this.f = new aeo();
                }
                aeo aeoVar = this.f;
                aeoVar.a();
                ColorStateList V = od.V(this.b);
                if (V != null) {
                    aeoVar.d = true;
                    aeoVar.a = V;
                }
                PorterDuff.Mode X = od.X(this.b);
                if (X != null) {
                    aeoVar.c = true;
                    aeoVar.b = X;
                }
                if (aeoVar.d || aeoVar.c) {
                    acv.g(background, aeoVar, this.b.getDrawableState());
                    return;
                }
            }
            aeo aeoVar2 = this.a;
            if (aeoVar2 != null) {
                acv.g(background, aeoVar2, this.b.getDrawableState());
                return;
            }
            aeo aeoVar3 = this.e;
            if (aeoVar3 == null) {
                return;
            }
            acv.g(background, aeoVar3, this.b.getDrawableState());
        }
    }

    final void f(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new aeo();
            }
            aeo aeoVar = this.e;
            aeoVar.a = colorStateList;
            aeoVar.d = true;
        } else {
            this.e = null;
        }
        e();
    }

    public final void g() {
        this.d = -1;
        f(null);
        e();
    }
}
