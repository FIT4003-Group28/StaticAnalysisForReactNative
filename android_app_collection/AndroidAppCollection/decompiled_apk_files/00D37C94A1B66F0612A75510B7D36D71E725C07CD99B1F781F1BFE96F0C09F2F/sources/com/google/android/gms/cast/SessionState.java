package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SessionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qjl(13);
    public final MediaLoadRequestData a;
    String b;
    private final JSONObject c;

    public SessionState(MediaLoadRequestData mediaLoadRequestData, JSONObject jSONObject) {
        this.a = mediaLoadRequestData;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) obj;
        if (qyk.a(this.c, sessionState.c)) {
            return tnk.j(this.a, sessionState.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, String.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.c;
        this.b = jSONObject == null ? null : jSONObject.toString();
        int m = tqj.m(parcel);
        tqj.E(parcel, 2, this.a, i);
        tqj.F(parcel, 3, this.b);
        tqj.n(parcel, m);
    }
}
