package defpackage;
/* compiled from: PG */
/* renamed from: cqoe  reason: default package */
/* loaded from: classes5.dex */
final class cqoe<T> extends cqpb<T> {
    private final int a;
    private final T b;
    private final cqpa<T> c;

    public cqoe(int i, T t, cqpa<T> cqpaVar) {
        this.a = i;
        this.b = t;
        if (cqpaVar != null) {
            this.c = cqpaVar;
            return;
        }
        throw new NullPointerException("Null applier");
    }

    @Override // defpackage.cqpb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cqpb
    public final T b() {
        return this.b;
    }

    @Override // defpackage.cqpb
    public final cqpa<T> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqpb) {
            cqpb cqpbVar = (cqpb) obj;
            if (this.a == cqpbVar.a() && this.b.equals(cqpbVar.b()) && this.c.equals(cqpbVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
        sb.append("SingleConstraint{viewId=");
        sb.append(i);
        sb.append(", value=");
        sb.append(valueOf);
        sb.append(", applier=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
