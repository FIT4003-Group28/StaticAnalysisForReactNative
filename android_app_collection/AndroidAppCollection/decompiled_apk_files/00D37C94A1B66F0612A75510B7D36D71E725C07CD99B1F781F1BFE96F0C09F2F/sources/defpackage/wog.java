package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_FORECASTING, d = {xba.class})
/* renamed from: wog  reason: default package */
/* loaded from: classes4.dex */
public final class wog extends wok {
    public final wvx a;

    public wog(woo wooVar, wvx wvxVar) {
        super(wooVar);
        this.a = wvxVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.c(new ampg() { // from class: wof
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                xdu xduVar = (xdu) obj;
                return wog.this.a.b(xduVar.a, null, (ForecastingAd) xduVar.d(xba.class));
            }
        });
    }
}
