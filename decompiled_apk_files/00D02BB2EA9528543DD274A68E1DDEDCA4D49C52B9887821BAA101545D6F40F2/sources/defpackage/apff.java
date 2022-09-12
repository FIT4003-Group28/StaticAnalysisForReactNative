package defpackage;

import android.animation.LayoutTransition;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: apff  reason: default package */
/* loaded from: classes2.dex */
final class apff extends cquq {
    public apff(Object... objArr) {
        super(objArr);
    }

    @Override // defpackage.cquq
    public final LayoutTransition a() {
        Interpolator interpolator = irf.a;
        LayoutTransition layoutTransition = new LayoutTransition();
        int[] iArr = {2, 3, 4, 0, 1};
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            layoutTransition.enableTransitionType(i2);
            layoutTransition.setDuration(i2, 250L);
            layoutTransition.setInterpolator(i2, interpolator);
            layoutTransition.setStartDelay(i2, 0L);
        }
        return layoutTransition;
    }
}
