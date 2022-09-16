package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alwc(12);
    public Bundle a;
    public Map b;

    public RemoteMessage(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.v(parcel, 2, this.a);
        tqj.n(parcel, m);
    }
}
