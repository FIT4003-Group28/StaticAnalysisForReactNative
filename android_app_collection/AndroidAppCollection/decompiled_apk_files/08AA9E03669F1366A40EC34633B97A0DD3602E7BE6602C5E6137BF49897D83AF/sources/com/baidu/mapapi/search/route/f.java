package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class f implements Parcelable.Creator<DrivingRouteResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DrivingRouteResult createFromParcel(Parcel parcel) {
        return new DrivingRouteResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DrivingRouteResult[] newArray(int i) {
        return new DrivingRouteResult[i];
    }
}
