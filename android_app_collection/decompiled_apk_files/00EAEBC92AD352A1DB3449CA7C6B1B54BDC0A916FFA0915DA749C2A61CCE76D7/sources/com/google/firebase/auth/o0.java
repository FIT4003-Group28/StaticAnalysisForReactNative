package com.google.firebase.auth;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class o0 extends h0 {
    public static final Parcelable.Creator<o0> CREATOR = new t1();

    /* renamed from: b  reason: collision with root package name */
    private final String f8428b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8429c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8430d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8431e;

    public o0(String str, String str2, long j, String str3) {
        com.google.android.gms.common.internal.s.b(str);
        this.f8428b = str;
        this.f8429c = str2;
        this.f8430d = j;
        com.google.android.gms.common.internal.s.b(str3);
        this.f8431e = str3;
    }

    public static o0 a(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new o0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    public String i() {
        return this.f8428b;
    }

    public String m() {
        return this.f8431e;
    }

    public String p() {
        return this.f8429c;
    }

    @Override // com.google.firebase.auth.h0
    public JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f8428b);
            jSONObject.putOpt("displayName", this.f8429c);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f8430d));
            jSONObject.putOpt("phoneNumber", this.f8431e);
            return jSONObject;
        } catch (JSONException e2) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new com.google.firebase.auth.v0.b(e2);
        }
    }

    public long r() {
        return this.f8430d;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, i(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, p(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, r());
        com.google.android.gms.common.internal.x.c.a(parcel, 4, m(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
