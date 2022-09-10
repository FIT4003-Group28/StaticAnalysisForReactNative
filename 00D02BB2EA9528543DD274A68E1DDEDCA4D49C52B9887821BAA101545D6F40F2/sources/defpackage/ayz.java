package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayz  reason: default package */
/* loaded from: classes3.dex */
final class ayz extends AnimatorListenerAdapter implements aym {
    private final View a;
    private final View b;
    private final int c;
    private final int d;
    private int[] e;
    private float f;
    private float g;
    private final float h;
    private final float i;

    public ayz(View view, View view2, int i, int i2, float f, float f2) {
        this.b = view;
        this.a = view2;
        this.c = i - Math.round(view.getTranslationX());
        this.d = i2 - Math.round(view.getTranslationY());
        this.h = f;
        this.i = f2;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.e = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, null);
        }
    }

    @Override // defpackage.aym
    public final void a(ayn aynVar) {
        this.b.setTranslationX(this.h);
        this.b.setTranslationY(this.i);
        aynVar.E(this);
    }

    @Override // defpackage.aym
    public final void b() {
    }

    @Override // defpackage.aym
    public final void c() {
    }

    @Override // defpackage.aym
    public final void d() {
    }

    @Override // defpackage.aym
    public final void e(ayn aynVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.e == null) {
            this.e = new int[2];
        }
        this.e[0] = Math.round(this.c + this.b.getTranslationX());
        this.e[1] = Math.round(this.d + this.b.getTranslationY());
        this.a.setTag(R.id.transition_position, this.e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f = this.b.getTranslationX();
        this.g = this.b.getTranslationY();
        this.b.setTranslationX(this.h);
        this.b.setTranslationY(this.i);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        this.b.setTranslationX(this.f);
        this.b.setTranslationY(this.g);
    }
}
