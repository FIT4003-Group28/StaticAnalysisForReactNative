package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
/* compiled from: PG */
/* renamed from: cowx  reason: default package */
/* loaded from: classes5.dex */
public final class cowx implements Parcelable.Creator<BirthdayEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BirthdayEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        Long l = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) cnwm.q(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                l = cnwm.l(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new BirthdayEntity(personFieldMetadataEntity, l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ BirthdayEntity[] newArray(int i) {
        return new BirthdayEntity[i];
    }
}
