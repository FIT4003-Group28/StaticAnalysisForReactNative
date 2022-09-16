package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ajhs  reason: default package */
/* loaded from: classes2.dex */
public final class ajhs extends ajic {
    private final int a;
    private final List<diss> b;
    private final List<disy> c;

    public ajhs(int i, @dzsi List<diss> list, @dzsi List<disy> list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.ajic
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ajic
    @dzsi
    public final List<diss> b() {
        return this.b;
    }

    @Override // defpackage.ajic
    @dzsi
    public final List<disy> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        List<diss> list;
        List<disy> list2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajic) {
            ajic ajicVar = (ajic) obj;
            if (this.a == ajicVar.a() && ((list = this.b) != null ? list.equals(ajicVar.b()) : ajicVar.b() == null) && ((list2 = this.c) != null ? list2.equals(ajicVar.c()) : ajicVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        List<diss> list = this.b;
        int i2 = 0;
        int hashCode = (i ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<disy> list2 = this.c;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68 + String.valueOf(valueOf2).length());
        sb.append("Result{status=");
        sb.append(i);
        sb.append(", requestedSharesList=");
        sb.append(valueOf);
        sb.append(", createdSharesList=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
