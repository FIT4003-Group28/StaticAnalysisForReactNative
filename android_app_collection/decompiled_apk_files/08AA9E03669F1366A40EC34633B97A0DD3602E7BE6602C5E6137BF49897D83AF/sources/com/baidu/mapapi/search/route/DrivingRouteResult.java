package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class DrivingRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<DrivingRouteResult> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    private List<DrivingRouteLine> f1885a;

    /* renamed from: b  reason: collision with root package name */
    private List<TaxiInfo> f1886b;

    /* renamed from: c  reason: collision with root package name */
    private TaxiInfo f1887c;

    /* renamed from: d  reason: collision with root package name */
    private SuggestAddrInfo f1888d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DrivingRouteResult() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public DrivingRouteResult(Parcel parcel) {
        this.f1885a = new ArrayList();
        parcel.readTypedList(this.f1885a, DrivingRouteLine.CREATOR);
        this.f1886b = new ArrayList();
        parcel.readTypedList(this.f1886b, TaxiInfo.CREATOR);
        this.f1888d = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DrivingRouteResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SuggestAddrInfo suggestAddrInfo) {
        this.f1888d = suggestAddrInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<DrivingRouteLine> list) {
        this.f1885a = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DrivingRouteLine> getRouteLines() {
        return this.f1885a;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.f1888d;
    }

    @Deprecated
    public TaxiInfo getTaxiInfo() {
        return this.f1887c;
    }

    public List<TaxiInfo> getTaxiInfos() {
        return this.f1886b;
    }

    public void setTaxiInfos(List<TaxiInfo> list) {
        this.f1886b = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1885a);
        parcel.writeTypedList(this.f1886b);
        parcel.writeParcelable(this.f1888d, 1);
    }
}
