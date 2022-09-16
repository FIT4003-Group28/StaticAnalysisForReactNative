package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: pzg  reason: default package */
/* loaded from: classes4.dex */
public final class pzg extends pyw {
    private final pzi c;

    public pzg(int i, String str, String str2, pyw pywVar, pzi pziVar) {
        super(i, str, str2, pywVar);
        this.c = pziVar;
    }

    @Override // defpackage.pyw
    public final JSONObject b() {
        JSONObject b = super.b();
        pzi pziVar = ((Boolean) qdb.z.e()).booleanValue() ? this.c : null;
        if (pziVar == null) {
            b.put("Response Info", "null");
        } else {
            b.put("Response Info", pziVar.a());
        }
        return b;
    }

    @Override // defpackage.pyw
    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
