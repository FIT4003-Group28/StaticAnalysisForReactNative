package defpackage;
/* compiled from: PG */
/* renamed from: ajlt  reason: default package */
/* loaded from: classes2.dex */
final class ajlt implements btzi<ditm, dito> {
    final /* synthetic */ boolean a;
    final /* synthetic */ btlu b;
    final /* synthetic */ deig c;
    final /* synthetic */ ajlu d;

    public ajlt(ajlu ajluVar, boolean z, btlu btluVar, deig deigVar) {
        this.d = ajluVar;
        this.a = z;
        this.b = btluVar;
        this.c = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<ditm> btzrVar, btzy btzyVar) {
        this.c.j(false);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<ditm> btzrVar, dito ditoVar) {
        dito ditoVar2 = ditoVar;
        if (this.a) {
            ailf ailfVar = this.d.d;
            dbsg<btlu> i = dbsg.i(this.b);
            dqzl dqzlVar = ditoVar2.a;
            if (dqzlVar == null) {
                dqzlVar = dqzl.j;
            }
            ailfVar.a(i, dqzlVar);
        } else {
            ailf ailfVar2 = this.d.d;
            dbsg<btlu> i2 = dbsg.i(this.b);
            dqzl dqzlVar2 = ditoVar2.a;
            if (dqzlVar2 == null) {
                dqzlVar2 = dqzl.j;
            }
            ailfVar2.f(i2, dqzlVar2);
        }
        this.c.j(true);
    }
}
