package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: czmp  reason: default package */
/* loaded from: classes5.dex */
public final class czmp {
    public static Uri a(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        String valueOf = String.valueOf(uri.getPath());
        return buildUpon.path(str.length() != 0 ? valueOf.concat(str) : new String(valueOf)).build();
    }
}
