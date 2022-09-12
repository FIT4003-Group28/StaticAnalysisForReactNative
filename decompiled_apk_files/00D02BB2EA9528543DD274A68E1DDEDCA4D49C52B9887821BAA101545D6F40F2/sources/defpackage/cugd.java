package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cugd  reason: default package */
/* loaded from: classes5.dex */
public abstract class cugd {
    private static final String a = "cugd";

    public static cugc f() {
        cudm cudmVar = new cudm();
        cudmVar.f(0);
        cudmVar.c(0);
        cudmVar.e("");
        return cudmVar;
    }

    public static dbsg<cugd> g(JSONObject jSONObject) {
        cugc f = f();
        try {
            f.c(jSONObject.getInt("ICON_HEIGHT"));
            f.f(jSONObject.getInt("ICON_WIDTH"));
            f.d(csto.g(jSONObject.getString("ICON")));
            f.e(jSONObject.getString("TALK_BACK_DESCRIPTION"));
            if (jSONObject.has("ICON_COLOR")) {
                f.b(jSONObject.getInt("ICON_COLOR"));
            }
            return dbsg.i(f.a());
        } catch (NullPointerException | JSONException unused) {
            return dbpy.a;
        }
    }

    public static cugd i() {
        cugc f = f();
        f.d(new byte[0]);
        f.c(0);
        f.f(0);
        f.e("");
        return f.a();
    }

    public abstract byte[] a();

    public abstract int b();

    public abstract int c();

    public abstract dbsg<Integer> d();

    public abstract String e();

    public final dbsg<JSONObject> h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ICON", csto.f(a()));
            jSONObject.put("ICON_WIDTH", b());
            jSONObject.put("ICON_HEIGHT", c());
            jSONObject.put("TALK_BACK_DESCRIPTION", e());
            if (d().a()) {
                jSONObject.put("ICON_COLOR", d().b());
            }
            return dbsg.i(jSONObject);
        } catch (JSONException unused) {
            cstl.a(a);
            return dbpy.a;
        }
    }
}
