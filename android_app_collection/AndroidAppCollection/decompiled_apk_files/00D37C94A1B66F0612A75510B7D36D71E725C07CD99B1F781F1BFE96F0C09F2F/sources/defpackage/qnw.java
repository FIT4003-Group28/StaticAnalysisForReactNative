package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: qnw  reason: default package */
/* loaded from: classes4.dex */
public final class qnw extends qod {
    final /* synthetic */ double a;
    final /* synthetic */ qoh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnw(qoh qohVar, double d) {
        super(qohVar);
        this.b = qohVar;
        this.a = d;
    }

    @Override // defpackage.qod
    public final void b() {
        qpy qpyVar = this.b.b;
        qpz c = c();
        double d = this.a;
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Volume cannot be ");
            sb.append(d);
            throw new IllegalArgumentException(sb.toString());
        }
        JSONObject jSONObject = new JSONObject();
        long a = qpyVar.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "SET_VOLUME");
            jSONObject.put("mediaSessionId", qpyVar.f());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("level", d);
            jSONObject.put("volume", jSONObject2);
        } catch (JSONException unused) {
        }
        qpyVar.c(jSONObject.toString(), a);
        qpyVar.o.a(a, c);
    }
}
