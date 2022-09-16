package defpackage;

import android.os.Parcelable;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: xeb  reason: default package */
/* loaded from: classes4.dex */
public final class xeb extends xdk {
    private SurveyAd a;

    public xeb() {
        super(null);
    }

    @Override // defpackage.aftn
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xdk
    protected final String c() {
        return "surveyAd";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xdk, defpackage.aftn
    public final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        SurveyAd surveyAd = this.a;
        Parcelable.Creator creator = SurveyAd.CREATOR;
        m(jSONObject, "surveyAdRenderer", Base64.encodeToString(surveyAd.b.toByteArray(), 2));
    }

    public xeb(SurveyAd surveyAd) {
        super(surveyAd);
        this.a = surveyAd;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new SurveyAd(h(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), h(jSONObject, "contentPlayerAdParams"), h(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), PlayerConfigModel.b, h(jSONObject, "adCpn"), (avcu) ((aopa) avcu.a.createBuilder().mo38mergeFrom(Base64.decode(h(jSONObject, "surveyAdRenderer"), 2), aoos.b())).mo39build());
        } catch (aopx unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
