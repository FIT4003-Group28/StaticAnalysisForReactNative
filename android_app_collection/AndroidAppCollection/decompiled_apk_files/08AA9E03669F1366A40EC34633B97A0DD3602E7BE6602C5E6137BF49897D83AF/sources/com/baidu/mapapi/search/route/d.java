package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class d implements Parcelable.Creator<DrivingRouteLine> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DrivingRouteLine createFromParcel(Parcel parcel) {
        return new DrivingRouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DrivingRouteLine[] newArray(int i) {
        return new DrivingRouteLine[i];
    }
}
