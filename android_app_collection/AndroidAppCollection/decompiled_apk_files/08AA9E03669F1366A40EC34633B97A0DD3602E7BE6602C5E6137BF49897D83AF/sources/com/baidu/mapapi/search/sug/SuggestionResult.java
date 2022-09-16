package com.baidu.mapapi.search.sug;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class SuggestionResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<SuggestionResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<SuggestionInfo> f1937a;

    /* loaded from: classes.dex */
    public static class SuggestionInfo implements Parcelable {
        public static final Parcelable.Creator<SuggestionInfo> CREATOR = new b();
        public String city;
        public String district;
        public String key;
        public LatLng pt;
        public String uid;

        /* JADX INFO: Access modifiers changed from: protected */
        public SuggestionInfo() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public SuggestionInfo(Parcel parcel) {
            this.key = parcel.readString();
            this.city = parcel.readString();
            this.district = parcel.readString();
            this.pt = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
            this.uid = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.key);
            parcel.writeString(this.city);
            parcel.writeString(this.district);
            parcel.writeValue(this.pt);
            parcel.writeString(this.uid);
        }
    }

    public SuggestionResult() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SuggestionResult(Parcel parcel) {
        this.f1937a = parcel.readArrayList(SuggestionInfo.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SuggestionResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ArrayList<SuggestionInfo> arrayList) {
        this.f1937a = arrayList;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<SuggestionInfo> getAllSuggestions() {
        return this.f1937a;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f1937a);
    }
}
