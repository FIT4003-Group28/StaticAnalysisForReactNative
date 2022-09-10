package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amjy  reason: default package */
/* loaded from: classes2.dex */
public final class amjy {
    private List<amhh> a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(dzrj<amhh> dzrjVar) {
        b();
        dzrn<amhh> a = dzrjVar.a();
        while (a.hasNext()) {
            a.next().w(128);
        }
        this.a.addAll(dzrjVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        for (amhh amhhVar : this.a) {
            amhhVar.x(128);
        }
        this.a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized JSONObject c() {
        JSONObject jSONObject;
        List<amhh> list = this.a;
        jSONObject = new JSONObject();
        if (list != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                for (amhh amhhVar : list) {
                    if (amhhVar instanceof amhv) {
                        akqi e = amhhVar.s().e();
                        if (!e.equals(akqi.a)) {
                            JSONObject jSONObject2 = new JSONObject();
                            String o = e.o();
                            dbsk.s(o);
                            jSONObject2.put("@id", o);
                            jSONObject2.put("rank", amhhVar.s().f());
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i = 0; i < 4; i++) {
                                akse d = amhhVar.j().d(i);
                                jSONArray2.put(new JSONObject().put("x", d.b).put("y", d.c));
                            }
                            jSONObject2.put("bounding_box", jSONArray2);
                            jSONArray.put(jSONObject2);
                        }
                    }
                }
                jSONObject.put("labels", jSONArray);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }
}
