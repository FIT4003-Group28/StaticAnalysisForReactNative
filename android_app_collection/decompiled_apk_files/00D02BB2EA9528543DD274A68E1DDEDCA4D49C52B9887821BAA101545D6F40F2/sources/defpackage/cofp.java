package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.languageprofile.LanguagePreferenceParams;
/* compiled from: PG */
/* renamed from: cofp  reason: default package */
/* loaded from: classes5.dex */
public final class cofp implements Parcelable.Creator<LanguagePreferenceParams> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LanguagePreferenceParams createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        float f2 = -1.0f;
        int i = 1;
        int i2 = 2;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                f2 = cnwm.m(parcel, readInt);
            } else if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                i2 = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new LanguagePreferenceParams(f2, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LanguagePreferenceParams[] newArray(int i) {
        return new LanguagePreferenceParams[i];
    }
}
