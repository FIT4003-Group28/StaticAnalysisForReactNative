package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: afjh  reason: default package */
/* loaded from: classes.dex */
final class afjh {
    public static final amvn a = amvn.s("docid", "referrer");

    public static Uri a(Uri uri) {
        zgp b = zgp.b(uri);
        amzs it = a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (b.d(str) != null) {
                b.g(str, "(scrubbed)");
            }
        }
        return b.a();
    }
}
