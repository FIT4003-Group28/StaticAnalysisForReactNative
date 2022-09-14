package com.baidu.mapapi.search.geocode;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class c implements Parcelable.Creator<ReverseGeoCodeResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReverseGeoCodeResult createFromParcel(Parcel parcel) {
        return new ReverseGeoCodeResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReverseGeoCodeResult[] newArray(int i) {
        return new ReverseGeoCodeResult[i];
    }
}
