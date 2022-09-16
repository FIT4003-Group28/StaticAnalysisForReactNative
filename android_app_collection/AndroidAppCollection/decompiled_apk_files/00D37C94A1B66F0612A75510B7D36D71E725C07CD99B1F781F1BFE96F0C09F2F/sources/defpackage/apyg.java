package defpackage;
/* compiled from: PG */
/* renamed from: apyg  reason: default package */
/* loaded from: classes2.dex */
public final class apyg {
    private final apxu a;

    public apyg(apxu apxuVar) {
        this.a = apxuVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyg) && this.a.equals(((apyg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("ReviewQueuePageDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
