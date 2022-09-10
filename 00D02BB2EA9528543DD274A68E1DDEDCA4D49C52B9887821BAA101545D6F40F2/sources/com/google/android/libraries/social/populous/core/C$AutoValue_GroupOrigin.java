package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_GroupOrigin  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_GroupOrigin extends GroupOrigin {
    public final String a;
    public final Name b;
    public final Photo c;

    public C$AutoValue_GroupOrigin(@dzsi String str, @dzsi Name name, @dzsi Photo photo) {
        this.a = str;
        this.b = name;
        this.c = photo;
    }

    @Override // com.google.android.libraries.social.populous.core.GroupOrigin
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.libraries.social.populous.core.GroupOrigin
    @dzsi
    public final Name b() {
        return this.b;
    }

    @Override // com.google.android.libraries.social.populous.core.GroupOrigin
    @dzsi
    public final Photo c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupOrigin) {
            GroupOrigin groupOrigin = (GroupOrigin) obj;
            String str = this.a;
            if (str != null ? str.equals(groupOrigin.a()) : groupOrigin.a() == null) {
                Name name = this.b;
                if (name != null ? name.equals(groupOrigin.b()) : groupOrigin.b() == null) {
                    Photo photo = this.c;
                    if (photo != null ? photo.equals(groupOrigin.c()) : groupOrigin.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Name name = this.b;
        int hashCode2 = (hashCode ^ (name == null ? 0 : name.hashCode())) * 1000003;
        Photo photo = this.c;
        if (photo != null) {
            i = photo.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("GroupOrigin{groupType=");
        sb.append(str);
        sb.append(", name=");
        sb.append(valueOf);
        sb.append(", photo=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
