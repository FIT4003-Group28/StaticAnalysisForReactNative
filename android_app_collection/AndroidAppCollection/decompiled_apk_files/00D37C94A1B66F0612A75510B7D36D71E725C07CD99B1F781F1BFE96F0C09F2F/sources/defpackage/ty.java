package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: ty  reason: default package */
/* loaded from: classes4.dex */
public final class ty {
    public aab a;
    private final View b;
    private aab e;
    private aab f;
    private int d = -1;
    private final ud c = ud.d();

    public ty(View view) {
        this.b = view;
    }

    public final void a() {
        Drawable background = this.b.getBackground();
        if (background != null) {
            if (Build.VERSION.SDK_INT <= 21 || this.e != null) {
                if (this.f == null) {
                    this.f = new aab();
                }
                aab aabVar = this.f;
                aabVar.a();
                ColorStateList k = lj.k(this.b);
                if (k != null) {
                    aabVar.d = true;
                    aabVar.a = k;
                }
                PorterDuff.Mode l = lj.l(this.b);
                if (l != null) {
                    aabVar.c = true;
                    aabVar.b = l;
                }
                if (aabVar.d || aabVar.c) {
                    yv.h(background, aabVar, this.b.getDrawableState());
                    return;
                }
            }
            aab aabVar2 = this.a;
            if (aabVar2 != null) {
                yv.h(background, aabVar2, this.b.getDrawableState());
                return;
            }
            aab aabVar3 = this.e;
            if (aabVar3 == null) {
                return;
            }
            yv.h(background, aabVar3, this.b.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        aad l = aad.l(this.b.getContext(), attributeSet, pm.z, i, 0);
        View view = this.b;
        lj.L(view, view.getContext(), pm.z, attributeSet, l.b, i, 0);
        try {
            if (l.q(0)) {
                this.d = l.f(0, -1);
                ColorStateList a = this.c.a(this.b.getContext(), this.d);
                if (a != null) {
                    d(a);
                }
            }
            if (l.q(1)) {
                lj.P(this.b, l.g(1));
            }
            if (l.q(2)) {
                lj.Q(this.b, vs.a(l.c(2, -1), null));
            }
        } finally {
            l.o();
        }
    }

    public final void c(int i) {
        this.d = i;
        ud udVar = this.c;
        d(udVar != null ? udVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new aab();
            }
            aab aabVar = this.e;
            aabVar.a = colorStateList;
            aabVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
