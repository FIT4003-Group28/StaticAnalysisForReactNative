package com.google.android.gms.car.display;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CarDisplay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarDisplay> CREATOR = new cnes();
    public final CarDisplayId a;
    public final int b;
    public final int c;
    public final Point d;
    public final Rect e;
    public final int f;

    public CarDisplay(CarDisplayId carDisplayId, int i, int i2, Point point, Rect rect, int i3) {
        this.a = carDisplayId;
        this.b = i;
        this.c = i2;
        this.d = point;
        this.e = rect;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarDisplay)) {
            return false;
        }
        CarDisplay carDisplay = (CarDisplay) obj;
        return carDisplay.a.equals(this.a) && carDisplay.b == this.b && carDisplay.c == this.c && Objects.equals(carDisplay.d, this.d) && Objects.equals(carDisplay.e, this.e) && carDisplay.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int i3 = this.f;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 144 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("CarDisplay{carDisplayId=");
        sb.append(valueOf);
        sb.append(", carDisplayType=");
        sb.append(i);
        sb.append(", displayDpi=");
        sb.append(i2);
        sb.append(", displayDimensions=");
        sb.append(valueOf2);
        sb.append(", stableInsets=");
        sb.append(valueOf3);
        sb.append(", initialContentType=");
        sb.append(i3);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.g(parcel, 2, this.b);
        cnwn.g(parcel, 3, this.c);
        cnwn.u(parcel, 4, this.d, i);
        cnwn.u(parcel, 5, this.e, i);
        cnwn.g(parcel, 6, this.f);
        cnwn.c(parcel, d);
    }
}
