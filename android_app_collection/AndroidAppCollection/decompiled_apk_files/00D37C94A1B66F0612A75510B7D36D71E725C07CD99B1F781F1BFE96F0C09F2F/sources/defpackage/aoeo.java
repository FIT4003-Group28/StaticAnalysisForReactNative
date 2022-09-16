package defpackage;

import j$.util.Objects;
/* compiled from: PG */
/* renamed from: aoeo  reason: default package */
/* loaded from: classes.dex */
public final class aoeo {
    public final String a;

    public aoeo(aoep aoepVar) {
        this.a = aoepVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aoeo) {
            return Objects.equals(this.a, ((aoeo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 25);
        sb.append("CapabilityAlias{alias='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
