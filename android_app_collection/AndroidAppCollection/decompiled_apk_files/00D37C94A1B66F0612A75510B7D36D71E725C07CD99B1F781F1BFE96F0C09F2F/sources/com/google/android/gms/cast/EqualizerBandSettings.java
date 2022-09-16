package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class EqualizerBandSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qjl(2);
    public final float a;
    public final float b;
    public final float c;

    public EqualizerBandSettings(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EqualizerBandSettings)) {
            return false;
        }
        EqualizerBandSettings equalizerBandSettings = (EqualizerBandSettings) obj;
        return this.a == equalizerBandSettings.a && this.b == equalizerBandSettings.b && this.c == equalizerBandSettings.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.q(parcel, 2, this.a);
        tqj.q(parcel, 3, this.b);
        tqj.q(parcel, 4, this.c);
        tqj.n(parcel, m);
    }
}
