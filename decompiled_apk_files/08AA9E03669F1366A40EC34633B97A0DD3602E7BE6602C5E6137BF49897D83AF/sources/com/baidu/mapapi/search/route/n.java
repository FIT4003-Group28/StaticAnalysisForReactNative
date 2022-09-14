package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.route.WalkingRouteLine;
/* loaded from: classes.dex */
final class n implements Parcelable.Creator<WalkingRouteLine.WalkingStep> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalkingRouteLine.WalkingStep createFromParcel(Parcel parcel) {
        return new WalkingRouteLine.WalkingStep(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public WalkingRouteLine.WalkingStep[] newArray(int i) {
        return new WalkingRouteLine.WalkingStep[i];
    }
}
