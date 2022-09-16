package com.google.android.apps.youtube.app.webviewfallback;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WebViewFallbackActivity extends olx {
    public static final String b = String.valueOf(WebViewFallbackActivity.class.getName()).concat("#FORCE_ON");
    public WebView c;
    public olz d;
    public omh e;
    public omn f;
    public omq g;
    public afvn h;
    public onb i;
    public ScheduledExecutorService j;
    public CookieManager k;
    public azqb l;
    public Executor m;
    public vzc n;
    private final aypf o;
    private final aypf p;

    public WebViewFallbackActivity() {
        aypf aypfVar = new aypf();
        this.o = aypfVar;
        this.p = new aypf(aypfVar);
    }

    public final void b(String str) {
        this.c.loadUrl(str);
    }

    @Override // defpackage.abp, android.app.Activity
    public final void onBackPressed() {
        if (this.c.canGoBack()) {
            this.c.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.getSettings().setJavaScriptEnabled(true);
        this.c.getSettings().setDomStorageEnabled(true);
        this.c.getSettings().setSupportMultipleWindows(false);
        WebSettings settings = this.c.getSettings();
        String userAgentString = this.c.getSettings().getUserAgentString();
        String b2 = zgt.b(this, zfm.c(this), getClass().getSimpleName());
        if (!userAgentString.contains(b2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(b2).length());
            sb.append(userAgentString);
            sb.append(" ");
            sb.append(b2);
            userAgentString = sb.toString();
        }
        settings.setUserAgentString(userAgentString);
        this.c.setWebViewClient(this.f);
        this.c.setWebChromeClient(this.e);
        String valueOf = String.valueOf(this.c.getSettings().getUserAgentString());
        if (valueOf.length() != 0) {
            "WebViewFallbackActivity user_agent: ".concat(valueOf);
        }
        this.k.setAcceptCookie(true);
        Uri.Builder buildUpon = Uri.parse(this.g.d()).buildUpon();
        buildUpon.appendQueryParameter("hl", getResources().getConfiguration().locale.getLanguage());
        buildUpon.appendQueryParameter("override_hl", "1");
        String builder = buildUpon.toString();
        Account b3 = this.n.b(this.h.c());
        if (this.k.hasCookies() || b3 == null) {
            b(builder);
        } else {
            this.p.d(afvj.a(this, b3, builder).F(azpj.b(this.j)).y(aypa.a()).R(builder).J(builder).S(new omb(this, 2)));
        }
        aypf aypfVar = this.p;
        ayvr ayvrVar = new ayvr(this.g.c().u(noc.n));
        azqc.k();
        omn omnVar = this.f;
        aynx G = omnVar.c.a().C(olg.r).G(azpj.b(omnVar.f));
        final omj omjVar = omnVar.d;
        omjVar.getClass();
        aynx G2 = omnVar.c.b().C(olg.r).G(azpj.b(omnVar.f));
        final omj omjVar2 = omnVar.e;
        omjVar2.getClass();
        aypg[] aypgVarArr = {G.Z(new ayqb() { // from class: omi
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                omj.this.a((vff) obj);
            }
        }), G2.Z(new ayqb() { // from class: omi
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                omj.this.a((vff) obj);
            }
        })};
        final onb onbVar = this.i;
        aynx C = onbVar.d.b.I().C(ona.a);
        final SwipeRefreshLayout swipeRefreshLayout = onbVar.c;
        aypfVar.g(ayvrVar.y(azpj.b(this.m)).T(new omb(this)), new aypf(aypgVarArr), new aypf(onbVar.e.Z(new ayqb() { // from class: omz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                onb.this.b.reload();
            }
        }), C.Z(new ayqb() { // from class: omy
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                SwipeRefreshLayout.this.l(((Boolean) obj).booleanValue());
            }
        })));
    }

    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.p.qr();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStart() {
        super.onStart();
        aypf aypfVar = this.o;
        final olz olzVar = this.d;
        aypg[] aypgVarArr = {ayos.D(false).S(new ayqb() { // from class: oly
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                olz olzVar2 = olz.this;
                if (((Boolean) obj).booleanValue()) {
                    olzVar2.a.r();
                } else {
                    olzVar2.a.f();
                }
            }
        })};
        omh omhVar = this.e;
        aynx v = omhVar.b().n().q(new ome(omhVar)).v(olg.m);
        final ViewGroup viewGroup = omhVar.a;
        viewGroup.getClass();
        aynx C = omhVar.a().af(2).u(noc.o).C(olg.l);
        olg olgVar = olg.p;
        int i = aynx.a;
        ayrd.c(i, "bufferSize");
        aywm aywmVar = new aywm(C, olgVar, i);
        azqc.j();
        aypg[] aypgVarArr2 = {omhVar.c().C(olg.o).Z(new ome(omhVar, 1)), v.Z(new ayqb() { // from class: omd
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                viewGroup.addView((View) obj);
            }
        }), aywmVar.C(olg.n).Z(npy.t)};
        aynx C2 = this.e.c().C(olg.g);
        WebView webView = this.c;
        webView.getClass();
        aypfVar.g(new aypf(aypgVarArr), new aypf(aypgVarArr2), this.f.a.H().C(olg.h).Z(new omb(this, 1)), C2.Z(new oma(webView)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oa, defpackage.dt, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.k.flush();
        this.o.c();
    }
}
