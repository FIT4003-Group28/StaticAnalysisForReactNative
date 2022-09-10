package defpackage;
/* compiled from: PG */
/* renamed from: bkhb  reason: default package */
/* loaded from: classes3.dex */
public final class bkhb extends befr<bkhm> {
    private static final cqkp b = new bkha();

    public bkhb(bkhm bkhmVar) {
        super(bkhmVar, 1, 2);
    }

    @Override // defpackage.befz
    public final void a(cqiv cqivVar) {
        bkhm bkhmVar = (bkhm) this.a;
        if (!bkhmVar.w().booleanValue()) {
            return;
        }
        bkhk a = bkhmVar.a();
        if (a != null) {
            cqivVar.a(ict.p(false, new cqmp[0]), b);
            cqivVar.a(new bgdn(irg.H()), a);
        }
        bkhk b2 = bkhmVar.b();
        if (b2 != null) {
            cqivVar.a(ict.p(false, new cqmp[0]), b);
            cqivVar.a(new bgdn(irg.H()), b2);
        }
        bkhk c = bkhmVar.c();
        if (c != null) {
            cqivVar.a(ict.p(false, new cqmp[0]), b);
            cqivVar.a(new bgdn(irg.H()), c);
        }
        bkhk d = bkhmVar.d();
        if (d == null) {
            return;
        }
        cqivVar.a(ict.p(false, new cqmp[0]), b);
        cqivVar.a(new bgdn(irg.H()), d);
    }
}
