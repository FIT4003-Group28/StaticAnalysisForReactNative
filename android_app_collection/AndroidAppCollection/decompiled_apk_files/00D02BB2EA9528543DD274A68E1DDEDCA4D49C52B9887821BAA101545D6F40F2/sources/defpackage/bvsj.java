package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: bvsj  reason: default package */
/* loaded from: classes4.dex */
public final class bvsj {
    public static String a(int i, Context context) {
        return context.getString(i);
    }

    @dzsi
    public static int b(Calendar calendar, long j) {
        Calendar calendar2 = Calendar.getInstance(calendar.getTimeZone());
        calendar2.setTimeInMillis(j);
        if (bvsk.e(calendar, calendar2)) {
            return R.string.TODAY;
        }
        calendar2.add(6, -1);
        if (bvsk.e(calendar, calendar2)) {
            return R.string.YESTERDAY;
        }
        calendar2.add(6, 2);
        if (!bvsk.e(calendar, calendar2)) {
            return 0;
        }
        return R.string.TOMORROW;
    }
}
