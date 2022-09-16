package defpackage;
/* compiled from: PG */
/* renamed from: apxx  reason: default package */
/* loaded from: classes2.dex */
public final class apxx {
    private final apxi a;

    public apxx(apxi apxiVar) {
        this.a = apxiVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apxx) && this.a.equals(((apxx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("AnalyticsDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
