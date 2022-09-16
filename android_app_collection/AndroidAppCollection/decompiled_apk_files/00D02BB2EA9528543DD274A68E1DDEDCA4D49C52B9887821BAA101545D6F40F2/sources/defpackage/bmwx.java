package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: bmwx  reason: default package */
/* loaded from: classes3.dex */
final class bmwx extends AnimatorListenerAdapter {
    final /* synthetic */ bmxd a;

    public bmwx(bmxd bmxdVar) {
        this.a = bmxdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bmxd bmxdVar = this.a;
        if (bmxdVar.c.a()) {
            bmxdVar.c(bmxdVar.c.b());
            bmxdVar.c = dbpy.a;
        }
    }
}
