package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
/* compiled from: PG */
/* renamed from: coxd  reason: default package */
/* loaded from: classes5.dex */
public final class coxd implements Parcelable.Creator<PersonFieldMetadataEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PersonFieldMetadataEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 3;
        while (true) {
            Boolean bool = null;
            while (parcel.dataPosition() < f) {
                int readInt = parcel.readInt();
                int b = cnwm.b(readInt);
                if (b == 3) {
                    i = cnwm.j(parcel, readInt);
                } else if (b != 4) {
                    cnwm.d(parcel, readInt);
                } else {
                    int c = cnwm.c(parcel, readInt);
                    if (c == 0) {
                        break;
                    }
                    cnwm.C(parcel, c, 4);
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
            }
            cnwm.B(parcel, f);
            return new PersonFieldMetadataEntity(i, bool);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PersonFieldMetadataEntity[] newArray(int i) {
        return new PersonFieldMetadataEntity[i];
    }
}
