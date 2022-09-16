package defpackage;

import android.accounts.Account;
import android.os.RemoteException;
import android.webkit.CookieManager;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: yfv  reason: default package */
/* loaded from: classes4.dex */
public final class yfv {
    private static final String d = "yfv";
    protected final qid a;
    public final AtomicReference b = new AtomicReference();
    public final Set c = Collections.synchronizedSet(new HashSet());
    private final dt e;
    private final afvn f;
    private final ankw g;
    private final vzc h;

    public yfv(dt dtVar, vzc vzcVar, afvn afvnVar, ankw ankwVar) {
        this.e = dtVar;
        this.h = vzcVar;
        this.f = afvnVar;
        this.g = ankwVar;
        this.a = qid.a(dtVar);
    }

    public static final void c(String str, zdt zdtVar) {
        if (zdtVar != null) {
            zdtVar.a(str);
        }
    }

    public static final void d(String str) {
        String str2 = d;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 16 + String.valueOf(str).length());
        sb.append("customWebView::");
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        afus.b(1, 11, sb.toString());
    }

    private static boolean e(Throwable th) {
        if (th == null) {
            return false;
        }
        if (!th.getClass().getName().contains("MissingWebViewPackageException")) {
            return e(th.getCause());
        }
        return true;
    }

    public final void a() {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
            this.c.clear();
        } catch (RuntimeException e) {
            if (!e(e)) {
                return;
            }
            d("MissingWebViewPackageException");
        }
    }

    public final void b(final String str, zdt zdtVar) {
        try {
            final Account a = this.h.a(this.f.c());
            if (!akzj.f(a, this.b.get())) {
                a();
                this.c.clear();
            }
            try {
                final URL url = new URL(str);
                if (this.c.contains(url.getHost())) {
                    c(str, zdtVar);
                } else {
                    ylx.n(this.e, this.g.qp(new Callable() { // from class: yfu
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            yfv yfvVar = yfv.this;
                            Account account = a;
                            String str2 = str;
                            URL url2 = url;
                            try {
                                yfvVar.a.c(account, str2);
                                yfvVar.c.add(url2.getHost());
                                yfvVar.b.set(account);
                                return null;
                            } catch (IOException | qhr | qib unused) {
                                yfv.d("WebLoginHelperException");
                                return null;
                            }
                        }
                    }), new yft(str, zdtVar), new yft(str, zdtVar, 1));
                }
            } catch (MalformedURLException unused) {
                d("MalformedURLException");
            }
        } catch (RemoteException | qsc | qsd unused2) {
            d("GetAccountException");
            c(str, zdtVar);
        }
    }
}
