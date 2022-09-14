package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class i implements Parcelable.Creator<SuggestAddrInfo> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SuggestAddrInfo createFromParcel(Parcel parcel) {
        return new SuggestAddrInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SuggestAddrInfo[] newArray(int i) {
        return new SuggestAddrInfo[i];
    }
}
