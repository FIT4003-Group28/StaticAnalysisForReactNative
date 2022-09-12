package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cxjd  reason: default package */
/* loaded from: classes.dex */
public final class cxjd {
    private static final aif<String, Uri> a = new aif<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (cxjd.class) {
            aif<String, Uri> aifVar = a;
            uri = aifVar.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                aifVar.put(str, uri);
            }
        }
        return uri;
    }
}
