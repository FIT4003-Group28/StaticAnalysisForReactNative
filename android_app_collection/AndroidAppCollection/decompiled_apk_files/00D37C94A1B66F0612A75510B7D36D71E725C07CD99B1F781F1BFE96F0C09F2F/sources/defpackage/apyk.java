package defpackage;
/* compiled from: PG */
/* renamed from: apyk  reason: default package */
/* loaded from: classes2.dex */
public final class apyk {
    private final apxv a;

    public apyk(apxv apxvVar) {
        this.a = apxvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyk) && this.a.equals(((apyk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("ToolboxPageDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
