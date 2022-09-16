package defpackage;

import android.animation.LayoutTransition;
/* compiled from: PG */
/* renamed from: cgiq  reason: default package */
/* loaded from: classes4.dex */
final class cgiq extends cquq {
    public cgiq(Object... objArr) {
        super(objArr);
    }

    @Override // defpackage.cquq
    public final LayoutTransition a() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(2, 400L);
        layoutTransition.setDuration(0, 400L);
        layoutTransition.setDuration(1, 400L);
        return layoutTransition;
    }
}
