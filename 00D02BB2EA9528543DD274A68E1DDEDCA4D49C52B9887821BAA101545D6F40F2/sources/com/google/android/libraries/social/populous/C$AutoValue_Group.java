package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.GroupOrigin;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.$AutoValue_Group  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Group extends Group {
    public final String a;
    public final String b;
    public final GroupMetadata c;
    public final dcdc<GroupOrigin> d;
    public final dcdc<GroupMember> e;

    public C$AutoValue_Group(String str, String str2, GroupMetadata groupMetadata, dcdc<GroupOrigin> dcdcVar, dcdc<GroupMember> dcdcVar2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (groupMetadata != null) {
                    this.c = groupMetadata;
                    if (dcdcVar != null) {
                        this.d = dcdcVar;
                        if (dcdcVar2 != null) {
                            this.e = dcdcVar2;
                            return;
                        }
                        throw new NullPointerException("Null membersSnippet");
                    }
                    throw new NullPointerException("Null origins");
                }
                throw new NullPointerException("Null metadata");
            }
            throw new NullPointerException("Null groupId");
        }
        throw new NullPointerException("Null key");
    }

    @Override // com.google.android.libraries.social.populous.Group
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.Group
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.Group
    public final GroupMetadata c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.Group
    public final dcdc<GroupOrigin> d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.Group
    public final dcdc<GroupMember> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Group) {
            Group group = (Group) obj;
            if (this.a.equals(group.a()) && this.b.equals(group.b()) && this.c.equals(group.c()) && dchl.m(this.d, group.d()) && dchl.m(this.e, group.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = str.length();
        int length2 = str2.length();
        int length3 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 59 + length2 + length3 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Group{key=");
        sb.append(str);
        sb.append(", groupId=");
        sb.append(str2);
        sb.append(", metadata=");
        sb.append(valueOf);
        sb.append(", origins=");
        sb.append(valueOf2);
        sb.append(", membersSnippet=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
