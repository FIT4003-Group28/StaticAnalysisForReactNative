package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class EqualizerSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qjl(3);
    public final EqualizerBandSettings a;
    public final EqualizerBandSettings b;

    public EqualizerSettings(EqualizerBandSettings equalizerBandSettings, EqualizerBandSettings equalizerBandSettings2) {
        this.a = equalizerBandSettings;
        this.b = equalizerBandSettings2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EqualizerSettings)) {
            return false;
        }
        EqualizerSettings equalizerSettings = (EqualizerSettings) obj;
        return qpl.j(this.a, equalizerSettings.a) && qpl.j(this.b, equalizerSettings.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.E(parcel, 2, this.a, i);
        tqj.E(parcel, 3, this.b, i);
        tqj.n(parcel, m);
    }
}
