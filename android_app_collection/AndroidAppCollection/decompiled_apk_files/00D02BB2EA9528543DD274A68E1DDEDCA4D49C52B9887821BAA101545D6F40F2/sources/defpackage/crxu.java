package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: crxu  reason: default package */
/* loaded from: classes5.dex */
public final class crxu {
    public final Context a;

    public crxu(Context context) {
        this.a = context;
    }

    public static boolean a(@dzsi Uri uri) {
        return "content".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean b(@dzsi Uri uri) {
        return "file".equalsIgnoreCase(uri.getScheme());
    }

    public final String c(Uri uri) {
        String type = a(uri) ? this.a.getContentResolver().getType(uri) : null;
        if (b(uri) || "application/octet-stream".equals(type)) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase(Locale.US));
        }
        if (!dbsj.d(type)) {
            return type;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Failed to get mime type for ");
        sb.append(valueOf);
        throw new IOException(sb.toString());
    }

    public final InputStream d(Uri uri) {
        return this.a.getContentResolver().openInputStream(uri);
    }
}
