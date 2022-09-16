package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
/* compiled from: PG */
/* renamed from: xjs  reason: default package */
/* loaded from: classes4.dex */
public final class xjs extends WebViewClient {
    final /* synthetic */ AdsWebView a;

    public xjs(AdsWebView adsWebView) {
        this.a = adsWebView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        xjt xjtVar = this.a.a;
        if (xjtVar != null) {
            ndd nddVar = (ndd) xjtVar;
            nddVar.e();
            nddVar.a.a();
            if (!nddVar.b.j()) {
                return;
            }
            if (!nddVar.g) {
                if (!nddVar.h) {
                    return;
                }
                if (nddVar.e != null && nddVar.d != null) {
                    asiw asiwVar = asiw.a;
                    aopa createBuilder = asjj.a.createBuilder();
                    createBuilder.copyOnWrite();
                    asjj asjjVar = (asjj) createBuilder.instance;
                    asiwVar.getClass();
                    asjjVar.p = asiwVar;
                    asjjVar.b |= 1073741824;
                    asjj asjjVar2 = (asjj) createBuilder.mo39build();
                    apds apdsVar = nddVar.e;
                    if ((apdsVar.b & 64) != 0) {
                        nddVar.d.H(3, new acte(apdsVar.h), asjjVar2);
                    }
                }
                nddVar.h = false;
                return;
            }
            int c = (int) (nddVar.c.c() - nddVar.f);
            if (nddVar.e != null && nddVar.d != null) {
                aopa createBuilder2 = asiw.a.createBuilder();
                createBuilder2.copyOnWrite();
                asiw asiwVar2 = (asiw) createBuilder2.instance;
                asiwVar2.b |= 1;
                asiwVar2.c = c;
                asiw asiwVar3 = (asiw) createBuilder2.mo39build();
                aopa createBuilder3 = asjj.a.createBuilder();
                createBuilder3.copyOnWrite();
                asjj asjjVar3 = (asjj) createBuilder3.instance;
                asiwVar3.getClass();
                asjjVar3.p = asiwVar3;
                asjjVar3.b |= 1073741824;
                nddVar.d.u(new acte(nddVar.e.h), (asjj) createBuilder3.mo39build());
            }
            nddVar.g = false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        xjt xjtVar = this.a.a;
        if (xjtVar != null) {
            ndd nddVar = (ndd) xjtVar;
            nddVar.f = nddVar.c.c();
            nddVar.a.c();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl().toString();
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
