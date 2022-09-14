package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class d implements Parcelable.Creator<RouteNode> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RouteNode createFromParcel(Parcel parcel) {
        return new RouteNode(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RouteNode[] newArray(int i) {
        return new RouteNode[i];
    }
}
