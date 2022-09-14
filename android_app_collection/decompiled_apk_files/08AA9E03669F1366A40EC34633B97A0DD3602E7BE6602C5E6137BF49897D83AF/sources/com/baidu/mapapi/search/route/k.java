package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.route.TransitRouteLine;
/* loaded from: classes.dex */
final class k implements Parcelable.Creator<TransitRouteLine.TransitStep> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TransitRouteLine.TransitStep createFromParcel(Parcel parcel) {
        return new TransitRouteLine.TransitStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public TransitRouteLine.TransitStep[] newArray(int i) {
        return new TransitRouteLine.TransitStep[i];
    }
}
