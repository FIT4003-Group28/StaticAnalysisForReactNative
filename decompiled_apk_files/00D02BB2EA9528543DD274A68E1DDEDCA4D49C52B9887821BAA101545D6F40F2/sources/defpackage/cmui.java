package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenRequest;
/* compiled from: PG */
/* renamed from: cmui  reason: default package */
/* loaded from: classes5.dex */
public final class cmui implements Parcelable.Creator<ClearTokenRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClearTokenRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ClearTokenRequest(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClearTokenRequest[] newArray(int i) {
        return new ClearTokenRequest[i];
    }
}
