package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: cpkc  reason: default package */
/* loaded from: classes5.dex */
public final class cpkc extends cpkb {
    public static final Uri a = Uri.parse("content://com.google.settings/partner");

    public static String b(ContentResolver contentResolver, String str) {
        return a(contentResolver, a, str);
    }
}
