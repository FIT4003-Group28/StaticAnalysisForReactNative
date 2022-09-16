package defpackage;
/* compiled from: PG */
/* renamed from: aswd  reason: default package */
/* loaded from: classes2.dex */
public final class aswd {
    private final aswh a;

    public aswd(aswh aswhVar) {
        this.a = aswhVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aswd) && this.a.equals(((aswd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("MacroModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
