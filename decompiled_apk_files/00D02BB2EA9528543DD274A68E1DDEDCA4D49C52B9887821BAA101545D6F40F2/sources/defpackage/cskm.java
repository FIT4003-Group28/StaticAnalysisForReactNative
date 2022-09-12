package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: cskm  reason: default package */
/* loaded from: classes5.dex */
public class cskm extends AnimatorListenerAdapter {
    private final aim<Animator, Boolean> a = new aim<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(Animator animator) {
        return this.a.containsKey(animator) && this.a.get(animator).booleanValue();
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
