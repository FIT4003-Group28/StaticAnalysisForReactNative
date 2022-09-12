package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CarUiInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarUiInfo> CREATOR = new cmww();
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int[] e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public int j;

    CarUiInfo() {
    }

    public CarUiInfo(boolean z, boolean z2, boolean z3, boolean z4, int[] iArr, boolean z5, int i, boolean z6, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = iArr;
        this.f = z5;
        this.g = i;
        this.h = z6;
        this.i = i2;
        this.j = i3;
    }

    public final String toString() {
        return String.format(Locale.US, "CarUiInfo (hasRotaryController: %b, touchscreenType: %d, hasSearchButton: %b, hasTouchpadForUiNavigation: %b, hasDpad: %b, isTouchpadUiAbsolute: %b, touchpadMoveThresholdPx: %d, touchpadMultimoveThresholdPx: %d)", Boolean.valueOf(this.a), Integer.valueOf(this.g), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.f), Boolean.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 1, this.a);
        cnwn.e(parcel, 2, this.b);
        cnwn.e(parcel, 3, this.c);
        cnwn.e(parcel, 4, this.d);
        cnwn.q(parcel, 5, this.e);
        cnwn.e(parcel, 6, this.f);
        cnwn.g(parcel, 7, this.g);
        cnwn.e(parcel, 8, this.h);
        cnwn.g(parcel, 9, this.i);
        cnwn.g(parcel, 10, this.j);
        cnwn.c(parcel, d);
    }
}
