package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: qns  reason: default package */
/* loaded from: classes4.dex */
final class qns extends qod {
    final /* synthetic */ int[] a;
    final /* synthetic */ qoh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qns(qoh qohVar, int[] iArr) {
        super(qohVar, true);
        this.b = qohVar;
        this.a = iArr;
    }

    @Override // defpackage.qod
    public final void b() {
        qpy qpyVar = this.b.b;
        qpz c = c();
        int[] iArr = this.a;
        JSONObject jSONObject = new JSONObject();
        long a = qpyVar.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", qpyVar.f());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        qpyVar.c(jSONObject.toString(), a);
        qpyVar.y.a(a, c);
    }
}
