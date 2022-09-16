package defpackage;

import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
/* compiled from: PG */
/* renamed from: ndc  reason: default package */
/* loaded from: classes3.dex */
public final class ndc {
    public final afvn a;
    public final vzc b;

    public ndc(afvn afvnVar, vzc vzcVar) {
        this.a = afvnVar;
        this.b = vzcVar;
    }

    public ndc(vzc vzcVar, afvn afvnVar) {
        vzcVar.getClass();
        this.b = vzcVar;
        afvnVar.getClass();
        this.a = afvnVar;
    }

    public static final zdt a(final AdsWebView adsWebView) {
        return new zdt() { // from class: nda
            @Override // defpackage.zdt
            public final void a(Object obj) {
                AdsWebView.this.loadUrl((String) obj);
            }
        };
    }
}
