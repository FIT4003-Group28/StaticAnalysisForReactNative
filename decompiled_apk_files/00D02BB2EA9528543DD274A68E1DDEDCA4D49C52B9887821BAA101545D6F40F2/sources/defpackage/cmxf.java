package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.google.android.gms.car.DrawingSpec;
/* compiled from: PG */
/* renamed from: cmxf  reason: default package */
/* loaded from: classes5.dex */
public final class cmxf implements Parcelable.Creator<DrawingSpec> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DrawingSpec createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Surface surface = null;
        Rect rect = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                i3 = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                surface = (Surface) cnwm.q(parcel, readInt, Surface.CREATOR);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                rect = (Rect) cnwm.q(parcel, readInt, Rect.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new DrawingSpec(i, i2, i3, surface, rect);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DrawingSpec[] newArray(int i) {
        return new DrawingSpec[i];
    }
}
