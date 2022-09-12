package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cxng  reason: default package */
/* loaded from: classes5.dex */
final class cxng {
    public static final Pattern a = Pattern.compile("^data:[-\\w]+/[-\\w]+;base64,");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(Uri uri) {
        Uri.Builder encodedFragment = uri.buildUpon().encodedFragment(null);
        if (uri.isHierarchical()) {
            encodedFragment.clearQuery();
        }
        return encodedFragment.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Uri uri) {
        if (uri == null) {
            return;
        }
        String trim = uri.toString().trim();
        if (trim.isEmpty() || dbsj.d(uri.getScheme())) {
            return;
        }
        if (!URLUtil.isNetworkUrl(trim)) {
            uri.getScheme();
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(uri.getScheme());
        sb.append("://");
        if (!dbsj.d(uri.getHost())) {
            sb.append(uri.getHost());
        }
        if (uri.getPort() != -1) {
            sb.append(":");
            sb.append(uri.getPort());
        }
        sb.append("/");
        sb.append("<REDACTED>");
        sb.toString();
    }
}
