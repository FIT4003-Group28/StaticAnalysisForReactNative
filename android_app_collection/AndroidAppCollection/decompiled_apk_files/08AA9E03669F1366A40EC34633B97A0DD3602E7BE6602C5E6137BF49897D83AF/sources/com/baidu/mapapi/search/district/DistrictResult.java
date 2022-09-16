package com.baidu.mapapi.search.district;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DistrictResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<DistrictResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private LatLng f1807a;

    /* renamed from: b  reason: collision with root package name */
    private List<List<LatLng>> f1808b;

    /* renamed from: c  reason: collision with root package name */
    private int f1809c;

    /* renamed from: d  reason: collision with root package name */
    private String f1810d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DistrictResult() {
        this.f1807a = null;
        this.f1808b = null;
        this.f1810d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DistrictResult(Parcel parcel) {
        super(parcel);
        this.f1807a = null;
        this.f1808b = null;
        this.f1810d = null;
        this.f1807a = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.f1808b = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                this.f1808b.add(parcel.createTypedArrayList(LatLng.CREATOR));
            }
        }
        this.f1809c = parcel.readInt();
        this.f1810d = parcel.readString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DistrictResult(SearchResult.ERRORNO errorno) {
        super(errorno);
        this.f1807a = null;
        this.f1808b = null;
        this.f1810d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.f1809c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(LatLng latLng) {
        this.f1807a = latLng;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.f1810d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<List<LatLng>> list) {
        this.f1808b = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLng getCenterPt() {
        return this.f1807a;
    }

    public int getCityCode() {
        return this.f1809c;
    }

    public String getCityName() {
        return this.f1810d;
    }

    public List<List<LatLng>> getPolylines() {
        return this.f1808b;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f1807a, i);
        parcel.writeInt(this.f1808b == null ? 0 : this.f1808b.size());
        for (List<LatLng> list : this.f1808b) {
            parcel.writeTypedList(list);
        }
        parcel.writeInt(this.f1809c);
        parcel.writeString(this.f1810d);
    }
}
