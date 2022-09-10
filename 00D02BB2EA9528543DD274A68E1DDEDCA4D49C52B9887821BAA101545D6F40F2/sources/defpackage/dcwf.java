package defpackage;
/* compiled from: PG */
/* renamed from: dcwf  reason: default package */
/* loaded from: classes5.dex */
public final class dcwf<Data> implements Comparable<dcwf<Data>>, dcvq {
    public final dcwa a;
    public final Data b;
    private final long c;

    public dcwf(dcvf dcvfVar, dcwa dcwaVar, Data data) {
        this.c = dcvfVar.b;
        this.a = dcwaVar;
        this.b = data;
    }

    @Override // defpackage.dcvq
    public final long a() {
        return this.c;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return decu.b(this.c, ((dcwf) obj).c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcwf) {
            dcwf dcwfVar = (dcwf) obj;
            if (this.a.p(dcwfVar.a) && dbsd.a(this.b, dcwfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Data data = this.b;
        return hashCode + (data == null ? 0 : data.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(new dcvs(this.a));
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(": ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
