package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cltz  reason: default package */
/* loaded from: classes5.dex */
public final class cltz {
    public static final Uri a(Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("cpn")) {
                for (String str2 : uri.getQueryParameters(str)) {
                    buildUpon.appendQueryParameter(str, str2);
                }
            }
        }
        return buildUpon.build();
    }
}
