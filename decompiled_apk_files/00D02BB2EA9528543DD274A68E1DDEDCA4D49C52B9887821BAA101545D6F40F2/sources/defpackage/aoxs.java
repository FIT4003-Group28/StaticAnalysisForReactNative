package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoxs  reason: default package */
/* loaded from: classes2.dex */
public final class aoxs {
    public static String a(Resources resources, aoxr aoxrVar) {
        aoxr aoxrVar2 = aoxr.LAST_VISIT_TIME;
        int ordinal = aoxrVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return resources.getString(R.string.MAPS_ACTIVITY_SORT_BY_MOST_VISITED);
            }
            if (ordinal == 2) {
                return resources.getString(R.string.MAPS_ACTIVITY_SORT_BY_ALPHABETICALLY);
            }
            String valueOf = String.valueOf(aoxrVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("No string found for sort by: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return resources.getString(R.string.MAPS_ACTIVITY_SORT_BY_MOST_RECENT);
    }
}
