package defpackage;
/* compiled from: PG */
/* renamed from: aqct  reason: default package */
/* loaded from: classes2.dex */
public final class aqct {
    private final aqcv a;

    public aqct(aqcv aqcvVar) {
        this.a = aqcvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqct) && this.a.equals(((aqct) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("PurchaseModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
