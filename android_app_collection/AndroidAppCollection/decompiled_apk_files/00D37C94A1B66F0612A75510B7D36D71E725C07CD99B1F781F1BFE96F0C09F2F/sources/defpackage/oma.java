package defpackage;

import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: oma  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oma implements ayqb {
    public final /* synthetic */ WebView a;
    private final /* synthetic */ int b;

    public /* synthetic */ oma(WebView webView, int i) {
        this.b = i;
        this.a = webView;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.setSystemUiVisibility(((Integer) obj).intValue());
        } else {
            this.a.loadUrl((String) obj);
        }
    }
}
