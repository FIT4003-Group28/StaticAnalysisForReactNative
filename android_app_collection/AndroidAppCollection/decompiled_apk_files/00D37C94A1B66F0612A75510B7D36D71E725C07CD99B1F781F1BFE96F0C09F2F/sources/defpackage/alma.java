package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alma  reason: default package */
/* loaded from: classes.dex */
public final class alma extends AnimatorListenerAdapter {
    final /* synthetic */ almc a;

    public alma(almc almcVar) {
        this.a = almcVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        almc almcVar = this.a;
        List<bol> list = almcVar.f;
        if (list == null || almcVar.g) {
            return;
        }
        for (bol bolVar : list) {
            bolVar.a();
        }
    }
}
