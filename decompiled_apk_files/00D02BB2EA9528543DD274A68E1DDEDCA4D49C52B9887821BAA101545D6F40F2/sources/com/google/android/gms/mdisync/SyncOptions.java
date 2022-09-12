package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SyncOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncOptions> CREATOR = new coro();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cnwn.c(parcel, cnwn.d(parcel));
    }
}
