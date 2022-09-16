package defpackage;

import com.google.android.gms.cast.MediaStatus;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qno  reason: default package */
/* loaded from: classes4.dex */
public final class qno extends qod {
    final /* synthetic */ qoh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qno(qoh qohVar) {
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
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = qpyVar.g;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.b);
            }
        } catch (JSONException unused) {
        }
        qpyVar.c(jSONObject.toString(), a);
        qpyVar.q.a(a, c);
    }
}
