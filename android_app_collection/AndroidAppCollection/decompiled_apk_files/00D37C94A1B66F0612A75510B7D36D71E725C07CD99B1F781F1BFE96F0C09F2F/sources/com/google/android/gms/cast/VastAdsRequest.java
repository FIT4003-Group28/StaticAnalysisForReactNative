package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VastAdsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qjl(15);
    public final String a;
    public final String b;

    public VastAdsRequest(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static VastAdsRequest a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new VastAdsRequest(qpl.e(jSONObject, "adTagUrl"), qpl.e(jSONObject, "adsResponse"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastAdsRequest)) {
            return false;
        }
        VastAdsRequest vastAdsRequest = (VastAdsRequest) obj;
        return qpl.j(this.a, vastAdsRequest.a) && qpl.j(this.b, vastAdsRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.n(parcel, m);
    }
}
