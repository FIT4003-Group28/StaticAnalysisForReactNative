package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DocumentId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DocumentId> CREATOR = new cmpv();
    final String a;
    final String b;
    final String c;

    public DocumentId(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", this.a, this.b, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.c(parcel, d);
    }
}
