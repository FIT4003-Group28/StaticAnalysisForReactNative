package defpackage;
/* compiled from: PG */
/* renamed from: apye  reason: default package */
/* loaded from: classes2.dex */
public final class apye {
    private final apxt a;

    public apye(apxt apxtVar) {
        this.a = apxtVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apye) && this.a.equals(((apye) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("IncludeDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
