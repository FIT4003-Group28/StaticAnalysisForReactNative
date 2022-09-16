package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: nwy  reason: default package */
/* loaded from: classes3.dex */
public final class nwy extends nwq implements aiza {
    public ValueAnimator a;
    public Interpolator b;
    public int d;
    private final Context e;
    private final aizb f;
    private final ntt g;
    private int m;
    private int n;
    private aypg o;
    public float c = 1.0f;
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final Rect j = new Rect();
    private final Rect k = new Rect();
    private float l = 1.777f;

    public nwy(Context context, aizb aizbVar, ntt nttVar) {
        this.e = context;
        this.f = aizbVar;
        this.g = nttVar;
    }

    private final void c() {
        etk.m(this.l, this.i, this.h);
        J();
    }

    public final void a() {
        if (b()) {
            int i = this.m;
            int i2 = this.n;
            int i3 = (int) (i * (true != zew.x(this.e) ? 0.65f : 0.7f));
            int i4 = (int) (i3 / 1.777f);
            this.i.set(0, 0, i3, i4);
            this.j.set(i3, 0, i, i2);
            this.k.set(0, i4, i3, i2);
        } else {
            int i5 = this.m;
            int i6 = this.n;
            int i7 = this.d;
            if (i7 <= 0) {
                i7 = (int) (i5 / 1.777f);
            }
            this.i.set(0, 0, i5, i7);
            this.j.set(0, this.i.height(), i5, i6);
        }
        c();
    }

    public final boolean b() {
        return zew.y(this.e) && zew.w(this.e) && this.d <= 0;
    }

    @Override // defpackage.aiza
    public final void d(int i, int i2) {
        float f = 1.777f;
        if (i2 > 0 && i > 0) {
            f = i / i2;
        }
        this.l = f;
        c();
    }

    @Override // defpackage.nxe
    public final float l() {
        return this.c;
    }

    @Override // defpackage.nxe
    public final float m() {
        return 0.0f;
    }

    @Override // defpackage.nxe
    public final float n() {
        return 0.0f;
    }

    @Override // defpackage.nxe
    public final float o() {
        return 1.0f;
    }

    @Override // defpackage.nxe
    public final float p() {
        return 1.0f;
    }

    @Override // defpackage.nxe
    public final float q() {
        return b() ? 1.0f : 0.0f;
    }

    @Override // defpackage.nxe
    public final Rect r() {
        return this.j;
    }

    @Override // defpackage.nxe
    public final Rect s() {
        return u;
    }

    @Override // defpackage.nxe
    public final Rect t() {
        return this.i;
    }

    @Override // defpackage.nxe
    public final Rect u() {
        return this.k;
    }

    @Override // defpackage.nxe
    public final Rect v() {
        return this.h;
    }

    @Override // defpackage.nxe
    public final void x() {
        this.o = this.g.b.n().Z(new ayqb() { // from class: nww
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                final nwy nwyVar = nwy.this;
                Integer num = (Integer) obj;
                ValueAnimator valueAnimator = nwyVar.a;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    nwyVar.a = null;
                }
                boolean b = nwyVar.b();
                nwyVar.d = num.intValue();
                if (b == nwyVar.b()) {
                    nwyVar.a();
                    return;
                }
                if (nwyVar.b == null) {
                    nwyVar.b = kt.o(0.05f, 0.0f, 0.0f, 1.0f);
                }
                nwyVar.a = ValueAnimator.ofFloat(0.01f, 1.0f);
                nwyVar.a.setDuration(500L);
                nwyVar.a.setInterpolator(nwyVar.b);
                nwyVar.a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nwv
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        nwy nwyVar2 = nwy.this;
                        nwyVar2.c = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        nwyVar2.J();
                    }
                });
                nwyVar.a.addListener(new nwx(nwyVar));
                nwyVar.a.start();
            }
        });
        this.f.a(this);
        if (this.f.a > 0.0f) {
            this.l = this.f.a;
            c();
        }
    }

    @Override // defpackage.nxe
    public final void y() {
        aypg aypgVar = this.o;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.o = null;
        }
        this.f.c(this);
    }

    @Override // defpackage.nxe
    public final void z(int i, int i2) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a = null;
        }
        this.m = i;
        this.n = i2;
        a();
    }
}
