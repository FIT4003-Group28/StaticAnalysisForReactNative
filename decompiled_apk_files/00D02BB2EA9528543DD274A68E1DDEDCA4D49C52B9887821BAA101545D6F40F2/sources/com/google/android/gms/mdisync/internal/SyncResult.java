package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SyncResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncResult> CREATOR = new cory();
    public final byte[] a;

    public SyncResult(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.l(parcel, 1, this.a, false);
        cnwn.c(parcel, d);
    }
}
