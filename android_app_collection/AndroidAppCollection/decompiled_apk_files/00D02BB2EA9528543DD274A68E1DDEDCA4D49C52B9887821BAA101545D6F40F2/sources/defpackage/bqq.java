package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bqq  reason: default package */
/* loaded from: classes4.dex */
public final class bqq {
    public static final String a(Locale locale, String str, Object... objArr) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return cr.a(locale, str, objArr);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static final String b(String str, Object... objArr) {
        return a(Locale.getDefault(), str, objArr);
    }

    public static final String c(Context context, int i, Object... objArr) {
        return a(Locale.getDefault(), context.getResources().getString(i), objArr);
    }
}
