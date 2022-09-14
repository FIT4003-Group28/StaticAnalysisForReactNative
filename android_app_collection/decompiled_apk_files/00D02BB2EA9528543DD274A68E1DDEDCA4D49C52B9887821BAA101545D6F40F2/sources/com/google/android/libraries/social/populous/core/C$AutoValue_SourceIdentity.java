package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_SourceIdentity  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_SourceIdentity extends SourceIdentity {
    public final duej a;
    public final String b;
    public final String c;

    public C$AutoValue_SourceIdentity(duej duejVar, @dzsi String str, @dzsi String str2) {
        if (duejVar != null) {
            this.a = duejVar;
            this.b = str;
            this.c = str2;
            return;
        }
        throw new NullPointerException("Null containerType");
    }

    @Override // com.google.android.libraries.social.populous.core.SourceIdentity
    public final duej a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.SourceIdentity
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.SourceIdentity
    @dzsi
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SourceIdentity) {
            SourceIdentity sourceIdentity = (SourceIdentity) obj;
            if (this.a.equals(sourceIdentity.a()) && ((str = this.b) != null ? str.equals(sourceIdentity.b()) : sourceIdentity.b() == null) && ((str2 = this.c) != null ? str2.equals(sourceIdentity.c()) : sourceIdentity.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String str2 = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("SourceIdentity{containerType=");
        sb.append(valueOf);
        sb.append(", id=");
        sb.append(str);
        sb.append(", deviceContactLookupKey=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
