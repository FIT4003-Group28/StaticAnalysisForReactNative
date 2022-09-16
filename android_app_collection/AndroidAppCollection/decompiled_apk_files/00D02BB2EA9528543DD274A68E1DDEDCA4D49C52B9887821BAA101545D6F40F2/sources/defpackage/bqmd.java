package defpackage;
/* compiled from: PG */
/* renamed from: bqmd  reason: default package */
/* loaded from: classes4.dex */
final class bqmd implements btzi<dvqa, dvqe> {
    final /* synthetic */ bqmf a;
    private final bwrs<ilo> b;
    private final dqgr c;
    private final bqlb d;

    public bqmd(bqmf bqmfVar, bwrs<ilo> bwrsVar, dqgr dqgrVar, bqlb bqlbVar) {
        this.a = bqmfVar;
        this.b = bwrsVar;
        this.c = dqgrVar;
        this.d = bqlbVar;
    }

    private final void c() {
        this.d.e();
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvqa> btzrVar, btzy btzyVar) {
        c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvqa> btzrVar, dvqe dvqeVar) {
        dvqe dvqeVar2 = dvqeVar;
        int a = dvqd.a(dvqeVar2.a);
        if (a != 0 && a != 1) {
            int i = dvqeVar2.a;
            c();
            return;
        }
        bwrs<ilo> bwrsVar = this.b;
        dqgr dqgrVar = this.c;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        if (dqgr.DRAFT.equals(dqgrVar)) {
            c.bu(null);
        } else {
            c.bt(null);
        }
        bwrsVar.d(c);
        bqks a2 = this.a.f.a(this.b.c());
        a2.e(dcbg.i());
        a2.c();
        int i2 = true != dqgr.DRAFT.equals(this.c) ? 2 : 4;
        this.a.b.b(new bqje(this.b, i2, dcdc.e()));
        this.d.d(bqlf.f(this.b, i2));
    }
}
