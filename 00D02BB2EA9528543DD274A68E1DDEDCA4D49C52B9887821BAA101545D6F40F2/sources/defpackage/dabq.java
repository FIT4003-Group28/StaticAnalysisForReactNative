package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
/* compiled from: PG */
/* renamed from: dabq  reason: default package */
/* loaded from: classes5.dex */
public final class dabq extends dabz<AnimatorSet> {
    public static final /* synthetic */ int l = 0;
    private static final Property<dabq, Integer> q = new dabm(Integer.class);
    private static final Property<dabq, Float> r = new dabn(Float.class);
    private static final Property<dabq, Float> s = new dabo(Float.class);
    private static final Property<dabq, Float> t = new dabp(Float.class);
    public final dabi a;
    public ObjectAnimator b;
    public ObjectAnimator c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    boolean j;
    azu k;
    private AnimatorSet p;

    public dabq(dabr dabrVar) {
        super(1);
        this.j = false;
        this.k = null;
        this.a = dabrVar.a;
    }

    private final void o() {
        this.d = 0;
        int c = czxb.c(this.a.c[0], this.m.i);
        this.c.setIntValues(c, czxb.c(this.a.c[i()], this.m.i));
        k(c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dabz
    public final void a(dacb dacbVar) {
        this.m = dacbVar;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this, (Property<dabq, V>) q, (TypeEvaluator) new czuo(), (Object[]) new Integer[]{Integer.valueOf(czxb.c(this.a.c[this.d], dacbVar.i)), Integer.valueOf(czxb.c(this.a.c[i()], dacbVar.i))});
        this.c = ofObject;
        ofObject.setDuration(333L);
        this.c.setStartDelay(1000L);
        this.c.setInterpolator(czum.b);
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null) {
            animatorSet.playTogether(this.c);
        }
    }

    @Override // defpackage.dabz
    public final void b() {
        if (this.p == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, r, 0.0f, 360.0f);
            ofFloat.setDuration(1333L);
            ofFloat.setInterpolator(null);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, s, 0.0f, 1.0f);
            ofFloat2.setDuration(666L);
            ofFloat2.setInterpolator(czum.b);
            ofFloat2.addListener(new dabk(this));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, t, 0.0f, 1.0f);
            this.b = ofFloat3;
            ofFloat3.setDuration(666L);
            this.b.setInterpolator(czum.b);
            AnimatorSet animatorSet = new AnimatorSet();
            this.p = animatorSet;
            animatorSet.playSequentially(ofFloat2, this.b);
            this.p.playTogether(ofFloat);
            ObjectAnimator objectAnimator = this.c;
            if (objectAnimator != null) {
                this.p.playTogether(objectAnimator);
            }
            this.p.addListener(new dabl(this));
        }
        this.p.start();
    }

    @Override // defpackage.dabz
    public final void c() {
        AnimatorSet animatorSet = this.p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // defpackage.dabz
    public final void d() {
        if (this.j) {
            return;
        }
        if (this.m.isVisible()) {
            this.j = true;
        } else {
            c();
        }
    }

    @Override // defpackage.dabz
    public final void e() {
        m(0.0f);
        n(0.0f);
        l(0.0f);
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null) {
            objectAnimator.setFloatValues(0.0f, 1.0f);
        }
        o();
    }

    @Override // defpackage.dabz
    public final void f() {
        o();
    }

    @Override // defpackage.dabz
    public final void g(azu azuVar) {
        this.k = azuVar;
    }

    @Override // defpackage.dabz
    public final void h() {
        this.k = null;
    }

    public final int i() {
        return (this.d + 1) % this.a.c.length;
    }

    public final void j() {
        float[] fArr = this.n;
        float f = this.f + this.g;
        fArr[0] = (((-20.0f) + f) + (this.i * 250.0f)) / 360.0f;
        fArr[1] = (f + (this.h * 250.0f)) / 360.0f;
    }

    public final void k(int i) {
        this.e = i;
        this.o[0] = i;
        this.m.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(float f) {
        this.f = f;
        j();
        this.m.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(float f) {
        this.h = f;
        j();
        this.m.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(float f) {
        this.i = f;
        j();
        this.m.invalidateSelf();
    }
}
