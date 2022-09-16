package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
/* compiled from: PG */
/* renamed from: usf  reason: default package */
/* loaded from: classes4.dex */
public final class usf implements Runnable {
    public final Activity a;
    public final usn b;
    private final Account c;
    private final String d;
    private final Runnable e;
    private Runnable f;

    public usf(Activity activity, Account account, String str, usn usnVar, Runnable runnable) {
        this.a = activity;
        this.c = account;
        this.d = str;
        this.b = usnVar;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            CookieManager cookieManager = CookieManager.getInstance();
            String str = null;
            if (cookieManager != null) {
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
            }
            try {
                String valueOf = String.valueOf(Uri.encode(this.d));
                String concat = valueOf.length() != 0 ? "weblogin:continue=".concat(valueOf) : new String("weblogin:continue=");
                String valueOf2 = String.valueOf(concat);
                if (valueOf2.length() != 0) {
                    "Getting authToken for authTokenType = ".concat(valueOf2);
                }
                String e = qhz.e(this.a, this.c, concat);
                if (TextUtils.isEmpty(e)) {
                    Log.w("ParentToolsAuthTokenTask", "Could not retrieve a non-empty authToken");
                } else {
                    String valueOf3 = String.valueOf(e);
                    if (valueOf3.length() != 0) {
                        "Loading auth'ed page from authToken = ".concat(valueOf3);
                    }
                }
                this.f = new use(this, e, 1);
                str = e;
            } catch (Throwable th) {
                Log.e("ParentToolsAuthTokenTask", "An error happened when getting authToken.", th);
            }
            if (TextUtils.isEmpty(str)) {
                this.e.run();
                return;
            }
            this.a.runOnUiThread(new use(this, str));
            Runnable runnable = this.f;
            if (runnable == null) {
                return;
            }
            runnable.run();
            return;
        }
        throw new IllegalStateException("Cannot get auth token on the UI thread");
    }
}
