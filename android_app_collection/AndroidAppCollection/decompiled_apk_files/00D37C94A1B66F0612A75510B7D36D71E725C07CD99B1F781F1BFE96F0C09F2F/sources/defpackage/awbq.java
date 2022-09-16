package defpackage;
/* compiled from: PG */
/* renamed from: awbq  reason: default package */
/* loaded from: classes2.dex */
public final class awbq {
    private final awbr a;

    public awbq(awbr awbrVar) {
        this.a = awbrVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awbq) && this.a.equals(((awbq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("VisibilityLoggingDirectivesModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
