package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.ar.core.ImageMetadata;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bvsk  reason: default package */
/* loaded from: classes4.dex */
public final class bvsk {
    static {
        int i = cqaz.a;
    }

    public static String a(Context context, Calendar calendar, int i) {
        long timeInMillis = calendar.getTimeInMillis();
        return DateUtils.formatDateRange(context, new Formatter(new StringBuilder(50), Locale.getDefault()), timeInMillis, timeInMillis, i, calendar.getTimeZone().getID()).toString();
    }

    public static String b(Context context, Calendar calendar, int i) {
        int b = bvsj.b(calendar, System.currentTimeMillis());
        if (b != 0) {
            return bvsj.a(b, context);
        }
        return a(context, calendar, i);
    }

    public static int c(cqat cqatVar, Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(cqatVar.b());
        return !e(calendar2, calendar) ? d(calendar2, calendar) ? 524307 : 524311 : ImageMetadata.LENS_FILTER_DENSITY;
    }

    public static boolean d(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1);
    }

    public static boolean e(Calendar calendar, Calendar calendar2) {
        return d(calendar, calendar2) && calendar.get(6) == calendar2.get(6);
    }

    public static String f(Context context, Calendar calendar) {
        bvsi bvsiVar = new bvsi(context);
        int b = bvsj.b(calendar, System.currentTimeMillis());
        if (b != 0) {
            bvsiVar.c(bvsj.a(b, context));
        }
        bvsiVar.c(DateUtils.formatDateTime(context, calendar.getTimeInMillis(), 22));
        return bvsiVar.toString();
    }
}
