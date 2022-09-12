package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cpho  reason: default package */
/* loaded from: classes5.dex */
public final class cpho implements Parcelable.Creator<CapabilityInfoParcelable> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CapabilityInfoParcelable createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, NodeParcelable.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new CapabilityInfoParcelable(str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CapabilityInfoParcelable[] newArray(int i) {
        return new CapabilityInfoParcelable[i];
    }
}
