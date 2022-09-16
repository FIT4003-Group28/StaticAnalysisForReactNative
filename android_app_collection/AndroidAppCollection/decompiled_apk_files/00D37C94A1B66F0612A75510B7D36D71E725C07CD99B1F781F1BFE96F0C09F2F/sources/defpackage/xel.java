package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: xel  reason: default package */
/* loaded from: classes4.dex */
public final class xel extends aftn {
    private VideoAdTrackingModel a;

    public xel() {
    }

    public xel(VideoAdTrackingModel videoAdTrackingModel) {
        this.a = videoAdTrackingModel;
    }

    @Override // defpackage.aftn
    public final int a() {
        return 1;
    }

    @Override // defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        VideoAdTrackingModel videoAdTrackingModel = this.a;
        VideoAdTrackingModel videoAdTrackingModel2 = VideoAdTrackingModel.a;
        m(jSONObject, "videoAdTrackingProto", Base64.encodeToString(videoAdTrackingModel.b.toByteArray(), 2));
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new VideoAdTrackingModel((apai) ((aopa) apai.a.createBuilder().mo38mergeFrom(Base64.decode(h(jSONObject, "videoAdTrackingProto"), 2), aoos.b())).mo39build());
        } catch (aopx unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
