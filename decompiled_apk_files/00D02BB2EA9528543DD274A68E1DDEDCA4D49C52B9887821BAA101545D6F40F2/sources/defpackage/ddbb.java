package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ddbb  reason: default package */
/* loaded from: classes5.dex */
public final class ddbb extends ddbc {
    private final ddbc a;
    private final double b;

    public ddbb(ddbc ddbcVar) {
        dbsk.a(true);
        this.a = ddbcVar;
        this.b = 0.5d;
    }

    @Override // defpackage.ddbc
    public final int b(int i) {
        int b = this.a.b(i);
        if (b <= 0) {
            return b;
        }
        double random = Math.random() - 0.5d;
        double d = b;
        Double.isNaN(d);
        return deay.e(b, ddbc.c((random + random) * d * 0.5d));
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof ddbb) {
            ddbb ddbbVar = (ddbb) obj;
            if (this.a.equals(ddbbVar.a)) {
                double d = ddbbVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Double.valueOf(0.5d)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append(valueOf);
        sb.append(".randomized(");
        sb.append(0.5d);
        sb.append(')');
        return sb.toString();
    }
}
