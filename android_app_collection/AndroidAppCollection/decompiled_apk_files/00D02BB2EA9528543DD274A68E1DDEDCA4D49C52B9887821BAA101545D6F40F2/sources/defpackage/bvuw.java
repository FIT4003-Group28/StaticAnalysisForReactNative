package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.apps.gmm.shared.webview.NativeApiImpl;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvuw  reason: default package */
/* loaded from: classes4.dex */
public final class bvuw {
    private static final dcqe a = dcqe.c("bvuw");
    private final btbd b;
    private final cqkj c;
    private final bvvm d;
    private final gga e;
    private final bvuf f;
    private final bvua g;
    private final bvuq h;
    private final List<dzsj<? extends bvwz>> i;
    private final dzsj<bvwt> j;
    private final bvtd k;

    public bvuw(gga ggaVar, bvtd bvtdVar, cqkj cqkjVar, bvvm bvvmVar, bvuf bvufVar, bvua bvuaVar, bvuq bvuqVar, dzsj dzsjVar, dzsj dzsjVar2, dzsj dzsjVar3, dzsj dzsjVar4, dzsj dzsjVar5, dzsj dzsjVar6, dzsj dzsjVar7, dzsj dzsjVar8, dzsj dzsjVar9, btbd btbdVar) {
        this.e = ggaVar;
        this.b = btbdVar;
        this.k = bvtdVar;
        this.c = cqkjVar;
        this.d = bvvmVar;
        this.f = bvufVar;
        this.g = bvuaVar;
        this.h = bvuqVar;
        this.j = dzsjVar9;
        this.i = dcdc.m(dzsjVar, dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, dzsjVar6, dzsjVar7, dzsjVar8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [bvup] */
    @dzsi
    public final <T extends cqiw<bvxg>> bwce a(bvvs bvvsVar, boolean z, boolean z2, @dzsi Bundle bundle) {
        cqiw<bvxg> bvxdVar;
        cqiw bwcxVar;
        bvtz bvtzVar;
        NativeApiImpl nativeApiImpl;
        bvxu a2 = bvvsVar.a();
        WebViewCallbacks c = bvvsVar.c();
        Class<? extends cqiw<bvxg>> b = bvvsVar.b();
        try {
            if (b == null) {
                bvxdVar = new bvxd();
            } else {
                bvxdVar = b.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Exception unused) {
            bvxdVar = new bvxd();
        }
        cqkj cqkjVar = this.c;
        if (a2.q) {
            bwcxVar = new bwcz(bvxdVar);
        } else {
            bwcxVar = new bwcx(bvxdVar);
        }
        cqkf d = cqkjVar.d(bwcxVar, null, false);
        View c2 = d.c();
        WebView webView = (WebView) cqhu.a(c2, bwcx.a);
        if (webView == null) {
            bvoo.h("WebView failed to inflate.", new Object[0]);
            return null;
        }
        dkyx dkyxVar = a2.j;
        if (dkyxVar == null) {
            dkyxVar = dkyx.f;
        }
        bvua bvuaVar = this.g;
        boolean z3 = dkyxVar.c;
        bvuy a3 = bvuaVar.a.a();
        bvua.a(a3, 1);
        Executor a4 = bvuaVar.b.a();
        bvua.a(a4, 2);
        dxio a5 = ((dxjh) bvuaVar.c).a();
        bvua.a(a5, 3);
        bvtz bvtzVar2 = new bvtz(a3, a4, a5, z3);
        if (dkyxVar.e) {
            bvuq bvuqVar = this.h;
            boolean z4 = dkyxVar.c;
            bvuy a6 = bvuqVar.a.a();
            bvuq.a(a6, 1);
            Executor a7 = bvuqVar.b.a();
            bvuq.a(a7, 2);
            dxio a8 = ((dxjh) bvuqVar.c).a();
            bvuq.a(a8, 3);
            bvtzVar = new bvup(a6, a7, a8, z4);
        } else {
            bvtzVar = bvtzVar2;
        }
        if (!dkyxVar.e && dkyxVar.b) {
            bvuf bvufVar = this.f;
            Executor a9 = bvufVar.a.a();
            bvuf.a(a9, 1);
            Executor a10 = bvufVar.b.a();
            bvuf.a(a10, 2);
            dxio a11 = ((dxjh) bvufVar.c).a();
            bvuf.a(a11, 3);
            bvuf.a(bvtzVar2, 4);
            NativeApiImpl nativeApiImpl2 = new NativeApiImpl(a9, a10, a11, bvtzVar2);
            for (dzsj<? extends bvwz> dzsjVar : this.i) {
                nativeApiImpl2.d(dzsjVar.a());
            }
            if (c != null) {
                for (bvwz bvwzVar : c.c(this.e)) {
                    nativeApiImpl2.d(bvwzVar);
                }
            }
            nativeApiImpl = nativeApiImpl2;
        } else {
            nativeApiImpl = null;
        }
        dccx F = dcdc.F();
        for (dzsj<? extends bvwz> dzsjVar2 : this.i) {
            F.g(dzsjVar2.a());
        }
        if (c != null) {
            F.i(c.c(this.e));
        }
        dcdc<bvwz> f = F.f();
        bvwt a12 = this.j.a();
        a12.f(webView);
        dszg b2 = dszg.b(bvvsVar.a().z);
        if (b2 == null) {
            b2 = dszg.UNKNOWN_FEATURE;
        }
        a12.d(b2);
        a12.e(f);
        a12.c(bvvsVar.d());
        bvwv g = a12.g();
        bvuu bvuuVar = new bvuu(g, nativeApiImpl);
        bvvm bvvmVar = this.d;
        gga a13 = bvvmVar.a.a();
        bvvm.a(a13, 1);
        cqhn a14 = bvvmVar.b.a();
        bvvm.a(a14, 2);
        bvus a15 = bvvmVar.c.a();
        bvvm.a(a15, 3);
        bvxz a16 = bvvmVar.d.a();
        bvvm.a(a16, 4);
        bvjj a17 = bvvmVar.e.a();
        bvvm.a(a17, 5);
        bwde a18 = bvvmVar.f.a();
        bvvm.a(a18, 6);
        btvo a19 = bvvmVar.g.a();
        bvvm.a(a19, 7);
        gce a20 = bvvmVar.h.a();
        bvvm.a(a20, 8);
        bwdc a21 = bvvmVar.i.a();
        bvvm.a(a21, 9);
        bvvm.a(a2, 10);
        bvvm.a(bvtzVar, 13);
        NativeApiImpl nativeApiImpl3 = nativeApiImpl;
        dcdc<bvwz> dcdcVar = f;
        bvtz bvtzVar3 = bvtzVar;
        bvvl bvvlVar = new bvvl(a13, a14, a15, a16, a17, a18, a19, a20, a21, a2, c, z, bvtzVar3, bundle, z2);
        bvtz bvtzVar4 = bvtzVar3;
        bvva.a(a2, 1);
        bvva.a(webView, 3);
        bvva.a(c2, 4);
        bvva.a(bvtzVar4, 6);
        bvva.a(bvvlVar, 7);
        bvva.a(bvtzVar3, 8);
        bvva.a(g, 9);
        bvuz bvuzVar = new bvuz(a2, c, webView, c2, bvuuVar, bvtzVar4, bvvlVar, bvtzVar3, g);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        Object[] objArr = new Object[4];
        int i = 0;
        objArr[0] = webView.getSettings().getUserAgentString();
        objArr[1] = true != a2.s ? "AndroidMapsWebView" : "AndroidMapsWebViewInline";
        objArr[2] = "10.55.4";
        objArr[3] = "R";
        settings.setUserAgentString(String.format("%s [%s/%s/%s]", objArr));
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
        settings.setTextZoom((int) (this.e.getResources().getConfiguration().fontScale * 100.0f));
        webView.setWebChromeClient(new bvuv());
        WebView.setWebContentsDebuggingEnabled(false);
        bvut bvutVar = new bvut(webView);
        if (nativeApiImpl3 != null) {
            for (bvwz bvwzVar2 : nativeApiImpl3.c.values()) {
                if (bvwzVar2 instanceof bvxc) {
                    ((bvxc) bvwzVar2).d(bvuzVar);
                }
            }
        } else {
            int size = dcdcVar.size();
            while (i < size) {
                dcdc<bvwz> dcdcVar2 = dcdcVar;
                bvwz bvwzVar3 = dcdcVar2.get(i);
                if (bvwzVar3 instanceof bvxc) {
                    ((bvxc) bvwzVar3).d(bvuzVar);
                }
                i++;
                dcdcVar = dcdcVar2;
            }
        }
        WebView webView2 = bvuzVar.c;
        if (nativeApiImpl3 != null) {
            webView2.removeJavascriptInterface("localpage_ext_NAAPI");
            webView2.addJavascriptInterface(nativeApiImpl3, "localpage_ext_NAAPI");
        }
        bvtzVar3.a(bvutVar);
        d.e(bvvlVar);
        bvvlVar.a(bvutVar);
        if (a2.p) {
            webView.getSettings().setBuiltInZoomControls(true);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.b.a();
        }
        return bvuzVar;
    }
}
