package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.GetFelicaTosAcceptanceResponse;
/* compiled from: PG */
/* renamed from: cpah  reason: default package */
/* loaded from: classes5.dex */
public final class cpah implements Parcelable.Creator<GetFelicaTosAcceptanceResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetFelicaTosAcceptanceResponse createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 1) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new GetFelicaTosAcceptanceResponse(z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetFelicaTosAcceptanceResponse[] newArray(int i) {
        return new GetFelicaTosAcceptanceResponse[i];
    }
}
