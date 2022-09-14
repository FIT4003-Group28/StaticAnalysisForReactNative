package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m0 implements com.google.firebase.auth.a0 {
    public static final Parcelable.Creator<m0> CREATOR = new p0();

    /* renamed from: b  reason: collision with root package name */
    private long f8378b;

    /* renamed from: c  reason: collision with root package name */
    private long f8379c;

    public m0(long j, long j2) {
        this.f8378b = j;
        this.f8379c = j2;
    }

    public static m0 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new m0(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f8378b);
            jSONObject.put("creationTimestamp", this.f8379c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.firebase.auth.a0
    public final long b() {
        return this.f8379c;
    }

    @Override // com.google.firebase.auth.a0
    public final long d() {
        return this.f8378b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, d());
        com.google.android.gms.common.internal.x.c.a(parcel, 2, b());
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
