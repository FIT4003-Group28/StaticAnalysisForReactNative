package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cupu  reason: default package */
/* loaded from: classes5.dex */
public abstract class cupu {
    public static cupt g() {
        cuov cuovVar = new cuov();
        cuovVar.h(new byte[0]);
        return cuovVar;
    }

    public static dbsg<cupu> i(JSONObject jSONObject) {
        dbsg dbsgVar;
        try {
            cupt g = g();
            JSONObject jSONObject2 = jSONObject.getJSONObject("MEDIA_ID");
            try {
                cukm c = cukn.c();
                c.b(jSONObject2.getString("RESOURCE_ID"));
                c.c(jSONObject2.getInt("RESOURCE_REGION"));
                dbsgVar = dbsg.i(c.a());
            } catch (Exception unused) {
                cstl.a("LighterMediaId");
                dbsgVar = dbpy.a;
            }
            if (!dbsgVar.a()) {
                return dbpy.a;
            }
            g.e((cukn) dbsgVar.b());
            if (jSONObject.has("LOCAL_URI")) {
                g.d(jSONObject.getString("LOCAL_URI"));
            }
            if (jSONObject.has("THUMBNAIL")) {
                g.h(csto.g(jSONObject.getString("THUMBNAIL")));
            }
            g.g(jSONObject.getInt("WIDTH"));
            g.b(jSONObject.getInt("HEIGHT"));
            g.c(jSONObject.getString("IMAGE_DESCRIPTION"));
            return dbsg.i(g.a());
        } catch (JSONException unused2) {
            cstl.a("ImageElement");
            return dbpy.a;
        }
    }

    public abstract cukn a();

    public abstract String b();

    public abstract dspd c();

    public abstract int d();

    public abstract int e();

    public abstract String f();

    public final dbsg<JSONObject> h() {
        dbsg dbsgVar;
        try {
            JSONObject jSONObject = new JSONObject();
            cukn a = a();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("RESOURCE_ID", a.a());
                jSONObject2.put("RESOURCE_REGION", a.b());
                dbsgVar = dbsg.i(jSONObject2);
            } catch (JSONException unused) {
                cstl.a("LighterMediaId");
                dbsgVar = dbpy.a;
            }
            if (dbsgVar.a()) {
                jSONObject.put("MEDIA_ID", dbsgVar.b());
                if (b() != null) {
                    jSONObject.put("LOCAL_URI", b());
                }
                if (c().c() > 0) {
                    jSONObject.put("THUMBNAIL", csto.f(c().G()));
                }
                jSONObject.put("WIDTH", d());
                jSONObject.put("HEIGHT", e());
                jSONObject.put("IMAGE_DESCRIPTION", f());
                return dbsg.i(jSONObject);
            }
            cstl.a("ImageElement");
            return dbpy.a;
        } catch (JSONException unused2) {
            cstl.a("ImageElement");
            return dbpy.a;
        }
    }
}
