package defpackage;
/* compiled from: PG */
/* renamed from: eapw  reason: default package */
/* loaded from: classes6.dex */
public final class eapw extends eaqn {
    public static final eapw a = new eapw(0);
    public static final eapw b = new eapw(1);
    public static final eapw c = new eapw(2);
    public static final eapw d = new eapw(3);
    public static final eapw e = new eapw(Integer.MAX_VALUE);
    public static final eapw f = new eapw(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380866L;

    static {
        eaum.a().a(eapo.d());
    }

    private eapw(int i) {
        super(i);
    }

    public static eapw a(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new eapw(i) : d : c : b : a : e : f;
    }

    public static eapw b(eapr eaprVar, eapr eaprVar2) {
        return a(eaqn.j(eaprVar, eaprVar2, eaoz.f));
    }

    public static eapw c(eapt eaptVar, eapt eaptVar2) {
        if (!(eaptVar instanceof eapg)) {
            return a(eaqn.k(eaptVar, eaptVar2, a));
        }
        eapg eapgVar = (eapg) eaptVar;
        return a(eaor.d(eapgVar.b).F().h(((eapg) eaptVar2).a, eapgVar.a));
    }

    private Object readResolve() {
        return a(this.p);
    }

    @Override // defpackage.eaqn
    public final eaoz d() {
        return eaoz.f;
    }

    @Override // defpackage.eaqn, defpackage.eapu
    public final eapo e() {
        return eapo.d();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("P");
        sb.append(valueOf);
        sb.append("W");
        return sb.toString();
    }
}
