package defpackage;
/* compiled from: PG */
/* renamed from: btzb  reason: default package */
/* loaded from: classes4.dex */
final class btzb<I, O> extends btzx<I, O> {
    private final btzr<I> a;
    private final O b;

    public btzb(btzr<I> btzrVar, O o) {
        this.a = btzrVar;
        if (o != null) {
            this.b = o;
            return;
        }
        throw new NullPointerException("Null value");
    }

    @Override // defpackage.btzx
    public final btzr<I> a() {
        return this.a;
    }

    @Override // defpackage.btzx
    public final O b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btzx) {
            btzx btzxVar = (btzx) obj;
            if (this.a.equals(btzxVar.a()) && this.b.equals(btzxVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29 + String.valueOf(valueOf2).length());
        sb.append("RpcResponse{context=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
