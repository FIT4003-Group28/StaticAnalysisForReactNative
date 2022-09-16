package defpackage;
/* compiled from: PG */
/* renamed from: awvy  reason: default package */
/* loaded from: classes2.dex */
public final class awvy {
    private final awvz a;

    public awvy(awvz awvzVar) {
        this.a = awvzVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof awvy) && this.a.equals(((awvy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("VisibilityConditionsModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
