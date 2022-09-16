package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PersonEntity extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator CREATOR = new rsz(7);
    public final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List b() {
        List list;
        if (this.k == null && (list = this.f) != null) {
            this.k = new ArrayList(list.size());
            for (Birthday birthday : this.f) {
                this.k.add(birthday);
            }
        }
        return this.k;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List c() {
        List list;
        if (this.i == null && (list = this.d) != null) {
            this.i = new ArrayList(list.size());
            for (Email email : this.d) {
                this.i.add(email);
            }
        }
        return this.i;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List d() {
        List list;
        if (this.g == null && (list = this.b) != null) {
            this.g = new ArrayList(list.size());
            for (Name name : this.b) {
                this.g.add(name);
            }
        }
        return this.g;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List e() {
        List list;
        if (this.j == null && (list = this.e) != null) {
            this.j = new ArrayList(list.size());
            for (Phone phone : this.e) {
                this.j.add(phone);
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
        return tnk.j(a(), person.a()) && tnk.j(d(), person.d()) && tnk.j(f(), person.f()) && tnk.j(c(), person.c()) && tnk.j(e(), person.e()) && tnk.j(b(), person.b());
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List f() {
        List list;
        if (this.h == null && (list = this.c) != null) {
            this.h = new ArrayList(list.size());
            for (Photo photo : this.c) {
                this.h.add(photo);
            }
        }
        return this.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), d(), f(), c(), e(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.J(parcel, 4, d());
        tqj.J(parcel, 5, f());
        tqj.J(parcel, 9, b());
        tqj.J(parcel, 11, c());
        tqj.J(parcel, 13, e());
        tqj.n(parcel, m);
    }
}
