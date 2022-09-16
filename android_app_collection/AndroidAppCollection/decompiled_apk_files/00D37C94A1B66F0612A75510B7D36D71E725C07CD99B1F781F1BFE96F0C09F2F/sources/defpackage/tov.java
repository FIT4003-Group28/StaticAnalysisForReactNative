package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: tov  reason: default package */
/* loaded from: classes4.dex */
public class tov extends AnimatorListenerAdapter {
    private final agd a = new agd();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(Animator animator) {
        return this.a.containsKey(animator) && ((Boolean) this.a.get(animator)).booleanValue();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.put(animator, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.put(animator, false);
    }
}
