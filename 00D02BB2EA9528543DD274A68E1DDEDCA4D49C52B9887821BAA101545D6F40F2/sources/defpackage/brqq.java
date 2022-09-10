package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: brqq  reason: default package */
/* loaded from: classes4.dex */
public final class brqq extends RecyclerView {
    public brqq(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            Context context = getContext();
            int e = cjyl.e().e(context);
            int e2 = brrj.b.e(context);
            int paddingStart = getPaddingStart();
            int round = (i3 - i) - Math.round((e2 + (e + e)) * 1.5f);
            if (round >= paddingStart) {
                paddingStart = round;
            }
            setPaddingRelative(getPaddingStart(), getPaddingTop(), paddingStart, getPaddingBottom());
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public brqq(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public brqq(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
