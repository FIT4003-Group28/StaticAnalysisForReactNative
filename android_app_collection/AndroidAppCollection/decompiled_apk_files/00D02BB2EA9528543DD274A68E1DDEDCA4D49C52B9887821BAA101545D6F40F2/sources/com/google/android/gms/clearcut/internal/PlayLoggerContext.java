package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes.dex */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PlayLoggerContext> CREATOR = new cnli();
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final int i;
    @dzsi
    public final Integer j;
    public final boolean k;

    public PlayLoggerContext(String str, int i, int i2, String str2, @dzsi String str3, boolean z, int i3) {
        cnwc.a(str);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.g = str2;
        this.d = str3;
        this.e = null;
        this.f = !z;
        this.h = z;
        int i4 = i3 - 1;
        if (i3 != 0) {
            this.i = i4;
            this.j = null;
            this.k = false;
            return;
        }
        throw null;
    }

    public PlayLoggerContext(String str, int i, int i2, @dzsi String str2, @dzsi String str3, boolean z, String str4, boolean z2, int i3, @dzsi Integer num, boolean z3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = i3;
        this.j = num;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            if (cnvv.a(this.a, playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && cnvv.a(this.g, playLoggerContext.g) && cnvv.a(this.d, playLoggerContext.d) && cnvv.a(this.e, playLoggerContext.e) && this.f == playLoggerContext.f && this.h == playLoggerContext.h && this.i == playLoggerContext.i && this.j == playLoggerContext.j && this.k == playLoggerContext.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.g, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j, Boolean.valueOf(this.k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.g + ",uploadAccount=" + this.d + ",loggingId=" + this.e + ",logAndroidId=" + this.f + ",isAnonymous=" + this.h + ",qosTier=" + this.i + ",appMobilespecId=" + this.j + ",scrubMccMnc=" + this.k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.g(parcel, 3, this.b);
        cnwn.g(parcel, 4, this.c);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.k(parcel, 6, this.e, false);
        cnwn.e(parcel, 7, this.f);
        cnwn.k(parcel, 8, this.g, false);
        cnwn.e(parcel, 9, this.h);
        cnwn.g(parcel, 10, this.i);
        cnwn.s(parcel, 11, this.j);
        cnwn.e(parcel, 12, this.k);
        cnwn.c(parcel, d);
    }
}
