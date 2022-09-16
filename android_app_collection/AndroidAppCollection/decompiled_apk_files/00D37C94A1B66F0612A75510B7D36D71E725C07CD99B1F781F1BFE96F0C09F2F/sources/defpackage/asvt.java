package defpackage;
/* compiled from: PG */
/* renamed from: asvt  reason: default package */
/* loaded from: classes2.dex */
public final class asvt {
    public final aajl a;
    public final asvv b;

    public asvt(asvv asvvVar, aajl aajlVar) {
        this.b = asvvVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asvt) && this.b.equals(((asvt) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("LoggingDirectivesModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
