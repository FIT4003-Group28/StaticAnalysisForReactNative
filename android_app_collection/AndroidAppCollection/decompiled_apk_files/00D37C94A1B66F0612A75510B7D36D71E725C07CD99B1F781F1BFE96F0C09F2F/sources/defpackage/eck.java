package defpackage;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_FULLSCREEN_COMPANION, b = apcd.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, c = {xbc.class})
/* renamed from: eck  reason: default package */
/* loaded from: classes3.dex */
public final class eck implements wqg {
    private final ecj a;
    private final wqf b;
    private final xdu c;
    private final xci d;
    private final arbh e;

    public eck(ecj ecjVar, wqf wqfVar, xdu xduVar, xci xciVar) {
        this.a = ecjVar;
        wqfVar.getClass();
        this.b = wqfVar;
        this.c = xduVar;
        xciVar.getClass();
        this.d = xciVar;
        this.e = (arbh) xciVar.e(xbc.class);
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        asjj asjjVar;
        asit asitVar = (asit) this.d.i.f();
        ecj ecjVar = this.a;
        arbh arbhVar = this.e;
        if (asitVar != null) {
            aopa createBuilder = asjj.a.createBuilder();
            createBuilder.copyOnWrite();
            asjj asjjVar2 = (asjj) createBuilder.instance;
            asjjVar2.t = asitVar;
            asjjVar2.c |= 1024;
            asjjVar = (asjj) createBuilder.mo39build();
        } else {
            asjjVar = null;
        }
        klt kltVar = (klt) ecjVar;
        kltVar.i = arbhVar;
        kltVar.j = asjjVar;
        kltVar.e();
        this.b.a(this.c, this.d);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        klt kltVar = (klt) this.a;
        kltVar.j = null;
        if (kltVar.i != null) {
            kltVar.i = null;
            kltVar.e();
        }
        this.b.d(this.c, this.d, i);
    }
}
