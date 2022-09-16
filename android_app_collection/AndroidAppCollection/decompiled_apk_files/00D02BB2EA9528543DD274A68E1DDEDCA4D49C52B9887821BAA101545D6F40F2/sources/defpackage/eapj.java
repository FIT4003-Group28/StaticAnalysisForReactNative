package defpackage;
/* compiled from: PG */
/* renamed from: eapj  reason: default package */
/* loaded from: classes6.dex */
public final class eapj extends eaqn {
    public static final eapj a = new eapj(0);
    public static final eapj b = new eapj(1);
    public static final eapj c = new eapj(2);
    public static final eapj d = new eapj(3);
    public static final eapj e = new eapj(Integer.MAX_VALUE);
    public static final eapj f = new eapj(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380863L;

    static {
        eaum.a().a(eapo.g());
    }

    private eapj(int i) {
        super(i);
    }

    public static eapj a(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new eapj(i) : d : c : b : a : e : f;
    }

    public static eapj b(eapr eaprVar, eapr eaprVar2) {
        return a(eaqn.j(eaprVar, eaprVar2, eaoz.j));
    }

    private Object readResolve() {
        return a(this.p);
    }

    public final eaow c() {
        return new eaow(this.p * 60000);
    }

    @Override // defpackage.eaqn
    public final eaoz d() {
        return eaoz.j;
    }

    @Override // defpackage.eaqn, defpackage.eapu
    public final eapo e() {
        return eapo.g();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3);
        sb.append("PT");
        sb.append(valueOf);
        sb.append("M");
        return sb.toString();
    }
}
