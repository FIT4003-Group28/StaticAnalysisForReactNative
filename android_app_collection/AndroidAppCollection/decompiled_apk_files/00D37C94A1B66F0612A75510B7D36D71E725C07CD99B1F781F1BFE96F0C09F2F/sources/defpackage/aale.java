package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aale  reason: default package */
/* loaded from: classes.dex */
public final class aale extends aftn {
    private AdBreakRendererModel a;

    public aale() {
    }

    public aale(AdBreakRendererModel adBreakRendererModel) {
        this.a = adBreakRendererModel;
    }

    @Override // defpackage.aftn
    public final int a() {
        return 1;
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new AdBreakRendererModel((aoyb) aopi.parseFrom(aoyb.a, Base64.decode(h(jSONObject, "adBreakRendererProto"), 2), aoos.b()));
        } catch (aopx unused) {
            throw new JSONException("Invalid protobuf");
        }
    }

    @Override // defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        m(jSONObject, "adBreakRendererProto", Base64.encodeToString(this.a.b.toByteArray(), 2));
    }
}
