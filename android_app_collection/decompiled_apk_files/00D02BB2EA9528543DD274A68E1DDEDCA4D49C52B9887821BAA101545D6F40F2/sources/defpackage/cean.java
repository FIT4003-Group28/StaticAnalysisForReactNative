package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cean  reason: default package */
/* loaded from: classes4.dex */
public final class cean {
    public static final boolean a(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return scheme.equals("content");
        }
        return false;
    }
}
