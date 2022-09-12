package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: kyv  reason: default package */
/* loaded from: classes7.dex */
public final class kyv {
    @dzsi
    public AnimatorSet d;
    @dzsi
    public AnimatorSet e;
    private final cqrp f = nqo.az;
    public final Interpolator a = irf.b;
    public final Interpolator b = irf.c;
    public final Interpolator c = irf.a;

    private final float b(View view) {
        int max = Math.max(view.getWidth(), this.f.e(view.getContext()));
        if (view.getLayoutDirection() == 1) {
            max = -max;
        }
        return max;
    }

    public final void a(View view, boolean z) {
        view.animate().alpha(0.0f).translationX(z ? b(view) : -b(view)).setInterpolator(this.b);
    }
}
