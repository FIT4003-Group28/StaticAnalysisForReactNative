package defpackage;

import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bwbn  reason: default package */
/* loaded from: classes4.dex */
final class bwbn implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bwbo a;

    public bwbn(bwbo bwboVar) {
        this.a = bwboVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        this.a.b.runOnUiThread(new Runnable(this) { // from class: bwbm
            private final bwbn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwce bwceVar = this.a.a.c;
                if (bwceVar == null) {
                    bvoo.h("WebViewInstance not initialized in WebViewDependentNativeApiFunction. WebView client code using this function will fail.", new Object[0]);
                    return;
                }
                bvuz bvuzVar = (bvuz) bwceVar;
                bvuzVar.d.d();
                WebViewCallbacks webViewCallbacks = bvuzVar.b;
                if (webViewCallbacks == null) {
                    return;
                }
                webViewCallbacks.a();
            }
        });
        return bvwy.a;
    }
}
