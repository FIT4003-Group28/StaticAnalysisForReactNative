package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.VideoAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_BELOW_PLAYER, d = {xbj.class, xap.class, xat.class, xar.class, xaf.class, xbf.class, xas.class})
/* renamed from: wnw  reason: default package */
/* loaded from: classes4.dex */
public final class wnw extends wok {
    public final wvx a;
    public final xdu b;
    private final Executor c;
    private final Executor e;

    public wnw(woo wooVar, Executor executor, Executor executor2, wvx wvxVar, xdu xduVar) {
        super(wooVar);
        this.c = executor;
        this.e = executor2;
        this.a = wvxVar;
        this.b = xduVar;
    }

    @Override // defpackage.wok
    public final void a() {
        final ankt anktVar = (ankt) this.b.d(xap.class);
        ampg ampgVar = new ampg() { // from class: wnv
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                wnw wnwVar = wnw.this;
                ankt anktVar2 = anktVar;
                xdu xduVar = (xdu) obj;
                InstreamAdImpl instreamAdImpl = (InstreamAdImpl) xduVar.d(xbf.class);
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
                wzr wzrVar = (wzr) xduVar.d(xaf.class);
                String str = (String) xduVar.d(xar.class);
                String str2 = (String) xduVar.d(xbj.class);
                PlayerAd playerAd = instreamAdImpl.b;
                aoyz aoyzVar = null;
                if (!(playerAd instanceof VideoAd) || TextUtils.isEmpty(((VideoAd) playerAd).n())) {
                    wwf.a(null, "Missing ad video id.");
                } else {
                    try {
                        aqfd aqfdVar = (aqfd) anktVar2.get();
                        if (aqfdVar != null && !akzj.f(aqfdVar, aqfd.a)) {
                            wvx wvxVar = wnwVar.a;
                            xdu xduVar2 = wnwVar.b;
                            int i = aqfdVar.b;
                            if ((i & 512) != 0) {
                                apng apngVar = aqfdVar.l;
                                if (apngVar == null) {
                                    apngVar = apng.a;
                                }
                                aozb aozbVar = apngVar.b;
                                if (aozbVar == null) {
                                    aozbVar = aozb.a;
                                }
                                return wvxVar.h(xduVar2, apngVar, wvxVar.f(aozbVar.b, str, str2, instreamAdImpl, wzrVar), amuk.q(), amuk.q());
                            }
                            if ((i & 256) != 0) {
                                aoza aozaVar = aqfdVar.k;
                                if (aozaVar == null) {
                                    aozaVar = aoza.a;
                                }
                                aoyzVar = aozaVar.b;
                                if (aoyzVar == null) {
                                    aoyzVar = aoyz.a;
                                }
                            }
                            aoyz aoyzVar2 = aoyzVar;
                            String a = wvxVar.c.a(apcb.LAYOUT_TYPE_COMPANION, xduVar2.a);
                            asit c = wvxVar.d.c(xduVar2, a, apcb.LAYOUT_TYPE_COMPANION, 1, aoyzVar2);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new xbf(instreamAdImpl));
                            arrayList.add(new xat(playerResponseModel));
                            arrayList.add(new xaq(aqfdVar));
                            return xci.d(a, apcb.LAYOUT_TYPE_COMPANION, 1, wvxVar.f(a, str, str2, instreamAdImpl, wzrVar), amuk.q(), amuk.q(), ampq.i(aoyzVar2), ampq.j(c), xac.a(arrayList));
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }
                return null;
            }
        };
        if (anktVar.isDone()) {
            this.d.c(ampgVar);
        } else {
            this.d.a(ampgVar, this.c, this.e);
        }
    }
}
