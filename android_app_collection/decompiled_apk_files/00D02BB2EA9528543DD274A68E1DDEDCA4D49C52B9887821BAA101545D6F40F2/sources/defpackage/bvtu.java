package defpackage;

import java.util.Map;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: bvtu  reason: default package */
/* loaded from: classes4.dex */
public final class bvtu {
    public static String a(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static Map<String, Object> b(String str) {
        final JSONObject jSONObject = new JSONObject(str);
        return dcjz.n(jSONObject.keys(), new dbrn(jSONObject) { // from class: bvtt
            private final JSONObject a;

            {
                this.a = jSONObject;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Object opt = this.a.opt((String) obj);
                dbsk.s(opt);
                return opt;
            }
        });
    }
}
