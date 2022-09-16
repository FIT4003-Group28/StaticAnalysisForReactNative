package defpackage;
/* compiled from: PG */
/* renamed from: apyi  reason: default package */
/* loaded from: classes2.dex */
public final class apyi {
    private final apxp a;

    public apyi(apxp apxpVar) {
        this.a = apxpVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyi) && this.a.equals(((apyi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("ServletDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
