package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaqt  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaqt extends eaqp {
    public static final eaox E;
    public static final eaox F;
    private static final eaox H;
    private static final eaox I;
    private static final eaox J;
    private static final eaox K;
    private static final eaox L;
    private static final eaon M;
    private static final eaon N;
    private static final eaon O;
    private static final eaon P;
    private static final eaon Q;
    private static final eaon R;
    private static final eaon S;
    private static final eaon T;
    private static final eaon U;
    private static final eaon V;
    private static final eaon W;
    private static final long serialVersionUID = 8283225332206808863L;
    public final int G;
    private final transient eaqs[] X;

    static {
        eaox eaoxVar = eatb.a;
        H = eaoxVar;
        eatf eatfVar = new eatf(eaoz.k, 1000L);
        I = eatfVar;
        eatf eatfVar2 = new eatf(eaoz.j, 60000L);
        J = eatfVar2;
        eatf eatfVar3 = new eatf(eaoz.i, 3600000L);
        K = eatfVar3;
        eatf eatfVar4 = new eatf(eaoz.h, 43200000L);
        E = eatfVar4;
        eatf eatfVar5 = new eatf(eaoz.g, 86400000L);
        F = eatfVar5;
        L = new eatf(eaoz.f, 604800000L);
        M = new eatd(eaop.y, eaoxVar, eatfVar);
        N = new eatd(eaop.x, eaoxVar, eatfVar5);
        O = new eatd(eaop.w, eatfVar, eatfVar2);
        P = new eatd(eaop.v, eatfVar, eatfVar5);
        Q = new eatd(eaop.u, eatfVar2, eatfVar3);
        R = new eatd(eaop.t, eatfVar2, eatfVar5);
        eatd eatdVar = new eatd(eaop.s, eatfVar3, eatfVar5);
        S = eatdVar;
        eatd eatdVar2 = new eatd(eaop.p, eatfVar3, eatfVar4);
        T = eatdVar2;
        U = new eatm(eatdVar, eaop.r);
        V = new eatm(eatdVar2, eaop.q);
        W = new eaqr();
    }

    public eaqt(eaok eaokVar, int i) {
        super(eaokVar, null);
        this.X = new eaqs[1024];
        if (i > 0) {
            this.G = i;
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Invalid min days in first week: ");
        sb.append(0);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eaqp
    public void V(eaqo eaqoVar) {
        eaqoVar.a = H;
        eaqoVar.b = I;
        eaqoVar.c = J;
        eaqoVar.d = K;
        eaqoVar.e = E;
        eaqoVar.f = F;
        eaqoVar.g = L;
        eaqoVar.m = M;
        eaqoVar.n = N;
        eaqoVar.o = O;
        eaqoVar.p = P;
        eaqoVar.q = Q;
        eaqoVar.r = R;
        eaqoVar.s = S;
        eaqoVar.u = T;
        eaqoVar.t = U;
        eaqoVar.v = V;
        eaqoVar.w = W;
        eaqoVar.E = new earb(this);
        eaqoVar.F = new earm(eaqoVar.E, this);
        eaqoVar.H = new easx(new eatc(eaqoVar.F, 99), eaop.e);
        eaqoVar.G = new eatc(new eatg((easx) eaqoVar.H), eaop.f);
        eaqoVar.I = new earj(this);
        eaqoVar.x = new eari(this, eaqoVar.f);
        eaqoVar.y = new eaqu(this, eaqoVar.f);
        eaqoVar.z = new eaqv(this, eaqoVar.f);
        eaqoVar.D = new earl(this);
        eaqoVar.B = new eara(this);
        eaqoVar.A = new eaqz(this, eaqoVar.g);
        eaqoVar.C = new eatc(new eatg(eaqoVar.B, eaop.k), eaop.k);
        eaqoVar.j = eaqoVar.E.s();
        eaqoVar.k = eaqoVar.H.s();
        eaqoVar.i = eaqoVar.D.s();
        eaqoVar.h = eaqoVar.B.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int W(int i) {
        return ap(i) ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int X(int i) {
        return (int) ((Y(i + 1) - Y(i)) / 604800000);
    }

    final long Y(int i) {
        long Z = Z(i);
        int aj = aj(Z);
        return aj > 8 - this.G ? Z + ((8 - aj) * 86400000) : Z - ((aj - 1) * 86400000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long Z(int i) {
        int i2 = i & 1023;
        eaqs eaqsVar = this.X[i2];
        if (eaqsVar == null || eaqsVar.a != i) {
            eaqsVar = new eaqs(i, at(i));
            this.X[i2] = eaqsVar;
        }
        return eaqsVar.b;
    }

    @Override // defpackage.eaqp, defpackage.eaok
    public final eaou a() {
        eaok eaokVar = this.a;
        if (eaokVar != null) {
            return eaokVar.a();
        }
        return eaou.b;
    }

    public abstract long aA(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long aa(int i, int i2) {
        return Z(i) + as(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long ab(int i, int i2, int i3) {
        return Z(i) + as(i, i2) + ((i3 - 1) * 86400000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ac(long j) {
        long ax = ax();
        long az = (j >> 1) + az();
        if (az < 0) {
            az = (az - ax) + 1;
        }
        int i = (int) (az / ax);
        long Z = Z(i);
        long j2 = j - Z;
        if (j2 < 0) {
            return i - 1;
        }
        long j3 = 31536000000L;
        if (j2 < 31536000000L) {
            return i;
        }
        if (true == ap(i)) {
            j3 = 31622400000L;
        }
        return Z + j3 > j ? i : i + 1;
    }

    public abstract int ad(long j, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ae(long j, int i, int i2) {
        return ((int) ((j - (Z(i) + as(i, i2))) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int af(long j, int i) {
        return ((int) ((j - Z(i)) / 86400000)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ag(long j) {
        int ac = ac(j);
        int ai = ai(j, ac);
        if (ai == 1) {
            return ac(j + 604800000);
        }
        return ai > 51 ? ac(j - 1209600000) : ac;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ah(long j) {
        return ai(j, ac(j));
    }

    final int ai(long j, int i) {
        long Y = Y(i);
        if (j < Y) {
            return X(i - 1);
        }
        if (j < Y(i + 1)) {
            return ((int) ((j - Y) / 604800000)) + 1;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int aj(long j) {
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
    public final int ak(long j) {
        return j >= 0 ? (int) (j % 86400000) : ((int) ((j + 1) % 86400000)) + 86399999;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int al(long j) {
        int ac = ac(j);
        return aq(ac, ad(j, ac));
    }

    public int am(long j, int i) {
        throw null;
    }

    public long an(int i, int i2, int i3) {
        easy.f(eaop.g, i, au(), av());
        easy.f(eaop.i, i2, 1, 12);
        easy.f(eaop.j, i3, 1, aq(i, i2));
        return ab(i, i2, i3);
    }

    public abstract long ao(long j, long j2);

    public abstract boolean ap(int i);

    public abstract int aq(int i, int i2);

    public abstract int ar(int i);

    public abstract long as(int i, int i2);

    public abstract long at(int i);

    public abstract int au();

    public abstract int av();

    public abstract long aw();

    public abstract long ax();

    public abstract long ay();

    public abstract long az();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eaqt eaqtVar = (eaqt) obj;
            if (this.G == eaqtVar.G && a().equals(eaqtVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (getClass().getName().hashCode() * 11) + a().hashCode() + this.G;
    }

    @Override // defpackage.eaok
    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        sb.append(name);
        sb.append('[');
        eaou a = a();
        if (a != null) {
            sb.append(a.d);
        }
        if (this.G != 4) {
            sb.append(",mdfw=");
            sb.append(this.G);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long d(int i, int i2, int i3, int i4) {
        eaok eaokVar = this.a;
        if (eaokVar == null) {
            easy.f(eaop.x, i4, 0, 86399999);
            return an(i, i2, i3) + i4;
        }
        return eaokVar.d(i, i2, i3, i4);
    }

    @Override // defpackage.eaqp, defpackage.eaqq, defpackage.eaok
    public final long e(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        eaok eaokVar = this.a;
        if (eaokVar == null) {
            easy.f(eaop.s, i4, 0, 23);
            easy.f(eaop.u, i5, 0, 59);
            easy.f(eaop.w, i6, 0, 59);
            easy.f(eaop.y, i7, 0, 999);
            return an(i, i2, i3) + (i4 * 3600000) + (i5 * 60000) + (i6 * 1000) + i7;
        }
        return eaokVar.e(i, i2, i3, i4, i5, i6, i7);
    }
}
