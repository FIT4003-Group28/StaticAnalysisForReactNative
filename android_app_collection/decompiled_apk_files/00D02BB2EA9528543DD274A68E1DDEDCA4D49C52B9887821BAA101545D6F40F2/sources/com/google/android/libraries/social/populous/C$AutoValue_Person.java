package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.Phone;
import com.google.android.libraries.social.populous.core.Photo;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.$AutoValue_Person  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Person extends Person {
    public final PersonMetadata a;
    public final dcdc<Name> b;
    public final dcdc<Email> c;
    public final dcdc<Phone> d;
    public final dcdc<Photo> e;
    public final dcdc<InAppNotificationTarget> f;
    public final String g;
    public final PersonExtendedData h;
    public final boolean i;
    public final dsgo j;

    public C$AutoValue_Person(PersonMetadata personMetadata, dcdc<Name> dcdcVar, dcdc<Email> dcdcVar2, dcdc<Phone> dcdcVar3, dcdc<Photo> dcdcVar4, dcdc<InAppNotificationTarget> dcdcVar5, @dzsi String str, @dzsi PersonExtendedData personExtendedData, boolean z, @dzsi dsgo dsgoVar) {
        if (personMetadata != null) {
            this.a = personMetadata;
            if (dcdcVar != null) {
                this.b = dcdcVar;
                if (dcdcVar2 != null) {
                    this.c = dcdcVar2;
                    if (dcdcVar3 != null) {
                        this.d = dcdcVar3;
                        if (dcdcVar4 != null) {
                            this.e = dcdcVar4;
                            if (dcdcVar5 != null) {
                                this.f = dcdcVar5;
                                this.g = str;
                                this.h = personExtendedData;
                                this.i = z;
                                this.j = dsgoVar;
                                return;
                            }
                            throw new NullPointerException("Null inAppNotificationTargetsList");
                        }
                        throw new NullPointerException("Null photosList");
                    }
                    throw new NullPointerException("Null phonesList");
                }
                throw new NullPointerException("Null emailsList");
            }
            throw new NullPointerException("Null namesList");
        }
        throw new NullPointerException("Null metadata");
    }

    @Override // com.google.android.libraries.social.populous.Person
    public final PersonMetadata a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.Person
    public final dcdc<Name> b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.Person
    public final dcdc<Email> c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.Person
    public final dcdc<Phone> d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.Person
    public final dcdc<Photo> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        PersonExtendedData personExtendedData;
        dsgo dsgoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Person) {
            Person person = (Person) obj;
            if (this.a.equals(person.a()) && dchl.m(this.b, person.b()) && dchl.m(this.c, person.c()) && dchl.m(this.d, person.d()) && dchl.m(this.e, person.e()) && dchl.m(this.f, person.f()) && ((str = this.g) != null ? str.equals(person.g()) : person.g() == null) && ((personExtendedData = this.h) != null ? personExtendedData.equals(person.h()) : person.h() == null) && this.i == person.i() && ((dsgoVar = this.j) != null ? dsgoVar.equals(person.j()) : person.j() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.social.populous.Person
    public final dcdc<InAppNotificationTarget> f() {
        return this.f;
    }

    @Override // com.google.android.libraries.social.populous.Person
    @dzsi
    public final String g() {
        return this.g;
    }

    @Override // com.google.android.libraries.social.populous.Person
    @dzsi
    public final PersonExtendedData h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.g;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        PersonExtendedData personExtendedData = this.h;
        int hashCode3 = (((hashCode2 ^ (personExtendedData == null ? 0 : personExtendedData.hashCode())) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003;
        dsgo dsgoVar = this.j;
        if (dsgoVar != null && (i = dsgoVar.bC) == 0) {
            i = dsst.a.b(dsgoVar).c(dsgoVar);
            dsgoVar.bC = i;
        }
        return hashCode3 ^ i;
    }

    @Override // com.google.android.libraries.social.populous.Person
    public final boolean i() {
        return this.i;
    }

    @Override // com.google.android.libraries.social.populous.Person
    @dzsi
    public final dsgo j() {
        return this.j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String str = this.g;
        String valueOf7 = String.valueOf(this.h);
        boolean z = this.i;
        String valueOf8 = String.valueOf(this.j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 196 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("Person{metadata=");
        sb.append(valueOf);
        sb.append(", namesList=");
        sb.append(valueOf2);
        sb.append(", emailsList=");
        sb.append(valueOf3);
        sb.append(", phonesList=");
        sb.append(valueOf4);
        sb.append(", photosList=");
        sb.append(valueOf5);
        sb.append(", inAppNotificationTargetsList=");
        sb.append(valueOf6);
        sb.append(", personId=");
        sb.append(str);
        sb.append(", extendedData=");
        sb.append(valueOf7);
        sb.append(", toPromoteNameAndPhotoForFirstContactMethod=");
        sb.append(z);
        sb.append(", clientSpecificData=");
        sb.append(valueOf8);
        sb.append("}");
        return sb.toString();
    }
}
