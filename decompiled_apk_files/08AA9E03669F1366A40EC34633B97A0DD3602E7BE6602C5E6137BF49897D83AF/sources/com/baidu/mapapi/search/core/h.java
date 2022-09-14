package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class h implements Parcelable.Creator<TaxiInfo> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TaxiInfo createFromParcel(Parcel parcel) {
        return new TaxiInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TaxiInfo[] newArray(int i) {
        return new TaxiInfo[i];
    }
}
