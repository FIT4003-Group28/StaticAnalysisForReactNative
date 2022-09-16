package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.PopupWindow;
/* compiled from: PG */
/* renamed from: xo  reason: default package */
/* loaded from: classes7.dex */
final class xo extends PopupWindow {
    public xo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        aeq b = aeq.b(context, attributeSet, sj.r, i, 0);
        if (b.p(2)) {
            qc.a(this, b.h(2, false));
        }
        setBackgroundDrawable(b.d(0));
        b.q();
    }
}
