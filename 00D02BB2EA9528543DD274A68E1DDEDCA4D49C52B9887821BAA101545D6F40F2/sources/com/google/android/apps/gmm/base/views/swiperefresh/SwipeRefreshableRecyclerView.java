package com.google.android.apps.gmm.base.views.swiperefresh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SwipeRefreshableRecyclerView extends RecyclerView implements jkm {
    public SwipeRefreshableRecyclerView(Context context) {
        super(context);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> av(cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.swipe_refreshable_recycler_view, cqqx.F(), cqgr.aT(jkn.n));
        bt.f(cqmpVarArr);
        return bt;
    }

    @Override // defpackage.jkm
    public final boolean a() {
        return !isSelected() || (this.D == 0 && !od.az(this));
    }

    public SwipeRefreshableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
