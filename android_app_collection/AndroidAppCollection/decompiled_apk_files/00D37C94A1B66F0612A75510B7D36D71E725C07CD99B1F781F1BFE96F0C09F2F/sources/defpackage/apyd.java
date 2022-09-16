package defpackage;
/* compiled from: PG */
/* renamed from: apyd  reason: default package */
/* loaded from: classes2.dex */
public final class apyd {
    private final apxm a;

    public apyd(apxm apxmVar) {
        this.a = apxmVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyd) && this.a.equals(((apyd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("DelegationContextModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
