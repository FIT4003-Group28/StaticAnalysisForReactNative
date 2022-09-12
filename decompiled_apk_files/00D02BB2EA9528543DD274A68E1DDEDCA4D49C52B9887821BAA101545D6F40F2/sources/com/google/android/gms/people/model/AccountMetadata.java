package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AccountMetadata extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AccountMetadata> CREATOR = new cowt();
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public AccountMetadata() {
    }

    public AccountMetadata(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 2, this.a);
        cnwn.e(parcel, 3, this.b);
        cnwn.e(parcel, 4, this.c);
        cnwn.e(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }
}
