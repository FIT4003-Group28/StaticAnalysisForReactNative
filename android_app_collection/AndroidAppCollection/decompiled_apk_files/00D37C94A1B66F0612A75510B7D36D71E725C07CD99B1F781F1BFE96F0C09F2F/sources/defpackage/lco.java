package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: lco  reason: default package */
/* loaded from: classes3.dex */
public final class lco extends lca {
    public View a;
    public afvn ae;
    public axxo af;
    public vzc ag;
    private WebView ah;
    public View b;
    public lcn c;
    public ayor d;
    public ayor e;

    public static lco o() {
        return new lco();
    }

    @JavascriptInterface
    public void consentError() {
        p();
    }

    @JavascriptInterface
    public void consentGiven() {
        p();
    }

    @JavascriptInterface
    public void consentNotGiven() {
        p();
    }

    @JavascriptInterface
    public void consentRevoked() {
        p();
    }

    @JavascriptInterface
    public void initialLoadCompleted() {
        View findViewById = this.a.findViewById(R.id.progress_loader);
        this.b = findViewById;
        findViewById.setVisibility(4);
    }

    @JavascriptInterface
    public void initialLoadFailed() {
        p();
    }

    @JavascriptInterface
    public void initialLoadSkipped() {
        p();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vaa_consent_webview, viewGroup, false);
        this.a = inflate;
        this.b = inflate.findViewById(R.id.progress_loader);
        WebView webView = (WebView) this.a.findViewById(R.id.webview);
        this.ah = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.ah.addJavascriptInterface(this, "gsa_assistant_vaa");
        this.ah.setWebViewClient(new lcm(this));
        ayos.A(new Callable() { // from class: lcl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                lco lcoVar = lco.this;
                return ampq.i(lcoVar.ag.a(lcoVar.ae.c()));
            }
        }).J(amon.a).h(kth.c).w(ktg.e).w(new fcr((String) this.af.a.a.V(axxk.o).B().an("https://myactivity.google.com/embedded/consent/assistant/vaa").U(), 8)).s(new ayqe() { // from class: lck
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                lco lcoVar = lco.this;
                ampr amprVar = (ampr) obj;
                return afvj.a(lcoVar.mJ(), (Account) amprVar.b, (String) amprVar.a).F(lcoVar.d).y(lcoVar.e).E((String) amprVar.a);
            }
        }).U(new oma(this.ah, 1), new ayqb() { // from class: lcj
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Throwable th = (Throwable) obj;
                lco.this.p();
            }
        });
        return this.a;
    }

    public final void p() {
        lcn lcnVar = this.c;
        if (lcnVar != null) {
            lcnVar.a();
        }
    }
}
