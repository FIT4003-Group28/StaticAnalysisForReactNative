package defpackage;

import com.google.android.gms.ads.internal.client.AdErrorParcel;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: pyw  reason: default package */
/* loaded from: classes4.dex */
public class pyw {
    public final String a;
    public final String b;
    private final int c;
    private final pyw d;

    public pyw(int i, String str, String str2) {
        this(i, str, str2, null);
    }

    public pyw(int i, String str, String str2, pyw pywVar) {
        this.c = i;
        this.a = str;
        this.b = str2;
        this.d = pywVar;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.c);
        jSONObject.put("Message", this.a);
        jSONObject.put("Domain", this.b);
        pyw pywVar = this.d;
        if (pywVar == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", pywVar.b());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final AdErrorParcel a() {
        pyw pywVar = this.d;
        return new AdErrorParcel(this.c, this.a, this.b, pywVar == null ? null : new AdErrorParcel(pywVar.c, pywVar.a, pywVar.b, null, null), null);
    }
}
