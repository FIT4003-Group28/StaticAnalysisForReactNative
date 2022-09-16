package defpackage;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adtb  reason: default package */
/* loaded from: classes.dex */
public final class adtb {
    private static final String a;

    static {
        String valueOf = String.valueOf(adtb.class.getCanonicalName());
        a = zep.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    private adtb() {
    }

    public static JSONArray a(adil adilVar, adip adipVar) {
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(0, adilVar);
        } catch (JSONException e) {
            String str = a;
            String valueOf = String.valueOf(adilVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Error converting ");
            sb.append(valueOf);
            sb.append(" to JSON ");
            zep.o(str, sb.toString(), e);
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = adipVar.iterator();
        while (it.hasNext()) {
            adio mo416next = ((adin) it).mo416next();
            try {
                jSONObject.put(mo416next.a, mo416next.b);
            } catch (JSONException e2) {
                String str2 = a;
                String valueOf2 = String.valueOf(adipVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb2.append("Error converting ");
                sb2.append(valueOf2);
                sb2.append(" to JSON ");
                zep.o(str2, sb2.toString(), e2);
                return jSONArray;
            }
        }
        try {
            jSONArray.put(1, jSONObject);
            return jSONArray;
        } catch (JSONException e3) {
            String str3 = a;
            String valueOf3 = String.valueOf(jSONObject);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 29);
            sb3.append("Error adding params ");
            sb3.append(valueOf3);
            sb3.append(" to JSON ");
            zep.o(str3, sb3.toString(), e3);
            return jSONArray;
        }
    }

    public static JSONObject b(adip adipVar) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = adipVar.iterator();
        while (it.hasNext()) {
            adio mo416next = ((adin) it).mo416next();
            try {
                jSONObject.put(mo416next.a, mo416next.b);
            } catch (JSONException e) {
                String str = a;
                String valueOf = String.valueOf(adipVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Error converting ");
                sb.append(valueOf);
                sb.append(" to JSON ");
                zep.o(str, sb.toString(), e);
            }
        }
        return jSONObject;
    }
}
