package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
/* compiled from: PG */
/* renamed from: hpn  reason: default package */
/* loaded from: classes3.dex */
public final class hpn extends AnimatorListenerAdapter {
    final /* synthetic */ ShortsRecordButtonView a;
    private boolean b = false;

    public hpn(ShortsRecordButtonView shortsRecordButtonView) {
        this.a = shortsRecordButtonView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.b) {
            ShortsRecordButtonView shortsRecordButtonView = this.a;
            shortsRecordButtonView.o = true;
            shortsRecordButtonView.b();
        }
    }
}
