package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* compiled from: PG */
/* renamed from: bvol  reason: default package */
/* loaded from: classes4.dex */
public final class bvol extends WebViewClient {
    final /* synthetic */ Activity a;
    final /* synthetic */ dxio b;

    public bvol(Activity activity, dxio dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        dxio dxioVar = this.b;
        if (dxioVar == null) {
            bvoo.h("Directly launching kill switch content url should only happen in NavGo.", new Object[0]);
            this.a.startActivity(intent);
            return true;
        }
        ((afha) dxioVar.a()).f(this.a, intent, 4);
        return true;
    }
}
