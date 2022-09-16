package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.webviewfallback.WebViewFallbackActivity;
/* compiled from: PG */
/* renamed from: omb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class omb implements ayqb {
    public final /* synthetic */ WebViewFallbackActivity a;
    private final /* synthetic */ int b;

    public /* synthetic */ omb(WebViewFallbackActivity webViewFallbackActivity, int i) {
        this.b = i;
        this.a = webViewFallbackActivity;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                eog.g(this.a, (Uri) obj);
                return;
            } else {
                this.a.b((String) obj);
                return;
            }
        }
        WebViewFallbackActivity webViewFallbackActivity = this.a;
        Boolean bool = (Boolean) obj;
        webViewFallbackActivity.startActivity((Intent) webViewFallbackActivity.l.get());
        webViewFallbackActivity.finish();
    }
}
