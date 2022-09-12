package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cuqu  reason: default package */
/* loaded from: classes5.dex */
public final class cuqu extends RecyclerView {
    public cuqu(Context context) {
        this(context, null);
    }

    public cuqu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cuqu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPadding(getResources().getDimensionPixelSize(R.dimen.rich_card_start_end_padding), 0, 0, 0);
        setClipToPadding(false);
        zd zdVar = new zd(getContext(), 0);
        zdVar.a(getContext().getDrawable(R.drawable.rich_card_divider));
        g(zdVar);
        setNestedScrollingEnabled(false);
    }
}
