package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class a implements Parcelable.Creator<CityInfo> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CityInfo createFromParcel(Parcel parcel) {
        return new CityInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public CityInfo[] newArray(int i) {
        return new CityInfo[i];
    }
}
