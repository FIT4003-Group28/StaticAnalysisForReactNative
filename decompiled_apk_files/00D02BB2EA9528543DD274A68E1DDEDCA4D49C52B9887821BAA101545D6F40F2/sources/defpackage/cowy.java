package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;
/* compiled from: PG */
/* renamed from: cowy  reason: default package */
/* loaded from: classes5.dex */
public final class cowy implements Parcelable.Creator<DeviceVersionEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceVersionEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Integer num = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                num = cnwm.j(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new DeviceVersionEntity(num);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DeviceVersionEntity[] newArray(int i) {
        return new DeviceVersionEntity[i];
    }
}
