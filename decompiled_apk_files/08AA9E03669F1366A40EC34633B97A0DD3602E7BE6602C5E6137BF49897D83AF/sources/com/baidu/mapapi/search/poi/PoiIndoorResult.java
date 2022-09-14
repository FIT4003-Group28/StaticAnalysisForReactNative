package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;
/* loaded from: classes.dex */
public class PoiIndoorResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<PoiIndoorResult> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    int f1849a;

    /* renamed from: b  reason: collision with root package name */
    int f1850b;

    /* renamed from: c  reason: collision with root package name */
    private List<PoiIndoorInfo> f1851c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PoiIndoorResult() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public PoiIndoorResult(Parcel parcel) {
        super(parcel);
        this.f1849a = parcel.readInt();
        this.f1850b = parcel.readInt();
    }

    public PoiIndoorResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getPageNum() {
        return this.f1850b;
    }

    public int getPoiNum() {
        return this.f1849a;
    }

    public List<PoiIndoorInfo> getmArrayPoiInfo() {
        return this.f1851c;
    }

    public void setPageNum(int i) {
        this.f1850b = i;
    }

    public void setPoiNum(int i) {
        this.f1849a = i;
    }

    public void setmArrayPoiInfo(List<PoiIndoorInfo> list) {
        this.f1851c = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1849a);
        parcel.writeInt(this.f1850b);
    }
}
