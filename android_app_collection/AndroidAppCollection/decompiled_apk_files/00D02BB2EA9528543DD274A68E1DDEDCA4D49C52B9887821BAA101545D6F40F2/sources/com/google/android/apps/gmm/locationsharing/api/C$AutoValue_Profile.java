package com.google.android.apps.gmm.locationsharing.api;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.locationsharing.api.$AutoValue_Profile  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_Profile extends Profile {
    public final PersonId a;
    public final dbsg<String> b;
    public final dbsg<String> c;
    public final dbsg<String> d;
    public final dbsg<String> e;

    public C$AutoValue_Profile(PersonId personId, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<String> dbsgVar4) {
        if (personId != null) {
            this.a = personId;
            if (dbsgVar != null) {
                this.b = dbsgVar;
                if (dbsgVar2 != null) {
                    this.c = dbsgVar2;
                    if (dbsgVar3 != null) {
                        this.d = dbsgVar3;
                        if (dbsgVar4 != null) {
                            this.e = dbsgVar4;
                            return;
                        }
                        throw new NullPointerException("Null displayEmail");
                    }
                    throw new NullPointerException("Null avatarUrl");
                }
                throw new NullPointerException("Null givenName");
            }
            throw new NullPointerException("Null displayName");
        }
        throw new NullPointerException("Null personId");
    }

    @Override // com.google.android.apps.gmm.locationsharing.api.Profile
    public final PersonId a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.locationsharing.api.Profile
    public final dbsg<String> b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.locationsharing.api.Profile
    public final dbsg<String> c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.locationsharing.api.Profile
    public final dbsg<String> d() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.locationsharing.api.Profile
    public final dbsg<String> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Profile) {
            Profile profile = (Profile) obj;
            if (this.a.equals(profile.a()) && this.b.equals(profile.b()) && this.c.equals(profile.c()) && this.d.equals(profile.d()) && this.e.equals(profile.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gmm.locationsharing.api.Profile
    public final ahwk f() {
        return new ahuw(this);
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 71 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Profile{personId=");
        sb.append(valueOf);
        sb.append(", displayName=");
        sb.append(valueOf2);
        sb.append(", givenName=");
        sb.append(valueOf3);
        sb.append(", avatarUrl=");
        sb.append(valueOf4);
        sb.append(", displayEmail=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
