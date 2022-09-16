package defpackage;

import android.net.Uri;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aipa  reason: default package */
/* loaded from: classes.dex */
public final class aipa {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final long e;

    private aipa(String str, int i, String str2, long j, long j2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }

    public static aipa a(Uri uri) {
        String queryParameter = uri.getQueryParameter("v");
        String queryParameter2 = uri.getQueryParameter("i");
        String queryParameter3 = uri.getQueryParameter("x");
        String queryParameter4 = uri.getQueryParameter("l");
        String queryParameter5 = uri.getQueryParameter("m");
        if (TextUtils.isEmpty(queryParameter) || queryParameter2 == null || queryParameter3 == null || queryParameter4 == null || queryParameter5 == null) {
            return null;
        }
        return new aipa(queryParameter, Integer.parseInt(queryParameter2), queryParameter3, Long.parseLong(queryParameter4), Long.parseLong(queryParameter5));
    }
}
