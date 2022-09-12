package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cqre  reason: default package */
/* loaded from: classes.dex */
public class cqre {
    @dzsi
    public static final adz a(RecyclerView recyclerView) {
        Object tag = recyclerView.getTag(R.id.recycler_view_snap_helper);
        if (tag instanceof adz) {
            return (adz) tag;
        }
        return null;
    }
}
