package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: dcwi  reason: default package */
/* loaded from: classes5.dex */
public final class dcwi implements Serializable, dcxj, dcxa {
    private static final dcwa[] b;
    public final int a;
    private final dcwa[] c;

    static {
        dcus.c(dcwi.class);
        b = new dcwa[0];
    }

    public dcwi(List<dcwa> list) {
        dcwa[] dcwaVarArr = (dcwa[]) list.toArray(b);
        this.a = dcwaVarArr.length;
        this.c = dcwaVarArr;
    }

    public final dcwa a(int i) {
        return this.c[i];
    }

    @Override // defpackage.dcxj
    public final int e() {
        return Math.max(0, this.a - 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dcwi)) {
            return false;
        }
        dcwi dcwiVar = (dcwi) obj;
        if (this.a != dcwiVar.a) {
            return false;
        }
        int i = 0;
        while (true) {
            dcwa[] dcwaVarArr = this.c;
            if (i >= dcwaVarArr.length) {
                return true;
            }
            if (!dcwaVarArr[i].p(dcwiVar.c[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.dcxj
    public final void f(int i, dcxi dcxiVar) {
        dcwa[] dcwaVarArr = this.c;
        dcxiVar.a(dcwaVarArr[i], dcwaVarArr[i + 1]);
    }

    @Override // defpackage.dcxj
    public final boolean g() {
        return false;
    }

    @Override // defpackage.dcxa
    public final boolean h(dcwa dcwaVar) {
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.deepHashCode(this.c))});
    }

    @Override // defpackage.dcxj
    public final boolean i() {
        throw new IllegalStateException("An S2Polyline has no interior, so containsOrigin() should never be called on one.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S2Polyline, ");
        sb.append(this.c.length);
        sb.append(" points. [");
        for (dcwa dcwaVar : this.c) {
            sb.append(dcwaVar.r());
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
