package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: ehh  reason: default package */
/* loaded from: classes6.dex */
public final class ehh {
    public static void a(eha ehaVar, acyu acyuVar, boolean z, @dzsi final Runnable runnable, @dzsi Runnable runnable2, View view) {
        ValueAnimator b;
        Animator b2;
        View o = acyuVar.o();
        int c = acyuVar.c();
        ehc ehcVar = ehd.a;
        if (z) {
            b = ehc.a(o, 0);
        } else {
            b = ehc.b(o, 0);
        }
        if (runnable != null) {
            b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(runnable) { // from class: ehe
                private final Runnable a;

                {
                    this.a = runnable;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.run();
                }
            });
        }
        if (runnable2 != null) {
            b.addListener(new ehf(runnable2));
        }
        if (z) {
            b2 = b(view, ehcVar, 0, c, true);
        } else {
            b2 = b(view, ehcVar, c, 0, false);
        }
        ehaVar.a(ehb.c, b);
        ehaVar.a(ehb.c, b2);
    }

    private static Animator b(View view, ehc ehcVar, int i, int i2, boolean z) {
        ValueAnimator b;
        int measuredHeight = view.getMeasuredHeight();
        if (z) {
            b = ehc.a(view, measuredHeight - i2);
        } else {
            b = ehc.b(view, measuredHeight - i);
        }
        b.addListener(new ehg(view));
        return b;
    }
}
