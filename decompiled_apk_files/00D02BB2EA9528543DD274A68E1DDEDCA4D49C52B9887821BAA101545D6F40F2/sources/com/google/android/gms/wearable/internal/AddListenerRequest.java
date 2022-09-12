package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AddListenerRequest> CREATOR = new cphj();
    public final cpix a;
    public final IntentFilter[] b;
    @dzsi
    public final String c;
    @dzsi
    public final String d;

    public AddListenerRequest(IBinder iBinder, IntentFilter[] intentFilterArr, @dzsi String str, @dzsi String str2) {
        cpix cpivVar;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (queryLocalInterface instanceof cpix) {
                cpivVar = (cpix) queryLocalInterface;
            } else {
                cpivVar = new cpiv(iBinder);
            }
            this.a = cpivVar;
        } else {
            this.a = null;
        }
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }

    public AddListenerRequest(cpjy cpjyVar) {
        this.a = cpjyVar;
        this.b = cpjyVar.b;
        this.c = null;
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cpix cpixVar = this.a;
        cnwn.p(parcel, 2, cpixVar == null ? null : cpixVar.asBinder());
        cnwn.x(parcel, 3, this.b, i);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.c(parcel, d);
    }
}
