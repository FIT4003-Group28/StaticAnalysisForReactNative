package com.baidu.mapapi.search.district;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class a implements Parcelable.Creator<DistrictResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DistrictResult createFromParcel(Parcel parcel) {
        return new DistrictResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DistrictResult[] newArray(int i) {
        return new DistrictResult[i];
    }
}
