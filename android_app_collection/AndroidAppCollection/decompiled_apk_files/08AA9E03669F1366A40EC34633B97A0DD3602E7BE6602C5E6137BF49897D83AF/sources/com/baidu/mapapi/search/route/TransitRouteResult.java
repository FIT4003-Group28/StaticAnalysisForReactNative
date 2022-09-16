package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class TransitRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<TransitRouteResult> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    private TaxiInfo f1910a;

    /* renamed from: b  reason: collision with root package name */
    private List<TransitRouteLine> f1911b;

    /* renamed from: c  reason: collision with root package name */
    private SuggestAddrInfo f1912c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransitRouteResult() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TransitRouteResult(Parcel parcel) {
        this.f1910a = (TaxiInfo) parcel.readParcelable(TaxiInfo.class.getClassLoader());
        this.f1911b = new ArrayList();
        parcel.readList(this.f1911b, TransitRouteLine.class.getClassLoader());
        this.f1912c = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransitRouteResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(TaxiInfo taxiInfo) {
        this.f1910a = taxiInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(SuggestAddrInfo suggestAddrInfo) {
        this.f1912c = suggestAddrInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<TransitRouteLine> list) {
        this.f1911b = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<TransitRouteLine> getRouteLines() {
        return this.f1911b;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.f1912c;
    }

    public TaxiInfo getTaxiInfo() {
        return this.f1910a;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1910a, 1);
        parcel.writeList(this.f1911b);
        parcel.writeParcelable(this.f1912c, 1);
    }
}
