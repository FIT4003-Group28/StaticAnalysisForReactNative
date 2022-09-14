package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
/* loaded from: classes.dex */
public class PlanNode implements Parcelable {
    public static final Parcelable.Creator<PlanNode> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    private LatLng f1889a;

    /* renamed from: b  reason: collision with root package name */
    private String f1890b;

    /* renamed from: c  reason: collision with root package name */
    private String f1891c;

    /* JADX INFO: Access modifiers changed from: protected */
    public PlanNode(Parcel parcel) {
        this.f1889a = null;
        this.f1890b = null;
        this.f1891c = null;
        this.f1889a = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.f1890b = parcel.readString();
        this.f1891c = parcel.readString();
    }

    PlanNode(LatLng latLng, String str, String str2) {
        this.f1889a = null;
        this.f1890b = null;
        this.f1891c = null;
        this.f1889a = latLng;
        this.f1890b = str;
        this.f1891c = str2;
    }

    public static PlanNode withCityCodeAndPlaceName(int i, String str) {
        return new PlanNode(null, String.valueOf(i), str);
    }

    public static PlanNode withCityNameAndPlaceName(String str, String str2) {
        return new PlanNode(null, str, str2);
    }

    public static PlanNode withLocation(LatLng latLng) {
        return new PlanNode(latLng, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCity() {
        return this.f1890b;
    }

    public LatLng getLocation() {
        return this.f1889a;
    }

    public String getName() {
        return this.f1891c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f1889a);
        parcel.writeString(this.f1890b);
        parcel.writeString(this.f1891c);
    }
}
