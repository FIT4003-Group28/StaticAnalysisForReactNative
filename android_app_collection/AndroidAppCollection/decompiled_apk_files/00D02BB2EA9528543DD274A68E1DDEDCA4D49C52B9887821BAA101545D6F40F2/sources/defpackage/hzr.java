package defpackage;
/* compiled from: PG */
/* renamed from: hzr  reason: default package */
/* loaded from: classes6.dex */
public final class hzr extends cqiw<hzv> {
    private final int a;
    @dzsi
    private final Integer b;

    private hzr(int i) {
        this(i, null);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnm<T> d(cqlc<T, hzv> cqlcVar, cqmp<T>... cqmpVarArr) {
        return cqgr.fP(new hzr(0), cqlcVar, cqmpVarArr);
    }

    @SafeVarargs
    public static <T extends cqkp> cqnm<T> e(cqlc<T, hzv> cqlcVar, cqmp<T>... cqmpVarArr) {
        return cqgr.fP(new hzr(1), cqlcVar, cqmpVarArr);
    }

    public hzr(int i, @dzsi Integer num) {
        super(Integer.valueOf(i));
        this.a = i;
        this.b = num;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<hzv> a() {
        int i = this.a;
        if (i != 1) {
            if (i == 2) {
                Integer num = this.b;
                dbsk.s(num);
                return hzh.c(num.intValue(), hzh.d(hzi.a), hzh.e(hzj.a), hzh.f(hzk.a), cqgr.z(ibm.b()));
            }
            return hzh.a(hzh.d(hzo.a), hzh.e(hzp.a), hzh.f(hzq.a), cqgr.z(ibm.b()));
        }
        return hzh.b(hzh.d(hzl.a), hzh.e(hzm.a), hzh.f(hzn.a), cqgr.z(ibm.b()));
    }
}
