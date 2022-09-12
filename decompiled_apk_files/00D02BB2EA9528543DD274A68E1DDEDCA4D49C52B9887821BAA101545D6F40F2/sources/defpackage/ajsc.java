package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ajsc  reason: default package */
/* loaded from: classes2.dex */
public class ajsc {
    public final Resources a;

    public ajsc(Resources resources) {
        this.a = resources;
    }

    private static int c(long j, TimeUnit timeUnit) {
        return (int) ((j + (timeUnit.toMillis(1L) / 2)) / timeUnit.toMillis(1L));
    }

    public final CharSequence a(long j) {
        dbsk.b(j >= 0, "Can't have a negative age");
        return b(j, 2);
    }

    public final CharSequence b(long j, int i) {
        if (j >= 86400000) {
            int i2 = (int) ((j + 43200000) / 86400000);
            return this.a.getQuantityString(i + (-1) != 0 ? R.plurals.LOCATION_UPDATED_DAYS_AGO_SHORT : R.plurals.SHARING_LOCATION_FOR_DAYS, i2, Integer.valueOf(i2));
        }
        double d = j;
        double millis = TimeUnit.MINUTES.toMillis(1L);
        Double.isNaN(millis);
        if (d >= millis * 59.5d) {
            int c = c(j, TimeUnit.HOURS);
            return this.a.getQuantityString(i + (-1) != 0 ? R.plurals.LOCATION_UPDATED_HOURS_AGO_SHORT : R.plurals.SHARING_LOCATION_FOR_HOURS, c, Integer.valueOf(c));
        }
        double millis2 = TimeUnit.SECONDS.toMillis(1L);
        Double.isNaN(millis2);
        if (d >= millis2 * 59.5d || i == 1) {
            int max = Math.max(1, c(j, TimeUnit.MINUTES));
            return this.a.getQuantityString(i + (-1) != 0 ? R.plurals.LOCATION_UPDATED_MINUTES_ABBREVIATED_AGO_SHORT : R.plurals.SHARING_LOCATION_FOR_MINUTES_ABBREVIATED, max, Integer.valueOf(max));
        }
        return this.a.getString(R.string.LOCATION_UPDATED_JUST_NOW_SHORT);
    }
}
