package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: wwd  reason: default package */
/* loaded from: classes4.dex */
public final class wwd {
    public final wkn a;
    public final wvw b;
    public final aadd c;

    public wwd(wkn wknVar, wvw wvwVar, aadd aaddVar) {
        this.a = wknVar;
        this.b = wvwVar;
        this.c = aaddVar;
    }

    public static final xdu c(String str, String str2, PlayerResponseModel playerResponseModel, xdb xdbVar, boolean z) {
        return xdu.b(str, apcd.SLOT_TYPE_PLAYER_BYTES, 4, xac.b(new xao(xdbVar), new xas(str2), new xat(playerResponseModel), new xbg(z)));
    }

    public static final List d(String str, ajbf ajbfVar, PlayerResponseModel playerResponseModel, xdb xdbVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xas(str));
        arrayList.add(new xbw(ajbfVar));
        arrayList.add(new xat(playerResponseModel));
        arrayList.add(new xao(xdbVar));
        return arrayList;
    }

    public static final long e(InstreamAdBreak instreamAdBreak) {
        if (instreamAdBreak != null && instreamAdBreak.b() == xdb.MID_ROLL) {
            return instreamAdBreak.a();
        }
        return 9223372036854775806L;
    }

    public final xdu a(aqzm aqzmVar, String str, ajbf ajbfVar, PlayerResponseModel playerResponseModel, InstreamAdBreak instreamAdBreak, xeg xegVar, ForecastingAd forecastingAd) {
        char c;
        Object a;
        xac b;
        String b2 = this.b.b(apcd.SLOT_TYPE_FORECASTING);
        apcd apcdVar = apcd.SLOT_TYPE_FORECASTING;
        xdb xdbVar = xdb.PRE_ROLL;
        int ordinal = instreamAdBreak.b().ordinal();
        if (ordinal == 0) {
            c = 1;
            a = xea.a(this.b.c(apcf.TRIGGER_TYPE_SLOT_ID_SCHEDULED), b2);
        } else if (ordinal == 1) {
            c = 1;
            a = xcz.a(this.b.c(apcf.TRIGGER_TYPE_MEDIA_TIME_RANGE), str, xegVar, false, false, false, false);
        } else if (ordinal == 2) {
            a = xca.a(this.b.c(apcf.TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED), str, false);
            c = 1;
        } else {
            throw new IllegalStateException();
        }
        amuk r = amuk.r(a);
        amuk r2 = amuk.r(xdx.a(this.b.c(apcf.TRIGGER_TYPE_SLOT_ID_ENTERED), b2));
        amuk s = amuk.s(xdg.a(this.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str), xdy.a(this.b.c(apcf.TRIGGER_TYPE_SLOT_ID_EXITED), b2));
        if (forecastingAd != null) {
            xal[] xalVarArr = new xal[4];
            xalVarArr[0] = new xba(forecastingAd);
            xalVarArr[c] = new xas(str);
            xalVarArr[2] = new xbe(instreamAdBreak);
            xalVarArr[3] = new xbw(ajbfVar);
            b = xac.b(xalVarArr);
        } else {
            xal[] xalVarArr2 = new xal[5];
            xalVarArr2[0] = new xbb(aqzmVar);
            xalVarArr2[c] = new xbe(instreamAdBreak);
            xalVarArr2[2] = new xas(str);
            xalVarArr2[3] = new xat(playerResponseModel);
            xalVarArr2[4] = new xbw(ajbfVar);
            b = xac.b(xalVarArr2);
        }
        return xdu.j(b2, apcdVar, r, r2, s, b);
    }

    public final xdu b() {
        return xdu.b(this.b.b(apcd.SLOT_TYPE_IN_PLAYER), apcd.SLOT_TYPE_IN_PLAYER, 3, xac.b(new xal[0]));
    }
}
