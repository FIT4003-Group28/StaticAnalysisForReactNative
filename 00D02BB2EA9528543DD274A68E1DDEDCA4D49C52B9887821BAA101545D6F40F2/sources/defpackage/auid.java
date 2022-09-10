package defpackage;
/* compiled from: PG */
/* renamed from: auid  reason: default package */
/* loaded from: classes.dex */
final class auid extends auir {
    private final dcdc<auiu> b;

    public auid(dcdc<auiu> dcdcVar) {
        this.b = dcdcVar;
    }

    @Override // defpackage.auir
    public final dcdc<auiu> a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof auir)) {
            return false;
        }
        return dchl.m(this.b, ((auir) obj).a());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("NotificationChannelConfig{channels=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
