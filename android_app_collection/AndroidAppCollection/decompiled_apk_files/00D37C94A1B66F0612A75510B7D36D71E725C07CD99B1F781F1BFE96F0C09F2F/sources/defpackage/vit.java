package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: vit  reason: default package */
/* loaded from: classes4.dex */
public final class vit {
    public static final String[] a = {"_data"};

    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
