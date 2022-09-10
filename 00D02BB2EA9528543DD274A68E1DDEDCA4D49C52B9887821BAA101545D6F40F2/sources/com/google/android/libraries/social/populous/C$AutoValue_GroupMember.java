package com.google.android.libraries.social.populous;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.$AutoValue_GroupMember  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_GroupMember extends GroupMember {
    public final Person a;
    public final int b;

    public C$AutoValue_GroupMember(int i, @dzsi Person person) {
        if (i != 0) {
            this.b = i;
            this.a = person;
            return;
        }
        throw new NullPointerException("Null memberType");
    }

    @Override // com.google.android.libraries.social.populous.GroupMember
    @dzsi
    public final Person a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.GroupMember
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Person person;
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupMember) {
            GroupMember groupMember = (GroupMember) obj;
            if (this.b == groupMember.b() && ((person = this.a) != null ? person.equals(groupMember.a()) : groupMember.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        Person person = this.a;
        return i ^ (person == null ? 0 : person.hashCode());
    }

    public final String toString() {
        String str = this.b != 1 ? "PERSON" : "UNSPECIFIED";
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 33 + String.valueOf(valueOf).length());
        sb.append("GroupMember{memberType=");
        sb.append(str);
        sb.append(", person=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
