package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.NotificationSettings;
/* compiled from: PG */
/* renamed from: cpap  reason: default package */
/* loaded from: classes5.dex */
public final class cpap implements Parcelable.Creator<NotificationSettings> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NotificationSettings createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 2) {
                z2 = cnwm.g(parcel, readInt);
            } else if (b == 3) {
                z3 = cnwm.g(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new NotificationSettings(z, z2, z3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NotificationSettings[] newArray(int i) {
        return new NotificationSettings[i];
    }
}
