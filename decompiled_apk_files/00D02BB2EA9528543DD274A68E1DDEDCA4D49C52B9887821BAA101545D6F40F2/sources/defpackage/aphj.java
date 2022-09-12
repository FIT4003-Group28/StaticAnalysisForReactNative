package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aphj  reason: default package */
/* loaded from: classes2.dex */
public class aphj {
    public final Context a;

    public aphj(Context context) {
        this.a = context;
    }

    private final CharSequence d(int i, int i2, boolean z) {
        bvsx bvsxVar = new bvsx(this.a.getResources());
        aoxr aoxrVar = aoxr.LAST_VISIT_TIME;
        int i3 = i2 - 1;
        if (i3 == 0) {
            if (z) {
                bvsu d = bvsxVar.d(R.plurals.NUMBER_OF_VISITED_COUNTRIES_TITLE_SHORT, i);
                d.a(bvsxVar.a(Integer.valueOf(i)));
                return d.c();
            }
            bvsu d2 = bvsxVar.d(R.plurals.NUMBER_OF_VISITED_COUNTRIES_TITLE_LONG, i);
            bvsv a = bvsxVar.a(Integer.valueOf(i));
            a.i();
            d2.a(a);
            return d2.c();
        } else if (i3 != 1) {
            if (z) {
                bvsu d3 = bvsxVar.d(R.plurals.NUMBER_OF_VISITED_PLACES_TITLE_SHORT, i);
                d3.a(bvsxVar.a(Integer.valueOf(i)));
                return d3.c();
            }
            bvsu d4 = bvsxVar.d(R.plurals.NUMBER_OF_VISITED_PLACES_TITLE_LONG, i);
            bvsv a2 = bvsxVar.a(Integer.valueOf(i));
            a2.i();
            d4.a(a2);
            return d4.c();
        } else if (z) {
            bvsu d5 = bvsxVar.d(R.plurals.NUMBER_OF_VISITED_CITIES_TITLE_SHORT, i);
            d5.a(bvsxVar.a(Integer.valueOf(i)));
            return d5.c();
        } else {
            bvsu d6 = bvsxVar.d(R.plurals.NUMBER_OF_VISITED_CITIES_TITLE_LONG, i);
            bvsv a3 = bvsxVar.a(Integer.valueOf(i));
            a3.i();
            d6.a(a3);
            return d6.c();
        }
    }

    public final CharSequence a(boolean z, aoxr aoxrVar) {
        Resources resources = this.a.getResources();
        if (!z) {
            return resources.getString(R.string.MAPS_ACTIVITY_SORT_BY_PIVOT_DESCIPTION);
        }
        aoxr aoxrVar2 = aoxr.LAST_VISIT_TIME;
        int ordinal = aoxrVar.ordinal();
        if (ordinal == 0) {
            return resources.getString(R.string.MAPS_ACTIVITY_SORT_BY_MOST_RECENT_DESCRIPTION);
        }
        if (ordinal == 1) {
            return resources.getString(R.string.MAPS_ACTIVITY_SORT_BY_MOST_VISITED_DESCRIPTION);
        }
        if (ordinal == 2) {
            return resources.getString(R.string.MAPS_ACTIVITY_SORT_BY_ALPHABETICALLY_DESCRIPTION);
        }
        String valueOf = String.valueOf(aoxrVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Unexpected sort by: ");
        sb.append(valueOf);
        throw new RuntimeException(sb.toString());
    }

    public final CharSequence b(int i, int i2) {
        return d(i, i2, false);
    }

    public final CharSequence c(int i, int i2) {
        return d(i, i2, true);
    }
}
