package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pva(7);
    public final boolean a;
    public final IBinder b;
    private final qbr c;

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        qbr qbrVar;
        this.a = z;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof qbr) {
                qbrVar = (qbr) queryLocalInterface;
            } else {
                qbrVar = new qbp(iBinder);
            }
        } else {
            qbrVar = null;
        }
        this.c = qbrVar;
        this.b = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.o(parcel, 1, this.a);
        qbr qbrVar = this.c;
        tqj.y(parcel, 2, qbrVar == null ? null : qbrVar.asBinder());
        tqj.y(parcel, 3, this.b);
        tqj.n(parcel, m);
    }
}
