package defpackage;

import android.transition.Transition;
/* compiled from: PG */
/* renamed from: hl  reason: default package */
/* loaded from: classes6.dex */
final class hl implements Transition.TransitionListener {
    final /* synthetic */ Runnable a;

    public hl(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
