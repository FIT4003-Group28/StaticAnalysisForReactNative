package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
import com.google.android.gms.people.protomodel.PhotoEntity;
/* compiled from: PG */
/* renamed from: coxf  reason: default package */
/* loaded from: classes5.dex */
public final class coxf implements Parcelable.Creator<PhotoEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PhotoEntity createFromParcel(Parcel parcel) {
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
        return new PhotoEntity(personFieldMetadataEntity, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PhotoEntity[] newArray(int i) {
        return new PhotoEntity[i];
    }
}
