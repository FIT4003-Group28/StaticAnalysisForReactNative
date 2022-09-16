package defpackage;

import android.content.Context;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: ahqo  reason: default package */
/* loaded from: classes.dex */
public final class ahqo extends ahmr implements ahod, ahoe, ahlz {
    public final Handler i;
    public final ViewGroup j;
    public ahqn k;
    public boolean o;
    private final float p;
    private final ahof q;
    private final ahob r;
    private int s;

    public ahqo(final ViewGroup viewGroup, final Context context, Handler handler, ahoo ahooVar, float f, float f2, ahof ahofVar, ahob ahobVar) {
        super(f * context.getResources().getDisplayMetrics().scaledDensity, f2 * context.getResources().getDisplayMetrics().scaledDensity, ahon.a(1.0f, 1.0f, ahmr.m), ahooVar, ahofVar.a.c());
        this.i = handler;
        this.j = viewGroup;
        this.q = ahofVar;
        this.r = ahobVar;
        rT(f, f2, 1.0f);
        float f3 = context.getResources().getDisplayMetrics().scaledDensity;
        this.p = f3;
        final int s = s(f * f3);
        final int s2 = s(f3 * f2);
        handler.post(new Runnable() { // from class: ahqf
            @Override // java.lang.Runnable
            public final void run() {
                ahqo ahqoVar = ahqo.this;
                Context context2 = context;
                ViewGroup viewGroup2 = viewGroup;
                int i = s;
                int i2 = s2;
                ahqoVar.k = new ahqn(context2, ahqoVar);
                viewGroup2.addView(ahqoVar.k, i, i2);
            }
        });
        this.s = ahofVar.k;
        B();
        ahofVar.a(this);
        ahofVar.c(this);
        y();
    }

    private final void B() {
        ((ahjj) this).a.e(this.s != 3);
        if (this.s == 3) {
            D(true);
        } else {
            C(true);
        }
    }

    private final void C(boolean z) {
        if (z) {
            ahof ahofVar = this.q;
            E(ahofVar.h, ahofVar.i);
            ((ahjj) this).a.j(0.0f);
        }
    }

    private final void D(boolean z) {
        float a = ahom.a(-100.0f);
        if (z) {
            E(56.0f, 31.5f);
            n(0.0f, a, 0.0f);
            return;
        }
        n(0.0f, -a, 0.0f);
    }

    private final void E(float f, float f2) {
        rT(f, f2, 1.0f);
        float f3 = this.p;
        w(f * f3, f3 * f2);
        this.i.post(new ahqm(this, new FrameLayout.LayoutParams(s(f * this.p), s(f2 * this.p))));
    }

    public final void A() {
        boolean z = true;
        if (this.r.g && this.o) {
            z = false;
        }
        this.l = z;
    }

    @Override // defpackage.ahoe
    public final void c(float f, float f2) {
        if (this.s != 3) {
            E(f, f2);
        }
    }

    @Override // defpackage.ahlz
    public final boolean f(ahjy ahjyVar) {
        return false;
    }

    @Override // defpackage.ahlz
    public final boolean g(ahjy ahjyVar) {
        return false;
    }

    @Override // defpackage.ahlz
    public final boolean h(ahjy ahjyVar) {
        return true;
    }

    @Override // defpackage.ahmr, defpackage.ahjj, defpackage.ahmf
    public final void i() {
        super.i();
        this.i.post(new ahqh(this, 2));
        this.q.g(this);
        this.q.h(this);
    }

    @Override // defpackage.ahjj, defpackage.ahmf
    public final void j(ahjy ahjyVar) {
    }

    @Override // defpackage.ahmr, defpackage.ahjj, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        super.m(ahjyVar);
        if (this.s == 3) {
            float[] fArr = ahjyVar.a;
            float f = fArr[2];
            float length = Matrix.length(fArr[0], fArr[1], f);
            float f2 = fArr[10];
            float degrees = (float) Math.toDegrees(Math.atan2(f / length, f2 / Matrix.length(fArr[8], fArr[9], f2)));
            if (true == Float.isNaN(degrees)) {
                degrees = 0.0f;
            }
            ((ahjj) this).a.j(degrees);
        }
    }

    public final void y() {
        this.i.post(new ahqh(this));
        this.o = false;
        A();
    }

    @Override // defpackage.ahod
    public final void z(int i) {
        int i2 = this.s;
        if (i2 != i) {
            if (i2 == 3) {
                D(false);
            } else {
                C(false);
            }
            this.s = i;
            B();
        }
    }
}
