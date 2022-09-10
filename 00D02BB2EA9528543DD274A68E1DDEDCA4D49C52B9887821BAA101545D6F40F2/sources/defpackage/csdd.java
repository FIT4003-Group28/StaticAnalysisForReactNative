package defpackage;

import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: csdd  reason: default package */
/* loaded from: classes5.dex */
public final class csdd implements cscx {
    public final cscx a;
    public boolean b = false;
    private final Handler c;
    private final csdl d;

    public csdd(cscx cscxVar, Handler handler, csdl csdlVar) {
        this.a = cscxVar;
        this.c = handler;
        this.d = csdlVar;
    }

    public final void a() {
        CookieManager cookieManager = CookieManager.getInstance();
        if (String.valueOf(this.d.c).length() == 0) {
            new String("Looking for cookie on URL=");
        }
        String cookie = cookieManager.getCookie(this.d.c);
        csdl csdlVar = this.d;
        String a = csdlVar.a();
        if (cookie == null || cookie.isEmpty()) {
            return;
        }
        Iterator<String> it = dbtm.c("; ").e().f().g(cookie).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!next.equals(a)) {
                a = next;
                break;
            }
        }
        if (a.isEmpty()) {
            return;
        }
        if (String.valueOf(a).length() == 0) {
            new String("Saving cookie=");
        }
        csdlVar.d.edit().putString("PAIDCONTENT_COOKIE", a).apply();
    }

    @JavascriptInterface
    public void onParamsLoaded(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42 + String.valueOf(str2).length());
        sb.append("Setting the params. survey=");
        sb.append(str);
        sb.append(", surveySeries=");
        sb.append(str2);
        sb.toString();
    }

    @JavascriptInterface
    public void onSurveyCanceled() {
        this.c.post(new csdc(this));
    }

    @JavascriptInterface
    public void onSurveyComplete(boolean z, boolean z2) {
        this.b = true;
        this.c.post(new csda(this, z, z2));
    }

    @JavascriptInterface
    public void onSurveyReady() {
        this.b = false;
        this.c.post(new cscz(this));
    }

    @JavascriptInterface
    public void onSurveyResponse(String str, String str2) {
        if (str.contains("t=a")) {
            this.c.post(new csdb());
        }
    }

    @JavascriptInterface
    public void onWindowError() {
        this.b = false;
        this.c.post(new cscy(this));
    }
}
