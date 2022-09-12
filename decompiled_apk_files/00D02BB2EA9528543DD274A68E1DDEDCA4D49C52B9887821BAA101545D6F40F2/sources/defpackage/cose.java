package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.internal.InitializationParams;
/* compiled from: PG */
/* renamed from: cose  reason: default package */
/* loaded from: classes5.dex */
public final class cose implements Parcelable.Creator<InitializationParams> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InitializationParams createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    j = cnwm.k(parcel, readInt);
                    break;
                case 2:
                    j2 = cnwm.k(parcel, readInt);
                    break;
                case 3:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 4:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 6:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 7:
                    bundle = cnwm.r(parcel, readInt);
                    break;
                case 8:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new InitializationParams(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InitializationParams[] newArray(int i) {
        return new InitializationParams[i];
    }
}
