package defpackage;

import android.os.Parcelable;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: xem  reason: default package */
/* loaded from: classes4.dex */
public final class xem extends xdk {
    private VideoTrackingAd a;

    private xem() {
        super(null);
    }

    @Override // defpackage.aftn
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xdk
    protected final String c() {
        return "videoTrackingAd";
    }

    @Override // defpackage.xdk, defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        VideoTrackingAd videoTrackingAd = this.a;
        Parcelable.Creator creator = VideoTrackingAd.CREATOR;
        m(jSONObject, "videoAdTrackingRenderer", Base64.encodeToString(videoTrackingAd.a.toByteArray(), 2));
    }

    public xem(VideoTrackingAd videoTrackingAd) {
        super(videoTrackingAd);
        this.a = videoTrackingAd;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new VideoTrackingAd(h(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), h(jSONObject, "contentPlayerAdParams"), jSONObject.getBoolean("isForOffline"), PlayerConfigModel.b, jSONObject.getInt("duration"), (avww) ((aopa) avww.a.createBuilder().mo38mergeFrom(Base64.decode(h(jSONObject, "videoAdTrackingRenderer"), 2), aoos.b())).mo39build());
        } catch (aopx unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
