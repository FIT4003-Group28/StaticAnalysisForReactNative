package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_FORECASTING, d = {xbe.class, xat.class, xbb.class})
/* renamed from: woi  reason: default package */
/* loaded from: classes4.dex */
public final class woi extends wok {
    public final wvx a;
    public final snc b;
    public final wnb c;

    public woi(woo wooVar, wnb wnbVar, wvx wvxVar, snc sncVar) {
        super(wooVar);
        this.c = wnbVar;
        this.a = wvxVar;
        this.b = sncVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.c(new ampg() { // from class: woh
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                woi woiVar = woi.this;
                xdu xduVar = (xdu) obj;
                return woiVar.a.b(xduVar.a, null, new ForecastingAd((InstreamAdBreak) xduVar.d(xbe.class), ((PlayerResponseModel) xduVar.d(xat.class)).c(), woiVar.c.a(), woiVar.b.c(), (aqzm) xduVar.d(xbb.class)));
            }
        });
    }
}
