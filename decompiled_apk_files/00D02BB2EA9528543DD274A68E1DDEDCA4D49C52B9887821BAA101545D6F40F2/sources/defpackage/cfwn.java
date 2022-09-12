package defpackage;
/* compiled from: PG */
/* renamed from: cfwn  reason: default package */
/* loaded from: classes4.dex */
final class cfwn extends cfwq {
    private final cqsn a;

    public cfwn(cqsn cqsnVar) {
        this.a = cqsnVar;
    }

    @Override // defpackage.cfwq
    public final cqsn a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cfwq)) {
            return false;
        }
        return this.a.equals(((cfwq) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("SnackbarMessage{text=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
