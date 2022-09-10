package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: ciaa  reason: default package */
/* loaded from: classes4.dex */
final class ciaa extends AnimatorListenerAdapter {
    final /* synthetic */ acl a;
    final /* synthetic */ chza b;
    final /* synthetic */ ciad c;

    public ciaa(ciad ciadVar, acl aclVar, chza chzaVar) {
        this.c = ciadVar;
        this.a = aclVar;
        this.b = chzaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.e();
        this.c.q.remove(this.a);
        this.c.t.remove(this.a);
        this.c.p(this.a);
        this.c.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
