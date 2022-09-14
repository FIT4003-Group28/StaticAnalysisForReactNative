package c.e.a.b.d.g;

import android.net.Uri;
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a  reason: collision with root package name */
    private static final a.e.a<String, Uri> f4274a = new a.e.a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (l2.class) {
            uri = f4274a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                f4274a.put(str, uri);
            }
        }
        return uri;
    }
}
