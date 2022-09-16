package defpackage;

import android.net.Uri;
import android.os.Build;
import android.webkit.URLUtil;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: vfk  reason: default package */
/* loaded from: classes4.dex */
public class vfk {
    private static final anay a = anay.m("UrlChecker");
    private static final Pattern b = Pattern.compile("(\\.|%2e){2,}|%u", 2);

    protected boolean b(String str) {
        throw null;
    }

    public final boolean c(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        String uri2 = vfj.a(uri).toString();
        if (b.matcher(uri2).find()) {
            ((anav) a.k().i("com/google/android/libraries/saferwebview/UrlChecker", "isUrlAllowlisted", 104, "UrlChecker.java")).s("'..' and '%%u' are not allowed in '%s'", vfj.b(uri));
            return false;
        } else if ((!amps.e(uri.getHost()) && "https".equalsIgnoreCase(uri.getScheme())) || URLUtil.isAssetUrl(uri2) || URLUtil.isAboutUrl(uri2) || uri2.startsWith("file:///android_res/")) {
            return b(uri2);
        } else {
            ((anav) a.k().i("com/google/android/libraries/saferwebview/UrlChecker", "isUrlAllowlisted", 114, "UrlChecker.java")).s("Url '%s' is not allowed (empty host/non-https or non resource/asset/about url)", vfj.b(uri));
            return false;
        }
    }
}
