package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qjl(4);
    public boolean a;
    public String b;
    public boolean c;
    public CredentialsData d;

    public LaunchOptions() {
        this(false, qpl.d(Locale.getDefault()), false, null);
    }

    public LaunchOptions(boolean z, String str, boolean z2, CredentialsData credentialsData) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = credentialsData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.a == launchOptions.a && qpl.j(this.b, launchOptions.b) && this.c == launchOptions.c && qpl.j(this.d, launchOptions.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.o(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.o(parcel, 4, this.c);
        tqj.E(parcel, 5, this.d, i);
        tqj.n(parcel, m);
    }
}
