package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cugq  reason: default package */
/* loaded from: classes5.dex */
public abstract class cugq {
    public static cugp k() {
        cudx cudxVar = new cudx();
        cudxVar.g(false);
        cudxVar.c(false);
        cudxVar.h(false);
        return cudxVar;
    }

    public static dbsg<cugq> m(JSONObject jSONObject) {
        cugp k = k();
        try {
            k.j(jSONObject.getInt("OVERLAY_STYLE"));
            k.k(jSONObject.getInt("time_to_live_sec"));
            if (jSONObject.has("dismiss_action")) {
                dbsg<ctzl> l = ctzl.l(jSONObject.getJSONObject("dismiss_action"));
                if (!l.a()) {
                    cstl.a("Message");
                    return dbpy.a;
                }
                k.b(l.b());
            }
            if (jSONObject.has("overlay_lighter_icon")) {
                dbsg<cugd> g = cugd.g(jSONObject.getJSONObject("overlay_lighter_icon"));
                if (!g.a()) {
                    cstl.a("Message");
                    return dbpy.a;
                }
                k.i(g.b());
            }
            if (jSONObject.has("display_text")) {
                k.e(jSONObject.getString("display_text"));
            }
            if (jSONObject.has("OVERLAY_EXPIRETIME_STAMP")) {
                k.f(jSONObject.getInt("OVERLAY_EXPIRETIME_STAMP"));
            }
            if (jSONObject.has("display_icon")) {
                k.d(dspd.x(csto.g(jSONObject.optString("display_icon"))));
            }
            if (jSONObject.has("hide_snippet_in_conversation_list")) {
                k.h(jSONObject.optBoolean("hide_snippet_in_conversation_list"));
            }
            if (jSONObject.has("hide_dismiss_button")) {
                k.g(jSONObject.optBoolean("hide_dismiss_button"));
            }
            if (jSONObject.has("dismissible_by_tapping_outside")) {
                k.c(jSONObject.optBoolean("dismissible_by_tapping_outside"));
            }
            return dbsg.i(k.a());
        } catch (JSONException unused) {
            cstl.a("Message");
            return dbpy.a;
        }
    }

    public abstract dbsg<ctzl> a();

    @Deprecated
    public abstract dbsg<dspd> b();

    public abstract dbsg<cugd> c();

    public abstract dbsg<String> d();

    public abstract int e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract dbsg<Integer> i();

    public abstract int j();

    public final dbsg<JSONObject> l() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (a().a()) {
                dbsg<JSONObject> k = a().b().k();
                if (!k.a()) {
                    cstl.a("Message");
                    return dbpy.a;
                }
                jSONObject.put("dismiss_action", k.b());
            }
            if (c().a()) {
                dbsg<JSONObject> h = c().b().h();
                if (!h.a()) {
                    cstl.a("Message");
                    return dbpy.a;
                }
                jSONObject.put("overlay_lighter_icon", h.b());
            }
            if (d().a()) {
                jSONObject.put("display_text", d().b());
            }
            jSONObject.put("time_to_live_sec", e());
            if (i().a()) {
                jSONObject.put("OVERLAY_EXPIRETIME_STAMP", i().b());
            }
            jSONObject.put("OVERLAY_STYLE", j());
            if (b().a()) {
                jSONObject.putOpt("display_icon", csto.f(b().b().G()));
            }
            jSONObject.putOpt("hide_snippet_in_conversation_list", Boolean.valueOf(f()));
            jSONObject.putOpt("hide_dismiss_button", Boolean.valueOf(g()));
            jSONObject.putOpt("dismissible_by_tapping_outside", Boolean.valueOf(h()));
            return dbsg.i(jSONObject);
        } catch (JSONException unused) {
            cstl.a("Message");
            return dbpy.a;
        }
    }
}
