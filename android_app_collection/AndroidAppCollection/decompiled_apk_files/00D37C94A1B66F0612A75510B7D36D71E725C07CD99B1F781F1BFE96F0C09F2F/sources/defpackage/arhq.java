package defpackage;
/* compiled from: PG */
/* renamed from: arhq  reason: default package */
/* loaded from: classes2.dex */
public final class arhq {
    private final arhs a;

    public arhq(arhs arhsVar) {
        this.a = arhsVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof arhq) && this.a.equals(((arhq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("IconModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
