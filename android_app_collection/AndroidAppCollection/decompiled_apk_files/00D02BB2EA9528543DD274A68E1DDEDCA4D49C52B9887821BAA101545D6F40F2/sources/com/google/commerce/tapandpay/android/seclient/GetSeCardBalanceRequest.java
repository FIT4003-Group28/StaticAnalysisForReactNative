package com.google.commerce.tapandpay.android.seclient;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class GetSeCardBalanceRequest implements Parcelable {
    public static final Parcelable.Creator<GetSeCardBalanceRequest> CREATOR = new dbol();
    private final String a;
    private final int b;

    public GetSeCardBalanceRequest(Parcel parcel) {
        this.a = parcel.readString();
        this.b = new int[]{1, 2, 3, 4, 5}[parcel.readInt()];
    }

    public GetSeCardBalanceRequest(String str) {
        this.a = str;
        this.b = 4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        int i2 = this.b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }
}
