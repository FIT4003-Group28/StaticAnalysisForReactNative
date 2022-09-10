package defpackage;
/* compiled from: PG */
/* renamed from: bkox  reason: default package */
/* loaded from: classes3.dex */
public final class bkox extends befr<blkx> {
    private final bego b;

    public bkox(blmi blmiVar, bego begoVar, boolean z) {
        super(blmiVar.a(true, z), 2, 2);
        this.b = begoVar;
    }

    @Override // defpackage.befz
    public final void a(cqiv cqivVar) {
        cqivVar.a(new bkwx(this.b), (blkx) this.a);
    }

    @Override // defpackage.befr, defpackage.befz
    public final void b(cqiv cqivVar) {
        if (!((blkx) this.a).e().booleanValue()) {
            return;
        }
        cqivVar.a(new grf(dtxy.eY), cqkp.T);
    }
}
