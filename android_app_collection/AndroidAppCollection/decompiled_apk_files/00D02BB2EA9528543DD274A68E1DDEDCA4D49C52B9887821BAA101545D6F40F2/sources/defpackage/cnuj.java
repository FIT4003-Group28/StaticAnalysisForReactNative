package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
/* compiled from: PG */
/* renamed from: cnuj  reason: default package */
/* loaded from: classes5.dex */
public final class cnuj implements Parcelable.Creator<ClientIdentity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClientIdentity createFromParcel(Parcel parcel) {
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
        return new ClientIdentity(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClientIdentity[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
