package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CallStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallStatus> CREATOR;
    public final int a;

    static {
        new CallStatus(1);
        new CallStatus(2);
        new CallStatus(3);
        CREATOR = new dent();
    }

    public CallStatus(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.c(parcel, d);
    }
}
