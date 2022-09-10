package defpackage;
/* compiled from: PG */
/* renamed from: bfzz  reason: default package */
/* loaded from: classes3.dex */
public final class bfzz extends cqiw<bnhy> {
    public static final /* synthetic */ int a = 0;
    private final boolean b;

    public bfzz() {
        this(false);
    }

    private final cqmp<bnhy> e(final int i) {
        cqlc cqlcVar = new cqlc(i) { // from class: bfzv
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i2 = this.a;
                int i3 = bfzz.a;
                return ((bnhy) cqkpVar).e(i2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
        return this.b ? cqic.f(cqlcVar, new cqmp[0]) : cqgr.aI(cqlcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bnhy> a() {
        return cqgr.fY(cqgr.fY(e(0), cqgr.fP(new blrt(), bfzw.a, new cqmp[0])), cqgr.fY(e(1), cqgr.fR(new bmxu(), bfzx.a, new cqmp[0])), cqgr.fY(e(2), cqgr.fR(new bmxu(), bfzy.a, new cqmp[0])));
    }

    public bfzz(boolean z) {
        super(Boolean.valueOf(z));
        this.b = z;
    }
}
