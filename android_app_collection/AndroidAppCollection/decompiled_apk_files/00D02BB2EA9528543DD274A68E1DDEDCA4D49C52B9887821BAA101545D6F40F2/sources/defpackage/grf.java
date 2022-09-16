package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: grf  reason: default package */
/* loaded from: classes6.dex */
public final class grf<T extends cqkp> extends cqiw<T> {
    public static final /* synthetic */ int a = 0;
    private final cqlc<T, cjtd> b;

    public grf(final cqlc<T, cjtd> cqlcVar) {
        super(cqlcVar);
        this.b = new cqlc(cqlcVar) { // from class: grd
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                int i = grf.a;
                cjtd cjtdVar = (cjtd) cqlcVar2.a(cqkpVar);
                if (cjtdVar == null || !cjtdVar.l()) {
                    return null;
                }
                cjta c = cjtd.c(cjtdVar);
                c.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
                return c.a();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<T> a() {
        return cqgr.fY(cqgr.fY(cqgr.fI(8), iue.c(this.b)));
    }

    public grf(final ddho ddhoVar) {
        this(new cqlc(ddhoVar) { // from class: gre
            private final ddho a;

            {
                this.a = ddhoVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                ddho ddhoVar2 = this.a;
                int i = grf.a;
                cjta b = cjtd.b();
                b.d = ddhoVar2;
                return b.a();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }
}
