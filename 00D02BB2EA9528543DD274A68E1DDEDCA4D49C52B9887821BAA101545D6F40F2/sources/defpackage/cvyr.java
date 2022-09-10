package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
/* compiled from: PG */
/* renamed from: cvyr  reason: default package */
/* loaded from: classes5.dex */
final class cvyr extends AnimatorListenerAdapter {
    final /* synthetic */ Object a;
    final /* synthetic */ AnimatorListenerAdapter b;
    final /* synthetic */ cvyt c;
    final /* synthetic */ int d;

    public cvyr(cvyt cvytVar, Object obj, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        this.c = cvytVar;
        this.a = obj;
        this.d = i;
        this.b = animatorListenerAdapter;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cvyt cvytVar = this.c;
        Object obj = this.a;
        int i = this.d;
        Object b = cvyt.b(cvytVar.a.a().l(), obj, i);
        if (!cvytVar.a(b, obj)) {
            cwjw e = cvytVar.a.e();
            int i2 = i == 3 ? 40 : 39;
            dtga bZ = dtgb.g.bZ();
            dtgh dtghVar = dtgh.ACCOUNT_PARTICLE_DISC_COMPONENT;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtgb dtgbVar = (dtgb) bZ.b;
            dtgbVar.c = dtghVar.u;
            dtgbVar.a |= 2;
            dtgb dtgbVar2 = (dtgb) bZ.b;
            dtgbVar2.e = 10;
            dtgbVar2.a |= 32;
            dtgb dtgbVar3 = (dtgb) bZ.b;
            dtgbVar3.d = 3;
            int i3 = dtgbVar3.a | 8;
            dtgbVar3.a = i3;
            dtgbVar3.b = i2 - 1;
            dtgbVar3.a = i3 | 1;
            e.a(obj, bZ.bK());
            cvytVar.a.a().b(b);
            dbsg i4 = cvytVar.a.c().i();
            if (i4.a()) {
                cvytVar.a.o();
                cvytVar.a.i();
                cvytVar.a.h();
                cvytVar.a.e();
                cvytVar.a.p();
                cvytVar.a.j();
                ((cwei) i4.b()).a();
            }
        }
        cvyt cvytVar2 = this.c;
        AnimatorListenerAdapter animatorListenerAdapter = this.b;
        dcdc h = dcdc.h(ObjectAnimator.ofFloat(cvytVar2.b, "scaleX", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(cvytVar2.b, "scaleY", 0.067f, 1.0f).setDuration(233L), ObjectAnimator.ofFloat(cvytVar2.b, "alpha", 0.125f, 1.0f).setDuration(117L));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(h);
        animatorSet.addListener(animatorListenerAdapter);
        animatorSet.addListener(new cvys(cvytVar2));
        animatorSet.start();
    }
}
