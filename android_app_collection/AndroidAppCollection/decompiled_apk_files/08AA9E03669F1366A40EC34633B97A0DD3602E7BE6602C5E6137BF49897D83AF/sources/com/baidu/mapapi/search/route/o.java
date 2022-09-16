package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class o implements Parcelable.Creator<WalkingRouteResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalkingRouteResult createFromParcel(Parcel parcel) {
        return new WalkingRouteResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalkingRouteResult[] newArray(int i) {
        return new WalkingRouteResult[i];
    }
}
