package com.baidu.mapapi.search.geocode;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;
/* loaded from: classes.dex */
public class GeoCodeResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<GeoCodeResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private LatLng f1819a;

    /* renamed from: b  reason: collision with root package name */
    private String f1820b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeoCodeResult() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public GeoCodeResult(Parcel parcel) {
        this.f1819a = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.f1820b = parcel.readString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeoCodeResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(LatLng latLng) {
        this.f1819a = latLng;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.f1820b;
    }

    public LatLng getLocation() {
        return this.f1819a;
    }

    public void setAddress(String str) {
        this.f1820b = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f1819a);
        parcel.writeString(this.f1820b);
    }
}
