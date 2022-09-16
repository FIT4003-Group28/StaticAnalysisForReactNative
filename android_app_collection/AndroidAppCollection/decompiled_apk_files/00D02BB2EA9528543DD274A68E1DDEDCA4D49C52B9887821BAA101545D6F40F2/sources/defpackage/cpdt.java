package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cpdt  reason: default package */
/* loaded from: classes5.dex */
public final class cpdt implements Parcelable.Creator<UdcCacheResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcCacheResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        int[] iArr = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                arrayList = cnwm.A(parcel, readInt, UdcCacheResponse.UdcSetting.CREATOR);
            } else if (b == 3) {
                iArr = cnwm.u(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new UdcCacheResponse(arrayList, iArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UdcCacheResponse[] newArray(int i) {
        return new UdcCacheResponse[i];
    }
}
