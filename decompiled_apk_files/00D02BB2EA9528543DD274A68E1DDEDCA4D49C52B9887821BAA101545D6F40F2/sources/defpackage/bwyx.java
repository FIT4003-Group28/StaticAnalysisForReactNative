package defpackage;

import android.animation.LayoutTransition;
/* compiled from: PG */
/* renamed from: bwyx  reason: default package */
/* loaded from: classes4.dex */
final class bwyx extends cquq {
    public bwyx(Object... objArr) {
        super(objArr);
    }

    @Override // defpackage.cquq
    public final LayoutTransition a() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        layoutTransition.enableTransitionType(4);
        layoutTransition.disableTransitionType(2);
        layoutTransition.disableTransitionType(3);
        layoutTransition.setDuration(200L);
        layoutTransition.setStartDelay(4, 0L);
        return layoutTransition;
    }
}
