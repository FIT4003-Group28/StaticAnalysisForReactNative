package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
/* compiled from: PG */
/* renamed from: fts  reason: default package */
/* loaded from: classes3.dex */
public final class fts extends AnimatorListenerAdapter {
    final /* synthetic */ fue a;
    final /* synthetic */ fuf b;
    final /* synthetic */ BottomUiContainer c;
    final /* synthetic */ ftr d;

    public fts(BottomUiContainer bottomUiContainer, fue fueVar, fuf fufVar, ftr ftrVar) {
        this.c = bottomUiContainer;
        this.a = fueVar;
        this.b = fufVar;
        this.d = ftrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.p(this.a, this.b, this.d);
    }
}
