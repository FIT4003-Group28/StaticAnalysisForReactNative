package com.baidu.mapapi.search.geocode;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.List;
/* loaded from: classes.dex */
public class ReverseGeoCodeResult extends SearchResult {
    public static final Parcelable.Creator<ReverseGeoCodeResult> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private String f1827a;

    /* renamed from: b  reason: collision with root package name */
    private String f1828b;

    /* renamed from: c  reason: collision with root package name */
    private AddressComponent f1829c;

    /* renamed from: d  reason: collision with root package name */
    private LatLng f1830d;
    private List<PoiInfo> e;

    /* loaded from: classes.dex */
    public static class AddressComponent implements Parcelable {
        public static final Parcelable.Creator<AddressComponent> CREATOR = new d();
        public String city;
        public String district;
        public String province;
        public String street;
        public String streetNumber;

        public AddressComponent() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public AddressComponent(Parcel parcel) {
            this.streetNumber = parcel.readString();
            this.street = parcel.readString();
            this.district = parcel.readString();
            this.city = parcel.readString();
            this.province = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.streetNumber);
            parcel.writeString(this.street);
            parcel.writeString(this.district);
            parcel.writeString(this.city);
            parcel.writeString(this.province);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReverseGeoCodeResult() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReverseGeoCodeResult(Parcel parcel) {
        super(parcel);
        this.f1827a = parcel.readString();
        this.f1828b = parcel.readString();
        this.f1829c = (AddressComponent) parcel.readParcelable(AddressComponent.class.getClassLoader());
        this.f1830d = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.e = parcel.createTypedArrayList(PoiInfo.CREATOR);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReverseGeoCodeResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(LatLng latLng) {
        this.f1830d = latLng;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AddressComponent addressComponent) {
        this.f1829c = addressComponent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.f1827a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<PoiInfo> list) {
        this.e = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        this.f1828b = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.f1828b;
    }

    public AddressComponent getAddressDetail() {
        return this.f1829c;
    }

    public String getBusinessCircle() {
        return this.f1827a;
    }

    public LatLng getLocation() {
        return this.f1830d;
    }

    public List<PoiInfo> getPoiList() {
        return this.e;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f1827a);
        parcel.writeString(this.f1828b);
        parcel.writeParcelable(this.f1829c, 0);
        parcel.writeValue(this.f1830d);
        parcel.writeTypedList(this.e);
    }
}
