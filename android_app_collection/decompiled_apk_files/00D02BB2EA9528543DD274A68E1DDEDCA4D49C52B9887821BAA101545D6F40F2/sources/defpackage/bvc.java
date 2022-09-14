package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: bvc  reason: default package */
/* loaded from: classes.dex */
public final class bvc {
    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean b(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean c(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }
}
