package com.baidu.mapapi.search.sug;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.sug.SuggestionResult;
/* loaded from: classes.dex */
final class b implements Parcelable.Creator<SuggestionResult.SuggestionInfo> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SuggestionResult.SuggestionInfo createFromParcel(Parcel parcel) {
        return new SuggestionResult.SuggestionInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public SuggestionResult.SuggestionInfo[] newArray(int i) {
        return new SuggestionResult.SuggestionInfo[i];
    }
}
