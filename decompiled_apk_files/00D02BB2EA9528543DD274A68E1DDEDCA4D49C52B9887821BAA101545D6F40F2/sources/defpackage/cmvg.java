package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.PowerStateImpl;
/* compiled from: PG */
/* renamed from: cmvg  reason: default package */
/* loaded from: classes5.dex */
public final class cmvg implements Parcelable.Creator<PowerStateImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PowerStateImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        double d = dcyn.a;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                d = cnwm.n(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PowerStateImpl(i, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PowerStateImpl[] newArray(int i) {
        return new PowerStateImpl[i];
    }
}
