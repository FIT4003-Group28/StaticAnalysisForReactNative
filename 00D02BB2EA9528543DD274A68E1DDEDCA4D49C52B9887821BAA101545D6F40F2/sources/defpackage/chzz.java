package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: chzz  reason: default package */
/* loaded from: classes4.dex */
final class chzz extends AnimatorListenerAdapter {
    final /* synthetic */ acl a;
    final /* synthetic */ acl b;
    final /* synthetic */ chza c;
    final /* synthetic */ ciad d;

    public chzz(ciad ciadVar, acl aclVar, acl aclVar2, chza chzaVar) {
        this.d = ciadVar;
        this.a = aclVar;
        this.b = aclVar2;
        this.c = chzaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.e();
        this.d.r.remove(this.a);
        this.d.r.remove(this.b);
        this.d.t.remove(this.a);
        this.d.t.remove(this.b);
        this.d.p(this.a);
        this.d.p(this.b);
        this.d.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
