package defpackage;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
/* compiled from: PG */
/* renamed from: csdk  reason: default package */
/* loaded from: classes5.dex */
public final class csdk extends WebViewClient {
    private static final dcep<String> a;

    static {
        dcen dcenVar = new dcen();
        dcenVar.b("https://www.google.com/insights/consumersurveys/");
        dcenVar.b("https://www.google.com/maps/preview/log204");
        dcenVar.b("https://clients4.google.com/insights/consumersurveys/");
        dcenVar.b("https://csi.gstatic.com/");
        dcenVar.b("https://ssl.gstatic.com/");
        dcenVar.b("https://www.gstatic.com/");
        dcenVar.b("data:");
        a = dcenVar.f();
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (str.startsWith("data:") || String.valueOf(str).length() != 0) {
            return;
        }
        new String("loading resource: ");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        sb.toString();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        dcpd<String> it = a.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return super.shouldInterceptRequest(webView, str);
            }
        }
        if (String.valueOf(str).length() == 0) {
            new String("Blocking resource: ");
        }
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
