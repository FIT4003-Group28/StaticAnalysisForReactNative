package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: akpz  reason: default package */
/* loaded from: classes2.dex */
public final class akpz extends akrl {
    private final akra a;
    private final akra b;
    private final List<Integer> c;

    public akpz(akra akraVar, akra akraVar2, List<Integer> list) {
        if (akraVar != null) {
            this.a = akraVar;
            if (akraVar2 != null) {
                this.b = akraVar2;
                this.c = list;
                return;
            }
            throw new NullPointerException("Null end");
        }
        throw new NullPointerException("Null start");
    }

    @Override // defpackage.akrl
    public final akra a() {
        return this.a;
    }

    @Override // defpackage.akrl
    public final akra b() {
        return this.b;
    }

    @Override // defpackage.akrl
    public final List<Integer> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akrl) {
            akrl akrlVar = (akrl) obj;
            if (this.a.equals(akrlVar.a()) && this.b.equals(akrlVar.b()) && this.c.equals(akrlVar.c())) {
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
        StringBuilder sb = new StringBuilder(length + 42 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DaisyChain{start=");
        sb.append(valueOf);
        sb.append(", end=");
        sb.append(valueOf2);
        sb.append(", polylineIndices=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
