package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.route.BikingRouteLine;
/* loaded from: classes.dex */
final class b implements Parcelable.Creator<BikingRouteLine.BikingStep> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BikingRouteLine.BikingStep createFromParcel(Parcel parcel) {
        return new BikingRouteLine.BikingStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BikingRouteLine.BikingStep[] newArray(int i) {
        return new BikingRouteLine.BikingStep[i];
    }
}
