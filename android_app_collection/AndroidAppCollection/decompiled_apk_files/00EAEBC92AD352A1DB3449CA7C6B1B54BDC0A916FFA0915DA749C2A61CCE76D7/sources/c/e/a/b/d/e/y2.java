package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class y2 extends com.google.android.gms.common.internal.x.a implements com.google.firebase.auth.v0.a.c2<y2, Object> {
    public static final Parcelable.Creator<y2> CREATOR = new x2();

    /* renamed from: b  reason: collision with root package name */
    private String f4020b;

    /* renamed from: c  reason: collision with root package name */
    private String f4021c;

    /* renamed from: d  reason: collision with root package name */
    private Long f4022d;

    /* renamed from: e  reason: collision with root package name */
    private String f4023e;

    /* renamed from: f  reason: collision with root package name */
    private Long f4024f;

    public y2() {
        this.f4024f = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y2(String str, String str2, Long l, String str3, Long l2) {
        this.f4020b = str;
        this.f4021c = str2;
        this.f4022d = l;
        this.f4023e = str3;
        this.f4024f = l2;
    }

    public static y2 b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            y2 y2Var = new y2();
            y2Var.f4020b = jSONObject.optString("refresh_token", null);
            y2Var.f4021c = jSONObject.optString("access_token", null);
            y2Var.f4022d = Long.valueOf(jSONObject.optLong("expires_in"));
            y2Var.f4023e = jSONObject.optString("token_type", null);
            y2Var.f4024f = Long.valueOf(jSONObject.optLong("issued_at"));
            return y2Var;
        } catch (JSONException e2) {
            Log.d("GetTokenResponse", "Failed to read GetTokenResponse from JSONObject");
            throw new com.google.firebase.auth.v0.b(e2);
        }
    }

    public final void a(String str) {
        com.google.android.gms.common.internal.s.b(str);
        this.f4020b = str;
    }

    public final long g() {
        Long l = this.f4022d;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final boolean j() {
        return com.google.android.gms.common.util.h.d().a() + 300000 < this.f4024f.longValue() + (this.f4022d.longValue() * 1000);
    }

    public final String k() {
        return this.f4021c;
    }

    public final String q() {
        return this.f4020b;
    }

    public final long r() {
        return this.f4024f.longValue();
    }

    public final String s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f4020b);
            jSONObject.put("access_token", this.f4021c);
            jSONObject.put("expires_in", this.f4022d);
            jSONObject.put("token_type", this.f4023e);
            jSONObject.put("issued_at", this.f4024f);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d("GetTokenResponse", "Failed to convert GetTokenResponse to JSON");
            throw new com.google.firebase.auth.v0.b(e2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f4020b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f4021c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, Long.valueOf(g()), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f4023e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, Long.valueOf(this.f4024f.longValue()), false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
