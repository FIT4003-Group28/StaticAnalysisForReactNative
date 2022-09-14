package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NameEntity extends AbstractSafeParcelable implements Name {
    public static final Parcelable.Creator<NameEntity> CREATOR = new coxb();
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public NameEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String c() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String d() {
        return this.d;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Name)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Name name = (Name) obj;
        return cnvv.a(a(), name.a()) && cnvv.a(b(), name.b()) && cnvv.a(c(), name.c()) && cnvv.a(d(), name.d()) && cnvv.a(e(), name.e()) && cnvv.a(f(), name.f()) && cnvv.a(g(), name.g());
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String f() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String g() {
        return this.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), d(), e(), f(), g()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.k(parcel, 4, this.g, false);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.k(parcel, 6, this.e, false);
        cnwn.k(parcel, 7, this.f, false);
        cnwn.k(parcel, 17, this.c, false);
        cnwn.c(parcel, d);
    }
}
