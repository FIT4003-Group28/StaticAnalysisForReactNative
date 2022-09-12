package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
/* compiled from: PG */
/* renamed from: coer  reason: default package */
/* loaded from: classes5.dex */
public final class coer implements Parcelable.Creator<TogglingData> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TogglingData createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
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
                str3 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new TogglingData(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ TogglingData[] newArray(int i) {
        return new TogglingData[i];
    }
}
