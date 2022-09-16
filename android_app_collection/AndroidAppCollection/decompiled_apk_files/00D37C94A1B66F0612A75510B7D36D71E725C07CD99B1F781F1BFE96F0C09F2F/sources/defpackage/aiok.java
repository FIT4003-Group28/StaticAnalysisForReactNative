package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: PG */
/* renamed from: aiok  reason: default package */
/* loaded from: classes.dex */
final class aiok extends WebViewClient {
    final /* synthetic */ String a;
    final /* synthetic */ aiom b;
    private boolean c = false;

    public aiok(aiom aiomVar, String str) {
        this.b = aiomVar;
        this.a = str;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (this.c) {
            return;
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "page finished:".concat(valueOf);
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(this.a);
        if (!TextUtils.equals(parse.getAuthority(), parse2.getAuthority()) || !TextUtils.equals(parse.getHost(), parse2.getHost()) || !TextUtils.equals(parse.getPath(), parse2.getPath())) {
            return;
        }
        aiom aiomVar = this.b;
        Activity activity = (Activity) aiomVar.a.get();
        if (activity == null || activity.isFinishing()) {
            afus.b(1, 10, "AgeVerificationDialog was attempted to be shown although the activity was destroyed.");
        } else {
            aiomVar.d.show();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String.valueOf(str).length();
        String.valueOf(str2).length();
        this.c = true;
        this.b.c();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if ("youtube://player/KavSuccess".equals(str)) {
            aiom aiomVar = this.b;
            aiomVar.a();
            aiomVar.h.a();
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
