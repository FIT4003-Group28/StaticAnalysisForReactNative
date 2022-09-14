package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class f implements Parcelable.Creator<SearchResult> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SearchResult createFromParcel(Parcel parcel) {
        return new SearchResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SearchResult[] newArray(int i) {
        return new SearchResult[i];
    }
}
