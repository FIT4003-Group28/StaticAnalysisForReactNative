package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: xcf  reason: default package */
/* loaded from: classes4.dex */
public final class xcf extends aftn {
    private InstreamAdBreak a;

    public xcf() {
    }

    public xcf(InstreamAdBreak instreamAdBreak) {
        this.a = instreamAdBreak;
    }

    @Override // defpackage.aftn
    public final int a() {
        return 1;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new InstreamAdBreak((AdBreakRendererModel) AdBreakRendererModel.a.g(jSONObject, "adBreakRenderer"), jSONObject.getInt("adBreakIndex"), jSONObject.getBoolean("isForOffline"), jSONObject.getString("orginalVideoId"), jSONObject.getString("adBreakId"), h(jSONObject, "contentPlayerAdParams"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0));
        }
        throw new JSONException("Unsupported version");
    }

    @Override // defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        o(jSONObject, "adBreakRenderer", this.a.c);
        jSONObject.put("adBreakIndex", this.a.d);
        jSONObject.put("isForOffline", this.a.e);
        jSONObject.put("orginalVideoId", this.a.f);
        jSONObject.put("adBreakId", this.a.g);
        m(jSONObject, "contentPlayerAdParams", this.a.h);
        jSONObject.put("requestTrackingParams", Base64.encodeToString(this.a.i, 0));
    }
}
