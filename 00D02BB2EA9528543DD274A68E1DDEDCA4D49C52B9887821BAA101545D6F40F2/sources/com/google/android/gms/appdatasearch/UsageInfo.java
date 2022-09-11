package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class UsageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UsageInfo> CREATOR = new cmqe();
    final DocumentId a;
    final long b;
    int c;
    public final String d;
    final DocumentContents e;
    final boolean f;
    int g;
    int h;
    public final String i;

    public UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3, String str2) {
        this.a = documentId;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = documentContents;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.h(parcel, 2, this.b);
        cnwn.g(parcel, 3, this.c);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.u(parcel, 5, this.e, i);
        cnwn.e(parcel, 6, this.f);
        cnwn.g(parcel, 7, this.g);
        cnwn.g(parcel, 8, this.h);
        cnwn.k(parcel, 9, this.i, false);
        cnwn.c(parcel, d);
    }
}