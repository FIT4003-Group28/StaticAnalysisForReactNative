package defpackage;
/* compiled from: PG */
/* renamed from: bkon  reason: default package */
/* loaded from: classes3.dex */
public final class bkon extends befr<blkx> {
    private final btvo b;

    public bkon(blmi blmiVar, btvo btvoVar) {
        super(blmiVar.a(false, false), 2, 2);
        this.b = btvoVar;
    }

    @Override // defpackage.befz
    public final void a(cqiv cqivVar) {
        cqivVar.a(new bgdr(), ((blkx) this.a).c().i());
        cqivVar.a(new bkxq(), ((blkx) this.a).c());
        if (!((blkx) this.a).a().isEmpty()) {
            cqivVar.f(new blbm(), ((blkx) this.a).a());
        } else if (this.b.getUgcParameters().ap().d) {
            cqivVar.a(new blix(true, 16, true, true), ((blkx) this.a).b());
        } else {
            cqivVar.a(new blix(false, 8, false, true), ((blkx) this.a).b());
        }
    }
}
