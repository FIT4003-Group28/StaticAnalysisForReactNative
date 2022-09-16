package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_PLAYER_BYTES, d = {xat.class, xaw.class, xas.class, xbw.class, xae.class})
/* renamed from: wpd  reason: default package */
/* loaded from: classes4.dex */
public final class wpd extends wok {
    public final wlc a;
    public final ahiu b;
    public final wvx c;
    public final wwa e;
    public final wul f;
    public final wtg g;
    public final snc h;
    public final long i;
    private final Executor j;
    private final Executor k;
    private final aadd l;

    public wpd(woo wooVar, Executor executor, Executor executor2, wlc wlcVar, ahiu ahiuVar, wkn wknVar, wvx wvxVar, wwa wwaVar, wul wulVar, wtg wtgVar, aadd aaddVar, snc sncVar) {
        super(wooVar);
        this.j = executor;
        this.k = executor2;
        this.a = wlcVar;
        this.b = ahiuVar;
        this.c = wvxVar;
        this.e = wwaVar;
        this.f = wulVar;
        this.g = wtgVar;
        this.l = aaddVar;
        this.h = sncVar;
        this.i = wknVar.f;
    }

    @Override // defpackage.wok
    public final void a() {
        final long b = xrz.k(this.l) ? ((ajbf) this.d.b.d(xbw.class)).b() : -1L;
        this.d.b(new ampg() { // from class: wpc
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                String str;
                aoyb aoybVar;
                wpd wpdVar = wpd.this;
                long j = b;
                xdu xduVar = (xdu) obj;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
                aeso aesoVar = (aeso) xduVar.d(xaw.class);
                String str2 = (String) xduVar.d(xas.class);
                ajbf ajbfVar = (ajbf) xduVar.d(xbw.class);
                int intValue = ((Integer) xduVar.d(xae.class)).intValue();
                wlc wlcVar = wpdVar.a;
                byte[] J2 = playerResponseModel.J();
                Iterator it = playerResponseModel.C().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    aoyb aoybVar2 = (aoyb) it.next();
                    int d = aoyt.d(aoybVar2.d);
                    if (d != 0 && d == 7) {
                        str = aoybVar2.e;
                        break;
                    }
                }
                String str3 = aesoVar.e;
                long j2 = aesoVar.d;
                long a = aesoVar.a();
                wpdVar.b.g();
                AdBreakResponseModel a2 = wlcVar.a(str2, J2, str, str3, j2, a, intValue, j, new zgk(wpdVar.h, wpdVar.i));
                if (a2 == null || a2.b()) {
                    return null;
                }
                if (a2.a.c.size() != 0) {
                    for (arkr arkrVar : a2.a.c) {
                        if (arkrVar.b == 84813246) {
                            aoybVar = (aoyb) arkrVar.c;
                            break;
                        }
                    }
                }
                aoybVar = null;
                InstreamAdBreak instreamAdBreak = new InstreamAdBreak(new AdBreakRendererModel(aoybVar), intValue, playerResponseModel.E(), playerResponseModel.B(), aesoVar.a, playerResponseModel.y(), playerResponseModel.J());
                List<PlayerAd> b2 = wpdVar.e.b(instreamAdBreak, a2.a(), playerResponseModel);
                wvx wvxVar = wpdVar.c;
                if (b2.isEmpty()) {
                    return null;
                }
                if (b2.get(0) instanceof ForecastingAd) {
                    return wvxVar.b(xduVar.a, instreamAdBreak, (ForecastingAd) b2.get(0));
                }
                ArrayList arrayList = new ArrayList();
                for (PlayerAd playerAd : b2) {
                    if (playerAd instanceof MediaAd) {
                        wvw wvwVar = wvxVar.c;
                        apcb apcbVar = apcb.LAYOUT_TYPE_MEDIA;
                        String str4 = xduVar.a;
                        String str5 = playerAd.l;
                        arrayList.add(wvwVar.a(apcbVar, str4));
                    } else {
                        String valueOf = String.valueOf(playerAd);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                        sb.append("Unexpected playerAd type for DAI layout: ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                String a3 = wvxVar.c.a(apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, xduVar.a);
                List g = wvxVar.g(instreamAdBreak, b2, arrayList, a3);
                if (!g.isEmpty()) {
                    return xci.h(a3, apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, amuk.r(new xcq(wvxVar.c.c(apcf.TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED), apcf.TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED, a3)), amon.a, xac.b(new xbe(instreamAdBreak), new xbp(g), new xbw(ajbfVar)));
                }
                return null;
            }
        }, this.j, this.k, new won() { // from class: wpb
            @Override // defpackage.won
            public final xci a(xdu xduVar, xci xciVar) {
                wpd wpdVar = wpd.this;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
                aeso aesoVar = (aeso) xduVar.d(xaw.class);
                String str = (String) xduVar.d(xas.class);
                ajbf ajbfVar = (ajbf) xduVar.d(xbw.class);
                if (xciVar != null) {
                    if (xciVar.b == apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES) {
                        wpdVar.f.k(xciVar, aesoVar.a);
                        return xciVar;
                    } else if (xciVar.g(apcb.LAYOUT_TYPE_FORECASTING, xba.class, xbe.class)) {
                        wpdVar.g.a(xduVar, str, ajbfVar, playerResponseModel, (InstreamAdBreak) xciVar.e(xbe.class), (ForecastingAd) xciVar.e(xba.class));
                        return null;
                    }
                }
                return null;
            }
        });
    }
}
