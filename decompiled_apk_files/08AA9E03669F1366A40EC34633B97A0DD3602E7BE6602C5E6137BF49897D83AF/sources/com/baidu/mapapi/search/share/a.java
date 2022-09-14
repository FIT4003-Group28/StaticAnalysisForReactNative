package com.baidu.mapapi.search.share;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class a implements Parcelable.Creator<ShareUrlResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ShareUrlResult createFromParcel(Parcel parcel) {
        return new ShareUrlResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public ShareUrlResult[] newArray(int i) {
        return new ShareUrlResult[i];
    }
}
