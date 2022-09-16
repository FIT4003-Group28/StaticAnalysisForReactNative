package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ryu  reason: default package */
/* loaded from: classes4.dex */
public final class ryu extends ryo {
    public Account ag;
    public ryq ah;
    public WebView ai;
    public qid aj;
    private ryh al;
    private ankw am;
    private final List an = new ArrayList();
    private int ao;
    public static final anay e = sbs.e();
    public static final amvn ae = amvn.s("https://myaccount.google.com/embedded/accountlinking/info", "https://myaccount.google.com/embedded/accountlinking/usagenotice");
    private static final amup ak = amup.o(aoga.ERROR_CODE_UNSPECIFIED, 408, aoga.ERROR_CODE_INVALID_REQUEST, 404, aoga.ERROR_CODE_RPC_ERROR, 405, aoga.ERROR_CODE_INTERNAL_ERROR, 406, aoga.ERROR_CODE_AUTHENTICATION_DENIED_BY_USER, 407);
    public static final String af = "4";

    private final void o(final String str) {
        anlz.A(this.am.qp(new Callable() { // from class: rys
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ryu ryuVar = ryu.this;
                return ryuVar.aj.c(ryuVar.ag, str);
            }
        }), new ryt(this, str), new rzw(new Handler(Looper.getMainLooper())));
    }

    @Override // defpackage.ryo
    public final void a() {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUserCancellingFlow", 214, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: User hits back button.");
        this.al.g();
        this.ah.d(ryp.c(1, 403));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ryo
    public final void d(String str) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onWebViewLoadingError", 193, "DataUsageNoticeFragment.java")).s("DataUsageNoticeFragment: Failed to load data usage notice url: %s", str);
        this.ah.d(ryp.c(1, 401));
    }

    @Override // defpackage.ryo, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.ao = 0;
        Bundle bundle2 = this.m;
        bundle2.getClass();
        Account account = (Account) bundle2.getParcelable("account");
        account.getClass();
        this.ag = account;
        String[] stringArray = bundle2.getStringArray("data_usage_notice_urls");
        stringArray.getClass();
        amtf f = amtf.e(stringArray).f(ryj.d);
        List list = this.an;
        list.getClass();
        Iterable<Object> h = f.h();
        if (h instanceof Collection) {
            list.addAll((Collection) h);
        } else {
            for (Object obj : h) {
                list.add(obj);
            }
        }
        this.ah = (ryq) bb.a(mJ()).a(ryq.class);
        this.al = (ryh) bb.a(mJ()).a(ryh.class);
        amtf d = amtf.d(this.an);
        mem memVar = mem.q;
        Iterator it = d.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!memVar.a(it.next())) {
                this.ah.d(ryp.c(1, 408));
                break;
            }
        }
        this.am = ((rzr) ((rzu) bb.a(mJ()).a(rzu.class)).d).b;
        this.aj = qid.a(rb());
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onCreate", 114, "DataUsageNoticeFragment.java")).q("DataUsageNotice: onCreate");
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onStart", 120, "DataUsageNoticeFragment.java")).q("DataUsageNotice: onStart");
        WebView webView = this.d;
        this.ai = webView;
        webView.addJavascriptInterface(this, "GAL");
        o((String) this.an.get(this.ao));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ryo
    public final void n(String str) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onWebViewLoadingHttpError", 204, "DataUsageNoticeFragment.java")).s("DataUsageNoticeFragment: HTTP error when loading url: %s", str);
        this.ah.d(ryp.c(1, 401));
    }

    @JavascriptInterface
    public void onError(int i, int i2, String str) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onError", 156, "DataUsageNoticeFragment.java")).s("DataUsageNoticeFragment: received error from JavaScript bridge with errorMessage %s ", str);
        this.ah.d(ryp.c(1, ((Integer) ak.getOrDefault(aoga.a(i2), 408)).intValue()));
    }

    @JavascriptInterface
    public void onUiEvent(int i) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUiEvent", 186, "DataUsageNoticeFragment.java")).s("DataUsageNotice: onUiEvent %s ", aotq.a(i));
        this.al.h(aotq.a(i));
    }

    @JavascriptInterface
    public void onUiStateChange(int i) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUiStateChange", 178, "DataUsageNoticeFragment.java")).s("DataUsageNotice: onUiStateChange %s ", aots.b(i));
        this.al.i(aots.b(i));
    }

    @JavascriptInterface
    public void onUserCancelLinking() {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUserCancelLinking", 143, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: user clicks the Cancel button");
        this.ah.d(ryp.c(1, 407));
    }

    @JavascriptInterface
    public void onUserConsent(String str) {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUserConsent", 170, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: User clicks the AgreeAndContinue button");
        this.ah.d(ryp.a(1, str));
    }

    @JavascriptInterface
    public void onUserContinueLinking() {
        ((anav) e.k().i("com/google/android/libraries/accountlinking/flows/datausagenotice/DataUsageNoticeFragment", "onUserContinueLinking", 130, "DataUsageNoticeFragment.java")).q("DataUsageNoticeFragment: user clicks the Continue button");
        if (this.an.size() > 1) {
            int i = this.ao + 1;
            this.ao = i;
            o((String) this.an.get(i));
            return;
        }
        this.ah.d(ryp.a(1, "continue_linking"));
    }
}
