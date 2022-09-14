package defpackage;
/* compiled from: PG */
/* renamed from: eapa  reason: default package */
/* loaded from: classes6.dex */
public final class eapa extends eaqn {
    public static final eapa a = new eapa(0);
    public static final eapa b = new eapa(1);
    public static final eapa c = new eapa(2);
    public static final eapa d = new eapa(3);
    public static final eapa e = new eapa(4);
    public static final eapa f = new eapa(5);
    public static final eapa g = new eapa(6);
    public static final eapa h = new eapa(7);
    public static final eapa i = new eapa(8);
    public static final eapa j = new eapa(Integer.MAX_VALUE);
    public static final eapa k = new eapa(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380864L;

    static {
        eaum.a().a(eapo.f());
    }

    private eapa(int i2) {
        super(i2);
    }

    public static eapa a(int i2) {
        if (i2 != Integer.MIN_VALUE) {
            if (i2 == Integer.MAX_VALUE) {
                return j;
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
                default:
                    return new eapa(i2);
            }
        }
        return k;
    }

    public static eapa b(eapr eaprVar, eapr eaprVar2) {
        return a(eaqn.j(eaprVar, eaprVar2, eaoz.i));
    }

    private Object readResolve() {
        return a(this.p);
    }

    @Override // defpackage.eaqn
    public final eaoz d() {
        return eaoz.i;
    }

    @Override // defpackage.eaqn, defpackage.eapu
    public final eapo e() {
        return eapo.f();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3);
        sb.append("PT");
        sb.append(valueOf);
        sb.append("H");
        return sb.toString();
    }
}
