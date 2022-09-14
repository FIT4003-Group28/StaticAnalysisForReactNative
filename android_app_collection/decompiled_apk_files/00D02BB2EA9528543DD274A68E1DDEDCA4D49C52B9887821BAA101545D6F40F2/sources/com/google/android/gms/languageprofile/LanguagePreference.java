package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LanguagePreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LanguagePreference> CREATOR = new cofo();
    public final Locale a;
    public final float b;
    public final float c;

    public LanguagePreference(String str, float f, float f2) {
        this.a = cofz.a(str);
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguagePreference) {
            LanguagePreference languagePreference = (LanguagePreference) obj;
            if (cnvv.a(this.a, languagePreference.a) && cnvv.a(Float.valueOf(this.b), Float.valueOf(languagePreference.b)) && cnvv.a(Float.valueOf(this.c), Float.valueOf(languagePreference.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, cofz.b(this.a), false);
        cnwn.i(parcel, 2, this.b);
        cnwn.i(parcel, 3, this.c);
        cnwn.c(parcel, d);
    }
}
