package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new cojk();
    public static final float[] a = {Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    final float[] b;
    int c;
    int d;
    float e;
    float f;
    long g;
    byte h;
    float i;

    public DeviceOrientation() {
        this.b = new float[4];
        this.c = -1;
        this.d = -1;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = 0L;
        this.h = (byte) 0;
        this.i = Float.NaN;
    }

    public final boolean a() {
        return (this.h & 1) != 0;
    }

    public final boolean b() {
        return (this.h & 2) != 0;
    }

    public final float c() {
        if (d()) {
            return this.e;
        }
        return Float.NaN;
    }

    public final boolean d() {
        return (this.h & 4) != 0;
    }

    public final float e() {
        if (f()) {
            return this.f;
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        return this.h == deviceOrientation.h && (!a() || this.c == deviceOrientation.c) && ((!b() || this.d == deviceOrientation.d) && ((!d() || this.e == deviceOrientation.e) && ((!f() || this.f == deviceOrientation.f) && this.g == deviceOrientation.g && (!h() || Arrays.equals(this.b, deviceOrientation.b)))));
    }

    public final boolean f() {
        return (this.h & 8) != 0;
    }

    public final boolean g() {
        return (this.h & 32) != 0;
    }

    public final boolean h() {
        return (this.h & 16) != 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Long.valueOf(this.g), this.b, Byte.valueOf(this.h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation{");
        if (h()) {
            String valueOf = String.valueOf(Arrays.toString(this.b));
            sb.append(valueOf.length() != 0 ? "mAttitude=".concat(valueOf) : new String("mAttitude="));
        }
        if (a()) {
            int i = this.c;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append(", mAttitudeConfidence=");
            sb2.append(i);
            sb.append(sb2.toString());
        }
        if (b()) {
            int i2 = this.d;
            StringBuilder sb3 = new StringBuilder(28);
            sb3.append(", mMagConfidence=");
            sb3.append(i2);
            sb.append(sb3.toString());
        }
        if (d()) {
            float f = this.e;
            StringBuilder sb4 = new StringBuilder(33);
            sb4.append(", mHeadingDegrees=");
            sb4.append(f);
            sb.append(sb4.toString());
        }
        if (f()) {
            float f2 = this.f;
            StringBuilder sb5 = new StringBuilder(38);
            sb5.append(", mHeadingErrorDegrees=");
            sb5.append(f2);
            sb.append(sb5.toString());
        }
        if (g()) {
            float f3 = this.i;
            StringBuilder sb6 = new StringBuilder(56);
            sb6.append(", mConservativeHeadingErrorVonMisesKappa=");
            sb6.append(f3);
            sb.append(sb6.toString());
        }
        long j = this.g;
        StringBuilder sb7 = new StringBuilder(42);
        sb7.append(", mElapsedRealtimeNs=");
        sb7.append(j);
        sb7.append('}');
        sb.append(sb7.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.o(parcel, 1, h() ? this.b : a);
        int i2 = -1;
        cnwn.g(parcel, 2, a() ? this.c : -1);
        if (b()) {
            i2 = this.d;
        }
        cnwn.g(parcel, 3, i2);
        cnwn.i(parcel, 4, c());
        cnwn.i(parcel, 5, e());
        cnwn.h(parcel, 6, this.g);
        cnwn.f(parcel, 7, this.h);
        cnwn.i(parcel, 8, g() ? this.i : Float.NaN);
        cnwn.c(parcel, d);
    }

    public DeviceOrientation(float[] fArr, int i, int i2, float f, float f2, long j, byte b, float f3) {
        float[] fArr2 = new float[4];
        this.b = fArr2;
        this.c = -1;
        this.d = -1;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = 0L;
        this.h = (byte) 0;
        this.i = Float.NaN;
        if (fArr.length == 4) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.c = i;
            this.d = i2;
            this.e = f;
            this.f = f2;
            this.i = f3;
            this.g = j;
            this.h = b;
            return;
        }
        throw new IllegalArgumentException("Input attitude array should be of length 4.");
    }
}
