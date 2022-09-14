package defpackage;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: czyn  reason: default package */
/* loaded from: classes5.dex */
public final class czyn {
    static final AtomicReference<czym> a = new AtomicReference<>();

    public static Calendar a() {
        a.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(h());
        return calendar;
    }

    public static Calendar b() {
        return c(null);
    }

    static Calendar c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    public static Calendar d(Calendar calendar) {
        Calendar c = c(calendar);
        Calendar b = b();
        b.set(c.get(1), c.get(2), c.get(5));
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(long j) {
        Calendar b = b();
        b.setTimeInMillis(j);
        return d(b).getTimeInMillis();
    }

    public static DateFormat f(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static java.text.DateFormat g(Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    private static java.util.TimeZone h() {
        return java.util.TimeZone.getTimeZone("UTC");
    }
}
