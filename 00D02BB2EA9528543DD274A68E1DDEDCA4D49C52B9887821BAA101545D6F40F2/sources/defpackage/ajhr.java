package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ajhr  reason: default package */
/* loaded from: classes2.dex */
public final class ajhr extends ajhz {
    public final int a;
    public final List<disy> b;
    private final List<diss> c;
    private final List<disy> d;

    public ajhr(int i, List<diss> list, List<disy> list2, List<disy> list3) {
        this.a = i;
        if (list != null) {
            this.c = list;
            if (list2 != null) {
                this.d = list2;
                if (list3 != null) {
                    this.b = list3;
                    return;
                }
                throw new NullPointerException("Null undeliveredSharesList");
            }
            throw new NullPointerException("Null createdSharesList");
        }
        throw new NullPointerException("Null requestedSharesList");
    }

    @Override // defpackage.ajhz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ajhz
    public final List<diss> b() {
        return this.c;
    }

    @Override // defpackage.ajhz
    public final List<disy> c() {
        return this.d;
    }

    @Override // defpackage.ajhz
    public final List<disy> d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajhz) {
            ajhz ajhzVar = (ajhz) obj;
            if (this.a == ajhzVar.a() && this.c.equals(ajhzVar.b()) && this.d.equals(ajhzVar.c()) && this.b.equals(ajhzVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.b);
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
