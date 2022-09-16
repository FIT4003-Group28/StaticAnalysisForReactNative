package defpackage;

import android.net.Uri;
import android.webkit.URLUtil;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cxnh  reason: default package */
/* loaded from: classes5.dex */
public class cxnh {
    private static final Pattern a;

    static {
        dcrc.b("UrlChecker");
        a = Pattern.compile("(\\.|%2e){2,}|%u", 2);
    }

    protected boolean a(String str) {
        throw null;
    }

    public final boolean b(Uri uri) {
        String uri2 = cxng.a(uri).toString();
        if (a.matcher(uri2).find()) {
            cxng.b(uri);
            return false;
        } else if ((!dbsj.d(uri.getHost()) && "https".equalsIgnoreCase(uri.getScheme())) || URLUtil.isAssetUrl(uri2) || URLUtil.isAboutUrl(uri2) || uri2.startsWith("file:///android_res/")) {
            return a(uri2);
        } else {
            cxng.b(uri);
            return false;
        }
    }
}
