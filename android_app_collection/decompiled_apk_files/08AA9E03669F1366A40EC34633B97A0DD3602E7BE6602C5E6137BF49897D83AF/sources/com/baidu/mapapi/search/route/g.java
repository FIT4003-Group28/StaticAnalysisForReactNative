package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class g implements Parcelable.Creator<PlanNode> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlanNode createFromParcel(Parcel parcel) {
        return new PlanNode(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public PlanNode[] newArray(int i) {
        return new PlanNode[i];
    }
}
