package defpackage;
/* compiled from: PG */
/* renamed from: eaov  reason: default package */
/* loaded from: classes6.dex */
public final class eaov extends eaqn {
    public static final eaov a = new eaov(0);
    public static final eaov b = new eaov(1);
    public static final eaov c = new eaov(2);
    public static final eaov d = new eaov(3);
    public static final eaov e = new eaov(4);
    public static final eaov f = new eaov(5);
    public static final eaov g = new eaov(6);
    public static final eaov h = new eaov(7);
    public static final eaov i = new eaov(Integer.MAX_VALUE);
    public static final eaov j = new eaov(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380865L;

    static {
        eaum.a().a(eapo.e());
    }

    private eaov(int i2) {
        super(i2);
    }

    public static eaov a(int i2) {
        if (i2 != Integer.MIN_VALUE) {
            if (i2 == Integer.MAX_VALUE) {
                return i;
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
                default:
                    return new eaov(i2);
            }
        }
        return j;
    }

    public static eaov b(eapr eaprVar, eapr eaprVar2) {
        return a(eaqn.j(eaprVar, eaprVar2, eaoz.g));
    }

    public static eaov c(eapt eaptVar, eapt eaptVar2) {
        if (!(eaptVar instanceof eapg) || !(eaptVar2 instanceof eapg)) {
            return a(eaqn.k(eaptVar, eaptVar2, a));
        }
        return a(eaor.d(eaptVar.j()).B().h(((eapg) eaptVar2).a, ((eapg) eaptVar).a));
    }

    private Object readResolve() {
        return a(this.p);
    }

    @Override // defpackage.eaqn
    public final eaoz d() {
        return eaoz.g;
    }

    @Override // defpackage.eaqn, defpackage.eapu
    public final eapo e() {
        return eapo.e();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("P");
        sb.append(valueOf);
        sb.append("D");
        return sb.toString();
    }
}
