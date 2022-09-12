package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.languageprofile.LanguagePreference;
/* compiled from: PG */
/* renamed from: cofo  reason: default package */
/* loaded from: classes5.dex */
public final class cofo implements Parcelable.Creator<LanguagePreference> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LanguagePreference createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        float f2 = 0.0f;
        String str = null;
        float f3 = 0.0f;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 2) {
                f2 = cnwm.m(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                f3 = cnwm.m(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new LanguagePreference(str, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LanguagePreference[] newArray(int i) {
        return new LanguagePreference[i];
    }
}
