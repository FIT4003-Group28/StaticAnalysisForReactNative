package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: bvii  reason: default package */
/* loaded from: classes4.dex */
final class bvii extends AnimatorListenerAdapter {
    final /* synthetic */ bvij a;

    public bvii(bvij bvijVar) {
        this.a = bvijVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.a.b.q();
        cqkx.p(this.a.b);
        this.a.a();
    }
}
