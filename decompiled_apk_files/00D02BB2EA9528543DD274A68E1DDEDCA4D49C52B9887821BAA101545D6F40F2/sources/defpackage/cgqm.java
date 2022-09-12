package defpackage;

import android.animation.LayoutTransition;
/* compiled from: PG */
/* renamed from: cgqm  reason: default package */
/* loaded from: classes4.dex */
final class cgqm extends cquq {
    final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgqm(Object[] objArr, boolean z) {
        super(objArr);
        this.a = z;
    }

    @Override // defpackage.cquq
    public final LayoutTransition a() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(3);
        layoutTransition.setInterpolator(1, irf.a);
        layoutTransition.setDuration(1, 800L);
        if (this.a) {
            layoutTransition.enableTransitionType(2);
            layoutTransition.setDuration(2, 400L);
            layoutTransition.enableTransitionType(4);
            layoutTransition.setDuration(4, 400L);
        } else {
            layoutTransition.disableTransitionType(2);
            layoutTransition.disableTransitionType(0);
            layoutTransition.disableTransitionType(4);
        }
        return layoutTransition;
    }
}
