package defpackage;
/* compiled from: PG */
/* renamed from: cwjm  reason: default package */
/* loaded from: classes.dex */
public final class cwjm<AccountT> extends cwjq<AccountT> {
    private final cwjs<AccountT> a;
    private final cwjs<AccountT> b;
    private final dcdc<cwjp> c;
    private final cwjn d;

    public cwjm(cwjs cwjsVar, cwjs cwjsVar2, cwjn cwjnVar, dcdc dcdcVar) {
        this.a = cwjsVar;
        this.b = cwjsVar2;
        this.d = cwjnVar;
        this.c = dcdcVar;
    }

    @Override // defpackage.cwjq
    public final cwjs<AccountT> a() {
        return this.a;
    }

    @Override // defpackage.cwjq
    public final cwjs<AccountT> b() {
        return this.b;
    }

    @Override // defpackage.cwjq
    public final dcdc<cwjp> c() {
        return this.c;
    }

    @Override // defpackage.cwjq
    public final cwjn d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        dcdc<cwjp> dcdcVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwjq) {
            cwjq cwjqVar = (cwjq) obj;
            if (this.a.equals(cwjqVar.a()) && this.b.equals(cwjqVar.b()) && this.d.equals(cwjqVar.d()) && ((dcdcVar = this.c) != null ? dchl.m(dcdcVar, cwjqVar.c()) : cwjqVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        dcdc<cwjp> dcdcVar = this.c;
        return hashCode ^ (dcdcVar == null ? 0 : dcdcVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ImageModelLoader{imageRetriever=");
        sb.append(valueOf);
        sb.append(", secondaryImageRetriever=");
        sb.append(valueOf2);
        sb.append(", defaultImageRetriever=");
        sb.append(valueOf3);
        sb.append(", postProcessors=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
