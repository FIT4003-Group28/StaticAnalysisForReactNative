package defpackage;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: ppi  reason: default package */
/* loaded from: classes7.dex */
final class ppi implements dbrn<Map<String, Object>, Map<String, Object>> {
    final /* synthetic */ ppk a;

    public ppi(ppk ppkVar) {
        this.a = ppkVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ Map<String, Object> a(Map<String, Object> map) {
        final Map<String, Object> map2 = map;
        if (map2 != null) {
            this.a.a.runOnUiThread(new Runnable(this, map2) { // from class: pph
                private final ppi a;
                private final Map b;

                {
                    this.a = this;
                    this.b = map2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dcdc e;
                    dbsg dbsgVar;
                    ppi ppiVar = this.a;
                    Map map3 = this.b;
                    ppk ppkVar = ppiVar.a;
                    if (map3.containsKey("params")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map3.get("params"));
                            dbsgVar = pod.a(jSONObject, "eventIdentifier");
                            try {
                                JSONArray optJSONArray = jSONObject.optJSONArray("models");
                                if (optJSONArray == null) {
                                    e = dcdc.e();
                                } else {
                                    dccx dccxVar = new dccx();
                                    for (int i = 0; i < optJSONArray.length(); i++) {
                                        dccxVar.g(optJSONArray.getString(i));
                                    }
                                    e = dccxVar.f();
                                }
                            } catch (JSONException unused) {
                                e = dcdc.e();
                            }
                        } catch (JSONException unused2) {
                            e = dcdc.e();
                            dbsgVar = dbpy.a;
                        }
                        if (!dbsgVar.a() || e.isEmpty()) {
                            return;
                        }
                        deha.q(ppkVar.b.c(ppkVar.d, ppkVar.e, ppkVar.f, (String) e.get(0)), new ppj(), ppkVar.c);
                    }
                }
            });
        }
        return bvwy.a;
    }
}
