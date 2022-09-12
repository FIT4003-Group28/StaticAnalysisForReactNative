package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.spotify.sdk.android.authentication.AuthenticationResponse;
/* compiled from: PG */
/* renamed from: dxic  reason: default package */
/* loaded from: classes6.dex */
final class dxic extends WebViewClient {
    final /* synthetic */ WebView a;
    final /* synthetic */ LinearLayout b;
    final /* synthetic */ String c;
    final /* synthetic */ dxid d;

    public dxic(dxid dxidVar, WebView webView, LinearLayout linearLayout, String str) {
        this.d = dxidVar;
        this.a = webView;
        this.b = linearLayout;
        this.c = str;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        dxid dxidVar = this.d;
        if (dxidVar.b) {
            dxidVar.a.dismiss();
        }
        this.a.setVisibility(0);
        this.b.setVisibility(0);
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        dxid dxidVar = this.d;
        if (dxidVar.b) {
            dxidVar.a.show();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        dxid dxidVar = this.d;
        Error error = new Error(String.format("%s, code: %s, failing url: %s", str, Integer.valueOf(i), str2));
        dxidVar.c = true;
        dxhs dxhsVar = dxidVar.d;
        if (dxhsVar != null) {
            dxhy dxhyVar = new dxhy();
            dxhyVar.a = dxhz.ERROR;
            dxhyVar.e = error.getMessage();
            dxhsVar.b.b(dxhsVar.a, dxhyVar.a());
        }
        dxidVar.a();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        if (str.startsWith(this.c)) {
            dxid dxidVar = this.d;
            dxidVar.c = true;
            dxhs dxhsVar = dxidVar.d;
            if (dxhsVar != null) {
                dxhsVar.b.b(dxhsVar.a, AuthenticationResponse.a(parse));
            }
            dxidVar.a();
            return true;
        } else if (parse.getAuthority().matches("^(.+\\.facebook\\.com)|(accounts\\.spotify\\.com)$")) {
            return false;
        } else {
            this.d.getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
            return true;
        }
    }
}
