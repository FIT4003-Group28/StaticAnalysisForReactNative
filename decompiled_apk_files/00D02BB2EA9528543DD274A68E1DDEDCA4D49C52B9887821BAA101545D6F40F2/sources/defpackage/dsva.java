package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: dsva  reason: default package */
/* loaded from: classes6.dex */
final class dsva extends ThreadLocal<SimpleDateFormat> {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ SimpleDateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }
}
