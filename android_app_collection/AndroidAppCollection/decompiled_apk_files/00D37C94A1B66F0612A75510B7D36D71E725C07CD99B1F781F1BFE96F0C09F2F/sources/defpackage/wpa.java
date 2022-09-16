package defpackage;

import com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_PLAYBACK_TRACKING, d = {xbv.class, xas.class, xat.class})
/* renamed from: wpa  reason: default package */
/* loaded from: classes4.dex */
public final class wpa extends wok {
    public final wvx a;
    private final xdu b;

    public wpa(woo wooVar, wvx wvxVar, xdu xduVar) {
        super(wooVar);
        this.a = wvxVar;
        this.b = xduVar;
    }

    @Override // defpackage.wok
    public final void a() {
        final avww avwwVar = (avww) this.b.d(xbv.class);
        final PlayerResponseModel playerResponseModel = (PlayerResponseModel) this.b.d(xat.class);
        this.d.c(new ampg() { // from class: woz
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                wpa wpaVar = wpa.this;
                PlayerResponseModel playerResponseModel2 = playerResponseModel;
                avww avwwVar2 = avwwVar;
                xdu xduVar = (xdu) obj;
                String str = (String) xduVar.d(xas.class);
                VideoTrackingAd videoTrackingAd = new VideoTrackingAd(playerResponseModel2.B(), playerResponseModel2.J(), playerResponseModel2.y(), playerResponseModel2.E(), playerResponseModel2.c(), playerResponseModel2.a(), avwwVar2);
                wvx wvxVar = wpaVar.a;
                aoyz qP = videoTrackingAd.qP();
                String a = wvxVar.c.a(apcb.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER, xduVar.a);
                asit c = wvxVar.d.c(xduVar, a, apcb.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER, 1, qP);
                apcb apcbVar = apcb.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER;
                amuk r = amuk.r(xdg.a(wvxVar.c.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str));
                amuk q = amuk.q();
                amuk q2 = amuk.q();
                ampq i = ampq.i(qP);
                ampq j = ampq.j(c);
                wvy wvyVar = wvxVar.a;
                apai apaiVar = videoTrackingAd.a.c;
                if (apaiVar == null) {
                    apaiVar = apai.a;
                }
                return xci.i(a, apcbVar, r, q, q2, i, j, ampq.j(wvyVar.a(new VideoAdTrackingModel(apaiVar))), xac.b(new xbx(videoTrackingAd)));
            }
        });
    }
}
