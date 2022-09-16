package defpackage;
/* compiled from: PG */
/* renamed from: awlr  reason: default package */
/* loaded from: classes2.dex */
public final class awlr {
    private final awlz a;

    public awlr(awlz awlzVar) {
        this.a = awlzVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awlr) && this.a.equals(((awlr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("AttachmentRunModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
