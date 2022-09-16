package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: fyd  reason: default package */
/* loaded from: classes3.dex */
public final class fyd extends AnimatorListenerAdapter {
    final /* synthetic */ fyg a;

    public fyd(fyg fygVar) {
        this.a = fygVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        argj argjVar;
        fyg fygVar = this.a;
        FloatingActionButton floatingActionButton = fygVar.d;
        Object orElse = Optional.ofNullable(fygVar.e).map(eoo.n).orElse(null);
        fyg fygVar2 = this.a;
        acti actiVar = fygVar2.k;
        if (floatingActionButton != null && actiVar != null && fygVar2.f == null && (orElse instanceof aqgr)) {
            aqgr aqgrVar = (aqgr) orElse;
            if ((aqgrVar.b & 64) != 0) {
                aqgq aqgqVar = aqgrVar.g;
                if (aqgqVar == null) {
                    aqgqVar = aqgq.a;
                }
                if (aqgqVar.b == 102716411) {
                    argjVar = (argj) aqgqVar.c;
                } else {
                    argjVar = argj.a;
                }
                this.a.b.b(argjVar, floatingActionButton, orElse, actiVar);
            }
        }
        this.a.d();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Optional.ofNullable(this.a.d).ifPresent(fyb.d);
    }
}
