package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TouchEventCompleteData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TouchEventCompleteData> CREATOR = new cmzi();
    public final int a;
    public final Rect b;
    public final int c;

    public TouchEventCompleteData(int i, Rect rect, int i2) {
        this.a = i;
        this.b = rect;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TouchEventCompleteData touchEventCompleteData = (TouchEventCompleteData) obj;
        if (this.a != touchEventCompleteData.a || this.c != touchEventCompleteData.c) {
            return false;
        }
        return Objects.equals(this.b, touchEventCompleteData.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Rect rect = this.b;
        return ((i + (rect != null ? rect.hashCode() : 0)) * 31) + this.c;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 78);
        sb.append("TouchEventCompleteData{hint=");
        sb.append(i);
        sb.append(", currentFocus=");
        sb.append(valueOf);
        sb.append(", direction=");
        sb.append(i2);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.u(parcel, 2, this.b, i);
        cnwn.g(parcel, 3, this.c);
        cnwn.c(parcel, d);
    }
}
