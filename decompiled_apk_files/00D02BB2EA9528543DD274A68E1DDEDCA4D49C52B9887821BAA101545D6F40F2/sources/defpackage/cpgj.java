package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
/* compiled from: PG */
/* renamed from: cpgj  reason: default package */
/* loaded from: classes5.dex */
public final class cpgj implements Parcelable.Creator<ConnectionConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionConfiguration createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 5:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 6:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 7:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 8:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 9:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                case 10:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConnectionConfiguration[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
