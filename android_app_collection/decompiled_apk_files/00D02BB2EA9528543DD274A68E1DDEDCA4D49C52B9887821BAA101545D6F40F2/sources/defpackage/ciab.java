package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: ciab  reason: default package */
/* loaded from: classes4.dex */
final class ciab extends AnimatorListenerAdapter {
    final /* synthetic */ chzg a;
    final /* synthetic */ chza b;
    final /* synthetic */ ciad c;

    public ciab(ciad ciadVar, chzg chzgVar, chza chzaVar) {
        this.c = ciadVar;
        this.a = chzgVar;
        this.b = chzaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.e();
        this.c.s.remove(this.a.a());
        this.c.t.remove(this.a.a());
        this.c.x(this.a.a());
        this.c.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
