package defpackage;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: bbmi  reason: default package */
/* loaded from: classes3.dex */
public final class bbmi implements bvwz {
    public final anhk a;
    public final bbnd b;
    @dzsi
    public final Runnable c;

    public bbmi(anhk anhkVar, bbnd bbndVar, @dzsi Runnable runnable) {
        this.a = anhkVar;
        this.b = bbndVar;
        this.c = runnable;
    }

    public static dspd d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        byte[] bArr = new byte[jSONObject.length()];
        for (int i = 0; i < jSONObject.length(); i++) {
            StringBuilder sb = new StringBuilder(11);
            sb.append(i);
            bArr[i] = (byte) jSONObject.getInt(sb.toString());
        }
        return dspd.x(bArr);
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: bbmh
            private final bbmi a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bbmi bbmiVar = this.a;
                Map map = (Map) obj;
                if (map != null) {
                    if (map.containsKey("token")) {
                        bbmiVar.a.h((String) map.get("token"));
                        bbmiVar.c.run();
                    }
                    if (map.containsKey("updated_preference_tokens")) {
                        try {
                            JSONArray jSONArray = new JSONArray((String) map.get("updated_preference_tokens"));
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                                bbmiVar.b.a(bbmi.d(jSONObject.getString("id")), bbmi.d(jSONObject.getString("value")));
                            }
                        } catch (JSONException unused) {
                        }
                    }
                }
                return bvwy.a;
            }
        };
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "ep.rlct";
    }
}
