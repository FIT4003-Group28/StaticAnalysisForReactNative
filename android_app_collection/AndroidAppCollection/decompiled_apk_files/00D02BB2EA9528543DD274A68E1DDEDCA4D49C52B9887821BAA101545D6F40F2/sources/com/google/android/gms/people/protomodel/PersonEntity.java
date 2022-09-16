package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PersonEntity extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator<PersonEntity> CREATOR = new coxc();
    public final String a;
    private final List<NameEntity> b;
    private final List<PhotoEntity> c;
    private final List<EmailEntity> d;
    private final List<PhoneEntity> e;
    private final List<BirthdayEntity> f;
    private List<Name> g;
    private List<Photo> h;
    private List<Email> i;
    private List<Phone> j;
    private List<Birthday> k;

    public PersonEntity(String str, List<NameEntity> list, List<PhotoEntity> list2, List<EmailEntity> list3, List<PhoneEntity> list4, List<BirthdayEntity> list5) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    @Override // defpackage.cntw
    public final boolean F() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List<Name> b() {
        List<NameEntity> list;
        if (this.g == null && (list = this.b) != null) {
            this.g = new ArrayList(list.size());
            for (NameEntity nameEntity : this.b) {
                this.g.add(nameEntity);
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List<Photo> c() {
        List<PhotoEntity> list;
        if (this.h == null && (list = this.c) != null) {
            this.h = new ArrayList(list.size());
            for (PhotoEntity photoEntity : this.c) {
                this.h.add(photoEntity);
            }
        }
        return this.h;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List<Email> d() {
        List<EmailEntity> list;
        if (this.i == null && (list = this.d) != null) {
            this.i = new ArrayList(list.size());
            for (EmailEntity emailEntity : this.d) {
                this.i.add(emailEntity);
            }
        }
        return this.i;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List<Phone> e() {
        List<PhoneEntity> list;
        if (this.j == null && (list = this.e) != null) {
            this.j = new ArrayList(list.size());
            for (PhoneEntity phoneEntity : this.e) {
                this.j.add(phoneEntity);
            }
        }
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Person person = (Person) obj;
        return cnvv.a(a(), person.a()) && cnvv.a(b(), person.b()) && cnvv.a(c(), person.c()) && cnvv.a(d(), person.d()) && cnvv.a(e(), person.e()) && cnvv.a(f(), person.f());
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List<Birthday> f() {
        List<BirthdayEntity> list;
        if (this.k == null && (list = this.f) != null) {
            this.k = new ArrayList(list.size());
            for (BirthdayEntity birthdayEntity : this.f) {
                this.k.add(birthdayEntity);
            }
        }
        return this.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), d(), e(), f()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.y(parcel, 4, b());
        cnwn.y(parcel, 5, c());
        cnwn.y(parcel, 9, f());
        cnwn.y(parcel, 11, d());
        cnwn.y(parcel, 13, e());
        cnwn.c(parcel, d);
    }
}
