package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: jds  reason: default package */
/* loaded from: classes7.dex */
final class jds extends AnimatorListenerAdapter {
    final /* synthetic */ jdv a;

    public jds(jdv jdvVar) {
        this.a = jdvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jdu jduVar = this.a.a;
        if (jduVar != null) {
            jduVar.a();
        }
    }
}
