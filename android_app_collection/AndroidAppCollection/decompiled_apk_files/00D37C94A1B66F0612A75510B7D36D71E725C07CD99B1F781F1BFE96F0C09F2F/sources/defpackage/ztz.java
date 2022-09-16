package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
/* compiled from: PG */
/* renamed from: ztz  reason: default package */
/* loaded from: classes4.dex */
public final class ztz extends AnimatorListenerAdapter {
    final /* synthetic */ ChooseFilterView a;

    public ztz(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zuk zukVar = this.a.a;
        View c = zukVar.c(zukVar.c);
        if (c != null) {
            c.sendAccessibilityEvent(8);
        }
    }
}
