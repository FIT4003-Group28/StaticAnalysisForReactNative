package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.VastInfoCard;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aals  reason: default package */
/* loaded from: classes.dex */
public final class aals extends aftn {
    private VastInfoCard.InfoCardAction a;

    public aals() {
    }

    public aals(VastInfoCard.InfoCardAction infoCardAction) {
        this.a = infoCardAction;
    }

    @Override // defpackage.aftn
    public final int a() {
        return 1;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new VastInfoCard.InfoCardAction(jSONObject.getInt("type"), e(jSONObject, "linkUrl"), jSONObject.getString("title"), p(jSONObject, "trackingUris"));
        }
        throw new JSONException("Unsupported version");
    }

    @Override // defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        jSONObject.put("type", this.a.b);
        jSONObject.put("linkUrl", this.a.c);
        jSONObject.put("title", this.a.d);
        q(jSONObject, "trackingUris", this.a.e);
    }
}
