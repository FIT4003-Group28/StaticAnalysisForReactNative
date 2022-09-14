package com.baidu.platform.comjni.tools;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ParcelItem implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public static final Parcelable.Creator<ParcelItem> f2153a = new b();

    /* renamed from: b  reason: collision with root package name */
    private Bundle f2154b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBundle() {
        return this.f2154b;
    }

    public void setBundle(Bundle bundle) {
        this.f2154b = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f2154b);
    }
}
