package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class c implements Parcelable.Creator<RouteLine> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RouteLine createFromParcel(Parcel parcel) {
        return new RouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public RouteLine[] newArray(int i) {
        return new RouteLine[i];
    }
}
