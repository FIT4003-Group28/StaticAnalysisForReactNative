package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class j implements Parcelable.Creator<TransitRouteLine> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TransitRouteLine createFromParcel(Parcel parcel) {
        return new TransitRouteLine(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TransitRouteLine[] newArray(int i) {
        return new TransitRouteLine[i];
    }
}
