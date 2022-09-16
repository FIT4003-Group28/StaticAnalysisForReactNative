package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aduv  reason: default package */
/* loaded from: classes.dex */
public final class aduv implements aduq {
    public static final String a = zep.a("MDX.PermissionsController");
    protected View b;
    protected WebView c;
    public final adux d;
    public final acti e;
    public final dp f;
    protected final qid g;
    public String h;
    private final ankw i;
    private final afvn j;
    private final boolean k;
    private final aduu l;
    private final airr m;
    private final adoa n;

    public aduv(adux aduxVar, acti actiVar, dp dpVar, ankw ankwVar, afvn afvnVar, acwu acwuVar, Context context, airr airrVar, adoa adoaVar) {
        CookieManager.getInstance().setAcceptCookie(true);
        this.d = aduxVar;
        this.e = actiVar;
        this.f = dpVar;
        this.i = ankwVar;
        this.j = afvnVar;
        this.k = acwuVar.r;
        this.l = new aduu(this);
        this.m = airrVar;
        this.n = adoaVar;
        this.g = qid.a(context);
    }

    @Override // defpackage.aduq
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.mdx_tvsignin_permissions_fragment, viewGroup, false);
        this.b = inflate.findViewById(R.id.loading);
        this.c = (WebView) inflate.findViewById(R.id.webview);
        return inflate;
    }

    @Override // defpackage.aduq
    public final void b(final String str, String str2, String str3) {
        if (this.n.e() == null) {
            this.m.a();
        }
        this.e.d(acuo.a(36387), null, null);
        this.d.a(str3, "started");
        this.h = str3;
        this.c.getSettings().setJavaScriptEnabled(true);
        this.c.addJavascriptInterface(this.l, "approvalJsInterface");
        this.c.setWebViewClient(new adut(this));
        ylx.n(this.f, this.i.qp(new Callable() { // from class: adus
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aduv.this.g.c(new Account(str, "com.google"), "https://accounts.google.com");
                return null;
            }
        }), new adur(this, str2), new adur(this, str2, 1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyError", str);
        }
        dt mJ = this.f.mJ();
        if (mJ == null) {
            return;
        }
        mJ.setResult(-1, intent);
        mJ.finish();
    }

    public final void d(String str) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("X-Identity-Oauth2-Device-Usercode", str);
        if (this.k) {
            hashMap.put("pageId", this.j.c().e());
            this.c.loadUrl("https://accounts.google.com/o/oauth2/device/usercode?", hashMap);
            return;
        }
        this.c.loadUrl("https://accounts.google.com/o/oauth2/device/usercode?pageId=none", hashMap);
    }
}
