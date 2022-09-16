package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl;
/* compiled from: PG */
/* renamed from: cmve  reason: default package */
/* loaded from: classes5.dex */
public final class cmve implements Parcelable.Creator<HeadphoneStateImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HeadphoneStateImpl createFromParcel(Parcel parcel) {
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
        return new HeadphoneStateImpl(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HeadphoneStateImpl[] newArray(int i) {
        return new HeadphoneStateImpl[i];
    }
}
