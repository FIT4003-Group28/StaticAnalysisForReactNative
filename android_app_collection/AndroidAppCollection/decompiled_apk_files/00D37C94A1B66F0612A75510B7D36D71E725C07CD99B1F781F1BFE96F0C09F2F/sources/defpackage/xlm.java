package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
/* compiled from: PG */
/* renamed from: xlm  reason: default package */
/* loaded from: classes4.dex */
public final class xlm extends AnimatorListenerAdapter {
    final /* synthetic */ xln a;
    private final Handler b = new Handler();
    private final View c;

    public xlm(xln xlnVar, View view) {
        this.a = xlnVar;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Animator a = xln.a(this.c, 0L);
        if (a != null) {
            a.addListener(new xlk());
            this.b.post(new xll(a));
            this.a.b.put(this.c, a);
        }
    }
}
