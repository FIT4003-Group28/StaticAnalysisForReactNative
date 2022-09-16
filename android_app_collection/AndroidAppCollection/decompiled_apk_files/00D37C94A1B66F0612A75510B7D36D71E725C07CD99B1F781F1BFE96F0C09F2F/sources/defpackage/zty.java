package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
/* compiled from: PG */
/* renamed from: zty  reason: default package */
/* loaded from: classes4.dex */
public final class zty extends AnimatorListenerAdapter {
    final /* synthetic */ ChooseFilterView a;

    public zty(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setAlpha(0.0f);
    }
}
