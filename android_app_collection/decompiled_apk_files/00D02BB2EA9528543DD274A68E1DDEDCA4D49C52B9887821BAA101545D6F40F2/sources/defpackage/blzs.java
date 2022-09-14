package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;
/* compiled from: PG */
/* renamed from: blzs  reason: default package */
/* loaded from: classes3.dex */
public class blzs {
    public final AnimatorSet a;
    public final ObjectAnimator b;
    public final ObjectAnimator c;
    public final ObjectAnimator d;
    @dzsi
    public ViewPropertyAnimator e;
    public boolean f;
    public boolean g;
    public float h;
    public float i;
    public int j;
    private final ValueAnimator.AnimatorUpdateListener k;
    private final ValueAnimator.AnimatorUpdateListener l;
    private final ValueAnimator.AnimatorUpdateListener m;

    public blzs() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.a = animatorSet;
        ObjectAnimator objectAnimator = new ObjectAnimator();
        this.b = objectAnimator;
        ObjectAnimator objectAnimator2 = new ObjectAnimator();
        this.c = objectAnimator2;
        ObjectAnimator objectAnimator3 = new ObjectAnimator();
        this.d = objectAnimator3;
        blzo blzoVar = new blzo(this);
        this.k = blzoVar;
        blzp blzpVar = new blzp(this);
        this.l = blzpVar;
        blzq blzqVar = new blzq(this);
        this.m = blzqVar;
        this.h = 1.0f;
        animatorSet.playTogether(objectAnimator, objectAnimator2, objectAnimator3);
        objectAnimator.setPropertyName("alpha");
        objectAnimator.addUpdateListener(blzoVar);
        objectAnimator2.setPropertyName("alpha");
        objectAnimator2.addUpdateListener(blzpVar);
        objectAnimator3.setPropertyName("maxHeight");
        objectAnimator3.addUpdateListener(blzqVar);
        objectAnimator3.setInterpolator(eho.a(0.0f, 0.0f, 1.0f, 1.0f));
    }

    public final void a() {
        this.g = false;
        this.a.cancel();
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final boolean b() {
        return this.f || this.g;
    }
}
