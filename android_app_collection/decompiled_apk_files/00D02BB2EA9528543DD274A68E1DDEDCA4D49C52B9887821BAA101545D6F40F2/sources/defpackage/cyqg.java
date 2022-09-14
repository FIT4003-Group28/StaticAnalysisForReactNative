package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cyqg  reason: default package */
/* loaded from: classes5.dex */
public final class cyqg implements Comparable<cyqg> {
    public final long a;
    public final double b;
    public final dspd c;
    public final transient List<cysn> d = new ArrayList();

    public cyqg(long j, double d, dspd dspdVar) {
        this.a = j;
        this.b = d;
        this.c = dspdVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(cyqg cyqgVar) {
        cyqg cyqgVar2 = cyqgVar;
        int compare = Double.compare(cyqgVar2.b, this.b);
        return compare == 0 ? (this.a > cyqgVar2.a ? 1 : (this.a == cyqgVar2.a ? 0 : -1)) : compare;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyqg) {
            cyqg cyqgVar = (cyqg) obj;
            if (this.a == cyqgVar.a && dbsd.a(this.c, cyqgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.c});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.g("id", this.a);
        b.d("affinity", this.b);
        dspd dspdVar = this.c;
        b.b("protoBytes", dspdVar == null ? "null" : dspdVar.G());
        return b.toString();
    }
}
