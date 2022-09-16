package defpackage;

import com.google.protos.youtube.api.innertube.OpenAdsWebViewInBrowserCommandOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gmp  reason: default package */
/* loaded from: classes3.dex */
public final class gmp implements aafl {
    private final emy a;

    public gmp(emy emyVar) {
        emyVar.getClass();
        this.a = emyVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand)) {
            return;
        }
        emy emyVar = this.a;
        emx emxVar = (emx) emyVar.a.get(((atuc) apzgVar.qm(OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand)).b);
        if (emxVar == null) {
            return;
        }
        emxVar.d();
    }
}
