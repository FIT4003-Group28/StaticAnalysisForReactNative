package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PhoneEntity extends AbstractSafeParcelable implements Phone {
    public static final Parcelable.Creator<PhoneEntity> CREATOR = new coxe();
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;

    public PhoneEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Phone)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Phone phone = (Phone) obj;
        return cnvv.a(a(), phone.a()) && cnvv.a(b(), phone.b()) && cnvv.a(c(), phone.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.c(parcel, d);
    }
}
