package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: curk  reason: default package */
/* loaded from: classes5.dex */
public final class curk extends RecyclerView {
    public curk(Context context) {
        this(context, null);
    }

    public curk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public curk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        setLayoutParams(layoutParams);
        int i2 = 0;
        setClipToPadding(false);
        setNestedScrollingEnabled(false);
        if (cste.b(getContext())) {
            od.t(this, amb.a(Locale.getDefault()) != 1 ? 1 : i2);
        }
    }
}
