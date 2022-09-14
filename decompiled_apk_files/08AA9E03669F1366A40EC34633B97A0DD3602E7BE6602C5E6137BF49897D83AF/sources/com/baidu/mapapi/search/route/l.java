package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class l implements Parcelable.Creator<TransitRouteResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TransitRouteResult createFromParcel(Parcel parcel) {
        return new TransitRouteResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TransitRouteResult[] newArray(int i) {
        return new TransitRouteResult[i];
    }
}
