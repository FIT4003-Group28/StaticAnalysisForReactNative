package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class c implements Parcelable.Creator<BikingRouteLine> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BikingRouteLine createFromParcel(Parcel parcel) {
        return new BikingRouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BikingRouteLine[] newArray(int i) {
        return new BikingRouteLine[i];
    }
}
