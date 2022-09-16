package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdBreakStatus extends AbstractSafeParcelable {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    private static final qpu f = new qpu("AdBreakStatus");
    public static final Parcelable.Creator CREATOR = new qhh(20);

    public AdBreakStatus(long j, long j2, String str, String str2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AdBreakStatus a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long b = qpl.b(jSONObject.getLong("currentBreakTime"));
                long b2 = qpl.b(jSONObject.getLong("currentBreakClipTime"));
                String e = qpl.e(jSONObject, "breakId");
                String e2 = qpl.e(jSONObject, "breakClipId");
                long optLong = jSONObject.optLong("whenSkippable", -1L);
                return new AdBreakStatus(b, b2, e, e2, optLong != -1 ? qpl.b(optLong) : optLong);
            } catch (JSONException e3) {
                f.c(e3, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        return this.a == adBreakStatus.a && this.b == adBreakStatus.b && qpl.j(this.c, adBreakStatus.c) && qpl.j(this.d, adBreakStatus.d) && this.e == adBreakStatus.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.t(parcel, 2, this.a);
        tqj.t(parcel, 3, this.b);
        tqj.F(parcel, 4, this.c);
        tqj.F(parcel, 5, this.d);
        tqj.t(parcel, 6, this.e);
        tqj.n(parcel, m);
    }
}
