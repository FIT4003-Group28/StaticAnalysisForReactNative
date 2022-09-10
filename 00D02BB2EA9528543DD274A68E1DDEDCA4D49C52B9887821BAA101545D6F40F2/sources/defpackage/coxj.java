package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
/* compiled from: PG */
/* renamed from: coxj  reason: default package */
/* loaded from: classes5.dex */
public final class coxj implements Parcelable.Creator<Configurations> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Configurations createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        Configuration[] configurationArr = null;
        byte[] bArr = null;
        long j = 0;
        boolean z = false;
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
                    configurationArr = (Configuration[]) cnwm.z(parcel, readInt, Configuration.CREATOR);
                    break;
                case 5:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 6:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 7:
                    j = cnwm.k(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new Configurations(str, str2, configurationArr, z, bArr, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Configurations[] newArray(int i) {
        return new Configurations[i];
    }
}
