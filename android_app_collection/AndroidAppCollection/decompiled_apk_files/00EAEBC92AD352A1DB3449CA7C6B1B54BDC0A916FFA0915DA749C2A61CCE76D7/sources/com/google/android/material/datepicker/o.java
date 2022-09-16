package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes.dex */
class o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j) {
        Calendar d2 = d();
        d2.setTimeInMillis(j);
        return a(d2).getTimeInMillis();
    }

    @TargetApi(24)
    private static DateFormat a(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(c());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat a(Locale locale) {
        return a("MMMEd", locale);
    }

    private static java.text.DateFormat a(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(a());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar a(Calendar calendar) {
        Calendar b2 = b(calendar);
        Calendar d2 = d();
        d2.set(b2.get(1), b2.get(2), b2.get(5));
        return d2;
    }

    private static TimeZone a() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static java.text.DateFormat b(Locale locale) {
        return a(0, locale);
    }

    private static SimpleDateFormat b(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(a());
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar b() {
        return a(Calendar.getInstance());
    }

    static Calendar b(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(a());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(24)
    public static DateFormat c(Locale locale) {
        return a("yMMMEd", locale);
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone c() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    private static SimpleDateFormat d(Locale locale) {
        return b("MMMM, yyyy", locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar d() {
        return b((Calendar) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SimpleDateFormat e() {
        return d(Locale.getDefault());
    }
}
