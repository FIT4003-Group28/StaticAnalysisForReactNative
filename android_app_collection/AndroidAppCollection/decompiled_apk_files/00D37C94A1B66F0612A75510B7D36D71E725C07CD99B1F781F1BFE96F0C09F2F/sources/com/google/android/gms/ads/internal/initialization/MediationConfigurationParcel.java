package com.google.android.gms.ads.internal.initialization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediationConfigurationParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pva(18);
    public final String a;
    public final Bundle b;

    public MediationConfigurationParcel(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.v(parcel, 2, this.b);
        tqj.n(parcel, m);
    }
}
