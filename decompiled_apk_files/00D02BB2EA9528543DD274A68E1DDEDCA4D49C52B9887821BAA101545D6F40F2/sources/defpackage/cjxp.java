package defpackage;

import android.net.UrlQuerySanitizer;
/* compiled from: PG */
/* renamed from: cjxp  reason: default package */
/* loaded from: classes4.dex */
public final class cjxp implements UrlQuerySanitizer.ValueSanitizer {
    @Override // android.net.UrlQuerySanitizer.ValueSanitizer
    public final String sanitize(String str) {
        String sanitize = UrlQuerySanitizer.getAllButNulAndAngleBracketsLegal().sanitize(str);
        return dbsj.d(sanitize) ? sanitize : sanitize.replace('\n', ' ');
    }
}
