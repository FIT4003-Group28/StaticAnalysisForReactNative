package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bvvl  reason: default package */
/* loaded from: classes4.dex */
public class bvvl implements bwch, bwcd {
    @dzsi
    public final WebViewCallbacks a;
    public final bvus b;
    public final String c;
    public final boolean d;
    public final bvxz e;
    @dzsi
    public WebView f;
    public final bvxu g;
    @dzsi
    public String h;
    public boolean i;
    public boolean j;
    private final bvjj k;
    private final gga l;
    private final bwcf m;
    @dzsi
    private final String n;
    private boolean o;
    private final boolean q;
    private final bwde r;
    private final bvxf s;
    private final btvo t;
    private final gce u;
    @dzsi
    private final jib w;
    private final boolean x;
    private boolean p = true;
    private dbsg<Integer> v = dbpy.a;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
        if ((r4 == null ? defpackage.bvxt.c : r4).a == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bvvl(final defpackage.gga r1, defpackage.cqhn r2, defpackage.bvus r3, defpackage.bvxz r4, defpackage.bvjj r5, defpackage.bwde r6, defpackage.btvo r7, defpackage.gce r8, defpackage.bwdc r9, defpackage.bvxu r10, @defpackage.dzsi com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks r11, boolean r12, defpackage.bwcf r13, @defpackage.dzsi android.os.Bundle r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvvl.<init>(gga, cqhn, bvus, bvxz, bvjj, bwde, btvo, gce, bwdc, bvxu, com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks, boolean, bwcf, android.os.Bundle, boolean):void");
    }

    public void a(bwcg bwcgVar) {
        WebView webView = ((bvut) bwcgVar).a;
        this.f = webView;
        this.o = false;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.u.h()) {
                    bvxu bvxuVar = this.g;
                    if ((bvxuVar.a & 2097152) != 0) {
                        bvxt bvxtVar = bvxuVar.w;
                        if (bvxtVar == null) {
                            bvxtVar = bvxt.c;
                        }
                        if (bvxtVar.a == 1) {
                            bvxt bvxtVar2 = this.g.w;
                            if (bvxtVar2 == null) {
                                bvxtVar2 = bvxt.c;
                            }
                            if (bvxtVar2.a == 1 && ((Boolean) bvxtVar2.b).booleanValue()) {
                                settings.setForceDark(2);
                            }
                        }
                    }
                }
                settings.setForceDark(0);
            }
        }
        b(this.c);
    }

    public void b(final String str) {
        dehn dehnVar;
        this.h = "";
        this.i = false;
        cqkx.p(this);
        this.m.e();
        if (!this.t.getLoggingParameters().A) {
            dehnVar = deha.a(null);
        } else {
            String format = String.format("NID=%s", this.k.z(bvjk.br, null));
            deig d = deig.d();
            CookieManager.getInstance().setCookie(str, format, new bvvj(d));
            dehnVar = d;
        }
        dehnVar.Pk(new Runnable(this, str) { // from class: bvvh
            private final bvvl a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvvl bvvlVar = this.a;
                String str2 = this.b;
                if (!bvvlVar.g.c) {
                    bvvlVar.j = !bvvlVar.e.b(str2, bvvlVar.r());
                    return;
                }
                bvvlVar.r().a(str2);
                bvvlVar.j = false;
            }
        }, dege.a);
    }

    public void c() {
        this.o = true;
        cqkx.p(this);
        t();
    }

    @Override // defpackage.bwch
    public Boolean d() {
        return Boolean.valueOf(!this.i);
    }

    @Override // defpackage.bwch
    public Boolean e() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.bwch
    public Boolean f() {
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.bwch
    public Integer g() {
        bvxp bvxpVar;
        if (this.x) {
            return Integer.valueOf(ibm.b().b(this.l));
        }
        bvxu bvxuVar = this.g;
        if ((bvxuVar.a & 4194304) != 0) {
            bvxpVar = bvxuVar.x;
            if (bvxpVar == null) {
                bvxpVar = bvxp.d;
            }
        } else {
            bvxpVar = bvxp.d;
        }
        return Integer.valueOf(this.u.h() ? bvxpVar.c : bvxpVar.b);
    }

    @Override // defpackage.bwch
    public Integer i() {
        return Integer.valueOf(this.g.u);
    }

    @Override // defpackage.bwch
    public Boolean j() {
        return Boolean.valueOf(this.q);
    }

    @Override // defpackage.bwch
    public Boolean k() {
        return Boolean.valueOf(this.g.l);
    }

    @Override // defpackage.bwch
    public bvxg l() {
        return this.s;
    }

    @Override // defpackage.bwcd
    public void m(dfvg dfvgVar) {
        if (this.d) {
            if ((dfvgVar.a & 1) != 0) {
                this.v = dbsg.i(Integer.valueOf(dfvgVar.b));
            }
            s();
        }
    }

    @Override // defpackage.bwch
    public Boolean n() {
        return Boolean.valueOf(this.v.a());
    }

    @Override // defpackage.bwch
    public Integer o() {
        return Integer.valueOf(this.v.a() ? cqrp.d(this.v.b().intValue()).e(this.l) : 0);
    }

    @Override // defpackage.bwch
    public Boolean p() {
        return Boolean.valueOf(this.g.s);
    }

    @Override // defpackage.bwch
    @dzsi
    public jib q() {
        return this.w;
    }

    public final bvxy r() {
        return new bvxy(this) { // from class: bvvi
            private final bvvl a;

            {
                this.a = this;
            }

            @Override // defpackage.bvxy
            public final void a(String str) {
                bvvl bvvlVar = this.a;
                bvxu bvxuVar = bvvlVar.g;
                if (bvxuVar.d && str == null) {
                    bvvlVar.h = String.format("WebView authentication was required and failed for %s.", bvvlVar.c);
                    bvvlVar.i = true;
                    return;
                }
                WebView webView = bvvlVar.f;
                if (webView == null) {
                    return;
                }
                bvus bvusVar = bvvlVar.b;
                bvvk bvvkVar = new bvvk(bvvlVar);
                cxnh a = bvusVar.a.a();
                bvus.a(a, 1);
                gga a2 = bvusVar.b.a();
                bvus.a(a2, 2);
                bwbz a3 = bvusVar.c.a();
                bvus.a(a3, 3);
                dxio a4 = ((dxjh) bvusVar.d).a();
                bvus.a(a4, 4);
                bvus.a(bvxuVar, 5);
                bvus.a(bvvkVar, 6);
                webView.setWebViewClient(new bvur(a, a2, a3, a4, bvxuVar, bvvkVar));
                if (bvvlVar.j) {
                    if (str == null) {
                        str = bvvlVar.c;
                    }
                    bvvlVar.f.loadUrl(str);
                    return;
                }
                bvvlVar.i = true;
                bvvlVar.c();
                cqkx.p(bvvlVar);
            }
        };
    }

    public final void s() {
        if (!this.i) {
            boolean z = false;
            if (this.p && this.o) {
                z = true;
            }
            this.p = z;
            this.i = true;
            cqkx.p(this);
            t();
            WebViewCallbacks webViewCallbacks = this.a;
            if (webViewCallbacks == null) {
                return;
            }
            webViewCallbacks.h();
        }
    }

    public final void t() {
        if (!this.i || !this.o) {
            return;
        }
        String str = this.h;
        if (dbsj.d(str)) {
            if (this.j) {
                this.m.k();
            }
            String str2 = this.n;
            if (str2 != null) {
                this.r.a(str2, bwdd.LOADED_AND_VISIBLE);
            }
            WebViewCallbacks webViewCallbacks = this.a;
            if (webViewCallbacks != null) {
                webViewCallbacks.d();
            }
            WebView webView = this.f;
            if (webView == null || webView.getTitle() == null) {
                return;
            }
            cpv cpvVar = cpv.a;
            WebView webView2 = this.f;
            cpvVar.f(webView2, webView2.getTitle());
            return;
        }
        String str3 = this.n;
        if (str3 != null) {
            this.r.a(str3, bwdd.UNREGISTER);
        }
        WebViewCallbacks webViewCallbacks2 = this.a;
        if (webViewCallbacks2 != null) {
            webViewCallbacks2.b(this.l);
        } else if (this.l.g() != null) {
            gn g = this.l.g();
            dbsk.s(g);
            if (!g.J()) {
                gga ggaVar = this.l;
                Toast.makeText(ggaVar, ggaVar.getString(R.string.ERROR_LOADING_TOAST), 0).show();
                this.l.g().f();
            }
        }
        bvoo.j(new bvon("%s", str));
    }

    public void u(Bundle bundle) {
        bvxz bvxzVar = this.e;
        bundle.putParcelable("preparedAccount", bvxzVar.a);
        bundle.putLong("authCookieTimestamp", bvxzVar.b);
    }

    @Override // defpackage.bwch
    public Integer h() {
        int i;
        if ((this.g.a & 8388608) == 0) {
            return g();
        }
        if (this.u.h()) {
            bvxp bvxpVar = this.g.y;
            if (bvxpVar == null) {
                bvxpVar = bvxp.d;
            }
            i = bvxpVar.c;
        } else {
            bvxp bvxpVar2 = this.g.y;
            if (bvxpVar2 == null) {
                bvxpVar2 = bvxp.d;
            }
            i = bvxpVar2.b;
        }
        return Integer.valueOf(i);
    }
}
