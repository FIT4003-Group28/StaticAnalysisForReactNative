package defpackage;
/* compiled from: PG */
/* renamed from: apyh  reason: default package */
/* loaded from: classes2.dex */
public final class apyh {
    private final apxo a;

    public apyh(apxo apxoVar) {
        this.a = apxoVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apyh) && this.a.equals(((apyh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("ScoringEventInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
