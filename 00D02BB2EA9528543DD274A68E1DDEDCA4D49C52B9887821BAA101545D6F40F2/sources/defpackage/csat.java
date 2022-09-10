package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: csat  reason: default package */
/* loaded from: classes5.dex */
final class csat extends AnimatorListenerAdapter {
    final /* synthetic */ csaw a;

    public csat(csaw csawVar) {
        this.a = csawVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        csav csavVar = this.a.c;
        if (csavVar != null) {
            csavVar.b();
            this.a.c.a();
        }
    }
}
