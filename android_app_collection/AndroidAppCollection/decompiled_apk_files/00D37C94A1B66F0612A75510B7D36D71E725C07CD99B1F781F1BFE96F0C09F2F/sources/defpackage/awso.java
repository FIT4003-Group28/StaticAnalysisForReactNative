package defpackage;
/* compiled from: PG */
/* renamed from: awso  reason: default package */
/* loaded from: classes2.dex */
public final class awso {
    private final awsp a;

    public awso(awsp awspVar) {
        this.a = awspVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awso) && this.a.equals(((awso) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("MentionRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
