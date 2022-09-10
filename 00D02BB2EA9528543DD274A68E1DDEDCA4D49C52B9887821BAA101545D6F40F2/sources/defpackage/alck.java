package defpackage;
/* compiled from: PG */
/* renamed from: alck  reason: default package */
/* loaded from: classes2.dex */
public final class alck extends aldu {
    private final dcdc<aldt> a;

    public alck(dcdc<aldt> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null callouts");
    }

    @Override // defpackage.aldu
    public final dcdc<aldt> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aldu)) {
            return false;
        }
        return dchl.m(this.a, ((aldu) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("RouteCalloutsRepositionedEvent{callouts=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
