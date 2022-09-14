package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class WalkingRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<WalkingRouteResult> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    private List<WalkingRouteLine> f1917a;

    /* renamed from: b  reason: collision with root package name */
    private TaxiInfo f1918b;

    /* renamed from: c  reason: collision with root package name */
    private SuggestAddrInfo f1919c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalkingRouteResult() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WalkingRouteResult(Parcel parcel) {
        this.f1917a = new ArrayList();
        parcel.readList(this.f1917a, WalkingRouteLine.class.getClassLoader());
        this.f1918b = (TaxiInfo) parcel.readParcelable(TaxiInfo.class.getClassLoader());
        this.f1919c = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WalkingRouteResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(TaxiInfo taxiInfo) {
        this.f1918b = taxiInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SuggestAddrInfo suggestAddrInfo) {
        this.f1919c = suggestAddrInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<WalkingRouteLine> list) {
        this.f1917a = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkingRouteLine> getRouteLines() {
        return this.f1917a;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.f1919c;
    }

    public TaxiInfo getTaxiInfo() {
        return this.f1918b;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f1917a);
        parcel.writeParcelable(this.f1918b, 1);
        parcel.writeParcelable(this.f1919c, 1);
    }
}
