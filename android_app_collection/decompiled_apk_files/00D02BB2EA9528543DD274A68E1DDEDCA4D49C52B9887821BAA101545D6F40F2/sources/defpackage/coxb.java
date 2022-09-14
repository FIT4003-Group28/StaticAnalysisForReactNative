package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
/* compiled from: PG */
/* renamed from: coxb  reason: default package */
/* loaded from: classes5.dex */
public final class coxb implements Parcelable.Creator<NameEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NameEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b != 17) {
                switch (b) {
                    case 2:
                        personFieldMetadataEntity = (PersonFieldMetadataEntity) cnwm.q(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
                        continue;
                    case 3:
                        str = cnwm.o(parcel, readInt);
                        continue;
                    case 4:
                        str6 = cnwm.o(parcel, readInt);
                        continue;
                    case 5:
                        str3 = cnwm.o(parcel, readInt);
                        continue;
                    case 6:
                        str4 = cnwm.o(parcel, readInt);
                        continue;
                    case 7:
                        str5 = cnwm.o(parcel, readInt);
                        continue;
                    default:
                        cnwm.d(parcel, readInt);
                        continue;
                }
            } else {
                str2 = cnwm.o(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        return new NameEntity(personFieldMetadataEntity, str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ NameEntity[] newArray(int i) {
        return new NameEntity[i];
    }
}
