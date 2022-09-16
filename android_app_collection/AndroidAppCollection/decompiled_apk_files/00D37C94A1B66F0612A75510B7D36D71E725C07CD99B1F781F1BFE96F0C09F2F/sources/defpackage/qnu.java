package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qnu  reason: default package */
/* loaded from: classes4.dex */
public final class qnu extends qod {
    final /* synthetic */ qoh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnu(qoh qohVar) {
        super(qohVar);
        this.a = qohVar;
    }

    @Override // defpackage.qod
    public final void b() {
        qpy qpyVar = this.a.b;
        qpz c = c();
        JSONObject jSONObject = new JSONObject();
        long a = qpyVar.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "PLAY");
            jSONObject.put("mediaSessionId", qpyVar.f());
        } catch (JSONException unused) {
        }
        qpyVar.c(jSONObject.toString(), a);
        qpyVar.l.a(a, c);
    }
}
