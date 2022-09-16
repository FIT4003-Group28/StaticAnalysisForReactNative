package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.ThrottledAd;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_PLAYER_BYTES, d = {xbe.class, xat.class, xas.class, xbw.class})
/* renamed from: wpi  reason: default package */
/* loaded from: classes4.dex */
public final class wpi extends wok {
    public final wlc a;
    public final ahiu b;
    public final wwa c;
    public final wvx e;
    public final wtg f;
    public final wtq g;
    public final snc h;
    public final long i;
    private final Executor j;
    private final Executor k;
    private final aadd l;

    public wpi(woo wooVar, Executor executor, Executor executor2, aadd aaddVar, wlc wlcVar, ahiu ahiuVar, wwa wwaVar, wvx wvxVar, wkn wknVar, wtg wtgVar, wtq wtqVar, snc sncVar) {
        super(wooVar);
        this.j = executor;
        this.k = executor2;
        this.l = aaddVar;
        this.a = wlcVar;
        this.b = ahiuVar;
        this.c = wwaVar;
        this.e = wvxVar;
        this.f = wtgVar;
        this.g = wtqVar;
        this.h = sncVar;
        this.i = wknVar.f;
    }

    @Override // defpackage.wok
    public final void a() {
        final long b = xrz.k(this.l) ? ((ajbf) this.d.b.d(xbw.class)).b() : -1L;
        this.d.b(new ampg() { // from class: wph
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                PlayerResponseModel playerResponseModel;
                InstreamAdBreak instreamAdBreak;
                List b2;
                wpi wpiVar = wpi.this;
                long j = b;
                xdu xduVar = (xdu) obj;
                InstreamAdBreak instreamAdBreak2 = (InstreamAdBreak) xduVar.d(xbe.class);
                PlayerResponseModel playerResponseModel2 = (PlayerResponseModel) xduVar.d(xat.class);
                String str = (String) xduVar.d(xas.class);
                if (playerResponseModel2.E()) {
                    throw new IllegalStateException("Received fulfillment request for offline playback");
                }
                zgk zgkVar = new zgk(wpiVar.h, wpiVar.i);
                List c = instreamAdBreak2.c();
                if (c.isEmpty()) {
                    wlc wlcVar = wpiVar.a;
                    byte[] bArr = instreamAdBreak2.i;
                    String a = instreamAdBreak2.c.a() == null ? "" : instreamAdBreak2.c.a();
                    long a2 = instreamAdBreak2.a();
                    int i = instreamAdBreak2.d;
                    wpiVar.b.g();
                    playerResponseModel = playerResponseModel2;
                    instreamAdBreak = instreamAdBreak2;
                    AdBreakResponseModel a3 = wlcVar.a(str, bArr, a, "", -1L, a2, i, j, zgkVar);
                    if (a3 == null) {
                        b2 = amuk.q();
                    } else if (a3.b()) {
                        b2 = Arrays.asList(ThrottledAd.a);
                    } else {
                        c = a3.a();
                    }
                    return wpiVar.e.i(xduVar.a, instreamAdBreak, b2);
                }
                playerResponseModel = playerResponseModel2;
                instreamAdBreak = instreamAdBreak2;
                b2 = wpiVar.c.b(instreamAdBreak, c, playerResponseModel);
                return wpiVar.e.i(xduVar.a, instreamAdBreak, b2);
            }
        }, this.j, this.k, new won() { // from class: wpg
            @Override // defpackage.won
            public final xci a(xdu xduVar, xci xciVar) {
                xeg xegVar;
                wpi wpiVar = wpi.this;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
                String str = (String) xduVar.d(xas.class);
                ajbf ajbfVar = (ajbf) xduVar.d(xbw.class);
                if (xciVar != null) {
                    if (xciVar.b == apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES) {
                        return xciVar;
                    }
                    int i = 0;
                    if (xciVar.g(apcb.LAYOUT_TYPE_FORECASTING, xba.class, xbe.class)) {
                        wpiVar.f.a(xduVar, str, ajbfVar, playerResponseModel, (InstreamAdBreak) xciVar.e(xbe.class), (ForecastingAd) xciVar.e(xba.class));
                    } else if (xciVar.g(apcb.LAYOUT_TYPE_UNSPECIFIED, xbq.class)) {
                        wtq wtqVar = wpiVar.g;
                        amuk amukVar = xduVar.d;
                        int i2 = ((amxx) amukVar).c;
                        while (true) {
                            if (i >= i2) {
                                xegVar = null;
                                break;
                            }
                            xek xekVar = (xek) amukVar.get(i);
                            i++;
                            if (xekVar instanceof xcz) {
                                xegVar = ((xcz) xekVar).d;
                                break;
                            }
                        }
                        if (xegVar != null && xduVar.c() == apcd.SLOT_TYPE_PLAYER_BYTES) {
                            List list = wtqVar.d;
                            wwd wwdVar = (wwd) wtqVar.c.get();
                            String str2 = (String) xduVar.d(xas.class);
                            InstreamAdBreak instreamAdBreak = (InstreamAdBreak) xduVar.d(xbe.class);
                            xac xacVar = xduVar.g;
                            String b2 = wwdVar.b.b(apcd.SLOT_TYPE_PLAYER_BYTES);
                            apcd apcdVar = apcd.SLOT_TYPE_PLAYER_BYTES;
                            amuk r = amuk.r(xcz.a(wwdVar.b.c(apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE), str2, xegVar, false, true, false, false));
                            String c = wwdVar.b.c(apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE);
                            long j = xegVar.a;
                            list.add(new wtp(xdu.j(b2, apcdVar, r, amuk.s(xcz.a(c, str2, new xeg(j - wwdVar.a.g, j), false, false, false, false), xdx.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b2)), amuk.t(xdh.a(wwdVar.b.c(apcf.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED), b2), xdy.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b2), xdg.e(wwdVar.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str2)), xacVar), xegVar, xcb.a(wtqVar.a, wtqVar.b)));
                            return null;
                        }
                    }
                }
                return null;
            }
        });
    }
}
