package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: vfj  reason: default package */
/* loaded from: classes4.dex */
final class vfj {
    public static final Pattern a = Pattern.compile("^data:[-\\w]+/[-+\\w]+;(charset=(utf|UTF)-8;)?base64,");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(Uri uri) {
        Uri.Builder encodedFragment = uri.buildUpon().encodedFragment(null);
        if (uri.isHierarchical()) {
            encodedFragment.clearQuery();
        }
        return encodedFragment.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Uri uri) {
        if (uri == null) {
            return "<NULL>";
        }
        String trim = uri.toString().trim();
        if (trim.isEmpty()) {
            return "<EMPTY>";
        }
        if (amps.e(uri.getScheme())) {
            return "<REDACTED>";
        }
        if (!URLUtil.isNetworkUrl(trim)) {
            return String.format("%s:%s", uri.getScheme(), "<REDACTED>");
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(uri.getScheme());
        sb.append("://");
        if (!amps.e(uri.getHost())) {
            sb.append(uri.getHost());
        }
        if (uri.getPort() != -1) {
            sb.append(":");
            sb.append(uri.getPort());
        }
        sb.append("/<REDACTED>");
        return sb.toString();
    }
}
