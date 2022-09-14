package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class SearchResult implements Parcelable {
    public static final Parcelable.Creator<SearchResult> CREATOR = new f();
    public ERRORNO error;

    /* loaded from: classes.dex */
    public enum ERRORNO {
        NO_ERROR,
        RESULT_NOT_FOUND,
        AMBIGUOUS_KEYWORD,
        AMBIGUOUS_ROURE_ADDR,
        NOT_SUPPORT_BUS,
        NOT_SUPPORT_BUS_2CITY,
        ST_EN_TOO_NEAR,
        KEY_ERROR,
        PERMISSION_UNFINISHED,
        NETWORK_TIME_OUT,
        NETWORK_ERROR,
        POIINDOOR_BID_ERROR,
        POIINDOOR_FLOOR_ERROR,
        POIINDOOR_SERVER_ERROR
    }

    public SearchResult() {
        this.error = ERRORNO.NO_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SearchResult(Parcel parcel) {
        int readInt = parcel.readInt();
        this.error = readInt == -1 ? null : ERRORNO.values()[readInt];
    }

    public SearchResult(ERRORNO errorno) {
        this.error = errorno;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.error == null ? -1 : this.error.ordinal());
    }
}
