package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ThemeSettings> CREATOR = new coda();
    public int a;
    int b;

    public ThemeSettings() {
        this(3, 0);
    }

    public ThemeSettings(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
