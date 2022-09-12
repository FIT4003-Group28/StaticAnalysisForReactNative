package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.ScreenStateImpl;
/* compiled from: PG */
/* renamed from: cmvh  reason: default package */
/* loaded from: classes5.dex */
public final class cmvh implements Parcelable.Creator<ScreenStateImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ScreenStateImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ScreenStateImpl(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ScreenStateImpl[] newArray(int i) {
        return new ScreenStateImpl[i];
    }
}
