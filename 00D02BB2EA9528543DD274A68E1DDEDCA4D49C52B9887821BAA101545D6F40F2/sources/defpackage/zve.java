package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zve  reason: default package */
/* loaded from: classes7.dex */
public final class zve {
    public static <T extends cqkp> cqnf<T> a(cqlc<T, cqkp> cqlcVar) {
        return cqjv.g(ztg.SCROLL_TO, cqlcVar, zth.a);
    }

    public static void b(RecyclerView recyclerView, @dzsi Object obj, boolean z) {
        if (obj == null) {
            recyclerView.setTag(R.id.scroll_to_id_tag, null);
            return;
        }
        int hashCode = obj.hashCode();
        Integer num = (Integer) recyclerView.getTag(R.id.scroll_to_id_tag);
        if (num != null && hashCode == num.intValue()) {
            return;
        }
        abg abgVar = recyclerView.k;
        int i = 0;
        while (true) {
            if (i >= abgVar.c()) {
                break;
            } else if (abgVar.k(i) != hashCode) {
                i++;
            } else if (z) {
                recyclerView.n(i);
            } else {
                abs absVar = recyclerView.l;
                if (absVar instanceof aag) {
                    ((aag) absVar).P(i, 0);
                } else {
                    absVar.O(i);
                }
            }
        }
        recyclerView.setTag(R.id.scroll_to_id_tag, Integer.valueOf(hashCode));
    }
}
