package defpackage;

import android.transition.Transition;
import android.transition.TransitionManager;
/* compiled from: PG */
/* renamed from: cjjl  reason: default package */
/* loaded from: classes4.dex */
public final class cjjl implements Transition.TransitionListener {
    final /* synthetic */ cjjn a;

    public cjjl(cjjn cjjnVar) {
        this.a = cjjnVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        dzvx.c(transition, "transition");
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        dzvx.c(transition, "transition");
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        dzvx.c(transition, "transition");
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        dzvx.c(transition, "transition");
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        dzvx.c(transition, "transition");
        cjjn cjjnVar = this.a;
        TransitionManager.beginDelayedTransition(cjjnVar, cjjnVar.d);
        this.a.setMinimized(false);
        this.a.c();
    }
}
