package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ryx  reason: default package */
/* loaded from: classes4.dex */
public final class ryx extends ryo {
    public Account ae;
    public String af;
    public ryq ag;
    public WebView ah;
    private ryh al;
    public static final anay e = sbs.e();
    private static final amvn ai = amvn.r("https://myaccount.google.com/embedded/accountlinking/create");
    private static final amup aj = amup.o(aoga.ERROR_CODE_UNSPECIFIED, 208, aoga.ERROR_CODE_INVALID_REQUEST, 204, aoga.ERROR_CODE_RPC_ERROR, 205, aoga.ERROR_CODE_INTERNAL_ERROR, 206, aoga.ERROR_CODE_AUTHENTICATION_DENIED_BY_USER, 207);
    private static final String ak = "4";

    @Override // defpackage.ryo
    public final void a() {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onUserCancellingFlow", 184, "StreamlineFragment.java")).q("StreamlinedFragment: User hits back button.");
        this.al.g();
        this.ag.d(ryp.c(2, 203));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ryo
    public final void d(String str) {
        ((anav) ((anav) e.g()).i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onWebViewLoadingError", 162, "StreamlineFragment.java")).s("Failed to load streamlined url: %s", str);
        this.ag.d(ryp.b(201));
    }

    @Override // defpackage.ryo, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        bundle2.getClass();
        Account account = (Account) bundle2.getParcelable("account");
        account.getClass();
        this.ae = account;
        String string = bundle2.getString("flow_url");
        string.getClass();
        this.af = Uri.parse(string).buildUpon().appendQueryParameter("result_channel", ak).build().toString();
        this.ag = (ryq) bb.a(mJ()).a(ryq.class);
        ryh ryhVar = (ryh) bb.a(mJ()).a(ryh.class);
        this.al = ryhVar;
        ryhVar.i(aots.STATE_ACCOUNT_SELECTION);
        amzs it = ai.iterator();
        while (true) {
            if (it.hasNext()) {
                if (this.af.startsWith((String) it.next())) {
                    break;
                }
            } else {
                ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onCreate", 89, "StreamlineFragment.java")).q("invalid streamlined flow url.");
                this.ag.d(ryp.b(208));
                break;
            }
        }
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onCreate", 94, "StreamlineFragment.java")).q("StreamlinedFragment: onCreate");
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onStart", 100, "StreamlineFragment.java")).q("StreamlinedFragment: onStart");
        WebView webView = this.d;
        this.ah = webView;
        webView.addJavascriptInterface(this, "GAL");
        anlz.A(((rzr) ((rzu) bb.a(mJ()).a(rzu.class)).d).b.qp(new Callable() { // from class: ryv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ryx ryxVar = ryx.this;
                return qid.a(ryxVar.rb()).c(ryxVar.ae, ryxVar.af);
            }
        }), new ryw(this), new rzw(new Handler(Looper.getMainLooper())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ryo
    public final void n(String str) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onWebViewLoadingHttpError", 172, "StreamlineFragment.java")).s("HTTP error when loading url: %s", str);
        this.ag.d(ryp.b(201));
    }

    @JavascriptInterface
    public void onSuccess(String str) {
        this.ag.d(ryp.a(2, str));
    }

    @JavascriptInterface
    public void onUiEvent(int i) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onUiEvent", 155, "StreamlineFragment.java")).s("StreamlinedFragment: onUiEvent %s ", aotq.a(i));
        this.al.h(aotq.a(i));
    }

    @JavascriptInterface
    public void onUiStateChange(int i) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onUiStateChange", 147, "StreamlineFragment.java")).s("StreamlinedFragment: onUiStateChange %s ", aots.b(i));
        this.al.i(aots.b(i));
    }

    @JavascriptInterface
    public void onError(int i, int i2, String str) {
        ryp c;
        if (i != 2) {
            ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onError", 130, "StreamlineFragment.java")).s("StreamlinedFragment: received recoverable error from JavaScript bridge with errorMessage %s ", str);
            c = ryp.b(((Integer) aj.getOrDefault(aoga.a(i2), 208)).intValue());
        } else {
            ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/streamline/StreamlineFragment", "onError", 119, "StreamlineFragment.java")).s("StreamlinedFragment: received unrecoverable error from JavaScript bridge with errorMessage %s ", str);
            c = ryp.c(2, ((Integer) aj.getOrDefault(aoga.a(i2), 208)).intValue());
        }
        this.ag.d(c);
    }
}
