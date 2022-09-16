package defpackage;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: buft  reason: default package */
/* loaded from: classes4.dex */
public final class buft {
    private static final dcqe b = dcqe.c("buft");
    public final JSONObject a;

    public buft(dxio<dixz> dxioVar) {
        JSONObject jSONObject = null;
        if ((dxioVar.a().a & 512) != 0) {
            try {
                jSONObject = new JSONObject(dxioVar.a().d);
            } catch (JSONException e) {
                bvoo.h("QUIC connection settings in networkParameters is invalid JSON string: %s", e);
            }
        }
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("idle_connection_timeout_seconds", cpnx.a);
            jSONObject2.put("migrate_sessions_on_network_change_v2", true);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.get(next));
                }
            }
        } catch (JSONException unused) {
        }
        this.a = jSONObject;
    }
}
