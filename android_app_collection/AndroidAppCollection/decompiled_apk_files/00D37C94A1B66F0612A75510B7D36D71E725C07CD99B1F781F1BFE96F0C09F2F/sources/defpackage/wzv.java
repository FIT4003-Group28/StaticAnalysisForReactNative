package defpackage;

import android.os.Parcelable;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.AdVideoEnd;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: wzv  reason: default package */
/* loaded from: classes4.dex */
public final class wzv extends xdk {
    private AdVideoEnd a;

    public wzv() {
        super(null);
    }

    @Override // defpackage.aftn
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xdk
    protected final String c() {
        return "adVideoEnd";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xdk, defpackage.aftn
    public final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        AdVideoEnd adVideoEnd = this.a;
        Parcelable.Creator creator = AdVideoEnd.CREATOR;
        PlayerAd playerAd = adVideoEnd.c;
        if (playerAd instanceof LocalVideoAd) {
            o(jSONObject, "videoAd", playerAd);
        } else {
            zep.b("Encountered an AdVideoEnd with a player ad for reporting that was not a VideoAd.");
        }
        m(jSONObject, "adVideoEndRenderer", Base64.encodeToString(this.a.b.toByteArray(), 2));
    }

    public wzv(AdVideoEnd adVideoEnd) {
        super(adVideoEnd);
        this.a = adVideoEnd;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        PlayerAd playerAd;
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        if (LocalVideoAd.a.g(jSONObject, "videoAd") != null) {
            playerAd = (PlayerAd) LocalVideoAd.a.g(jSONObject, "videoAd");
        } else {
            zep.b("Encountered an AdVideoEnd with a player ad for reporting that was not a VideoAd.");
            playerAd = null;
        }
        PlayerAd playerAd2 = playerAd;
        try {
            return new AdVideoEnd(h(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), h(jSONObject, "contentPlayerAdParams"), h(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), PlayerConfigModel.b, h(jSONObject, "adCpn"), (apax) ((aopa) apax.a.createBuilder().mo38mergeFrom(Base64.decode(h(jSONObject, "adVideoEndRenderer"), 2), aoos.b())).mo39build(), playerAd2);
        } catch (aopx unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
