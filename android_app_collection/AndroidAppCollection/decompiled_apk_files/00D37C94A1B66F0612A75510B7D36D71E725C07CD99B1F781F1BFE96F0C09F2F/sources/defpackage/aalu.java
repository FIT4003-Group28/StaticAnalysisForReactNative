package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.VastInfoCard;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aalu  reason: default package */
/* loaded from: classes.dex */
public final class aalu extends aftn {
    private VastInfoCard.InfoCardTrackingEvent a;

    public aalu() {
    }

    public aalu(VastInfoCard.InfoCardTrackingEvent infoCardTrackingEvent) {
        this.a = infoCardTrackingEvent;
    }

    @Override // defpackage.aftn
    public final int a() {
        return 1;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new VastInfoCard.InfoCardTrackingEvent(jSONObject.getInt("type"), e(jSONObject, "baseUri"));
        }
        throw new JSONException("Unsupported version");
    }

    @Override // defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        jSONObject.put("type", this.a.a());
        jSONObject.put("baseUri", this.a.b());
    }
}
