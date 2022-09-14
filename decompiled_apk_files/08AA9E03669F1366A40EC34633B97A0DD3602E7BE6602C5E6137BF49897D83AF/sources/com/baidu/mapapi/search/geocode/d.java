package com.baidu.mapapi.search.geocode;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;
/* loaded from: classes.dex */
final class d implements Parcelable.Creator<ReverseGeoCodeResult.AddressComponent> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReverseGeoCodeResult.AddressComponent createFromParcel(Parcel parcel) {
        return new ReverseGeoCodeResult.AddressComponent(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ReverseGeoCodeResult.AddressComponent[] newArray(int i) {
        return new ReverseGeoCodeResult.AddressComponent[i];
    }
}
