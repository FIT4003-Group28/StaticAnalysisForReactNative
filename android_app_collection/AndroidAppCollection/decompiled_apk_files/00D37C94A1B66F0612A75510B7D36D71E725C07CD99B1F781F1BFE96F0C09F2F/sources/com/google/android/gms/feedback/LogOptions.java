package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qxv(9);
    String a;
    boolean b;

    public LogOptions(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.o(parcel, 3, this.b);
        tqj.n(parcel, m);
    }
}
