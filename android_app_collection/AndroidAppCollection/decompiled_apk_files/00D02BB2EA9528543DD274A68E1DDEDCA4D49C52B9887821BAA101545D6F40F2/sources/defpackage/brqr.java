package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brqr  reason: default package */
/* loaded from: classes4.dex */
public final class brqr {
    public final jmz a;
    public final RecyclerView b;

    public brqr(jmz jmzVar, View view) {
        this.a = jmzVar;
        int i = brqs.a;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.partial_interpretation_scroll_view);
        dbsk.s(recyclerView);
        this.b = recyclerView;
    }
}
