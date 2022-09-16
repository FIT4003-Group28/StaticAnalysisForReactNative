package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: PG */
/* renamed from: skb  reason: default package */
/* loaded from: classes4.dex */
final class skb extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        ((amzw) ((amzw) skc.a.g()).i("com/google/android/libraries/ar/faceviewer/components/web/WebViewWebInterface$FaceViewerWebViewClient", "onReceivedHttpError", 105, "WebViewWebInterface.java")).v("Http error for url:%s code:%d reason:%s", webResourceRequest.getUrl(), Integer.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getReasonPhrase());
    }
}
