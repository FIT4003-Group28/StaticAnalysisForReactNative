package defpackage;

import com.google.protos.youtube.api.innertube.ShowInterstitialActionOuterClass$ShowInterstitialAction;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: isz  reason: default package */
/* loaded from: classes3.dex */
public final class isz implements aafl {
    private static final long a = TimeUnit.DAYS.toSeconds(1);
    private final acth b;
    private final ghj c;
    private final ggk d;

    public isz(acth acthVar, ghk ghkVar, ggk ggkVar) {
        this.b = acthVar;
        this.c = ghkVar.a(etk.RATE_LIMIT_SHOW_INTERSTITIAL_PROMO_LAST_ALLOWED, a, TimeUnit.SECONDS);
        this.d = ggkVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        asku askuVar;
        if (apzgVar.qn(ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction)) {
            if (!((ShowInterstitialActionOuterClass$ShowInterstitialAction) apzgVar.qm(ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction)).c && !this.c.b()) {
                return;
            }
            ShowInterstitialActionOuterClass$ShowInterstitialAction showInterstitialActionOuterClass$ShowInterstitialAction = (ShowInterstitialActionOuterClass$ShowInterstitialAction) apzgVar.qm(ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction);
            auvi auviVar = showInterstitialActionOuterClass$ShowInterstitialAction.b;
            if (auviVar == null) {
                auviVar = auvi.a;
            }
            if (auviVar.b != 86135402) {
                return;
            }
            auvi auviVar2 = showInterstitialActionOuterClass$ShowInterstitialAction.b;
            if (auviVar2 == null) {
                auviVar2 = auvi.a;
            }
            if (auviVar2.b == 86135402) {
                askuVar = (asku) auviVar2.c;
            } else {
                askuVar = asku.a;
            }
            this.b.oi().D(new acte(askuVar.n));
            this.d.e(askuVar);
            this.c.a();
        }
    }
}
