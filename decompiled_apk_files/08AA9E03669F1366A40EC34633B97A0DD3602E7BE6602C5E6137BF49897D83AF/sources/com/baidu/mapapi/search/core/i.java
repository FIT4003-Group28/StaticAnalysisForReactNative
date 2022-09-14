package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class i implements Parcelable.Creator<VehicleInfo> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VehicleInfo createFromParcel(Parcel parcel) {
        return new VehicleInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public VehicleInfo[] newArray(int i) {
        return new VehicleInfo[i];
    }
}
