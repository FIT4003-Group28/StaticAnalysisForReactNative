package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.ui.webview.AdsInlineWebsite;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xjq  reason: default package */
/* loaded from: classes4.dex */
public final class xjq extends WebViewClient {
    final /* synthetic */ AdsInlineWebsite a;

    public xjq(AdsInlineWebsite adsInlineWebsite) {
        this.a = adsInlineWebsite;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        xjr xjrVar = this.a.a;
        if (xjrVar != null) {
            ncy ncyVar = (ncy) xjrVar;
            ((ImageView) ncyVar.c.findViewById(R.id.back)).setImageTintList(ColorStateList.valueOf(zhn.d(ncyVar.a, true != ncyVar.d.canGoBack() ? R.attr.ytIconDisabled : R.attr.ytTextPrimary)));
            ((ImageView) ncyVar.c.findViewById(R.id.url_security_icon)).setImageResource(ncyVar.d.getCertificate() != null ? 2131233415 : 2131233309);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        xjr xjrVar = this.a.a;
        if (xjrVar != null) {
            ncy ncyVar = (ncy) xjrVar;
            ((TextView) ncyVar.c.findViewById(R.id.url)).setText(ncy.d(str));
            ((ImageView) ncyVar.c.findViewById(R.id.url_security_icon)).setImageDrawable(null);
        }
    }
}
