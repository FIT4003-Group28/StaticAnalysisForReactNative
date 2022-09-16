package defpackage;
/* compiled from: PG */
/* renamed from: eapv  reason: default package */
/* loaded from: classes6.dex */
public final class eapv extends eaqn {
    public static final eapv a = new eapv(0);
    public static final eapv b = new eapv(1);
    public static final eapv c = new eapv(2);
    public static final eapv d = new eapv(3);
    public static final eapv e = new eapv(Integer.MAX_VALUE);
    public static final eapv f = new eapv(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380862L;

    static {
        eaum.a().a(eapo.h());
    }

    private eapv(int i) {
        super(i);
    }

    public static eapv a(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new eapv(i) : d : c : b : a : e : f;
    }

    public static eapv b(eapr eaprVar, eapr eaprVar2) {
        return a(eaqn.j(eaprVar, eaprVar2, eaoz.k));
    }

    private Object readResolve() {
        return a(this.p);
    }

    @Override // defpackage.eaqn
    public final eaoz d() {
        return eaoz.k;
    }

    @Override // defpackage.eaqn, defpackage.eapu
    public final eapo e() {
        return eapo.h();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3);
        sb.append("PT");
        sb.append(valueOf);
        sb.append("S");
        return sb.toString();
    }
}
