package defpackage;
/* compiled from: PG */
/* renamed from: eapk  reason: default package */
/* loaded from: classes6.dex */
public final class eapk extends eaqn {
    public static final eapk a = new eapk(0);
    public static final eapk b = new eapk(1);
    public static final eapk c = new eapk(2);
    public static final eapk d = new eapk(3);
    public static final eapk e = new eapk(4);
    public static final eapk f = new eapk(5);
    public static final eapk g = new eapk(6);
    public static final eapk h = new eapk(7);
    public static final eapk i = new eapk(8);
    public static final eapk j = new eapk(9);
    public static final eapk k = new eapk(10);
    public static final eapk l = new eapk(11);
    public static final eapk m = new eapk(12);
    public static final eapk n = new eapk(Integer.MAX_VALUE);
    public static final eapk o = new eapk(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380867L;

    static {
        eaum.a().a(eapo.c());
    }

    private eapk(int i2) {
        super(i2);
    }

    public static eapk a(int i2) {
        if (i2 != Integer.MIN_VALUE) {
            if (i2 == Integer.MAX_VALUE) {
                return n;
            }
            switch (i2) {
                case 0:
                    return a;
                case 1:
                    return b;
                case 2:
                    return c;
                case 3:
                    return d;
                case 4:
                    return e;
                case 5:
                    return f;
                case 6:
                    return g;
                case 7:
                    return h;
                case 8:
                    return i;
                case 9:
                    return j;
                case 10:
                    return k;
                case 11:
                    return l;
                case 12:
                    return m;
                default:
                    return new eapk(i2);
            }
        }
        return o;
    }

    public static eapk b(eapr eaprVar, eapr eaprVar2) {
        return a(eaqn.j(eaprVar, eaprVar2, eaoz.e));
    }

    public static eapk c(eapt eaptVar, eapt eaptVar2) {
        if (!(eaptVar instanceof eapg) || !(eaptVar2 instanceof eapg)) {
            return a(eaqn.k(eaptVar, eaptVar2, a));
        }
        return a(eaor.d(eaptVar.j()).K().h(((eapg) eaptVar2).a, ((eapg) eaptVar).a));
    }

    private Object readResolve() {
        return a(this.p);
    }

    @Override // defpackage.eaqn
    public final eaoz d() {
        return eaoz.e;
    }

    @Override // defpackage.eaqn, defpackage.eapu
    public final eapo e() {
        return eapo.c();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("P");
        sb.append(valueOf);
        sb.append("M");
        return sb.toString();
    }
}
