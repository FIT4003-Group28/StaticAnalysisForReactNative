package com.google.android.gms.languageprofile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LanguageFluency extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LanguageFluency> CREATOR = new cofn();
    public final float a;
    public final float b;
    private final Locale c;

    public LanguageFluency(String str, float f, float f2) {
        this.c = cofz.a(str);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguageFluency) {
            LanguageFluency languageFluency = (LanguageFluency) obj;
            if (cnvv.a(this.c, languageFluency.c) && cnvv.a(Float.valueOf(this.a), Float.valueOf(languageFluency.a)) && cnvv.a(Float.valueOf(this.b), Float.valueOf(languageFluency.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Float.valueOf(this.a), Float.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, cofz.b(this.c), false);
        cnwn.i(parcel, 2, this.a);
        cnwn.i(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
