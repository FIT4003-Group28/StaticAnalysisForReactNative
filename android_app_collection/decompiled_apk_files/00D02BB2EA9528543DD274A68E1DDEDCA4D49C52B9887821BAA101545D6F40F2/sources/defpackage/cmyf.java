package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.InputFocusChangedEvent;
/* compiled from: PG */
/* renamed from: cmyf  reason: default package */
/* loaded from: classes5.dex */
public final class cmyf implements Parcelable.Creator<InputFocusChangedEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InputFocusChangedEvent createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        boolean z = false;
        Rect rect = null;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                z = cnwm.g(parcel, readInt);
            } else if (b == 2) {
                z2 = cnwm.g(parcel, readInt);
            } else if (b == 3) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                rect = (Rect) cnwm.q(parcel, readInt, Rect.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new InputFocusChangedEvent(z, z2, i, rect);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ InputFocusChangedEvent[] newArray(int i) {
        return new InputFocusChangedEvent[i];
    }
}
