package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class BikingRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<BikingRouteLine> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private List<BikingRouteLine> f1870a;

    /* renamed from: b  reason: collision with root package name */
    private SuggestAddrInfo f1871b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BikingRouteResult() {
    }

    protected BikingRouteResult(Parcel parcel) {
        this.f1870a = new ArrayList();
        parcel.readList(this.f1870a, BikingRouteLine.class.getClassLoader());
        this.f1871b = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BikingRouteResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SuggestAddrInfo suggestAddrInfo) {
        this.f1871b = suggestAddrInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<BikingRouteLine> list) {
        this.f1870a = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<BikingRouteLine> getRouteLines() {
        return this.f1870a;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.f1871b;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f1870a);
        parcel.writeParcelable(this.f1871b, 1);
    }
}
