package defpackage;

import android.os.Parcelable;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: xcc  reason: default package */
/* loaded from: classes4.dex */
public final class xcc extends xdk {
    private ForecastingAd a;

    public xcc() {
        super(null);
    }

    @Override // defpackage.aftn
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xdk
    protected final String c() {
        return "forecastingAd";
    }

    @Override // defpackage.xdk, defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        ForecastingAd forecastingAd = this.a;
        Parcelable.Creator creator = ForecastingAd.CREATOR;
        m(jSONObject, "forecastingAdRenderer", Base64.encodeToString(forecastingAd.b.toByteArray(), 2));
    }

    public xcc(ForecastingAd forecastingAd) {
        super(forecastingAd);
        this.a = forecastingAd;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new ForecastingAd(h(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), h(jSONObject, "contentPlayerAdParams"), h(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), PlayerConfigModel.b, h(jSONObject, "adCpn"), jSONObject.getLong("expirationTimeMillis"), (aqzm) ((aopa) aqzm.a.createBuilder().mo38mergeFrom(Base64.decode(h(jSONObject, "forecastingAdRenderer"), 2), aoos.b())).mo39build());
        } catch (aopx unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
