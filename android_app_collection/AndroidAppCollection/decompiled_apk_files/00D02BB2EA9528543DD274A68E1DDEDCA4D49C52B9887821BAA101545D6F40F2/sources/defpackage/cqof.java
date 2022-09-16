package defpackage;
/* compiled from: PG */
/* renamed from: cqof  reason: default package */
/* loaded from: classes5.dex */
final class cqof<A, B> extends cqpc<A, B> {
    private final int a;
    private final A b;
    private final cqpa<B> c;
    private final cqom d;

    /* JADX WARN: Multi-variable type inference failed */
    public cqof(int i, Object obj, cqpa cqpaVar, cqom cqomVar) {
        this.a = i;
        if (obj != 0) {
            this.b = obj;
            if (cqpaVar != null) {
                this.c = cqpaVar;
                this.d = cqomVar;
                return;
            }
            throw new NullPointerException("Null applier");
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.cqpc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cqpc
    public final A b() {
        return this.b;
    }

    @Override // defpackage.cqpc
    public final cqpa<B> c() {
        return this.c;
    }

    @Override // defpackage.cqpc
    public final cqom d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqpc) {
            cqpc cqpcVar = (cqpc) obj;
            if (this.a == cqpcVar.a() && this.b.equals(cqpcVar.b()) && this.c.equals(cqpcVar.c()) && this.d.equals(cqpcVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ ((cqrp) this.b).a) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 79 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("SingleTransformedConstraint{viewId=");
        sb.append(i);
        sb.append(", value=");
        sb.append(valueOf);
        sb.append(", applier=");
        sb.append(valueOf2);
        sb.append(", transformer=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
