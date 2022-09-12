package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
/* compiled from: PG */
/* renamed from: cpan  reason: default package */
/* loaded from: classes5.dex */
public final class cpan implements Parcelable.Creator<InStoreCvmConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InStoreCvmConfig createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 3) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                i3 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new InStoreCvmConfig(z, i, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InStoreCvmConfig[] newArray(int i) {
        return new InStoreCvmConfig[i];
    }
}
