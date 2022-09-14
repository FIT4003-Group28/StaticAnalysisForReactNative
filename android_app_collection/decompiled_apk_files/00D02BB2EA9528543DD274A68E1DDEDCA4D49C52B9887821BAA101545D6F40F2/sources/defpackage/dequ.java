package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: dequ  reason: default package */
/* loaded from: classes6.dex */
final class dequ implements deqp<Date> {
    private static final DateFormat a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // defpackage.deql
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        deqw deqwVar = (deqw) obj2;
        deqwVar.d(a.format((Date) obj));
    }
}
