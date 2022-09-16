package defpackage;
/* compiled from: PG */
/* renamed from: apyj  reason: default package */
/* loaded from: classes2.dex */
public final class apyj {
    private final apxq a;

    public apyj(apxq apxqVar) {
        this.a = apxqVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyj) && this.a.equals(((apyj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("SharingDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
