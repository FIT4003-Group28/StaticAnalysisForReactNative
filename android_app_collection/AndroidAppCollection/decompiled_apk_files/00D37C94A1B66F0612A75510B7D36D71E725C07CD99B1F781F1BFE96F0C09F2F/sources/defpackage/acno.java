package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
/* compiled from: PG */
/* renamed from: acno  reason: default package */
/* loaded from: classes.dex */
public final class acno extends AnimatorListenerAdapter {
    final /* synthetic */ WaitingIndicatorView a;

    public acno(WaitingIndicatorView waitingIndicatorView) {
        this.a = waitingIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setVisibility(8);
    }
}
