package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.reporting.SendDataRequest;
/* compiled from: PG */
/* renamed from: coqm  reason: default package */
/* loaded from: classes5.dex */
public final class coqm implements Parcelable.Creator<SendDataRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SendDataRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                bArr = cnwm.s(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new SendDataRequest(str, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SendDataRequest[] newArray(int i) {
        return new SendDataRequest[i];
    }
}
