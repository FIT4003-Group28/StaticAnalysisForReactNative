package defpackage;
/* compiled from: PG */
/* renamed from: eapz  reason: default package */
/* loaded from: classes6.dex */
public final class eapz extends eaqn {
    public static final eapz a = new eapz(0);
    public static final eapz b = new eapz(1);
    public static final eapz c = new eapz(2);
    public static final eapz d = new eapz(3);
    public static final eapz e = new eapz(Integer.MAX_VALUE);
    public static final eapz f = new eapz(Integer.MIN_VALUE);
    private static final long serialVersionUID = 87525275727380868L;

    static {
        eaum.a().a(eapo.b());
    }

    private eapz(int i) {
        super(i);
    }

    public static eapz a(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new eapz(i) : d : c : b : a : e : f;
    }

    public static eapz b(eapr eaprVar, eapr eaprVar2) {
        return a(eaqn.j(eaprVar, eaprVar2, eaoz.d));
    }

    public static eapz c(eapt eaptVar, eapt eaptVar2) {
        if (!(eaptVar instanceof eapg)) {
            return a(eaqn.k(eaptVar, eaptVar2, a));
        }
        eapg eapgVar = (eapg) eaptVar;
        return a(eaor.d(eapgVar.b).M().h(((eapg) eaptVar2).a, eapgVar.a));
    }

    private Object readResolve() {
        return a(this.p);
    }

    @Override // defpackage.eaqn
    public final eaoz d() {
        return eaoz.d;
    }

    @Override // defpackage.eaqn, defpackage.eapu
    public final eapo e() {
        return eapo.b();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.p);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("P");
        sb.append(valueOf);
        sb.append("Y");
        return sb.toString();
    }
}
