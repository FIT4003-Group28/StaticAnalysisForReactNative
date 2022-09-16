package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: uh  reason: default package */
/* loaded from: classes4.dex */
final class uh extends PopupWindow {
    public uh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        aad l = aad.l(context, attributeSet, pm.r, i, 0);
        if (l.q(2)) {
            kx.d(this, l.p(2, false));
        }
        setBackgroundDrawable(l.h(0));
        l.o();
    }
}
