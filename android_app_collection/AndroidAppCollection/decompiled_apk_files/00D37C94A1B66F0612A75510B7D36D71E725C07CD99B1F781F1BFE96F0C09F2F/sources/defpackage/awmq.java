package defpackage;
/* compiled from: PG */
/* renamed from: awmq  reason: default package */
/* loaded from: classes2.dex */
public final class awmq {
    private final awmv a;

    public awmq(awmv awmvVar) {
        this.a = awmvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awmq) && this.a.equals(((awmq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("GestureAccessibilityInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
