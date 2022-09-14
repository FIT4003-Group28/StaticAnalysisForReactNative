package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class UlrPrivateModeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UlrPrivateModeRequest> CREATOR = new coqn();
    public final String a;
    public final boolean b;

    public UlrPrivateModeRequest(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
        sb.append("UlrPrivateModeRequest{Tag='");
        sb.append(str);
        sb.append(", privateMode=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.e(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
