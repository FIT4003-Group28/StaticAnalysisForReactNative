package defpackage;
/* compiled from: PG */
/* renamed from: aqcr  reason: default package */
/* loaded from: classes2.dex */
public final class aqcr {
    public final aqcu a;

    public aqcr(aqcu aqcuVar) {
        this.a = aqcuVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqcr) && this.a.equals(((aqcr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("CommerceAcquisitionClientPayloadModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
