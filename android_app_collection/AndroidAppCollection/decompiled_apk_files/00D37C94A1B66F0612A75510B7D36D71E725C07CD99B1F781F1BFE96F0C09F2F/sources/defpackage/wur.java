package defpackage;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_BELOW_PLAYER)
/* renamed from: wur  reason: default package */
/* loaded from: classes4.dex */
public final class wur implements wuw {
    private final wuv a;
    private final xdu b;
    private final wux c;

    public wur(wuv wuvVar, wux wuxVar, xdu xduVar) {
        this.a = wuvVar;
        this.c = wuxVar;
        this.b = xduVar;
    }

    @Override // defpackage.wuw
    public final void a() {
        wlr wlrVar = this.c.a;
        if (wlrVar == null) {
            this.a.j(this.b, new wuq("No belowPlayerSpaceAcquirerApi available"));
            return;
        }
        ody odyVar = (ody) wlrVar;
        odyVar.a.clear();
        odyVar.b = new fkh();
        odyVar.a.add(odyVar.b);
        this.a.h(this.b);
    }

    @Override // defpackage.wuw
    public final void b() {
        wlr wlrVar = this.c.a;
        if (wlrVar == null) {
            wwf.a(this.b, "No belowPlayerSpaceAcquirerApi when trying to exit slot");
        } else {
            ody odyVar = (ody) wlrVar;
            odyVar.a.remove(odyVar.b);
            odyVar.b = null;
        }
        this.a.k(this.b);
    }
}
