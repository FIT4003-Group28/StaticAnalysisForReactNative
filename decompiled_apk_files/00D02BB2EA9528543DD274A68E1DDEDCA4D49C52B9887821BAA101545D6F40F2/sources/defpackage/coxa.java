package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponseEntity;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: coxa  reason: default package */
/* loaded from: classes5.dex */
public final class coxa implements Parcelable.Creator<FetchBackUpDeviceContactInfoResponseEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FetchBackUpDeviceContactInfoResponseEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            if (cnwm.b(readInt) != 2) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList = cnwm.A(parcel, readInt, BackedUpContactsPerDeviceEntity.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new FetchBackUpDeviceContactInfoResponseEntity(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FetchBackUpDeviceContactInfoResponseEntity[] newArray(int i) {
        return new FetchBackUpDeviceContactInfoResponseEntity[i];
    }
}
