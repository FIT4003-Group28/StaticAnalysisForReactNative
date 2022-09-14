package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class a implements Parcelable.Creator<WalkingRouteLine> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalkingRouteLine createFromParcel(Parcel parcel) {
        return new WalkingRouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalkingRouteLine[] newArray(int i) {
        return new WalkingRouteLine[i];
    }
}
