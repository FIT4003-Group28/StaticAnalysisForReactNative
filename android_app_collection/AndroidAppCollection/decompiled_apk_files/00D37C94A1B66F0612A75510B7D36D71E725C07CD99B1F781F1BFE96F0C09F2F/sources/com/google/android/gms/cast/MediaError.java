package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaError extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qjl(5);
    public String a;
    public long b;
    public final Integer c;
    public final String d;
    String e;
    private final JSONObject f;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = j;
        this.c = num;
        this.d = str2;
        this.f = jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, qpl.e(jSONObject, "reason"), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.t(parcel, 3, this.b);
        tqj.B(parcel, 4, this.c);
        tqj.F(parcel, 5, this.d);
        tqj.F(parcel, 6, this.e);
        tqj.n(parcel, m);
    }
}
