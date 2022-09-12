package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
/* compiled from: PG */
/* renamed from: cpjh  reason: default package */
/* loaded from: classes5.dex */
public final class cpjh implements Parcelable.Creator<NodeParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NodeParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        boolean z = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 3) {
                str2 = cnwm.o(parcel, readInt);
            } else if (b == 4) {
                i = cnwm.i(parcel, readInt);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                z = cnwm.g(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new NodeParcelable(str, str2, i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NodeParcelable[] newArray(int i) {
        return new NodeParcelable[i];
    }
}
