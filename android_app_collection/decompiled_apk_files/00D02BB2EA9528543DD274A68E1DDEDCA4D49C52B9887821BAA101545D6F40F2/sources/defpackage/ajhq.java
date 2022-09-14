package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ajhq  reason: default package */
/* loaded from: classes2.dex */
public final class ajhq extends ajhw {
    public final int a;
    public final List<dqzv> b;
    public final List<dqzv> c;
    private final List<dqzx> d;

    public ajhq(int i, List<dqzx> list, List<dqzv> list2, List<dqzv> list3) {
        this.a = i;
        this.d = list;
        this.b = list2;
        this.c = list3;
    }

    @Override // defpackage.ajhw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ajhw
    public final List<dqzx> b() {
        return this.d;
    }

    @Override // defpackage.ajhw
    public final List<dqzv> c() {
        return this.b;
    }

    @Override // defpackage.ajhw
    public final List<dqzv> d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajhw) {
            ajhw ajhwVar = (ajhw) obj;
            if (this.a == ajhwVar.a() && this.d.equals(ajhwVar.b()) && this.b.equals(ajhwVar.c()) && this.c.equals(ajhwVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 93 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Result{outcome=");
        sb.append(i);
        sb.append(", requestedSharesList=");
        sb.append(valueOf);
        sb.append(", createdSharesList=");
        sb.append(valueOf2);
        sb.append(", undeliveredSharesList=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
