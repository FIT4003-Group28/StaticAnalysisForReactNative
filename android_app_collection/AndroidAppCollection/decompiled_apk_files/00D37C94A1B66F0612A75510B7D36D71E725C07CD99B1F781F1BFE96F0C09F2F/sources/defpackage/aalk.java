package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.ads.Survey;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aalk  reason: default package */
/* loaded from: classes.dex */
public final class aalk extends aftn {
    private Survey a;

    public aalk() {
    }

    public aalk(Survey survey) {
        this.a = survey;
    }

    @Override // defpackage.aftn
    public final int a() {
        return 2;
    }

    @Override // defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        Survey survey = this.a;
        aalk aalkVar = Survey.a;
        jSONObject.put("data_pb", Base64.encodeToString(survey.b.toByteArray(), 0));
    }

    @Override // defpackage.aftn
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 2) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new Survey((osc) aopi.parseFrom(osc.a, Base64.decode(jSONObject.getString("data_pb"), 0), aoos.b()));
        } catch (aopx e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Unable to parse proto: ".concat(valueOf) : new String("Unable to parse proto: "));
        }
    }
}
