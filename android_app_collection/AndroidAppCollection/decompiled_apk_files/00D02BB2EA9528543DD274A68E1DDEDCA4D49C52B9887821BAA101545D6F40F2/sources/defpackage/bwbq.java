package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: bwbq  reason: default package */
/* loaded from: classes4.dex */
final class bwbq implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ bwbr a;

    public bwbq(bwbr bwbrVar) {
        this.a = bwbrVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(@dzsi Map<String, Object> map) {
        this.a.b.runOnUiThread(new Runnable(this) { // from class: bwbp
            private final bwbq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwce bwceVar = this.a.a.c;
                if (bwceVar == null) {
                    bvoo.h("WebViewInstance not initialized in WebViewDependentNativeApiFunction. WebView client code using this function will fail.", new Object[0]);
                } else {
                    bwceVar.i(dfvg.c);
                }
            }
        });
        return bvwy.a;
    }
}
