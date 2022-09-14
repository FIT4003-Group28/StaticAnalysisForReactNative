package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.RpcResponse;
/* compiled from: PG */
/* renamed from: cpjm  reason: default package */
/* loaded from: classes5.dex */
public final class cpjm implements Parcelable.Creator<RpcResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RpcResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                bArr = cnwm.s(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new RpcResponse(i, i2, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RpcResponse[] newArray(int i) {
        return new RpcResponse[i];
    }
}
