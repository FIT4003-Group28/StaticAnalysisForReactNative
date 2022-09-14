package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class b implements Parcelable.Creator<PoiIndoorResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PoiIndoorResult createFromParcel(Parcel parcel) {
        return new PoiIndoorResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PoiIndoorResult[] newArray(int i) {
        return new PoiIndoorResult[i];
    }
}
