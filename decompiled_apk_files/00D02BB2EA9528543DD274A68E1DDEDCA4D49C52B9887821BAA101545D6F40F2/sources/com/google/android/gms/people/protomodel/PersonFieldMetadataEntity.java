package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PersonFieldMetadataEntity extends AbstractSafeParcelable implements PersonFieldMetadata {
    public static final Parcelable.Creator<PersonFieldMetadataEntity> CREATOR = new coxd();
    public final Integer a;
    public final Boolean b;

    public PersonFieldMetadataEntity(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final Integer a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonFieldMetadata)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) obj;
        return cnvv.a(a(), personFieldMetadata.a()) && cnvv.a(b(), personFieldMetadata.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.s(parcel, 3, this.a);
        Boolean bool = this.b;
        if (bool != null) {
            cnwn.a(parcel, 4, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        cnwn.c(parcel, d);
    }
}
