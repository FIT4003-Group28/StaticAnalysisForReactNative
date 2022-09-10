package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cnyn  reason: default package */
/* loaded from: classes5.dex */
public final class cnyn implements Parcelable.Creator<FenceStateImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FenceStateImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                j = cnwm.k(parcel, readInt);
            } else if (b == 4) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 5) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 6) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, ContextData.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new FenceStateImpl(i, j, str, i2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FenceStateImpl[] newArray(int i) {
        return new FenceStateImpl[i];
    }
}
