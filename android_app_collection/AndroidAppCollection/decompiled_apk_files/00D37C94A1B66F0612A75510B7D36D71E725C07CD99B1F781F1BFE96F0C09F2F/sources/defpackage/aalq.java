package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.VastAd;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aalq  reason: default package */
/* loaded from: classes.dex */
public final class aalq extends aftn {
    private VastAd.ProgressPing a;

    public aalq() {
    }

    public aalq(VastAd.ProgressPing progressPing) {
        this.a = progressPing;
    }

    @Override // defpackage.aftn
    public final int a() {
        return 1;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new VastAd.ProgressPing(jSONObject.getInt("offset"), jSONObject.getBoolean("isPercentageOffset"), e(jSONObject, "pingUri"));
        }
        throw new JSONException("Unsupported version");
    }

    @Override // defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        jSONObject.put("offset", this.a.b);
        jSONObject.put("isPercentageOffset", this.a.c);
        m(jSONObject, "pingUri", this.a.d);
    }
}
