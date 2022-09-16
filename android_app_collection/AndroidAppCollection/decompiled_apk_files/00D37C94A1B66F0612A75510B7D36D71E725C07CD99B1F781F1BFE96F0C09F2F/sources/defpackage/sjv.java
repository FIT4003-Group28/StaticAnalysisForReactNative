package defpackage;

import android.util.Base64;
import android.webkit.WebView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sjv  reason: default package */
/* loaded from: classes4.dex */
public final class sjv implements ankb {
    final /* synthetic */ awfl a;
    final /* synthetic */ sjw b;

    public sjv(sjw sjwVar, awfl awflVar) {
        this.b = sjwVar;
        this.a = awflVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        ((amzw) ((amzw) ((amzw) sjw.a.f()).h(th)).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge$1", "onFailure", 'U', "WebBridge.java")).q("Error sending message to web.");
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        skl sklVar = this.b.b;
        final String encodeToString = Base64.encodeToString(this.a.toByteArray(), 2);
        final skc skcVar = (skc) sklVar;
        WebView webView = skcVar.b;
        if (webView == null) {
            return;
        }
        webView.post(new Runnable() { // from class: sjz
            @Override // java.lang.Runnable
            public final void run() {
                skc.this.b.evaluateJavascript(String.format("receiveDataJson(\"%s\")", encodeToString), null);
            }
        });
    }
}
