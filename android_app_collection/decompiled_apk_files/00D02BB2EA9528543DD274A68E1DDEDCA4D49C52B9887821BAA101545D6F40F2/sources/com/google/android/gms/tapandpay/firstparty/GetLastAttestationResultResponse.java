package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetLastAttestationResultResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetLastAttestationResultResponse> CREATOR = new cpai();
    int a;
    long b;

    public GetLastAttestationResultResponse(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GetLastAttestationResultResponse) {
            GetLastAttestationResultResponse getLastAttestationResultResponse = (GetLastAttestationResultResponse) obj;
            if (this.a == getLastAttestationResultResponse.a && this.b == getLastAttestationResultResponse.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("result", Integer.valueOf(this.a));
        b.a("timeMillis", Long.valueOf(this.b));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.h(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
