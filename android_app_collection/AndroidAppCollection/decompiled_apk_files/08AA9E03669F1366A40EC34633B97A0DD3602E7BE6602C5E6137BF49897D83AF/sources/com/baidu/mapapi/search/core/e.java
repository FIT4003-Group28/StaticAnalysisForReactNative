package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class e implements Parcelable.Creator<RouteStep> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RouteStep createFromParcel(Parcel parcel) {
        return new RouteStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RouteStep[] newArray(int i) {
        return new RouteStep[i];
    }
}
