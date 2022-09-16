package defpackage;
/* compiled from: PG */
/* renamed from: apyf  reason: default package */
/* loaded from: classes2.dex */
public final class apyf {
    private final apxn a;

    public apyf(apxn apxnVar) {
        this.a = apxnVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyf) && this.a.equals(((apyf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("PlaylistItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
