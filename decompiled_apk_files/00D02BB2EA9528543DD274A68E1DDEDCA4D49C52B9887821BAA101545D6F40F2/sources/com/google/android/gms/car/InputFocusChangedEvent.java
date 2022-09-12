package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class InputFocusChangedEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InputFocusChangedEvent> CREATOR = new cmyf();
    public final boolean a;
    public final boolean b;
    public final int c;
    public final Rect d;

    public InputFocusChangedEvent(boolean z, boolean z2, int i, Rect rect) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputFocusChangedEvent inputFocusChangedEvent = (InputFocusChangedEvent) obj;
        if (this.a != inputFocusChangedEvent.a || this.b != inputFocusChangedEvent.b || this.c != inputFocusChangedEvent.c) {
            return false;
        }
        return Objects.equals(this.d, inputFocusChangedEvent.d);
    }

    public final int hashCode() {
        int i = (((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31;
        Rect rect = this.d;
        return i + (rect != null ? rect.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        int i = this.c;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93);
        sb.append("InputFocusChangedEvent{focused=");
        sb.append(z);
        sb.append(", inTouchMode=");
        sb.append(z2);
        sb.append(", direction=");
        sb.append(i);
        sb.append(", focusedRect=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 1, this.a);
        cnwn.e(parcel, 2, this.b);
        cnwn.g(parcel, 3, this.c);
        cnwn.u(parcel, 4, this.d, i);
        cnwn.c(parcel, d);
    }
}
