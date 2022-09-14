package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class b implements Parcelable.Creator<PoiInfo> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PoiInfo createFromParcel(Parcel parcel) {
        return new PoiInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PoiInfo[] newArray(int i) {
        return new PoiInfo[i];
    }
}
