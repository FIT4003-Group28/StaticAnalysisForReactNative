package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.herrevad.NetworkQualityReport;
/* compiled from: PG */
/* renamed from: coez  reason: default package */
/* loaded from: classes5.dex */
public final class coez implements Parcelable.Creator<NetworkQualityReport> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NetworkQualityReport createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 4:
                    j2 = cnwm.k(parcel, readInt);
                    break;
                case 5:
                    j3 = cnwm.k(parcel, readInt);
                    break;
                case 6:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 7:
                    bundle = cnwm.r(parcel, readInt);
                    break;
                case 8:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 9:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                case 10:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 11:
                    z3 = cnwm.g(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new NetworkQualityReport(i, j, j2, j3, i2, bundle, z, i3, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NetworkQualityReport[] newArray(int i) {
        return new NetworkQualityReport[i];
    }
}
