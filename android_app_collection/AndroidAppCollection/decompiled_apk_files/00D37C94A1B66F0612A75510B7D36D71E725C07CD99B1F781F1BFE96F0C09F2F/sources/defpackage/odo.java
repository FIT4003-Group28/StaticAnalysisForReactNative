package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: odo  reason: default package */
/* loaded from: classes3.dex */
public final class odo extends gey {
    private final ajqm a;

    public odo(ajqm ajqmVar) {
        this.a = ajqmVar;
    }

    @Override // defpackage.gey
    public final int a(int i) {
        Object c = this.a.c(i);
        if (c instanceof aumr) {
            return 63;
        }
        return c instanceof aqbx ? 1 : 0;
    }

    @Override // defpackage.gey
    public final long b(int i) {
        Object c = this.a.c(i);
        if (c != null) {
            return c.hashCode();
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.gey
    public final void c(View view, View view2) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.related_chip_cloud);
        if (recyclerView2 == null || !(recyclerView2.n instanceof LinearLayoutManager) || (recyclerView = (RecyclerView) view2.findViewById(R.id.related_chip_cloud)) == null) {
            return;
        }
        xw xwVar = recyclerView.n;
        if (!(xwVar instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.n;
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) xwVar;
        linearLayoutManager2.Y(linearLayoutManager.P());
        int b = recyclerView2.m.b();
        if (b != recyclerView.m.b()) {
            return;
        }
        for (int i = 0; i < b; i++) {
            View S = linearLayoutManager.S(i);
            View S2 = linearLayoutManager2.S(i);
            if ((S instanceof fwn) && (S2 instanceof fwn)) {
                ((fwn) S2).d(((fwn) S).f);
            }
        }
    }
}
