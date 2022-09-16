package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
/* compiled from: PG */
/* renamed from: acnm  reason: default package */
/* loaded from: classes.dex */
public final class acnm extends AnimatorListenerAdapter {
    final /* synthetic */ WaitingIndicatorView a;

    public acnm(WaitingIndicatorView waitingIndicatorView) {
        this.a = waitingIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.a.setVisibility(0);
    }
}
