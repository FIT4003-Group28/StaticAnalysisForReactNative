package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: pnx  reason: default package */
/* loaded from: classes7.dex */
public final class pnx {
    public final dbsg<String> a;
    public final dbsg<Integer> b;
    public final dbsg<String> c;

    public pnx(String str) {
        dbsg<String> dbsgVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.b = pod.a(jSONObject, "eventIdentifier");
            this.a = pod.c(jSONObject, "modelName");
            jSONObject.optJSONObject("modelVisibility");
            jSONObject.optJSONObject("textureChanges");
            dbsgVar = dbsg.i(str);
        } catch (JSONException unused) {
            this.a = dbpy.a;
            this.b = dbpy.a;
            dbsgVar = dbpy.a;
        }
        this.c = dbsgVar;
    }
}
