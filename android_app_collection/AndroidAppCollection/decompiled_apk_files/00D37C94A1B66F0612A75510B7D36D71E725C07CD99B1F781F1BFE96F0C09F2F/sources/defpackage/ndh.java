package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ndh  reason: default package */
/* loaded from: classes3.dex */
public final class ndh extends WebViewClient {
    final /* synthetic */ ndi a;

    public ndh(ndi ndiVar) {
        this.a = ndiVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ndi ndiVar = this.a;
        acti actiVar = ndiVar.e.a;
        acte acteVar = ndiVar.g;
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asit.a.createBuilder();
        aopa createBuilder3 = asiu.a.createBuilder();
        long d = this.a.c.d();
        long j = this.a.h;
        createBuilder3.copyOnWrite();
        asiu asiuVar = (asiu) createBuilder3.instance;
        asiuVar.b |= 1;
        asiuVar.c = (int) (d - j);
        ndi ndiVar2 = this.a;
        int i = ndiVar2.i + 1;
        ndiVar2.i = i;
        createBuilder3.copyOnWrite();
        asiu asiuVar2 = (asiu) createBuilder3.instance;
        asiuVar2.b |= 2;
        asiuVar2.d = i;
        asiu asiuVar3 = (asiu) createBuilder3.mo39build();
        createBuilder2.copyOnWrite();
        asit asitVar = (asit) createBuilder2.instance;
        asiuVar3.getClass();
        asitVar.d = asiuVar3;
        asitVar.c = 2;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asit asitVar2 = (asit) createBuilder2.mo39build();
        asitVar2.getClass();
        asjjVar.t = asitVar2;
        asjjVar.c |= 1024;
        actiVar.w(acteVar, (asjj) createBuilder.mo39build());
        ndi ndiVar3 = this.a;
        atya atyaVar = ndiVar3.f;
        if ((atyaVar.b & 64) != 0) {
            aafo aafoVar = ndiVar3.b;
            apzg apzgVar = atyaVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
        this.a.d.evaluateJavascript("if (onAdData) { onAdData({}, { exit: function() { PlayableAdJavascriptInterface.onExit(); }}); }", null);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ndi ndiVar = this.a;
        ndiVar.h = ndiVar.c.d();
        ndi ndiVar2 = this.a;
        atya atyaVar = ndiVar2.f;
        if ((atyaVar.b & 32) != 0) {
            aafo aafoVar = ndiVar2.b;
            apzg apzgVar = atyaVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ndi ndiVar = this.a;
        atya atyaVar = ndiVar.f;
        if ((atyaVar.b & 256) != 0) {
            aafo aafoVar = ndiVar.b;
            apzg apzgVar = atyaVar.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.a.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }
}
