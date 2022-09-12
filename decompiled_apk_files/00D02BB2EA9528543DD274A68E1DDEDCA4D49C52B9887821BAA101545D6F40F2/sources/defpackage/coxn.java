package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: coxn  reason: default package */
/* loaded from: classes5.dex */
public final class coxn implements Parcelable.Creator<Flag> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Flag createFromParcel(Parcel parcel) {
        int i;
        int f = cnwm.f(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        long j = 0;
        String str2 = null;
        byte[] bArr = null;
        double d = 0.0d;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    i = 2;
                    break;
                case 3:
                    j = cnwm.k(parcel, readInt);
                    i = 3;
                    break;
                case 4:
                    z = cnwm.g(parcel, readInt);
                    i = 4;
                    break;
                case 5:
                    d = cnwm.n(parcel, readInt);
                    i = 5;
                    break;
                case 6:
                    str2 = cnwm.o(parcel, readInt);
                    i = 6;
                    break;
                case 7:
                    bArr = cnwm.s(parcel, readInt);
                    i = 7;
                    break;
                case 8:
                    i2 = cnwm.i(parcel, readInt);
                    i = 8;
                    break;
                case 9:
                    i3 = cnwm.i(parcel, readInt);
                    i = 9;
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    continue;
            }
            hashSet.add(Integer.valueOf(i));
        }
        if (parcel.dataPosition() == f) {
            return new Flag(hashSet, str, j, z, d, str2, bArr, i2, i3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(f);
        throw new cnwl(sb.toString(), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Flag[] newArray(int i) {
        return new Flag[i];
    }
}
