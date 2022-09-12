package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bbti  reason: default package */
/* loaded from: classes3.dex */
public enum bbti {
    PHOTO,
    VIDEO;

    public static dbsg<bbti> a(@dzsi String str) {
        if (str == null) {
            return dbpy.a;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (lowerCase.startsWith("video/")) {
            return dbsg.i(VIDEO);
        }
        return lowerCase.startsWith("image/") ? dbsg.i(PHOTO) : dbpy.a;
    }

    public static dbsg<bbti> b(Context context, Uri uri) {
        return a(context.getContentResolver().getType(uri));
    }

    public static dbsg<bbti> c(Uri uri) {
        return a(MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString())));
    }
}
