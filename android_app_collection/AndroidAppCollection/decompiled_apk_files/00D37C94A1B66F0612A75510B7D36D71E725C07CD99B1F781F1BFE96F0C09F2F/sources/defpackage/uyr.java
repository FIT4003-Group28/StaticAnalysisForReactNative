package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: uyr  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uyr {
    public static Uri a(Uri uri, String str) {
        Uri.Builder buildUpon = uri.buildUpon();
        String valueOf = String.valueOf(uri.getPath());
        return buildUpon.path(str.length() != 0 ? valueOf.concat(str) : new String(valueOf)).build();
    }
}
