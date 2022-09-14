package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: altv  reason: default package */
/* loaded from: classes.dex */
public final class altv implements Serializable, Comparable<altv> {
    public static final altv c = new altv(new akqh(0, 0), 0);
    public final akqh a;
    public final int b;

    public altv(akqh akqhVar, int i) {
        this.a = akqhVar;
        this.b = i;
    }

    @dzsi
    public static altv b(dwzu dwzuVar) {
        if (dwzuVar == null) {
            return null;
        }
        akqh a = akqh.a(dwzuVar.b);
        int i = (dwzuVar.a & 2) != 0 ? dwzuVar.c : Integer.MIN_VALUE;
        if (a == null) {
            return null;
        }
        return new altv(a, i);
    }

    @dzsi
    public static altv c(@dzsi dnfi dnfiVar) {
        akqh a;
        int i;
        if (dnfiVar == null || (dnfiVar.a & 1) == 0 || (a = akqh.a(dnfiVar.b)) == null) {
            return null;
        }
        if ((dnfiVar.a & 2) != 0) {
            double d = dnfiVar.c;
            Double.isNaN(d);
            i = (int) (d * 1000.0d);
        } else {
            i = Integer.MIN_VALUE;
        }
        return new altv(a, i);
    }

    @dzsi
    public static altv d(dmjm dmjmVar) {
        if (dmjmVar == null) {
            return null;
        }
        akqh a = akqh.a(dmjmVar.b);
        int i = (dmjmVar.a & 2) != 0 ? dmjmVar.c : Integer.MIN_VALUE;
        if (a == null) {
            return null;
        }
        return new altv(a, i);
    }

    @dzsi
    public static altv e(dtaq dtaqVar) {
        if ((dtaqVar.a & 2048) != 0) {
            dtai dtaiVar = dtaqVar.j;
            if (dtaiVar == null) {
                dtaiVar = dtai.d;
            }
            return new altv(new akqh(dtaiVar.b, dtaiVar.c), (dtaqVar.a & 4096) != 0 ? (int) (dtaqVar.k * 1000.0f) : Integer.MIN_VALUE);
        }
        return null;
    }

    public final dwzu a() {
        dwzt bZ = dwzu.e.bZ();
        String o = this.a.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwzu dwzuVar = (dwzu) bZ.b;
        o.getClass();
        int i = dwzuVar.a | 1;
        dwzuVar.a = i;
        dwzuVar.b = o;
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            dwzuVar.a = i | 2;
            dwzuVar.c = i2;
        }
        return bZ.bK();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(altv altvVar) {
        return this.a.compareTo(altvVar.a);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof altv)) {
            return false;
        }
        return this.a.equals(((altv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 33 + String.valueOf(valueOf).length());
        sb.append("{");
        sb.append(simpleName);
        sb.append(":id=");
        sb.append(valueOf);
        sb.append(", levelNumberE3=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
