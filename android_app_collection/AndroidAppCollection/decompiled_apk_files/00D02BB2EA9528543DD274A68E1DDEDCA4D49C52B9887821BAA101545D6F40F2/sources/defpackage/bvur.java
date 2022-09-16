package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: PG */
/* renamed from: bvur  reason: default package */
/* loaded from: classes4.dex */
public final class bvur extends cxnf {
    private static final dcqe a = dcqe.c("bvur");
    private int b;
    private boolean c;
    private final gga d;
    private final bwbz e;
    private final dxio<afha> f;
    private final boolean g;
    private final boolean h;
    private final cxnh i;
    private final bvvk j;

    public bvur(cxnh cxnhVar, gga ggaVar, bwbz bwbzVar, dxio dxioVar, bvxu bvxuVar, bvvk bvvkVar) {
        super(cxnhVar, cxnhVar);
        super.b(cxnd.a);
        this.j = bvvkVar;
        this.b = bvxuVar.f;
        this.d = ggaVar;
        this.e = bwbzVar;
        this.f = dxioVar;
        this.g = bvxuVar.m;
        this.h = bvxuVar.n;
        this.i = c();
    }

    private static cxnh c() {
        ArrayList arrayList = new ArrayList();
        dcdc<String> dcdcVar = bvtk.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            try {
                arrayList.add(Pattern.compile(dcdcVar.get(i)));
            } catch (PatternSyntaxException e) {
                bvoo.h("Invalid deep link url allowlist regex %s", e);
            }
        }
        return new cxne(dcdc.r(arrayList));
    }

    private final void d(String str, Uri uri) {
        if (this.i.b(uri)) {
            return;
        }
        g(str);
    }

    @dzsi
    private static Intent e(String str) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (scheme != null && TextUtils.equals(scheme, "intent") && host != null && (TextUtils.indexOf(host, ".google") >= 0 || host.matches("^(www\\.)?youtube\\.com$"))) {
            try {
                return Intent.parseUri(str, 1);
            } catch (URISyntaxException unused) {
            }
        }
        if (TextUtils.equals(scheme, "tel")) {
            return new Intent("android.intent.action.DIAL", parse);
        }
        return null;
    }

    private final boolean f() {
        return this.b <= 0;
    }

    private final void g(String str) {
        if (f() || this.c) {
            return;
        }
        bvvl bvvlVar = this.j.a;
        if (!bvvlVar.i) {
            bvvlVar.h = str;
            bvvlVar.i = true;
            bvvlVar.t();
        }
        this.c = true;
    }

    @Override // defpackage.cxnf
    public final boolean a(String str) {
        bwbz bwbzVar = this.e;
        Intent a2 = bwbz.a(str);
        if (a2 != null && bwbz.a.a(a2)) {
            afia b = bwbz.a.b(a2, null);
            if (b.a.equals(afib.DIRECTIONS)) {
                bwca bwcaVar = bwbzVar.b;
                dcdc<amvh> dcdcVar = b.j;
                if (b.i != null || !dcdcVar.isEmpty()) {
                    qbt a3 = bwcaVar.a.a();
                    qcw x = qcx.x();
                    amvh amvhVar = b.i;
                    if (amvhVar == null) {
                        amvhVar = amvh.i(bwcaVar.b);
                    }
                    x.r(amvhVar);
                    if (dcdcVar.isEmpty()) {
                        dcdcVar = dcdc.f(amvh.i(bwcaVar.b));
                    }
                    x.b(dcdcVar);
                    x.k(qbs.DEFAULT);
                    a3.m(x.a());
                    return true;
                }
            }
        }
        if (!this.g || !URLUtil.isNetworkUrl(str)) {
            Intent e = e(str);
            if (!this.h || e == null) {
                g(String.format("Tried to open non-allowlisted URL: %s.", str));
                return true;
            }
            this.f.a().f(this.d, e, 4);
            return true;
        }
        this.f.a().H(this.d, str, 4);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.b--;
        if (!f() || this.c) {
            return;
        }
        bvvl bvvlVar = this.j.a;
        if (!bvvlVar.d) {
            bvvlVar.s();
        }
        this.c = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        d(String.format("Received error during WebView loading: %s. Failing url: %s. Error code: %s.", str, str2, Integer.valueOf(i)), Uri.parse(str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String valueOf = String.valueOf(String.format("Received HTTP error during WebView loading with request url: %s.", webResourceRequest.getUrl()));
        String valueOf2 = String.valueOf(String.format(" status_code: %s; reason_phrase: %s", Integer.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getReasonPhrase()));
        d(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceError.getErrorCode() == -1 && "net::ERR_CACHE_MISS".contentEquals(webResourceError.getDescription())) {
            Uri url = webResourceRequest.getUrl();
            String path = url == null ? "" : url.getPath();
            if (path != null && path.endsWith(".woff2")) {
                webView.getSettings().setCacheMode(2);
                return;
            }
        }
        WebViewCallbacks webViewCallbacks = this.j.a.a;
        if (webViewCallbacks == null || !webViewCallbacks.g(webView, webResourceRequest, webResourceError)) {
            onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }
}
