package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import android.text.format.Time;
import com.google.android.apps.maps.R;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: cvda  reason: default package */
/* loaded from: classes5.dex */
public final class cvda {
    public static String a(long j, Context context) {
        String formatDateTime;
        String formatDateTime2 = DateUtils.formatDateTime(context, j, 1);
        if (!cuvy.b(j)) {
            long rawOffset = TimeZone.getDefault().getRawOffset();
            int julianDay = Time.getJulianDay(j, rawOffset);
            cstd.a();
            if (julianDay + 1 != Time.getJulianDay(System.currentTimeMillis(), rawOffset)) {
                long rawOffset2 = TimeZone.getDefault().getRawOffset();
                int julianDay2 = Time.getJulianDay(j, rawOffset2);
                cstd.a();
                if (julianDay2 + 6 < Time.getJulianDay(System.currentTimeMillis(), rawOffset2)) {
                    cstd.a();
                    if (Math.abs(System.currentTimeMillis() - j) > 31449600000L) {
                        formatDateTime = DateUtils.formatDateTime(context, j, 65558);
                    } else {
                        formatDateTime = DateUtils.formatDateTime(context, j, 65562);
                    }
                } else {
                    formatDateTime = DateUtils.formatDateTime(context, j, 2);
                }
            } else {
                formatDateTime = context.getText(R.string.tombstone_yesterday_tag).toString();
            }
            return context.getResources().getString(R.string.bullet_point_separated_text, formatDateTime, formatDateTime2);
        }
        return formatDateTime2;
    }
}
