package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: wtg  reason: default package */
/* loaded from: classes4.dex */
public final class wtg {
    public final azqb a;
    private final azqb b;

    public wtg(azqb azqbVar, azqb azqbVar2) {
        this.b = azqbVar;
        this.a = azqbVar2;
    }

    public final void a(final xdu xduVar, final String str, final ajbf ajbfVar, final PlayerResponseModel playerResponseModel, final InstreamAdBreak instreamAdBreak, final ForecastingAd forecastingAd) {
        ((wtm) this.b.get()).a(9, xcb.a(str, playerResponseModel), new wtl() { // from class: wtf
            @Override // defpackage.wtl
            public final List a() {
                xeg xegVar;
                wtg wtgVar = wtg.this;
                xdu xduVar2 = xduVar;
                String str2 = str;
                ajbf ajbfVar2 = ajbfVar;
                PlayerResponseModel playerResponseModel2 = playerResponseModel;
                InstreamAdBreak instreamAdBreak2 = instreamAdBreak;
                ForecastingAd forecastingAd2 = forecastingAd;
                xdu[] xduVarArr = new xdu[1];
                wwd wwdVar = (wwd) wtgVar.a.get();
                aqzm aqzmVar = forecastingAd2.b;
                if (instreamAdBreak2.b() == xdb.PRE_ROLL) {
                    xegVar = new xeg(0L, 0L);
                } else {
                    amuk amukVar = xduVar2.d;
                    int i = ((amxx) amukVar).c;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            xek xekVar = (xek) amukVar.get(i2);
                            i2++;
                            if (xekVar instanceof xcz) {
                                xegVar = ((xcz) xekVar).d;
                                break;
                            }
                        } else {
                            xegVar = new xeg(0L, 0L);
                            break;
                        }
                    }
                }
                xduVarArr[0] = wwdVar.a(aqzmVar, str2, ajbfVar2, playerResponseModel2, instreamAdBreak2, xegVar, forecastingAd2);
                return Arrays.asList(xduVarArr);
            }
        });
    }
}
