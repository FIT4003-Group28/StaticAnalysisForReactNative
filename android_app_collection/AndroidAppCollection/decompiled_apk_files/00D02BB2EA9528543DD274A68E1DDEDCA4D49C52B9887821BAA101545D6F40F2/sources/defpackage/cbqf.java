package defpackage;
/* compiled from: PG */
/* renamed from: cbqf  reason: default package */
/* loaded from: classes4.dex */
public final class cbqf {
    private final befw a;

    public cbqf(befw befwVar) {
        this.a = befwVar;
    }

    public static boolean b(@dzsi ilo iloVar) {
        if (iloVar == null || iloVar.ba()) {
            return false;
        }
        doay ce = iloVar.ce();
        return ce.equals(doay.TYPE_ESTABLISHMENT) || ce.equals(doay.TYPE_GEOCODED_ADDRESS);
    }

    public final dehn<ilo> a(ilo iloVar) {
        if (!dbsd.a(iloVar.ai(), akqi.a) || !dbsj.d(iloVar.y())) {
            if (iloVar.f) {
                return deha.a(iloVar);
            }
            deig d = deig.d();
            befu p = befv.p();
            p.j(bwrs.a(iloVar));
            befv m = p.m();
            ((bdvy) this.a).f(new cbqe(d), m);
            return d;
        }
        return deha.a(iloVar);
    }
}
