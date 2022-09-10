package defpackage;
/* renamed from: tfi  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class tfi implements cqlc {
    static final cqlc a = new tfi();

    private tfi() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        dbsg i;
        tfq tfqVar = (tfq) cqkpVar;
        int i2 = tfk.a;
        if (tfqVar.c() == null) {
            return dcdc.e();
        }
        sza c = tfqVar.c();
        dbsk.s(c);
        if (c instanceof syx) {
            i = dbsg.i(cqgr.fT(new sxs(), (syx) c));
        } else if (c instanceof syz) {
            i = dbsg.i(cqgr.fT(new syw(), (syz) c));
        } else {
            i = c instanceof syy ? dbsg.i(cqgr.fT(new sxw(), (syy) c)) : dbpy.a;
        }
        return i.a() ? dcdc.f((cqix) i.b()) : dcdc.e();
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
