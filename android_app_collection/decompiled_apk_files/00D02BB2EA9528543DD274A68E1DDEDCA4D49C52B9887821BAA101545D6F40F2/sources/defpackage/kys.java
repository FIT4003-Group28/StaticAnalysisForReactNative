package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: kys  reason: default package */
/* loaded from: classes7.dex */
public final class kys extends AnimatorListenerAdapter {
    final /* synthetic */ List a;

    public kys(List list) {
        this.a = list;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        for (View view : this.a) {
            view.setVisibility(0);
        }
    }
}
