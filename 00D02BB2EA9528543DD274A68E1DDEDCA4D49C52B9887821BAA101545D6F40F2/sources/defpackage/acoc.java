package defpackage;
/* compiled from: PG */
/* renamed from: acoc  reason: default package */
/* loaded from: classes2.dex */
public final class acoc extends cqiw<acod> {
    @dzsi
    private final cqjg a;

    private acoc() {
        this.a = null;
    }

    @SafeVarargs
    public static <T extends cqkp> cqnm<T> e(cqlc<T, acod> cqlcVar, cqmp<T>... cqmpVarArr) {
        return cqgr.fP(new acoc(), cqlcVar, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnm<T> f(cqlc<T, acod> cqlcVar, cqjg cqjgVar, cqmp<T>... cqmpVarArr) {
        return cqgr.fP(new acoc(cqjgVar), cqlcVar, cqmpVarArr);
    }

    private acoc(cqjg cqjgVar) {
        super(cqjgVar);
        this.a = cqjgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<acod> a() {
        cqmp[] cqmpVarArr = new cqmp[3];
        cqjg cqjgVar = this.a;
        cqmpVarArr[0] = cqjgVar == null ? cqmp.e : cqgr.aT(cqjgVar);
        cqmpVarArr[1] = cqjv.f(acnr.ON_TAB_SELECTED_LISTENER, acoa.a);
        cqmpVarArr[2] = acns.e(acob.a);
        return acns.f(cqmpVarArr);
    }
}
