package defpackage;
/* compiled from: PG */
/* renamed from: cucw  reason: default package */
/* loaded from: classes5.dex */
public final class cucw extends cuff {
    private final dcdc<cufh> a;

    public cucw(dcdc<cufh> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.cuff
    public final dcdc<cufh> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cuff)) {
            return false;
        }
        return dchl.m(this.a, ((cuff) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("CloudConversationMetadata{cloudMessages=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
