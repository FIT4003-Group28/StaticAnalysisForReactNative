package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LanguagePreferenceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LanguagePreferenceParams> CREATOR = new cofp();
    public final float a;
    public final int b;
    public final int c;

    public LanguagePreferenceParams(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguagePreferenceParams) {
            LanguagePreferenceParams languagePreferenceParams = (LanguagePreferenceParams) obj;
            if (cnvv.a(Float.valueOf(this.a), Float.valueOf(languagePreferenceParams.a)) && cnvv.a(Integer.valueOf(this.b), Integer.valueOf(languagePreferenceParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.i(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.g(parcel, 3, this.c);
        cnwn.c(parcel, d);
    }
}
