package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.google.android.apps.maps.R;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: cuvy  reason: default package */
/* loaded from: classes5.dex */
public final class cuvy {
    public static CharSequence a(Context context, long j) {
        cstd.a();
        long abs = Math.abs(System.currentTimeMillis() - j);
        if (abs < 60000) {
            return context.getResources().getText(R.string.recent_message_timestamp_text);
        }
        if (abs < 3600000) {
            long j2 = abs / 60000;
            return String.format(context.getResources().getQuantityString(R.plurals.num_minutes_ago, (int) j2), Long.valueOf(j2));
        } else if (b(j)) {
            return DateUtils.formatDateTime(context, j, 1);
        } else {
            if (abs < 604800000) {
                return DateUtils.formatDateTime(context, j, 32771);
            }
            if (abs >= 31449600000L) {
                return DateUtils.formatDateTime(context, j, 65556);
            }
            return DateUtils.formatDateTime(context, j, 65560);
        }
    }

    public static boolean b(long j) {
        long rawOffset = TimeZone.getDefault().getRawOffset();
        int julianDay = Time.getJulianDay(j, rawOffset);
        cstd.a();
        return julianDay == Time.getJulianDay(System.currentTimeMillis(), rawOffset);
    }
}
