package defpackage;

import android.animation.LayoutTransition;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: bobn  reason: default package */
/* loaded from: classes3.dex */
final class bobn extends cquq {
    public bobn(Object... objArr) {
        super(objArr);
    }

    @Override // defpackage.cquq
    public final LayoutTransition a() {
        Interpolator interpolator = irf.a;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.setDuration(2, 250L);
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.enableTransitionType(3);
        layoutTransition.setDuration(3, 250L);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.enableTransitionType(4);
        layoutTransition.setDuration(4, 250L);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.setStartDelay(4, 0L);
        layoutTransition.enableTransitionType(0);
        layoutTransition.setDuration(0, 250L);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.enableTransitionType(1);
        layoutTransition.setDuration(1, 250L);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setStartDelay(1, 0L);
        return layoutTransition;
    }
}
