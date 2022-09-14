package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: eafr  reason: default package */
/* loaded from: classes6.dex */
final class eafr extends ThreadLocal<DateFormat> {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ DateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(eafa.e);
        return simpleDateFormat;
    }
}
