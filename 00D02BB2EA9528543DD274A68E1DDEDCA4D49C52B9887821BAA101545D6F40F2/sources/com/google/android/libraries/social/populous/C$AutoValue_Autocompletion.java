package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.ContactMethodField;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.$AutoValue_Autocompletion  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Autocompletion extends Autocompletion {
    public final dcdc<ContactMethodField> a;
    public final Person b;
    public final Group c;
    public final int d;

    public C$AutoValue_Autocompletion(int i, dcdc<ContactMethodField> dcdcVar, @dzsi Person person, @dzsi Group group) {
        if (i != 0) {
            this.d = i;
            if (dcdcVar != null) {
                this.a = dcdcVar;
                this.b = person;
                this.c = group;
                return;
            }
            throw new NullPointerException("Null matchesList");
        }
        throw new NullPointerException("Null objectType");
    }

    @Override // com.google.android.libraries.social.populous.Autocompletion
    public final dcdc<ContactMethodField> a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.Autocompletion
    @dzsi
    public final Person b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.Autocompletion
    @dzsi
    public final Group c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.Autocompletion
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Person person;
        Group group;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Autocompletion) {
            Autocompletion autocompletion = (Autocompletion) obj;
            if (this.d == autocompletion.d() && dchl.m(this.a, autocompletion.a()) && ((person = this.b) != null ? person.equals(autocompletion.b()) : autocompletion.b() == null) && ((group = this.c) != null ? group.equals(autocompletion.c()) : autocompletion.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.d ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003;
        Person person = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (person == null ? 0 : person.hashCode())) * 1000003;
        Group group = this.c;
        if (group != null) {
            i = group.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? "GROUP" : "PERSON" : "OBJECT_TYPE_UNSPECIFIED";
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(str.length() + 58 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Autocompletion{objectType=");
        sb.append(str);
        sb.append(", matchesList=");
        sb.append(valueOf);
        sb.append(", person=");
        sb.append(valueOf2);
        sb.append(", group=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
