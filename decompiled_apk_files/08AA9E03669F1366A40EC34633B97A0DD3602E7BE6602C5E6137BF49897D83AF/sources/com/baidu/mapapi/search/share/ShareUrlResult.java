package com.baidu.mapapi.search.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
/* loaded from: classes.dex */
public class ShareUrlResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<ShareUrlResult> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f1930a;

    /* renamed from: b  reason: collision with root package name */
    private int f1931b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShareUrlResult() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareUrlResult(Parcel parcel) {
        this.f1930a = parcel.readString();
        this.f1931b = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShareUrlResult(SearchResult.ERRORNO errorno) {
        super(errorno);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        this.f1931b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.f1930a = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getUrl() {
        return this.f1930a;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1930a);
        parcel.writeInt(this.f1931b);
    }
}
