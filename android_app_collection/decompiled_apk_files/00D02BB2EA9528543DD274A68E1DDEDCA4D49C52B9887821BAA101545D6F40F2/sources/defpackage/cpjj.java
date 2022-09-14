package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.PackageStorageInfo;
/* compiled from: PG */
/* renamed from: cpjj  reason: default package */
/* loaded from: classes5.dex */
public final class cpjj implements Parcelable.Creator<PackageStorageInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PackageStorageInfo createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                j = cnwm.k(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PackageStorageInfo(str, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PackageStorageInfo[] newArray(int i) {
        return new PackageStorageInfo[i];
    }
}
