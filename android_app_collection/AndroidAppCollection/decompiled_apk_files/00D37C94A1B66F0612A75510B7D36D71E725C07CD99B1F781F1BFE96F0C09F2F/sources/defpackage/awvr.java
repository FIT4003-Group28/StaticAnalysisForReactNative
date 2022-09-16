package defpackage;
/* compiled from: PG */
/* renamed from: awvr  reason: default package */
/* loaded from: classes2.dex */
public final class awvr {
    private final awvs a;

    public awvr(awvs awvsVar) {
        this.a = awvsVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awvr) && this.a.equals(((awvr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("FocusDescriptionsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
