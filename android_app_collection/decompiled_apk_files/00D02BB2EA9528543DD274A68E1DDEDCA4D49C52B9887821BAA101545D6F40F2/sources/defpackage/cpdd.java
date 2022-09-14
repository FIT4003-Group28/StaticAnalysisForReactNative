package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.udc.ConsentCancelReason;
/* compiled from: PG */
/* renamed from: cpdd  reason: default package */
/* loaded from: classes5.dex */
public final class cpdd implements Parcelable.Creator<ConsentCancelReason> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConsentCancelReason createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new ConsentCancelReason(i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ConsentCancelReason[] newArray(int i) {
        return new ConsentCancelReason[i];
    }
}
