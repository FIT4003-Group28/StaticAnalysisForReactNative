package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.SourceIdentity;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.$AutoValue_IdentityInfo  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_IdentityInfo extends IdentityInfo {
    public final dcdc<SourceIdentity> a;

    public C$AutoValue_IdentityInfo(dcdc<SourceIdentity> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null sourceIdsList");
    }

    @Override // com.google.android.libraries.social.populous.IdentityInfo
    public final dcdc<SourceIdentity> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdentityInfo)) {
            return false;
        }
        return dchl.m(this.a, ((IdentityInfo) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("IdentityInfo{sourceIdsList=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
