package com.baidu.mapapi.search.poi;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;
/* loaded from: classes.dex */
public class PoiResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<PoiResult> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private int f1856a;

    /* renamed from: b  reason: collision with root package name */
    private int f1857b;

    /* renamed from: c  reason: collision with root package name */
    private int f1858c;

    /* renamed from: d  reason: collision with root package name */
    private int f1859d;
    private List<PoiInfo> e;
    private List<CityInfo> f;
    private List<PoiAddrInfo> g;
    private boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PoiResult() {
        this.f1856a = 0;
        this.f1857b = 0;
        this.f1858c = 0;
        this.f1859d = 0;
        this.h = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PoiResult(Parcel parcel) {
        this.f1856a = 0;
        this.f1857b = 0;
        this.f1858c = 0;
        this.f1859d = 0;
        this.h = false;
        this.f1856a = parcel.readInt();
        this.f1857b = parcel.readInt();
        this.f1858c = parcel.readInt();
        this.f1859d = parcel.readInt();
        this.e = parcel.readArrayList(PoiInfo.class.getClassLoader());
        this.f = parcel.readArrayList(CityInfo.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PoiResult(SearchResult.ERRORNO errorno) {
        super(errorno);
        this.f1856a = 0;
        this.f1857b = 0;
        this.f1858c = 0;
        this.f1859d = 0;
        this.h = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.f1856a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<PoiInfo> list) {
        this.e = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.h = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        this.f1857b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(List<PoiAddrInfo> list) {
        this.g = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        this.f1858c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(List<CityInfo> list) {
        this.f = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        this.f1859d = i;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<PoiAddrInfo> getAllAddr() {
        return this.g;
    }

    public List<PoiInfo> getAllPoi() {
        return this.e;
    }

    public int getCurrentPageCapacity() {
        return this.f1858c;
    }

    public int getCurrentPageNum() {
        return this.f1856a;
    }

    public List<CityInfo> getSuggestCityList() {
        return this.f;
    }

    public int getTotalPageNum() {
        return this.f1857b;
    }

    public int getTotalPoiNum() {
        return this.f1859d;
    }

    public boolean isHasAddrInfo() {
        return this.h;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1856a);
        parcel.writeInt(this.f1857b);
        parcel.writeInt(this.f1858c);
        parcel.writeInt(this.f1859d);
        parcel.writeList(this.e);
        parcel.writeList(this.f);
    }
}
