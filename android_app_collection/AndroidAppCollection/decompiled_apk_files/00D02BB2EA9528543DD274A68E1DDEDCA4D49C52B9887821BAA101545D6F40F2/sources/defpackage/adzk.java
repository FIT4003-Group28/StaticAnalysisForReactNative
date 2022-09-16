package defpackage;

import android.animation.LayoutTransition;
/* compiled from: PG */
/* renamed from: adzk  reason: default package */
/* loaded from: classes.dex */
final class adzk extends cquq {
    public adzk(Object... objArr) {
        super(objArr);
    }

    @Override // defpackage.cquq
    public final LayoutTransition a() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.setDuration(2, 50L);
        layoutTransition.setInterpolator(2, irf.b);
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.enableTransitionType(3);
        layoutTransition.setDuration(3, 125L);
        layoutTransition.setInterpolator(3, irf.c);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        return layoutTransition;
    }
}
