package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
/* compiled from: PG */
/* renamed from: acnp  reason: default package */
/* loaded from: classes.dex */
public final class acnp extends AnimatorListenerAdapter {
    final /* synthetic */ WaitingIndicatorView a;

    public acnp(WaitingIndicatorView waitingIndicatorView) {
        this.a = waitingIndicatorView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        WaitingIndicatorView waitingIndicatorView = this.a;
        if (waitingIndicatorView.e) {
            waitingIndicatorView.b.setVisibility(8);
        }
        WaitingIndicatorView waitingIndicatorView2 = this.a;
        if (!waitingIndicatorView2.d || waitingIndicatorView2.f > 0) {
            animator.start();
            return;
        }
        acnr acnrVar = waitingIndicatorView2.c;
        if (acnrVar == null) {
            return;
        }
        acnrVar.aJ();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        WaitingIndicatorView waitingIndicatorView = this.a;
        if (waitingIndicatorView.d) {
            if (waitingIndicatorView.e) {
                waitingIndicatorView.b.setText(String.format("%d", Integer.valueOf(waitingIndicatorView.f)));
                this.a.b.setVisibility(0);
            }
            WaitingIndicatorView waitingIndicatorView2 = this.a;
            waitingIndicatorView2.f--;
        }
    }
}
