package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqwv  reason: default package */
/* loaded from: classes5.dex */
public final class cqwv extends cqyw {
    public final dcep<String> a;
    public final dcep<String> b;
    public final dcdc<Throwable> c;

    public cqwv(dcep<String> dcepVar, dcep<String> dcepVar2, dcdc<Throwable> dcdcVar) {
        this.a = dcepVar;
        this.b = dcepVar2;
        this.c = dcdcVar;
    }

    @Override // defpackage.cqyw
    public final dcep<String> a() {
        return this.a;
    }

    @Override // defpackage.cqyw
    public final dcep<String> b() {
        return this.b;
    }

    @Override // defpackage.cqyw
    public final dcdc<Throwable> c() {
        return this.c;
    }

    @Override // defpackage.cqyw
    public final cqyv d() {
        return new cqwu(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqyw) {
            cqyw cqywVar = (cqyw) obj;
            if (this.a.equals(cqywVar.a()) && this.b.equals(cqywVar.b()) && dchl.m(this.c, cqywVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("SyncResult{changedElementKeys=");
        sb.append(valueOf);
        sb.append(", uploadedElementKeys=");
        sb.append(valueOf2);
        sb.append(", failures=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
