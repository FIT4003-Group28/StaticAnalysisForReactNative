package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ygd  reason: default package */
/* loaded from: classes4.dex */
public final class ygd {
    private final Activity a;
    private final afvn b;
    private final yfv c;
    private final acvh d;
    private final aadd e;
    private final axxc f;
    private final Executor g;
    private WebView h;
    private final vzc i;

    public ygd(Activity activity, vzc vzcVar, afvn afvnVar, yfv yfvVar, acvh acvhVar, aadd aaddVar, axxc axxcVar, Executor executor) {
        this.a = activity;
        this.i = vzcVar;
        this.b = afvnVar;
        this.c = yfvVar;
        this.d = acvhVar;
        this.e = aaddVar;
        this.f = axxcVar;
        this.g = executor;
    }

    private final void d() {
        WebView webView = this.h;
        if (webView == null || webView.getParent() == null) {
            return;
        }
        ((ViewGroup) this.h.getParent()).removeView(this.h);
    }

    public final WebView a() {
        d();
        return this.h;
    }

    public final void b(LoadingFrameLayout loadingFrameLayout, String str, boolean z, boolean z2) {
        acvg b = this.d.b(asny.LATENCY_ACTION_SHOPPING_IN_APP);
        this.h = new WebView(this.a);
        if (!z2) {
            loadingFrameLayout.e();
            loadingFrameLayout.c();
        }
        yga ygaVar = new yga();
        ygaVar.a.add(new ygc(z2, loadingFrameLayout, str, b));
        this.h.setWebViewClient(ygaVar);
        this.h.setWebChromeClient(new yfz());
        this.h.setScrollBarStyle(33554432);
        this.h.setScrollbarFadingEnabled(false);
        WebSettings settings = this.h.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setMixedContentMode(2);
        arhd a = this.e.a();
        if (a != null) {
            aqdb aqdbVar = a.r;
            if (aqdbVar == null) {
                aqdbVar = aqdb.b;
            }
            if (aqdbVar.h) {
                this.h.setLayerType(2, null);
            }
        }
        b.c("stcw_c");
        if (!z) {
            this.h.loadUrl(str);
        } else if (!((Boolean) this.f.a.a.V(axwv.q).B().aw()).booleanValue()) {
            try {
                Account a2 = this.i.a(this.b.c());
                Activity activity = this.a;
                final WebView webView = this.h;
                webView.getClass();
                this.g.execute(new afvj(activity, a2, str, new zdt() { // from class: ygb
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        webView.loadUrl((String) obj);
                    }
                }));
            } catch (Exception e) {
                zep.d("Failed to execute GoogleSsoAuthTokenTask.", e);
                this.h.loadUrl(str);
            }
        } else {
            yfv yfvVar = this.c;
            final WebView webView2 = this.h;
            webView2.getClass();
            yfvVar.b(str, new zdt() { // from class: ygb
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    webView2.loadUrl((String) obj);
                }
            });
        }
    }

    public final void c() {
        if (this.h != null) {
            d();
            this.h = null;
        }
    }
}
