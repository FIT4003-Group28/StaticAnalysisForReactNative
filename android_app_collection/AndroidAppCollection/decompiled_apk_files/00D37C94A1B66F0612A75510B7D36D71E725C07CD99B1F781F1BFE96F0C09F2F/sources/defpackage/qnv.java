package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qnv  reason: default package */
/* loaded from: classes4.dex */
public final class qnv extends qod {
    final /* synthetic */ qke a;
    final /* synthetic */ qoh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnv(qoh qohVar, qke qkeVar) {
        super(qohVar);
        this.b = qohVar;
        this.a = qkeVar;
    }

    @Override // defpackage.qod
    public final void b() {
        qpy qpyVar = this.b.b;
        qpz c = c();
        qke qkeVar = this.a;
        JSONObject jSONObject = new JSONObject();
        long a = qpyVar.a();
        long j = qkeVar.a;
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", qpyVar.f());
            jSONObject.put("currentTime", qpl.a(j));
        } catch (JSONException unused) {
        }
        qpyVar.c(jSONObject.toString(), a);
        qpyVar.h = Long.valueOf(j);
        qpyVar.n.a(a, new qpw(qpyVar, c, 1));
    }
}
