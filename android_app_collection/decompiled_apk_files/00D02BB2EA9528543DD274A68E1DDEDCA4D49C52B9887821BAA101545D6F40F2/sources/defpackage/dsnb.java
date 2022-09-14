package defpackage;
/* compiled from: PG */
/* renamed from: dsnb  reason: default package */
/* loaded from: classes6.dex */
public final class dsnb implements Comparable<dsnb> {
    public final dsne a;
    public final dsnd b;

    public dsnb(dsne dsneVar, dsnd dsndVar) {
        this.a = dsneVar;
        this.b = dsndVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dsnb a(dsne dsneVar, dsnd dsndVar) {
        return new dsnb(dsneVar, dsndVar);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(dsnb dsnbVar) {
        return this.b.compareTo(dsnbVar.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
