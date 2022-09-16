package defpackage;

import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.AdIntro;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: wzs  reason: default package */
/* loaded from: classes4.dex */
public final class wzs extends xdk {
    private AdIntro a;

    public wzs() {
        super(null);
    }

    @Override // defpackage.aftn
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xdk
    protected final String c() {
        return "videoAd";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xdk, defpackage.aftn
    public final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        AdIntro adIntro = this.a;
        Parcelable.Creator creator = AdIntro.CREATOR;
        m(jSONObject, "playerResponse", Base64.encodeToString(adIntro.b.K(), 2));
    }

    public wzs(AdIntro adIntro) {
        super(adIntro);
        this.a = adIntro;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        PlayerResponseModel j;
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        String h = h(jSONObject, "originalVideoId");
        byte[] decode = Base64.decode(jSONObject.getString("requestTrackingParams"), 0);
        String h2 = h(jSONObject, "contentPlayerAdParams");
        String h3 = h(jSONObject, "adBreakId");
        boolean z = jSONObject.getBoolean("isForOffline");
        String h4 = h(jSONObject, "adCpn");
        long j2 = jSONObject.getLong("expirationTimeMillis");
        String h5 = h(jSONObject, "playerResponse");
        if (TextUtils.isEmpty(h5)) {
            j = PlayerResponseModel.i();
        } else {
            j = PlayerResponseModel.j(Base64.decode(h5, 2), 0L);
        }
        return new AdIntro(h, decode, h2, h3, z, h4, j2, j);
    }
}
