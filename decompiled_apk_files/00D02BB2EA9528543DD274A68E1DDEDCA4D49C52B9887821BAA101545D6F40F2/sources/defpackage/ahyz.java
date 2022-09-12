package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.locationsharing.interprocess.api.InterfaceVersion;
/* compiled from: PG */
/* renamed from: ahyz  reason: default package */
/* loaded from: classes2.dex */
public final class ahyz implements Parcelable.Creator<InterfaceVersion> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InterfaceVersion createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 2) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new InterfaceVersion(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InterfaceVersion[] newArray(int i) {
        return new InterfaceVersion[i];
    }
}
