package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cmrk  reason: default package */
/* loaded from: classes5.dex */
public final class cmrk implements Parcelable.Creator<TokenData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenData createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        Long l = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    l = cnwm.l(parcel, readInt);
                    break;
                case 4:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 5:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                case 6:
                    arrayList = cnwm.y(parcel, readInt);
                    break;
                case 7:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new TokenData(i, str, l, z, z2, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TokenData[] newArray(int i) {
        return new TokenData[i];
    }
}
