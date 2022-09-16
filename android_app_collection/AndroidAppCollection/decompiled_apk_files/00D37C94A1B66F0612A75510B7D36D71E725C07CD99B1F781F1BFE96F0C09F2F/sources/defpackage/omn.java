package defpackage;

import android.graphics.Bitmap;
import android.webkit.CookieManager;
import android.webkit.WebView;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: omn  reason: default package */
/* loaded from: classes3.dex */
public final class omn extends vfi {
    public final azpb a;
    public final azpb b;
    public final omq c;
    public final omj d;
    public final omj e;
    public final Executor f;
    private final azpb g;
    private final omu h;

    public omn(omq omqVar, omj omjVar, omj omjVar2, omu omuVar, Executor executor) {
        super(omjVar, omjVar2);
        this.g = azpa.ar().ax();
        this.a = azpd.ar().ax();
        this.b = azpa.as(omk.IDLE).ax();
        this.c = omqVar;
        this.d = omjVar;
        this.e = omjVar2;
        this.h = omuVar;
        this.f = executor;
        omjVar.a(new vff((List) omqVar.a().ab()));
        omjVar2.a(new vff((List) omqVar.b().ab()));
    }

    @Override // defpackage.vfi
    public final boolean a(String str) {
        this.a.c(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        this.g.c(new omm(str, webView.canGoBack()));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.b.c(omk.IDLE);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        amuk q;
        omu omuVar = this.h;
        String language = ((Locale) omuVar.c.get()).getLanguage();
        String str2 = omuVar.b;
        if (str2 == null || omuVar.a.getCookie(str2) == null) {
            q = amuk.q();
        } else {
            q = (amuk) DesugarArrays.stream(omuVar.a.getCookie(omuVar.b).split(";")).map(omr.b).filter(new lws(18)).collect(amsf.a);
        }
        String str3 = (String) arey.r(q, "");
        Map hashMap = new HashMap();
        if (!str3.isEmpty()) {
            if (str3.startsWith("PREF=")) {
                str3 = str3.substring(5);
            }
            hashMap = (Map) DesugarArrays.stream(str3.split("&")).filter(lws.s).map(omr.a).collect(Collectors.toMap(omr.e, omr.f));
        }
        hashMap.put("hl", language);
        oms omsVar = new oms();
        omsVar.a = amup.j(amup.j(hashMap));
        amup amupVar = omsVar.a;
        if (amupVar == null) {
            throw new IllegalStateException("Missing required properties: keyValues");
        }
        String str4 = (String) Collection.EL.stream(new omt(amupVar).a.entrySet()).sorted(Comparator$CC.comparing(omr.d)).map(omr.c).collect(Collectors.joining("&"));
        String str5 = omuVar.b;
        if (str5 != null) {
            CookieManager cookieManager = omuVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 5 + 0);
            sb.append("PREF=");
            sb.append(str4);
            sb.append("");
            cookieManager.setCookie(str5, sb.toString());
        }
        super.onPageStarted(webView, str, bitmap);
        this.b.c(omk.LOADING);
    }
}
