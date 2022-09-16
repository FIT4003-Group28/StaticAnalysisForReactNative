package defpackage;
/* compiled from: PG */
/* renamed from: aqcs  reason: default package */
/* loaded from: classes2.dex */
public final class aqcs {
    public final aqcw a;

    public aqcs(aqcw aqcwVar) {
        this.a = aqcwVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqcs) && this.a.equals(((aqcs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("PlayBillingClientPayloadModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
