package defpackage;
/* compiled from: PG */
/* renamed from: ajrg  reason: default package */
/* loaded from: classes2.dex */
final class ajrg implements btzi<ditc, dite> {
    final /* synthetic */ btlu a;
    final /* synthetic */ deig b;
    final /* synthetic */ ajri c;
    final /* synthetic */ int d = 2;

    public ajrg(ajri ajriVar, int i, btlu btluVar, deig deigVar) {
        this.c = ajriVar;
        this.a = btluVar;
        this.b = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<ditc> btzrVar, btzy btzyVar) {
        this.b.j(1);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<ditc> btzrVar, dite diteVar) {
        dite diteVar2 = diteVar;
        if ((diteVar2.a & 2) == 0) {
            this.b.j(0);
            return;
        }
        ailf ailfVar = this.c.c;
        dbsg<btlu> i = dbsg.i(this.a);
        dqzl dqzlVar = diteVar2.b;
        if (dqzlVar == null) {
            dqzlVar = dqzl.j;
        }
        dehn<Void> a = ailfVar.a(i, dqzlVar);
        final deig deigVar = this.b;
        a.Pk(new Runnable(deigVar) { // from class: ajrf
            private final deig a;

            {
                this.a = deigVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(0);
            }
        }, this.c.d.h());
    }
}
