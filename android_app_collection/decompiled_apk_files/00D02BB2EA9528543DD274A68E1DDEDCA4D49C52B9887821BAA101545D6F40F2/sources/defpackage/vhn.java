package defpackage;

import android.animation.LayoutTransition;
/* compiled from: PG */
/* renamed from: vhn  reason: default package */
/* loaded from: classes7.dex */
final class vhn extends cquq {
    public vhn(Object... objArr) {
        super(objArr);
    }

    @Override // defpackage.cquq
    public final LayoutTransition a() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        layoutTransition.disableTransitionType(4);
        return layoutTransition;
    }
}
