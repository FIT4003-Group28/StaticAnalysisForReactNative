package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class c implements Parcelable.Creator<PoiResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PoiResult createFromParcel(Parcel parcel) {
        return new PoiResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PoiResult[] newArray(int i) {
        return new PoiResult[i];
    }
}
