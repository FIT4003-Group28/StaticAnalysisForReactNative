package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.ThrottledAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: xee  reason: default package */
/* loaded from: classes4.dex */
public final class xee extends xdk {
    public xee() {
        super(null);
    }

    @Override // defpackage.aftn
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xdk
    protected final String c() {
        return "throttledAd";
    }

    public xee(ThrottledAd throttledAd) {
        super(throttledAd);
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        return new ThrottledAd(h(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), h(jSONObject, "contentPlayerAdParams"), h(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), PlayerConfigModel.b, h(jSONObject, "adCpn"), jSONObject.getLong("expirationTimeMillis"));
    }
}
