package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jih  reason: default package */
/* loaded from: classes7.dex */
public final class jih {
    private static final cqkv a = new jii();
    private static final acb b = jie.a;

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqjb<T, cqiv> cqjbVar, cqmp<T>... cqmpVarArr) {
        cqmj<T> bt = cqgr.bt(R.layout.gmm_recycler_view, cqjv.e(jif.a, cqjbVar, a));
        bt.f(cqmpVarArr);
        return bt;
    }

    public static void b(RecyclerView recyclerView, @dzsi abg<?> abgVar) {
        if (abgVar == null) {
            recyclerView.setAdapter(null);
            recyclerView.setRecyclerListener(null);
            return;
        }
        cqqk.c(recyclerView, abgVar);
        recyclerView.setRecyclerListener(b);
    }
}
