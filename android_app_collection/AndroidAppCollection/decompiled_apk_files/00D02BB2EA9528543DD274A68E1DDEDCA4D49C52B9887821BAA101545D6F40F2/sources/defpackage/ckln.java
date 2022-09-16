package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: ckln  reason: default package */
/* loaded from: classes4.dex */
public final class ckln<VmT extends cqkp> {
    @dzsi
    public cklj a;
    private final cqjb<VmT, zx> b = new cklk(this);
    private final cqjb<VmT, abp> c = new ckll(this);
    private final cqjb<VmT, Integer> d = new cklm(this);

    public static <T extends cqkp> cqmn<T> a(ckln<T> cklnVar) {
        return cqmn.a(cqjv.d(cqqi.SPAN_SIZE_LOOKUP, ((ckln) cklnVar).b), cqqx.K(((ckln) cklnVar).c), cqjv.d(cqqi.SPAN_COUNT, ((ckln) cklnVar).d), cqqx.H(1));
    }

    public final cklj b(cqiv cqivVar, int i, int i2) {
        cklj ckljVar = new cklj(cqivVar, i, i2);
        this.a = ckljVar;
        return ckljVar;
    }
}
