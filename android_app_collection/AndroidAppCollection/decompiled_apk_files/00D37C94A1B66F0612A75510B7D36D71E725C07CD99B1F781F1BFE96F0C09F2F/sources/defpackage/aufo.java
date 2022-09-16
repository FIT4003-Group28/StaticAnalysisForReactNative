package defpackage;
/* compiled from: PG */
/* renamed from: aufo  reason: default package */
/* loaded from: classes2.dex */
public final class aufo {
    private final aufp a;

    public aufo(aufp aufpVar) {
        this.a = aufpVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aufo) && this.a.equals(((aufo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("PostCreationDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
