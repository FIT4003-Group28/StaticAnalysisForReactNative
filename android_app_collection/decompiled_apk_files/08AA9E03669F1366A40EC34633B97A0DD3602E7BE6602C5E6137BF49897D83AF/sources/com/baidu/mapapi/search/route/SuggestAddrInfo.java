package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import java.util.List;
/* loaded from: classes.dex */
public class SuggestAddrInfo implements Parcelable {
    public static final Parcelable.Creator<SuggestAddrInfo> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    private List<PoiInfo> f1897a;

    /* renamed from: b  reason: collision with root package name */
    private List<PoiInfo> f1898b;

    /* renamed from: c  reason: collision with root package name */
    private List<List<PoiInfo>> f1899c;

    /* renamed from: d  reason: collision with root package name */
    private List<CityInfo> f1900d;
    private List<CityInfo> e;
    private List<List<CityInfo>> f;

    /* JADX INFO: Access modifiers changed from: protected */
    public SuggestAddrInfo() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SuggestAddrInfo(Parcel parcel) {
        this.f1897a = parcel.readArrayList(PoiInfo.class.getClassLoader());
        this.f1898b = parcel.readArrayList(PoiInfo.class.getClassLoader());
        this.f1899c = parcel.readArrayList(PoiInfo.class.getClassLoader());
        this.f1900d = parcel.readArrayList(CityInfo.class.getClassLoader());
        this.e = parcel.readArrayList(CityInfo.class.getClassLoader());
        this.f = parcel.readArrayList(CityInfo.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<PoiInfo> list) {
        this.f1897a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(List<PoiInfo> list) {
        this.f1898b = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(List<List<PoiInfo>> list) {
        this.f1899c = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(List<CityInfo> list) {
        this.f1900d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(List<CityInfo> list) {
        this.e = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(List<List<CityInfo>> list) {
        this.f = list;
    }

    public List<CityInfo> getSuggestEndCity() {
        return this.e;
    }

    public List<PoiInfo> getSuggestEndNode() {
        return this.f1898b;
    }

    public List<CityInfo> getSuggestStartCity() {
        return this.f1900d;
    }

    public List<PoiInfo> getSuggestStartNode() {
        return this.f1897a;
    }

    public List<List<CityInfo>> getSuggestWpCity() {
        return this.f;
    }

    public List<List<PoiInfo>> getSuggestWpNode() {
        return this.f1899c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f1897a);
        parcel.writeList(this.f1898b);
        parcel.writeList(this.f1899c);
        parcel.writeList(this.f1900d);
        parcel.writeList(this.e);
        parcel.writeList(this.f);
    }
}
