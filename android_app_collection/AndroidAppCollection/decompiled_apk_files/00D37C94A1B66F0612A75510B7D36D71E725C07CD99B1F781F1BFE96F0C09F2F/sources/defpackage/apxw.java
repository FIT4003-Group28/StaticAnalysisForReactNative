package defpackage;
/* compiled from: PG */
/* renamed from: apxw  reason: default package */
/* loaded from: classes2.dex */
public final class apxw {
    public final apxh a;

    public apxw(apxh apxhVar) {
        this.a = apxhVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apxw) && this.a.equals(((apxw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("AdminSelfieDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
