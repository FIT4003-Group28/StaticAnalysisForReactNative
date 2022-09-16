package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: ctzi  reason: default package */
/* loaded from: classes5.dex */
public abstract class ctzi {
    public static ctzh c() {
        return new cucj();
    }

    public static dbsg<JSONObject> d(ctzi ctziVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (ctziVar.b().a()) {
                dbsg<JSONObject> d = cufz.d(ctziVar.b().b());
                if (!d.a()) {
                    return dbpy.a;
                }
                jSONObject.put("STACKED_REACTION_WEB_VIEW", d.b());
            }
            if (ctziVar.a().a()) {
                dbsg<JSONObject> l = ctziVar.a().b().l();
                if (!l.a()) {
                    return dbpy.a;
                }
                jSONObject.put("REACTION_OVERLAY_HEADER", l.b());
            }
            return dbsg.i(jSONObject);
        } catch (JSONException unused) {
            cstl.a("Action");
            return dbpy.a;
        }
    }

    public abstract dbsg<cugq> a();

    public abstract dbsg<cufz> b();
}
