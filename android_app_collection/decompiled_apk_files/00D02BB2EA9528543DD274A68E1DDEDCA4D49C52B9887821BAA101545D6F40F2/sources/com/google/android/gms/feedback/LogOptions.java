package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogOptions> CREATOR = new cocz();
    String a;
    boolean b;

    public LogOptions(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.e(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
