package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetContactlessSetupStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetContactlessSetupStatusResponse> CREATOR = new cpag();
    ContactlessSetupItem[] a;

    public GetContactlessSetupStatusResponse(ContactlessSetupItem[] contactlessSetupItemArr) {
        this.a = contactlessSetupItemArr;
    }

    public final String toString() {
        ContactlessSetupItem[] contactlessSetupItemArr;
        cnvu b = cnvv.b(this);
        for (ContactlessSetupItem contactlessSetupItem : this.a) {
            b.a("type", Integer.valueOf(contactlessSetupItem.a));
            b.a("status", Integer.valueOf(contactlessSetupItem.b));
        }
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.x(parcel, 1, this.a, i);
        cnwn.c(parcel, d);
    }
}
