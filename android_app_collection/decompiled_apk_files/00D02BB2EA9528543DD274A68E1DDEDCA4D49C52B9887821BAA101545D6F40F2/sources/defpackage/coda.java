package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ThemeSettings;
/* compiled from: PG */
/* renamed from: coda  reason: default package */
/* loaded from: classes5.dex */
public final class coda implements Parcelable.Creator<ThemeSettings> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ThemeSettings createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                i2 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ThemeSettings(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ThemeSettings[] newArray(int i) {
        return new ThemeSettings[i];
    }
}
