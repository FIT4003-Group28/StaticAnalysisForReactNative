package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.PhotoEntity;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: coxc  reason: default package */
/* loaded from: classes5.dex */
public final class coxc implements Parcelable.Creator<PersonEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PersonEntity createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                str = cnwm.o(parcel, readInt);
            } else if (b == 9) {
                arrayList5 = cnwm.A(parcel, readInt, BirthdayEntity.CREATOR);
            } else if (b == 11) {
                arrayList3 = cnwm.A(parcel, readInt, EmailEntity.CREATOR);
            } else if (b == 13) {
                arrayList4 = cnwm.A(parcel, readInt, PhoneEntity.CREATOR);
            } else if (b == 4) {
                arrayList = cnwm.A(parcel, readInt, NameEntity.CREATOR);
            } else if (b != 5) {
                cnwm.d(parcel, readInt);
            } else {
                arrayList2 = cnwm.A(parcel, readInt, PhotoEntity.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new PersonEntity(str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PersonEntity[] newArray(int i) {
        return new PersonEntity[i];
    }
}
