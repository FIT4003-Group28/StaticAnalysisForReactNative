package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baiw  reason: default package */
/* loaded from: classes2.dex */
public abstract class baiw extends bais {
    public static final bahn A;
    public static final bahn B;
    public static final bahn C;
    public static final bahn D;
    public static final bahn E;
    public static final bahv n;
    public static final bahv o;
    public static final bahv p;
    public static final bahv q;
    public static final bahv r;
    public static final bahv s;
    private static final long serialVersionUID = 8283225332206808863L;
    public static final bahv t;
    public static final bahn u;
    public static final bahn v;
    public static final bahn w;
    public static final bahn x;
    public static final bahn y;
    public static final bahn z;
    public final int F;
    private final transient baiv[] G;

    static {
        bahv bahvVar = bajz.a;
        n = bahvVar;
        bakd bakdVar = new bakd(bahx.k, 1000L);
        o = bakdVar;
        bakd bakdVar2 = new bakd(bahx.j, 60000L);
        p = bakdVar2;
        bakd bakdVar3 = new bakd(bahx.i, 3600000L);
        q = bakdVar3;
        bakd bakdVar4 = new bakd(bahx.h, 43200000L);
        r = bakdVar4;
        bakd bakdVar5 = new bakd(bahx.g, 86400000L);
        s = bakdVar5;
        t = new bakd(bahx.f, 604800000L);
        u = new bakb(bahp.y, bahvVar, bakdVar);
        v = new bakb(bahp.x, bahvVar, bakdVar5);
        w = new bakb(bahp.w, bakdVar, bakdVar2);
        x = new bakb(bahp.v, bakdVar, bakdVar5);
        y = new bakb(bahp.u, bakdVar2, bakdVar3);
        z = new bakb(bahp.t, bakdVar2, bakdVar5);
        bakb bakbVar = new bakb(bahp.s, bakdVar3, bakdVar5);
        A = bakbVar;
        bakb bakbVar2 = new bakb(bahp.p, bakdVar3, bakdVar4);
        B = bakbVar2;
        C = new baki(bakbVar, bahp.r);
        D = new baki(bakbVar2, bahp.q);
        E = new baiu();
    }

    public baiw(bahl bahlVar, int i) {
        super(bahlVar, null);
        this.G = new baiv[1024];
        this.F = i;
    }

    @Override // defpackage.bais
    protected void N(bair bairVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O(long j, int i, int i2) {
        return ((int) ((j - (ae(i) + ac(i, i2))) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int P(long j) {
        long j2;
        if (j >= 0) {
            j2 = j / 86400000;
        } else {
            j2 = (j - 86399999) / 86400000;
            if (j2 < -3) {
                return ((int) ((j2 + 4) % 7)) + 7;
            }
        }
        return ((int) ((j2 + 3) % 7)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Q(long j, int i) {
        return ((int) ((j - ae(i)) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int R(long j) {
        int Z = Z(j);
        return S(Z, U(j, Z));
    }

    public abstract int S(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int T(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    public abstract int U(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int V(long j) {
        return W(j, Z(j));
    }

    final int W(long j, int i) {
        long ab = ab(i);
        if (j < ab) {
            return X(i - 1);
        }
        if (j < ab(i + 1)) {
            return ((int) ((j - ab) / 604800000)) + 1;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int X(int i) {
        return (int) ((ab(i + 1) - ab(i)) / 604800000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Y(long j) {
        int Z = Z(j);
        int W = W(j, Z);
        if (W == 1) {
            return Z(j + 604800000);
        }
        return W > 51 ? Z(j - 1209600000) : Z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int Z(long j) {
        long j2 = (j >> 1) + 31083597720000L;
        if (j2 < 0) {
            j2 -= 15778475999L;
        }
        int i = (int) (j2 / 15778476000L);
        long ae = ae(i);
        long j3 = j - ae;
        if (j3 < 0) {
            return i - 1;
        }
        long j4 = 31536000000L;
        if (j3 < 31536000000L) {
            return i;
        }
        if (true == ai(i)) {
            j4 = 31622400000L;
        }
        return ae + j4 > j ? i : i + 1;
    }

    public abstract long aa(int i);

    final long ab(int i) {
        long ae = ae(i);
        int P = P(ae);
        return P > 8 - this.F ? ae + ((8 - P) * 86400000) : ae - ((P - 1) * 86400000);
    }

    public abstract long ac(int i, int i2);

    public abstract long ad(long j, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ae(int i) {
        int i2 = i & 1023;
        baiv baivVar = this.G[i2];
        if (baivVar == null || baivVar.a != i) {
            baivVar = new baiv(i, aa(i));
            this.G[i2] = baivVar;
        }
        return baivVar.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long af(int i, int i2, int i3) {
        return ae(i) + ac(i, i2) + ((i3 - 1) * 86400000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ag(int i, int i2) {
        return ae(i) + ac(i, i2);
    }

    public abstract long ah(long j, int i);

    public abstract boolean ai(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            baiw baiwVar = (baiw) obj;
            if (this.F == baiwVar.F && z().equals(baiwVar.z())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + z().hashCode() + this.F;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        baht z2 = z();
        if (z2 != null) {
            sb.append(z2.c);
        }
        if (this.F != 4) {
            sb.append(",mdfw=");
            sb.append(this.F);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.bais, defpackage.bahl
    public final baht z() {
        bahl bahlVar = this.a;
        if (bahlVar != null) {
            return bahlVar.z();
        }
        return baht.a;
    }
}
