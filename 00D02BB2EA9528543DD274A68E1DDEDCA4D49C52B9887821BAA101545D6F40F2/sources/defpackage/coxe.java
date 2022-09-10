package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;
/* compiled from: PG */
/* renamed from: coxe  reason: default package */
/* loaded from: classes5.dex */
public final class coxe implements Parcelable.Creator<PhoneEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PhoneEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) cnwm.q(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new PhoneEntity(personFieldMetadataEntity, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PhoneEntity[] newArray(int i) {
        return new PhoneEntity[i];
    }
}
