package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
@Deprecated
/* renamed from: wns  reason: default package */
/* loaded from: classes4.dex */
public final class wns {
    public static final wnr a = new wnr();
    public final snc b;
    public final aaqp c;
    public final azqb d;
    private final wnb e;

    public wns(snc sncVar, wnb wnbVar, aaqp aaqpVar, azqb azqbVar) {
        this.b = sncVar;
        this.e = wnbVar;
        this.c = aaqpVar;
        this.d = azqbVar;
    }

    public final InstreamAdImpl a(InstreamAdBreak instreamAdBreak, aunb aunbVar, PlayerConfigModel playerConfigModel, String str) {
        instreamAdBreak.getClass();
        if (instreamAdBreak.b() == xdb.PRE_ROLL) {
            ylr.b();
        }
        aanz aanzVar = (aanz) this.d.get();
        aaqp aaqpVar = this.c;
        long c = this.b.c();
        PlayerAd playerAd = null;
        if (aunbVar == null) {
            zep.b("Received null renderer, this should never happen.");
        } else if (aunbVar.qn(avwv.a)) {
            playerAd = new LocalVideoAd(instreamAdBreak, playerConfigModel, str, (avwu) aunbVar.qm(avwv.a), aanzVar, aaqpVar, c);
        } else if (aunbVar.qn(aqzn.a)) {
            playerAd = new ForecastingAd(instreamAdBreak, playerConfigModel, str, c, (aqzm) aunbVar.qm(aqzn.a));
        } else if (aunbVar.qn(avcx.a)) {
            playerAd = new SurveyAd(instreamAdBreak, playerConfigModel, str, (avcu) aunbVar.qm(avcx.a));
        } else {
            zep.b("Received unsupported ad type, this should never happen.");
        }
        return new InstreamAdImpl(playerAd);
    }

    public final String b() {
        return this.e.a();
    }
}
