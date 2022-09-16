package defpackage;
/* compiled from: PG */
/* renamed from: ardc  reason: default package */
/* loaded from: classes2.dex */
public final class ardc {
    private final ardd a;

    public ardc(ardd arddVar) {
        this.a = arddVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ardc) && this.a.equals(((ardc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("GestureLoggingDirectivesModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
