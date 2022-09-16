package defpackage;
/* compiled from: PG */
/* renamed from: atrb  reason: default package */
/* loaded from: classes2.dex */
public final class atrb {
    private final atrc a;

    public atrb(atrc atrcVar) {
        this.a = atrcVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof atrb) && this.a.equals(((atrb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("OfflineOrchestrationActionMetadataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
