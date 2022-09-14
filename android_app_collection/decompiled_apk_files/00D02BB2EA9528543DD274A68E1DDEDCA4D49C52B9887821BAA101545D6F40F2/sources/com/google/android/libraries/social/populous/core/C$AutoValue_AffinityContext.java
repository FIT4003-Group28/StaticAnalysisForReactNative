package com.google.android.libraries.social.populous.core;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_AffinityContext  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_AffinityContext extends AffinityContext {
    public final Integer a;

    public C$AutoValue_AffinityContext(@dzsi Integer num) {
        this.a = num;
    }

    @Override // com.google.android.libraries.social.populous.core.AffinityContext
    @dzsi
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AffinityContext)) {
            return false;
        }
        AffinityContext affinityContext = (AffinityContext) obj;
        Integer num = this.a;
        return num == null ? affinityContext.a() == null : num.equals(affinityContext.a());
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("AffinityContext{affinityVersion=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
