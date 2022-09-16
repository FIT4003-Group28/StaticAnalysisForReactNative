package defpackage;
/* compiled from: PG */
/* renamed from: awwa  reason: default package */
/* loaded from: classes2.dex */
public final class awwa {
    public final awwb a;

    public awwa(awwb awwbVar) {
        this.a = awwbVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awwa) && this.a.equals(((awwa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("VisibilityCriteriaModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
