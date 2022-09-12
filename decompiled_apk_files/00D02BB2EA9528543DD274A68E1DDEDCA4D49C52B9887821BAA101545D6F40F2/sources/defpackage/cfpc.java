package defpackage;

import android.view.View;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: cfpc  reason: default package */
/* loaded from: classes4.dex */
final class cfpc implements Animation.AnimationListener {
    final /* synthetic */ cpv a;
    final /* synthetic */ cfpd b;

    public cfpc(cfpd cfpdVar, cpv cpvVar) {
        this.b = cfpdVar;
        this.a = cpvVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        for (View view : cqkx.n(this.b)) {
            this.a.a(view);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
