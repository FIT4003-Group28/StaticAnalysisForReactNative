package defpackage;
/* compiled from: PG */
/* renamed from: arae  reason: default package */
/* loaded from: classes2.dex */
public final class arae {
    public final aajl a;
    public final arah b;

    public arae(arah arahVar, aajl aajlVar) {
        this.b = arahVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof arae) && this.b.equals(((arae) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("FormattedStringSupportedAccessibilityDatasModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
