package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qpm(4);
    public Intent a;

    public CloudMessage(Intent intent) {
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.E(parcel, 1, this.a, i);
        tqj.n(parcel, m);
    }
}
