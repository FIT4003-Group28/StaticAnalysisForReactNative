package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ReserveResourceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ReserveResourceResponse> CREATOR = new cpas();
    public String a;

    private ReserveResourceResponse() {
    }

    public ReserveResourceResponse(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReserveResourceResponse)) {
            return false;
        }
        return cnvv.a(this.a, ((ReserveResourceResponse) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.c(parcel, d);
    }
}
