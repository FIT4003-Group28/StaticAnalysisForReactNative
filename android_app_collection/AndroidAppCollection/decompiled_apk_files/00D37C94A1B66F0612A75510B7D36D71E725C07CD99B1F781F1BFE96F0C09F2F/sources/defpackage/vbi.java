package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: vbi  reason: default package */
/* loaded from: classes4.dex */
public final class vbi {
    private static final afw a = new afw();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (vbi.class) {
            afw afwVar = a;
            uri = (Uri) afwVar.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                afwVar.put(str, uri);
            }
        }
        return uri;
    }
}
