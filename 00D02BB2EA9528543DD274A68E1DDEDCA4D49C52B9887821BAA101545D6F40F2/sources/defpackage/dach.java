package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
/* compiled from: PG */
/* renamed from: dach  reason: default package */
/* loaded from: classes5.dex */
public final class dach extends dabz<AnimatorSet> {
    public static final /* synthetic */ int c = 0;
    private static final Property<dach, Float> g = new dacf(Float.class);
    private static final Property<dach, Float> h = new dacg(Float.class);
    public float a;
    public float b;
    private final dabi d;
    private AnimatorSet e;
    private int f;

    public dach(daco dacoVar) {
        super(3);
        this.d = dacoVar.a;
    }

    private final void l() {
        this.f = 0;
        m();
    }

    private final void m() {
        int a = dabf.a(this.f + 2, this.d.c.length);
        int a2 = dabf.a(this.f + 1, this.d.c.length);
        this.o[0] = czxb.c(this.d.c[a], this.m.i);
        this.o[1] = czxb.c(this.d.c[a2], this.m.i);
        this.o[2] = czxb.c(this.d.c[this.f], this.m.i);
    }

    private final void n() {
        float[] fArr = this.n;
        fArr[0] = 0.0f;
        float min = Math.min(this.a, this.b);
        fArr[2] = min;
        fArr[1] = min;
        float[] fArr2 = this.n;
        float max = Math.max(this.a, this.b);
        fArr2[4] = max;
        fArr2[3] = max;
        this.n[5] = 1.0f;
    }

    @Override // defpackage.dabz
    public final void b() {
        if (this.e == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, g, 0.0f, 1.0f);
            ofFloat.setDuration(667L);
            ofFloat.setInterpolator(czum.b);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.addListener(new dacd(this));
            Property<dach, Float> property = h;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, property, 0.0f, 0.0f);
            ofFloat2.setDuration(333L);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, property, 0.0f, 1.0f);
            ofFloat3.setDuration(667L);
            ofFloat3.setInterpolator(czum.b);
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.addListener(new dace(this));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat2, ofFloat3);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.e = animatorSet2;
            animatorSet2.playTogether(ofFloat, animatorSet);
        }
        this.e.start();
    }

    @Override // defpackage.dabz
    public final void c() {
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // defpackage.dabz
    public final void d() {
    }

    @Override // defpackage.dabz
    public final void e() {
        j(0.0f);
        k(0.0f);
        l();
    }

    @Override // defpackage.dabz
    public final void f() {
        l();
    }

    @Override // defpackage.dabz
    public final void g(azu azuVar) {
    }

    @Override // defpackage.dabz
    public final void h() {
    }

    public final void i() {
        this.f = (this.f + 1) % this.d.c.length;
        m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(float f) {
        this.a = f;
        n();
        this.m.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(float f) {
        this.b = f;
        n();
        this.m.invalidateSelf();
    }
}
