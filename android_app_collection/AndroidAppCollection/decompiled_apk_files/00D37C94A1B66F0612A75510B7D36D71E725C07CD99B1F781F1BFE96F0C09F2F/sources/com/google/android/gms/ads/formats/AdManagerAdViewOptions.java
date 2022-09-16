package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pva(6);
    public final boolean a;
    public final IBinder b;

    public AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.a = z;
        this.b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.o(parcel, 1, this.a);
        tqj.y(parcel, 2, this.b);
        tqj.n(parcel, m);
    }
}
