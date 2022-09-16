package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: allz  reason: default package */
/* loaded from: classes.dex */
public final class allz extends AnimatorListenerAdapter {
    final /* synthetic */ almc a;

    public allz(almc almcVar) {
        this.a = almcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        almc almcVar = this.a;
        List<bol> list = almcVar.f;
        if (list == null || almcVar.g) {
            return;
        }
        for (bol bolVar : list) {
        }
    }
}
