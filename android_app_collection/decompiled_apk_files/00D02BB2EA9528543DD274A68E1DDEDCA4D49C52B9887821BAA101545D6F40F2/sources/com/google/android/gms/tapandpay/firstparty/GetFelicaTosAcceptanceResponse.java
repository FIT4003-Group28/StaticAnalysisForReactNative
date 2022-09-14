package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GetFelicaTosAcceptanceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetFelicaTosAcceptanceResponse> CREATOR = new cpah();
    public boolean a;

    private GetFelicaTosAcceptanceResponse() {
    }

    public GetFelicaTosAcceptanceResponse(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFelicaTosAcceptanceResponse)) {
            return false;
        }
        return cnvv.a(Boolean.valueOf(this.a), Boolean.valueOf(((GetFelicaTosAcceptanceResponse) obj).a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 1, this.a);
        cnwn.c(parcel, d);
    }
}
