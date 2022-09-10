package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
/* compiled from: PG */
/* renamed from: cowz  reason: default package */
/* loaded from: classes5.dex */
public final class cowz implements Parcelable.Creator<EmailEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EmailEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String str = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) cnwm.q(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                str = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new EmailEntity(personFieldMetadataEntity, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ EmailEntity[] newArray(int i) {
        return new EmailEntity[i];
    }
}
