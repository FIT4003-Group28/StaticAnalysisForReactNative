package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adtd  reason: default package */
/* loaded from: classes.dex */
public final class adtd {
    public final adil a;
    public final JSONObject b;

    public adtd() {
    }

    public adtd(adil adilVar, JSONObject jSONObject) {
        this.a = adilVar;
        this.b = jSONObject;
    }

    public static adtd b(JSONArray jSONArray) {
        JSONObject jSONObject;
        String string = jSONArray.getString(0);
        adil a = adil.a(string);
        if (a == null) {
            throw new JSONException(String.format("Invalid method name (%s) on message: %s", string, jSONArray));
        }
        JSONObject optJSONObject = jSONArray.optJSONObject(1);
        adtc adtcVar = new adtc();
        adtcVar.a = a;
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        adtcVar.b = optJSONObject;
        adil adilVar = adtcVar.a;
        if (adilVar == null || (jSONObject = adtcVar.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (adtcVar.a == null) {
                sb.append(" method");
            }
            if (adtcVar.b == null) {
                sb.append(" data");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adtd(adilVar, jSONObject);
    }

    public final int a() {
        return this.b.optInt("senderMsn", -1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adtd) {
            adtd adtdVar = (adtd) obj;
            if (this.a.equals(adtdVar.a) && this.b.equals(adtdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(valueOf2).length());
        sb.append("MdxMessage{method=");
        sb.append(valueOf);
        sb.append(", data=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
