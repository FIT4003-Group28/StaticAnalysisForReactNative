package defpackage;

import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: baii  reason: default package */
/* loaded from: classes2.dex */
public final class baii extends baiq {
    public static final baii a = new baii(0);
    public static final baii b = new baii(1);
    public static final baii c = new baii(2);
    public static final baii d = new baii(3);
    public static final baii e = new baii(Integer.MAX_VALUE);
    public static final baii f = new baii(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
    private static final long serialVersionUID = 87525275727380862L;

    static {
        balh g = banl.g();
        baie c2 = baie.c();
        if (c2 == g.c) {
            return;
        }
        new balh(g.a, g.b, c2);
    }

    private baii(int i) {
        super(i);
    }

    public static baii g(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new baii(i) : d : c : b : a : e : f;
    }

    public static baii h(baig baigVar, baig baigVar2) {
        return g(bahx.k.a(bahq.e(baigVar)).a(((baia) baigVar2).a, ((baia) baigVar).a));
    }

    private Object readResolve() {
        return g(this.g);
    }

    @Override // defpackage.baiq, defpackage.baih
    public final baie e() {
        return baie.c();
    }

    @Override // defpackage.baiq
    public final bahx f() {
        return bahx.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 3);
        sb.append("PT");
        sb.append(valueOf);
        sb.append("S");
        return sb.toString();
    }
}
