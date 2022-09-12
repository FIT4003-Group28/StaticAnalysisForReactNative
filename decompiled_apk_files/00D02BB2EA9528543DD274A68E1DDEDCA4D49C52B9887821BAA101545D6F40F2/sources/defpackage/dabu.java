package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;
/* compiled from: PG */
/* renamed from: dabu  reason: default package */
/* loaded from: classes5.dex */
final class dabu extends AnimatorListenerAdapter {
    final /* synthetic */ dabx a;

    public dabu(dabx dabxVar) {
        this.a = dabxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        List<azu> list = this.a.f;
        if (list != null) {
            for (azu azuVar : list) {
                azuVar.c();
            }
        }
    }
}
