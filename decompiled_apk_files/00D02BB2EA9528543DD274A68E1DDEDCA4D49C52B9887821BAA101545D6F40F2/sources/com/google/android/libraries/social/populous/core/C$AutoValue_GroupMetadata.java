package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_GroupMetadata  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_GroupMetadata extends GroupMetadata {
    public final int a;
    public final boolean b;
    public final long c;
    public final String d;
    public final PeopleApiAffinity e;
    public final int f;

    public C$AutoValue_GroupMetadata(int i, boolean z, long j, String str, PeopleApiAffinity peopleApiAffinity, int i2) {
        this.a = i;
        this.b = z;
        this.c = j;
        if (str != null) {
            this.d = str;
            if (peopleApiAffinity != null) {
                this.e = peopleApiAffinity;
                this.f = i2;
                return;
            }
            throw new NullPointerException("Null peopleApiAffinity");
        }
        throw new NullPointerException("Null query");
    }

    @Override // com.google.android.libraries.social.populous.core.GroupMetadata
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.GroupMetadata
    public final boolean b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.GroupMetadata
    public final long c() {
        return this.c;
    }

    @Override // com.google.android.libraries.social.populous.core.GroupMetadata
    public final String d() {
        return this.d;
    }

    @Override // com.google.android.libraries.social.populous.core.GroupMetadata
    public final PeopleApiAffinity e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupMetadata) {
            GroupMetadata groupMetadata = (GroupMetadata) obj;
            if (this.a == groupMetadata.a() && this.b == groupMetadata.b() && this.c == groupMetadata.c() && this.d.equals(groupMetadata.d()) && this.e.equals(groupMetadata.e()) && this.f == groupMetadata.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.social.populous.core.GroupMetadata
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        int i2 = true != this.b ? 1237 : 1231;
        long j = this.c;
        return ((((((((i ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f;
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        long j = this.c;
        String str = this.d;
        String valueOf = String.valueOf(this.e);
        int i2 = this.f;
        StringBuilder sb = new StringBuilder(str.length() + 153 + String.valueOf(valueOf).length());
        sb.append("GroupMetadata{size=");
        sb.append(i);
        sb.append(", canExpandMembers=");
        sb.append(z);
        sb.append(", querySessionId=");
        sb.append(j);
        sb.append(", query=");
        sb.append(str);
        sb.append(", peopleApiAffinity=");
        sb.append(valueOf);
        sb.append(", personLevelPosition=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
