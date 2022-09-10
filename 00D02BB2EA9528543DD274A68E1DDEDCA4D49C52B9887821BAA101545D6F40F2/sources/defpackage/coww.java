package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.DeviceVersionEntity;
import com.google.android.gms.people.protomodel.SourceStatsEntity;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: coww  reason: default package */
/* loaded from: classes5.dex */
public final class coww implements Parcelable.Creator<BackedUpContactsPerDeviceEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BackedUpContactsPerDeviceEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        Long l2 = null;
        Long l3 = null;
        DeviceVersionEntity deviceVersionEntity = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 2:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    arrayList = cnwm.A(parcel, readInt, SourceStatsEntity.CREATOR);
                    break;
                case 4:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    l2 = cnwm.l(parcel, readInt);
                    break;
                case 6:
                    l3 = cnwm.l(parcel, readInt);
                    break;
                case 7:
                    l = cnwm.l(parcel, readInt);
                    break;
                case 8:
                    deviceVersionEntity = (DeviceVersionEntity) cnwm.q(parcel, readInt, DeviceVersionEntity.CREATOR);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new BackedUpContactsPerDeviceEntity(str, l, arrayList, str2, l2, l3, deviceVersionEntity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BackedUpContactsPerDeviceEntity[] newArray(int i) {
        return new BackedUpContactsPerDeviceEntity[i];
    }
}
