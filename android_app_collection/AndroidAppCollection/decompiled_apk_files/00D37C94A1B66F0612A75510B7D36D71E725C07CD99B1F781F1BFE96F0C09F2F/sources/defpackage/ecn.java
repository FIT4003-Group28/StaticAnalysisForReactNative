package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.FullscreenEngagementCompanionRendererOuterClass;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, d = {xbj.class, xbf.class, xby.class})
/* renamed from: ecn  reason: default package */
/* loaded from: classes3.dex */
public final class ecn extends wok {
    public final wvx a;
    private final Executor b;
    private final Executor c;
    private final xdu e;

    public ecn(woo wooVar, wvx wvxVar, Executor executor, Executor executor2, xdu xduVar) {
        super(wooVar);
        this.a = wvxVar;
        this.b = executor;
        this.c = executor2;
        this.e = xduVar;
    }

    @Override // defpackage.wok
    public final void a() {
        final ankt anktVar = (ankt) this.e.d(xby.class);
        ampg ampgVar = new ampg() { // from class: ecm
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                ecn ecnVar = ecn.this;
                ankt anktVar2 = anktVar;
                xdu xduVar = (xdu) obj;
                String str = (String) xduVar.d(xbj.class);
                PlayerAd playerAd = ((InstreamAdImpl) xduVar.d(xbf.class)).b;
                aoyz aoyzVar = null;
                if ((playerAd instanceof LocalVideoAd) && !TextUtils.isEmpty(playerAd.n())) {
                    try {
                        WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) anktVar2.get();
                        if (watchNextResponseModel != null) {
                            wvx wvxVar = ecnVar.a;
                            asgt asgtVar = watchNextResponseModel.a;
                            if ((asgtVar.b & 256) == 0) {
                                return null;
                            }
                            aunb aunbVar = asgtVar.i;
                            if (aunbVar == null) {
                                aunbVar = aunb.a;
                            }
                            if (!aunbVar.qn(FullscreenEngagementCompanionRendererOuterClass.fullscreenEngagementCompanionRenderer)) {
                                return null;
                            }
                            arbh arbhVar = (arbh) aunbVar.qm(FullscreenEngagementCompanionRendererOuterClass.fullscreenEngagementCompanionRenderer);
                            if ((arbhVar.b & 4) != 0 && (aoyzVar = arbhVar.e) == null) {
                                aoyzVar = aoyz.a;
                            }
                            aoyz aoyzVar2 = aoyzVar;
                            String a = wvxVar.c.a(apcb.LAYOUT_TYPE_FULLSCREEN_COMPANION, xduVar.a);
                            return xci.d(a, apcb.LAYOUT_TYPE_FULLSCREEN_COMPANION, 1, amuk.r(xdc.e(wvxVar.c.c(apcf.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str, apcd.SLOT_TYPE_PLAYER_BYTES, apcb.LAYOUT_TYPE_MEDIA)), amuk.q(), amuk.q(), ampq.i(aoyzVar2), ampq.j(wvxVar.d.c(xduVar, a, apcb.LAYOUT_TYPE_FULLSCREEN_COMPANION, 1, aoyzVar2)), xac.b(new xbc(arbhVar)));
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        throw new IllegalStateException("Exception getting the WatchNextResponseFuture", e);
                    }
                }
                return null;
            }
        };
        if (anktVar.isDone()) {
            this.d.c(ampgVar);
        } else {
            this.d.a(ampgVar, this.b, this.c);
        }
    }
}
