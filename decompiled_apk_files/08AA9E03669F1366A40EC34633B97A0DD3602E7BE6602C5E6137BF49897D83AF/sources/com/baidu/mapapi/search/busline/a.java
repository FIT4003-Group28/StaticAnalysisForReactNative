package com.baidu.mapapi.search.busline;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class a implements Parcelable.Creator<BusLineResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BusLineResult createFromParcel(Parcel parcel) {
        return new BusLineResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public BusLineResult[] newArray(int i) {
        return new BusLineResult[i];
    }
}
