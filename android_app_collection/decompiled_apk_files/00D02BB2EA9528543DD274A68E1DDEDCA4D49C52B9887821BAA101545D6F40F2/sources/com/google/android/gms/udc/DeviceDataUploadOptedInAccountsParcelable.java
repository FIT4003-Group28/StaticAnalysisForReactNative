package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DeviceDataUploadOptedInAccountsParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceDataUploadOptedInAccountsParcelable> CREATOR = new cpdh();
    public final List<String> a;
    public final List<String> b;

    public DeviceDataUploadOptedInAccountsParcelable(List<String> list, List<String> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof DeviceDataUploadOptedInAccountsParcelable) {
            DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable = (DeviceDataUploadOptedInAccountsParcelable) obj;
            if (cnvv.a(this.a, deviceDataUploadOptedInAccountsParcelable.a) && cnvv.a(this.b, deviceDataUploadOptedInAccountsParcelable.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.w(parcel, 2, this.a);
        cnwn.w(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
