package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: kyr  reason: default package */
/* loaded from: classes7.dex */
public final class kyr extends AnimatorListenerAdapter {
    final /* synthetic */ List a;

    public kyr(List list) {
        this.a = list;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        for (View view : this.a) {
            view.setVisibility(4);
        }
    }
}
