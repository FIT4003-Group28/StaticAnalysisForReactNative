package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcCacheRequest;
/* compiled from: PG */
/* renamed from: cpds  reason: default package */
/* loaded from: classes5.dex */
public final class cpds implements Parcelable.Creator<UdcCacheRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcCacheRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int[] iArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                iArr = cnwm.u(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new UdcCacheRequest(iArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcCacheRequest[] newArray(int i) {
        return new UdcCacheRequest[i];
    }
}
