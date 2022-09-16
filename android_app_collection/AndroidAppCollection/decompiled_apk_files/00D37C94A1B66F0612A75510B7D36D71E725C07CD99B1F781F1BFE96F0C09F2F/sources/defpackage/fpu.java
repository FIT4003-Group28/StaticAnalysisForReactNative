package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: fpu  reason: default package */
/* loaded from: classes3.dex */
final class fpu extends afyl {
    private final String a;
    private final String b;

    public fpu(String str, String str2, String str3) {
        super(2, str, (cez) null);
        this.a = str2;
        this.b = str3;
    }

    @Override // defpackage.yua
    public final byte[] qA() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", this.a);
            HashMap hashMap = new HashMap();
            hashMap.put("screenId", this.b);
            hashMap.put("method", "updateRemoteTransactionStatus");
            hashMap.put("params", jSONObject.toString());
            return yqt.d(hashMap, "ISO-8859-1").c();
        } catch (UnsupportedEncodingException | JSONException e) {
            zep.f(fpv.a, "Error while creating POST payload for the RemoteTransaction progress API.", e);
            return null;
        }
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        int i = cewVar.a;
        if (i == 200 || i == 204) {
            String str = fpv.a;
            return cfb.b(null, null);
        }
        zep.c(fpv.a, "ERROR status code from external message response");
        return cfb.a(new cff(cewVar));
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        Void r1 = (Void) obj;
    }
}
