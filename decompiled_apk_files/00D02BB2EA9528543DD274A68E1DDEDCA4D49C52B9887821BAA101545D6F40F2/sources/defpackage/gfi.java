package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: gfi  reason: default package */
/* loaded from: classes6.dex */
final class gfi extends WebViewClient {
    final /* synthetic */ gfk a;

    public gfi(gfk gfkVar) {
        this.a = gfkVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.a.ae.b();
        Runnable runnable = this.a.ah;
        if (runnable != null) {
            runnable.run();
            this.a.ah = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        if (this.a.ag.a()) {
            for (Pattern pattern : this.a.ag.b()) {
                if (pattern.matcher(str).matches()) {
                    return false;
                }
            }
            this.a.d.a().k(this.a.af, str, 4);
            return true;
        }
        Uri parse = Uri.parse(str);
        if ("https".equals(parse.getScheme())) {
            return false;
        }
        if ("http".equals(parse.getScheme()) || "tel".equals(parse.getScheme()) || "market".equals(parse.getScheme())) {
            this.a.d.a().k(this.a.af, str, 4);
        }
        return true;
    }
}
