package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.route.DrivingRouteLine;
/* loaded from: classes.dex */
final class e implements Parcelable.Creator<DrivingRouteLine.DrivingStep> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DrivingRouteLine.DrivingStep createFromParcel(Parcel parcel) {
        return new DrivingRouteLine.DrivingStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DrivingRouteLine.DrivingStep[] newArray(int i) {
        return new DrivingRouteLine.DrivingStep[i];
    }
}
