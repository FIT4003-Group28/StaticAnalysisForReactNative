package defpackage;
/* compiled from: PG */
/* renamed from: mwf  reason: default package */
/* loaded from: classes7.dex */
public final class mwf extends krq {
    private final jzp b;

    public mwf(jzp jzpVar) {
        dbsk.l(((btvq) btsr.a(btvq.class)).rp().getCarParameters().j);
        this.b = jzpVar;
    }

    @Override // defpackage.krq
    @SafeVarargs
    protected final cqmj<krv> d(cqmp<krv>... cqmpVarArr) {
        if (this.b.b()) {
            cqmj<krv> fY = cqgr.fY(cqmpVarArr);
            fY.f(cqgr.cW(mwe.a), cqgr.az(false), cqgr.aC(false));
            return fY;
        }
        return cqgr.fY(cqmpVarArr);
    }

    @Override // defpackage.krq
    @SafeVarargs
    protected final cqmj<krv> e(cqmp<krv>... cqmpVarArr) {
        return new cqmh(mwg.class, cqmpVarArr);
    }
}
