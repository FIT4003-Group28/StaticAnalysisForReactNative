package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_PLAYER_BYTES, d = {xat.class, xas.class, xbw.class})
/* renamed from: aggl  reason: default package */
/* loaded from: classes.dex */
public final class aggl extends wok {
    public final wvx a;
    public final wtg b;
    public final wwz c;
    public final acwm e;
    public final aanz f;
    public final snc g;
    public final long h;
    public final long i;
    public final long j;
    public final aggh k;
    private final Executor l;
    private final Executor m;

    public aggl(woo wooVar, aggh agghVar, wvx wvxVar, wtg wtgVar, wwz wwzVar, acwm acwmVar, aanz aanzVar, snc sncVar, Executor executor, Executor executor2, agkp agkpVar) {
        super(wooVar);
        this.k = agghVar;
        this.a = wvxVar;
        this.b = wtgVar;
        this.c = wwzVar;
        this.e = acwmVar;
        this.f = aanzVar;
        this.g = sncVar;
        this.l = executor;
        this.m = executor2;
        this.h = agkpVar.a() * 1000;
        this.i = agkpVar.c() * 1000;
        this.j = agkpVar.b() * 1000;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.b(new ampg() { // from class: aggk
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                InstreamAdBreak instreamAdBreak;
                PlayerAd playerAd;
                aggl agglVar = aggl.this;
                xdu xduVar = (xdu) obj;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
                String str = (String) xduVar.d(xas.class);
                ajbf ajbfVar = (ajbf) xduVar.d(xbw.class);
                if (playerResponseModel.E()) {
                    List e = agglVar.k.a().e(playerResponseModel.B());
                    if (e == null || e.isEmpty()) {
                        instreamAdBreak = null;
                    } else if (e.size() > 1) {
                        throw new IllegalStateException("Got more than one adBreak for offline");
                    } else {
                        instreamAdBreak = (InstreamAdBreak) e.get(0);
                        if (instreamAdBreak.b() != xdb.PRE_ROLL) {
                            throw new IllegalStateException("Got non-preroll adBreak for offline");
                        }
                        if (!instreamAdBreak.e) {
                            throw new IllegalStateException("Fulfilled adBreak that was not for offline");
                        }
                    }
                    if (instreamAdBreak != null) {
                        InstreamAdImpl c = agglVar.k.a().c(instreamAdBreak.f, instreamAdBreak.g);
                        if (c != null) {
                            ArrayList arrayList = new ArrayList();
                            long b = agglVar.c.b();
                            if (b > 0) {
                                long j = agglVar.h;
                                if (j > 0 && b + j > agglVar.g.c()) {
                                    arrayList.add(aali.REASON_CLIENT_OFFLINE_INSTREAM_FREQUENCY_CAP);
                                }
                            }
                            zah zahVar = agglVar.c.e;
                            if (zahVar != null) {
                                long a = zahVar.a();
                                if (a != -1) {
                                    long j2 = c.m() ? agglVar.i : agglVar.j;
                                    if (j2 > 0 && a > j2) {
                                        arrayList.add(aali.REASON_CLIENT_OFFLINE_INACTIVE_USER);
                                    }
                                }
                            }
                            if (c.c() != -1) {
                                if (Math.max(c.i() == null ? 0 : agglVar.k.a().b(c.i()), agglVar.k.a().a(c.j(), c.g())) >= c.c()) {
                                    arrayList.add(aali.REASON_CLIENT_OFFLINE_AD_ASSET_FREQUENCY_CAP);
                                }
                            }
                            if (c.k(agglVar.g)) {
                                arrayList.add(aali.REASON_CLIENT_OFFLINE_AD_ASSET_EXPIRED);
                            }
                            if (c.i() != null) {
                                if (agglVar.k.a().d(c.i()) != agqe.COMPLETE) {
                                    arrayList.add(aali.REASON_CLIENT_OFFLINE_AD_ASSET_NOT_READY);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                if (TextUtils.isEmpty(c.i())) {
                                    playerAd = c.b;
                                } else {
                                    agqm a2 = agglVar.k.b().d().a(c.i(), agglVar.g.d() + (c.a() - agglVar.g.c()));
                                    aghe b2 = agglVar.k.b().b();
                                    if (a2 != null && b2 != null) {
                                        FormatStreamModel d = a2.d(b2.g());
                                        FormatStreamModel b3 = a2.b(b2.g());
                                        if (d != null && b3 != null) {
                                            PlayerResponseModel g = c.b.g().g(agglVar.f, d, b3);
                                            agglVar.g.c();
                                            LocalVideoAd localVideoAd = (LocalVideoAd) c.b;
                                            playerAd = new InstreamAdImpl(new LocalVideoAd(localVideoAd.f, localVideoAd.g, localVideoAd.h, localVideoAd.i, localVideoAd.j, localVideoAd.l, localVideoAd.m, localVideoAd.b, g)).b;
                                        }
                                    }
                                    playerAd = null;
                                }
                                if (playerAd != null) {
                                    return agglVar.a.i(xduVar.a, instreamAdBreak, Arrays.asList(playerAd));
                                }
                            } else {
                                agglVar.e.c("DISALLOW", TextUtils.join(",", arrayList));
                                agglVar.e.b(c.b.C());
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Got non-offline fulfillment request");
            }
        }, this.l, this.m, new won() { // from class: aggj
            @Override // defpackage.won
            public final xci a(xdu xduVar, xci xciVar) {
                aggl agglVar = aggl.this;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
                String str = (String) xduVar.d(xas.class);
                ajbf ajbfVar = (ajbf) xduVar.d(xbw.class);
                if (xciVar != null) {
                    if (xciVar.b == apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES) {
                        return xciVar;
                    }
                    if (xciVar.g(apcb.LAYOUT_TYPE_FORECASTING, xba.class, xbe.class)) {
                        agglVar.b.a(xduVar, str, ajbfVar, playerResponseModel, (InstreamAdBreak) xciVar.e(xbe.class), (ForecastingAd) xciVar.e(xba.class));
                        return null;
                    }
                }
                return null;
            }
        });
    }
}
